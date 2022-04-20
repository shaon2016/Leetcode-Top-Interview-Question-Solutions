package dynamic

fun main() {
    println(canSum(7, intArrayOf(5, 3, 4, 7)))
}

fun canSum(target: Int, ints: IntArray, memo: HashMap<Int, Boolean> = HashMap()): Boolean {
    if (target in memo) return memo[target]!!
    if (target < 0) return false
    if (target == 0) return true

    for (i in ints.indices) {
        val rem = target - ints[i]

        if(canSum(rem, ints, memo)) {
            memo[target] = true
            return true
        }
    }

    memo[target] = false
    return false
}