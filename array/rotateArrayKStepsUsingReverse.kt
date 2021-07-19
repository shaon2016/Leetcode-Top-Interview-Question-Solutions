package array

fun main() {
    val nums = intArrayOf(1, 2, 3)
    rotateByReverse(nums, 6)
    println(nums.toList().toString())
}

fun rotateByReverse(nums: IntArray, k: Int) {
    val updatedK = k % nums.size
    println(updatedK)

    reverseArray(nums, 0, nums.size - 1)
    reverseArray(nums, 0, updatedK - 1)
    reverseArray(nums, updatedK, nums.size - 1)
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

