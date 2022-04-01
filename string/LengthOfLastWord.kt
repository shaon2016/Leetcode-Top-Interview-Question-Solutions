package string

fun lengthOfLastWord(s: String): Int {
    val newStr = s.trim()

    var i = newStr.length - 1

    var lastWordLength = 0
    while (i >= 0) {
        // if we find space then we break. coz without space it is a word
        if (newStr[i] != ' ') {
            lastWordLength++
        } else break
        i--
    }

    return lastWordLength
}