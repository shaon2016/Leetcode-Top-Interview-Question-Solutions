package other

fun main() {
    var str = "middle-outz"
    val k = 2

    val s = StringBuilder()

    for (i in str.indices) {
        if (str[i].isLetter()) {
            when {
                str[i] == 'y' -> s.append('a')
                str[i] == 'z' -> s.append('b')
                else -> s.append(str[i] + 2)
            }
        } else s.append(str[i])
    }

    println(s.toString())
}