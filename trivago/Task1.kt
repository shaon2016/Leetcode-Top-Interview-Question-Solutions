package trivago

fun main() {
    println(solution("aaaaaba"))
}

fun solution(S: String): Boolean {
//    val firstB = S.indexOf('b',0)
//    if (firstB == -1) return true
//    for (i in firstB until S.length) if (S[i] == 'a') return false

    for (i in 0 until S.length - 1) {
        if (S[i] == 'b' && S[i + 1] == 'a') return false
    }

    return true
}