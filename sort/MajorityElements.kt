package sort

fun main() {
    println(majorityElement(intArrayOf(3, 2, 3)).toString())
}

fun majorityElement(nums: IntArray): Int {
    val h = HashMap<Int, Int>()
    var maxValue = 0
    var maxSeen = nums[0]

    nums.forEach {
        if (h.containsKey(it)) {
            h[it] = h[it]!!.plus(1)
        } else
            h[it] = 1

        if (h[it]!! > maxValue) {
            maxValue = h[it]!!
            maxSeen = it
        }

    }

    return maxSeen
}