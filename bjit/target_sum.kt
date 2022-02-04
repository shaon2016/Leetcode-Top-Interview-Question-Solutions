package bjit

fun main() {
    val arrays = intArrayOf(2)
    val m = arrays.size
    println(min(arrays, m, 3).toString())

}

fun min(arrays: IntArray, m: Int, V: Int): Int {
    if (V == 0) return 0

    var res = Int.MAX_VALUE

    for (i in 0 until m) {
        if (arrays[i] <= V) {
            val sub_res = min(arrays, m, V - arrays[i])

            if (sub_res != Int.MAX_VALUE && sub_res + 1 < res) res = sub_res + 1
        }
    }
    if (Int.MAX_VALUE == res || res == 0) return -1
    return res
}