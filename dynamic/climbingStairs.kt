package dynamic

fun main() {
    println(climbStairs(4))
}

fun climbStairs(n: Int, memo: HashMap<Int, Int> = HashMap()): Int {
    if(n in memo) return memo[n]!!
    if (n == 0) return 1
    if (n < 0) return 0

    memo[n] = climbStairs(n - 1, memo) + climbStairs(n - 2, memo)

    return memo[n]!!
}