package andela

import java.util.*
import kotlin.collections.ArrayList
import kotlin.math.abs


// Closest Numbers

fun main() {
    closestNumbers(intArrayOf(4, -2, -1, 3).toTypedArray())
}

fun closestNumbers(array: Array<Int>) {
    var result: MutableList<Int> = ArrayList()
    val n = array.size
    Arrays.sort(array)
    var minAbs = Int.MAX_VALUE

    for (i in 0 until n - 1) {
        val absDiff: Int = if (array[i] < 0 && array[i + 1] < 0 || array[i] > 0 && array[i + 1] > 0)
            abs(array[i] - array[i + 1])
        else abs(array[i]) + abs(array[i + 1])
        when {
            absDiff < minAbs -> {
                minAbs = absDiff
                result = ArrayList()
                result.add(array[i])
                result.add(array[i + 1])
            }
            absDiff == minAbs -> {
                result.add(array[i])
                result.add(array[i + 1])
            }
        }
    }

    var i = 0
    while (i < result.size) {
        println("${result[i]} ${result[i + 1]}")

        i += 2
    }
//    val result: MutableList<Int> = ArrayList()
//    Arrays.sort(input)
//    var mindist = Int.MAX_VALUE
//    var indexes: MutableSet<Int> = HashSet()
//    var currdist: Int
//
//    for (i in 0 until input.size - 1) {
//        currdist = input[i + 1] - input[i]
//        if (currdist < mindist) {
//            indexes = HashSet()
//            indexes.add(i)
//            mindist = currdist
//        }
//        if (currdist == mindist) {
//            indexes.add(i)
//        }
//    }
//
//    val it: Iterator<Int> = indexes.iterator()
//    var next: Int
//    while (it.hasNext()) {
//        next = it.next()
//        result.add(input[next])
//        result.add(input[next + 1])
//    }
//
//    result.sort()
//
//    var i = 0
//    while (i < result.size) {
//        println("${result[i]} ${result[i + 1]}")
//
//        i += 2
//    }
}
