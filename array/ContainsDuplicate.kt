package array

import java.util.*
import kotlin.collections.HashSet


fun main() {
    println(containsDuplicate(intArrayOf(1, 2, 3, 4, 6,5)))
}

/*// Solution 1
fun containsDuplicate(nums: IntArray): Boolean {

    Arrays.sort(nums)

    for (i in 0 until nums.size - 1) {
        if (nums[i] == nums[i + 1]) return true
    }

    return false
}*/

// Solution 2
fun containsDuplicate(nums: IntArray): Boolean {
    val hashSet = HashSet<Int>(nums.size)

    var found = false
    for (i in nums.indices) {
        if (hashSet.contains(nums[i])) {
            found = true
            break
        }
        hashSet.add(nums[i])
    }

    return found
}
