package string

fun main() {
    println(isAnagram("aba", "ba"))
}

fun isAnagram(s: String, t: String): Boolean {
    if (s.length != t.length) return false

    val cA = IntArray(26)

    for (i in s.indices) {
        cA[s[i]  - 'a']++
        cA[t[i]  - 'a']--
    }

    for (i in cA.indices) {
        if (cA[i] != 0) return false
    }

    return true
}

