package practice

fun main() {
    println(isAnagram("rat", "car"))
}

fun isAnagram(s: String, t: String): Boolean {
    if (s.length != t.length) return false

    for (i in s.indices)
        if (!s[i].isLetter() || !t.contains(s[i]))
            return false
    return true
}