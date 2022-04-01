package hackerrank

import kotlin.math.abs

fun main() {
    println(flatlandSpaceStations(5, intArrayOf(0, 4).toTypedArray()))
}


fun flatlandSpaceStations(n: Int, c: Array<Int>): Int {
    var max = Int.MIN_VALUE

    c.forEach { spaceStationCity->
        for (i in 0 until n) {
            if(abs(spaceStationCity - i) > max)
                max = abs(spaceStationCity - i)
        }
    }

    return max
}
