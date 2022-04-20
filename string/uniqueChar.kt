package string

fun main() {
    println(firstUniqChar("leetcode"))
}

fun firstUniqChar(s: String): Int {

    val hMap = HashMap<Char, Int>()

    for (i in s.indices) {
        if (!hMap.containsKey(s[i])) {
            hMap[s[i]] = 1
        } else {
            hMap[s[i]] = hMap[s[i]]!!.plus(1)
        }
    }

    for (i in s.indices) {
        if (hMap[s[i]] == 1) return i
    }

    return -1
}