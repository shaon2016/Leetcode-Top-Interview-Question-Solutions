package array

fun main() {
    val nums = intArrayOf(0,0,1,1,1,2,2,3,3,4)

    print(removeDuplicates(nums))
}

private fun removeDuplicates(nums: IntArray): Int {

    if (nums.isEmpty()) return 0

    var i = 0

    for (j in nums.indices) {
        if (nums[i] != nums[j]) {
            nums[++i] = nums[j]
        }
    }

    println(nums.toList())

    return i + 1
}

