package line


fun main() {
    println(solution(3).toList().toString())
}

fun solution(n: Int): Array<String> {
    val result = arrayListOf<String>()
    generateParenthesis(result, "", 0, 0, n)
    return result.toTypedArray()
}

private fun generateParenthesis(
    result: ArrayList<String>,
    s: String,
    open: Int,
    close: Int,
    n: Int
) {
    if (open == n && close == n) {
        result.add(s)
        return
    }
    if (open < n) {
        generateParenthesis(result, "$s(", open + 1, close, n)
    }
    if (close < open) {
        generateParenthesis(result, "$s)", open, close + 1, n)
    }
}