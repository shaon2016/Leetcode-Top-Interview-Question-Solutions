package dynamic

fun main() {
    println(maxSubArray(intArrayOf(-2,1,-3,4,-1,2,1,-5,4)))
}

fun maxSubArray(nums: IntArray): Int {
//    if(nums.isEmpty()) return 0
//    if (nums.size == 1) return nums[0]
//
//    var max = Int.MIN_VALUE
//    var i = 0
//    while (i < nums.size) {
//        var sum = 0
//        for (j in i until nums.size) {
//            sum += nums[j]
//
//            if (sum > max)
//                max = sum
//        }
//        i++
//    }
//
//    return max

    var max = Int.MIN_VALUE
    var maxEnd = 0

    for (num in nums) {
        maxEnd += num

        if(max < maxEnd)
            max = maxEnd
        if(maxEnd < 0)
            maxEnd = 0
    }

    return max
}