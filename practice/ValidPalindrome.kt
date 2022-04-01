package practice

fun main() {
println(isPalindrome("A man, a plan, a canal: Panama"))
}

fun isPalindrome(s: String): Boolean {
    var newStr = ""

    s.forEach {
        if (it.isLetterOrDigit()) newStr += it.lowercase()
    }

    val mid = newStr.length / 2

    for (i in 0 until mid) {
        if (newStr[i] != newStr[newStr.length - 1 - i]) return false
    }

    return true
}