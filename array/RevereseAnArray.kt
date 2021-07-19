package array

class RevereseAnArray {
    fun reverseArray(nums: IntArray) {
        val mid = nums.size / 2

        (0 until mid).forEach {
            val temp = nums[it]
            nums[it] = nums[nums.size - it - 1]
            nums[nums.size - it - 1] = temp
        }
    }
}