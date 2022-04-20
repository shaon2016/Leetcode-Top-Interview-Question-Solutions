package venture_dive

import java.util.*

fun main() {
    val arr1 = intArrayOf(2, 3, 3, 2, 2)
    val arr2 = intArrayOf(1, 3, 2, 4, 1)
    val N = 2
    println(getMaximumDistinctCount(arr1.toTypedArray(), arr2.toTypedArray(), N))
}

fun getMaximumDistinctCount(a: Array<Int>, b: Array<Int>, k: Int): Int {
    val mp = HashMap<Int, Int>()

    for (i in 0 until k) {
        mp[a[i]] = b[i]
    }

    var count = 1


    val visited = IntArray(k + 1)
    Arrays.fill(visited, 0)
    for (i in 1..k) {

        if (visited[i] <= 0) {

            val s = HashSet<Int>()
            var curr_index = i

            do {
                s.add(mp[curr_index]!!)

                curr_index = mp[curr_index]!!
            } while (curr_index != i)

            for (it in s) {
                visited[it] = 1
            }
            count *= 2
        }
    }
    return count
}