package array

fun main() {
    val nums = intArrayOf(1,2,3,4,5,6,7)
    rotateByReverse(nums, 3)
}

fun rotateByReverse(nums: IntArray, k: Int) {
    val updatedK = k % nums.size

    reverseArray(nums, 0, nums.size - 1)
    println(nums.toList().toString())
    reverseArray(nums, 0, updatedK - 1)
    println(nums.toList().toString())
    reverseArray(nums, updatedK, nums.size - 1)
    println(nums.toList().toString())
}

fun reverseArray(nums: IntArray, low: Int, high: Int) {
    var i = low
    var j = high
    while (i < j) {
        val temp = nums[i]
        nums[i] = nums[j]
        nums[j] = temp
        j--
        i++
    }
}

