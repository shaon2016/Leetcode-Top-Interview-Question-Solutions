package practice

fun main() {
    val nums = intArrayOf(1, 2, 3, 4, 5, 6, 7)
    val k = 3

    rotate(nums, k)

    println(nums.toList().toString())

}

fun rotate(nums: IntArray, k: Int) {
    // How many times we need to cycle
    // It ensures k is always less than nums.size
    var k = k % nums.size

    while (k > 0) {
        val last = nums[nums.size - 1]

        for (i in nums.size - 2 downTo 0) {
            nums[i + 1] = nums[i]
        }

        nums[0] = last

        k--
    }


}