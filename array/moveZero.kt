package array

fun main() {
    println(moveZeroes(intArrayOf(2,1)).toList().toString())
    //[4,2,4,3,5,1,0,0,0,0]
}

fun moveZeroes(nums: IntArray): IntArray {

    for (i in nums.size - 1 downTo 0) {
        if (nums[i] == 0) {
            var j = i
            while (j < nums.size - 1) {
                val temp = nums[j]
                nums[j] = nums[j + 1]
                nums[j + 1] = temp

                j++
            }
        }
    }



    return nums

}
