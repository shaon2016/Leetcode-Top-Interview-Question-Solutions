package array

import java.util.*
import kotlin.collections.ArrayList
import kotlin.collections.HashMap
import kotlin.collections.HashSet

fun main() {
    println(singleNumber(intArrayOf( 2, 2, 1)))
}

fun singleNumber(nums: IntArray): Int {
    val arrayList = ArrayList<Int>()

    nums.forEach {
        if (arrayList.contains(it)) {
            arrayList.remove(it)
        } else arrayList.add(it)
    }

    return arrayList.first()
}