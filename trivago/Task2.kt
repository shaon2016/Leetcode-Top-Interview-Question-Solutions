package trivago


fun main() {
    println(solution1("minusplusminus"))
}

fun solution1(S: String): String {
    var result = ""

    var i = 0

    while (i < S.length) {
        if (S.substring(i, i + 4) == "plus") {
            result += "+"
            i += 4
        } else {
            result += "-"
            i += 5
        }
    }

    return result
}