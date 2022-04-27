package happyfresh

fun playlist(songs: Array<Int>): Long {
    val map: MutableMap<Int, Int> = HashMap()
    var count = 0L
    for (s in songs) {
        if (map.containsKey((60 - s % 60) % 60)) {
            count += map[(60 - s % 60) % 60]!!
        }
        map[s % 60] = map.getOrDefault(s % 60, 0) + 1
    }
    return count
}

fun numPairsDivisibleBy60(time: IntArray): Int {
    val map: MutableMap<Int, Int> = HashMap()
    var count = 0
    for (t in time) {
        // Checking the other value that makes 60 contains or not
        if (map.containsKey((60 - t % 60) % 60)) {
            count += map[(60 - t % 60) % 60]!!
        }
        map[t % 60] = map.getOrDefault(t % 60, 0) + 1
    }
    return count
}

fun main() {
    println(wholeMinuteDilemma(intArrayOf(30, 20, 150, 100, 40).toTypedArray()))
}

fun wholeMinuteDilemma(time: Array<Int>): Int {
    var count = 0
    val hashMap = HashMap<Int, Int>()

    for (t in time.indices) {
        if (t % 60 == 0) {
            count += hashMap.getOrDefault(0, 0)
        } else if (hashMap.containsKey(60 - (t % 60))) {
            count += hashMap.getOrDefault(60 - (t % 60), 0)
        }
        println("60 - (t % 60) ${60 - (t % 60)} and map" + hashMap[60 - (t % 60)])

        hashMap[t % 60] = hashMap.getOrDefault(t % 60, 0) + 1
        println("t % 60 " + hashMap[t % 60])
    }

    return count
}