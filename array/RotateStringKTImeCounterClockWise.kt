package array

fun main() {

    val nums = intArrayOf(1, 2, 3, 4, 5)
    println("Values  "+ nums.toList().toString())
    rotateCounterClockWise(nums, 3)
    println("Values  "+ nums.toList().toString())
}

// Solution 1
fun rotateCounterClockWise(nums: IntArray, k: Int) {

    for (i in 0 until k) {
        rotateLeftByOne(nums)
    }
}

fun rotateLeftByOne(nums: IntArray) {
    val temp = nums[0]

    for (i in 0 until  nums.size - 1) {
        nums[i] = nums[i + 1]
        nums[i + 1] = temp
        println("At Loops "+ nums.toList().toString())
    }


    println("Outside Loop "+nums.toList().toString())

}