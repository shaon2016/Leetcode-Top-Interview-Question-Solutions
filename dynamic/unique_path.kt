package dynamic

private class UniquePath {
    fun uniquePaths(m: Int, n: Int, memo: HashMap<String, Int> = HashMap()): Int {
        val key = "$m,$n"
        if(memo.containsKey(key)) return memo[key]!!
        if(m == 0 || n == 0) return 0
        if(m == 1 && n == 1) return 1

        memo[key] = uniquePaths(m,n-1, memo) + uniquePaths(m-1,n,memo)
        return memo[key]!!
    }
}

fun main() {
    println(UniquePath().uniquePaths(3, 2))
}