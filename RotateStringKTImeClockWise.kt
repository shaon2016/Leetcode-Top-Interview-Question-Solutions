fun main() {

    val nums = intArrayOf(1, 2, 3, 4, 5, 6, 7)
    println("Values  "+ nums.toList().toString())
    rotate(nums, 3)
}

// Solution 1
fun rotate(nums: IntArray, k: Int) {

    for (i in 0 until k) {
        rotateRightByOne(nums)
    }
}

fun rotateRightByOne(nums: IntArray) {
    val temp = nums[nums.size - 1]

    for (i in (nums.size - 2) downTo 0) {
        nums[i + 1] = nums[i]
        println("At Loops "+ nums.toList().toString())
    }

    nums[0] = temp

    println("Outside Loop "+nums.toList().toString())

}