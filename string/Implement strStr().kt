package string

fun main() {

    println(strStr("hello", "o"))
}

fun strStr(haystack: String, needle: String): Int {
    if (needle.isEmpty()) return 0

    if (haystack.length < needle.length) return -1

    for (i in 0 until haystack.length - needle.length + 1) {
        var needleLength = 0
        for (j in needle.indices) {
            if (haystack[i + j] == needle[j]) {
                needleLength++

            } else break
        }

        if (needleLength == needle.length) return i
    }

    return -1
}