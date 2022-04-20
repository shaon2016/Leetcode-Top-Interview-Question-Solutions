package array

fun main() {
    println(removeElement(intArrayOf(0,1,2,2,3,0,4,2), 2))
}
fun removeElement(nums: IntArray, `val`: Int): Int {
    var count = 0

    for (i in nums.indices) {
        if(nums[i] == `val`) {
            count++
            nums[i] = Int.MAX_VALUE
        }
    }
    nums.sort()

    return nums.size - count
}