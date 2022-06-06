package line

fun main() {
    println(solution(15, arrayOf("0 A created", "1 B created", "10 A running",
        "12 B waiting", "13 B running", " 14 A waiting", "17 B terminated", "18 A terminated")))
//    println(solution(14, arrayOf("0 A created", "1 B created", "2 C created",
//        "3 D created", "10 A running", "11 A waiting", "12 B waiting", "13 B running", "14 C running", "17 B terminated", "18 A terminated")))
}

fun solution(t: Int, logs: Array<String>): String {
    // Find how many process is running with the given time t
    var countRunningProcessAtGivenTime = 0

    val logsList = ArrayList<Log>()
    val detectRunningProcessMap = HashMap<String, ProcessTime>()

    logs.forEach {
        val stringArray = it.trim().split(" ")
        logsList.add(Log(stringArray[0].toInt(), stringArray[1], stringArray[2]))
    }

    logsList.forEach { singleLog ->
        if (!detectRunningProcessMap.containsKey(singleLog.processName) && singleLog.state == "running") {
            // Not in the hashmap and it started running . so keeping its start running time
            detectRunningProcessMap.putIfAbsent(singleLog.processName,
                ProcessTime(singleLog.time, Int.MAX_VALUE))
        } else if (detectRunningProcessMap.containsKey(singleLog.processName) && singleLog.state != "running" && detectRunningProcessMap[singleLog.processName]!!.endRunningTime == Int.MAX_VALUE) {
            detectRunningProcessMap[singleLog.processName] =
                ProcessTime(detectRunningProcessMap[singleLog.processName]!!.startRunningTime,
                    singleLog.time)
        }

    }

    var oneProcessWithInGivenTime = ""
    detectRunningProcessMap.keys.forEach {
        val processTime = detectRunningProcessMap[it]

        if (t in processTime!!.startRunningTime..processTime.endRunningTime) {
            countRunningProcessAtGivenTime++
            oneProcessWithInGivenTime = it
        }
    }

    return if (countRunningProcessAtGivenTime == 1) oneProcessWithInGivenTime else "-1"
}

data class Log(val time: Int, val processName: String, val state: String)
data class ProcessTime(val startRunningTime: Int, val endRunningTime: Int)