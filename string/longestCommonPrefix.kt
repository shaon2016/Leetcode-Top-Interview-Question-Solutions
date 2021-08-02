package string

fun main() {
    println(longestCommonPrefix(arrayOf("flower","flow","flight")))
}

fun longestCommonPrefix(strs: Array<String>): String {
    if (strs.isEmpty()) return ""

    var prefix = strs[0]

    for (i in 1 until strs.size) {
        while (strs[i].indexOf(prefix) != 0) {
            prefix = prefix.substring(0, prefix.length - 1)

            println("i => $i and prefix => $prefix")
        }
    }

    return prefix
}