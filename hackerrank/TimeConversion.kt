package hackerrank

fun main() {
    println(timeConversion("07:05:45PM"))
}

fun timeConversion(str: String): String {

    var h = str.substring(0, 2)
    val m = str.substring(3, 5)
    val s = str.substring(6, 8)

    if(str.contains("AM") && h == "12") return "00:$m:$s"
    if(str.contains("PM") && h != "12") {
       h = (h.toInt() + 12).toString()
    }

    return "$h:$m:$s"
}