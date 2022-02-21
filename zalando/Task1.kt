fun main() {
    println(solution(4))
}

fun solution(N: Int): String {
    var str = ""
    (0 until N).forEach { i ->
        str += if (i % 2 == 0) "+"
        else "-"
    }

    return str
}