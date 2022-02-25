package dynamic

import kotlin.math.max

fun main() {
    println(rob(intArrayOf(2, 7, 9, 3, 1)))

}

fun rob(nums: IntArray): Int {
    var realMax = 0 // storedMax
    var prevMax = 0 // Hold the previous max

    nums.forEach { num ->
        val currentMax = max(prevMax + num, realMax)
        prevMax = realMax
        realMax = currentMax
    }

    return realMax
}