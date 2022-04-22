package trivago

fun main() {
    println(solution("abba"))
}

fun solution(S: String): Boolean {
    val firstB = S.indexOf('b',0)
    if (firstB == -1) return true
    for (i in firstB until S.length) if (S[i] == 'a') return false
    return true
}