package array

import java.util.*
import kotlin.collections.ArrayList
import kotlin.collections.HashMap
import kotlin.collections.HashSet

fun main() {
    println(singleNumber(intArrayOf(  4,1,2,1,2)))
}

fun singleNumber(nums: IntArray): Int {
    var sum = 0
    for (element in nums) {
        sum = sum.xor(element)
    }

    return sum
}