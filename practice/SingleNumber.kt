package practice


fun main() {
    println(singleNumber(intArrayOf(2,2,1)))
}

fun singleNumber(nums: IntArray): Int {
    var foundNumber = 0

    nums.forEach {
        foundNumber = foundNumber.xor(it)
    }

    return foundNumber
}