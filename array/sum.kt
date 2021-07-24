package array

import java.lang.Exception

fun main() {
    println(twoSum(intArrayOf(2, 7, 11, 15), 9).toList().toString())

}

fun twoSum(nums: IntArray, target: Int): IntArray {

    val h = HashMap<Int, Int>()

    for (i in nums.indices) {
        val currentNumber = nums[i]

        if (h.containsKey(target - currentNumber)) {
            return intArrayOf(h[target - currentNumber]!!, i)
        }

        h[nums[i]] = i
    }

    throw Exception()
}