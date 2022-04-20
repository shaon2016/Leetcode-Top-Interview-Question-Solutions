package practice

fun main() {
    println(containsDuplicate(intArrayOf(1, 2, 3, 4)))
}

fun containsDuplicate(nums: IntArray): Boolean {
    if (nums.size == 1) return false

//    val set = HashSet<Int>()
//
//    for (i in nums.indices) {
//        if(!set.add(nums[i])) return true
//    }

    nums.sort()

    for (i in 0 until nums.size - 1) {
        if (nums[i] == nums[i + 1]) return true
    }

    return false
}