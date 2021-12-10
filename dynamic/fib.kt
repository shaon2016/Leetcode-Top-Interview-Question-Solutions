package dynamic

private class Solution {
    fun fib(n: Int, memo: HashMap<Int, Int> = HashMap()): Int {
        if(memo.contains(n)) return memo[n]!!
        if (n == 0) return 0;
        if (n == 1) return 1;

        memo[n] = fib(n - 1, memo) + fib(n - 2, memo)
        return memo[n]!!
    }

}


fun main() {
    println(Solution().fib(6))
}