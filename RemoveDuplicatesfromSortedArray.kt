fun main() {
    val nums = intArrayOf(1, 1, 2, 2,3)

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

    return i + 1
}
