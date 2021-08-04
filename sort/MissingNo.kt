package sort

fun main() {
   println( missingNumber(intArrayOf(1,2,3,4,0,5,6)))
}

fun missingNumber(nums: IntArray): Int {
    var sumArray = 0
    var sumForMissingNo = 0

    for(i in nums.indices) {
       sumArray += nums[i]
        sumForMissingNo += i + 1
    }

    return  sumForMissingNo - sumArray
}