package hackerank_basic_test

fun main() {
    println(filledOrders(intArrayOf(10, 30).toTypedArray(), 40))
}

fun filledOrders(order: Array<Int>, k: Int): Int {
    var result = 0
    order.sort()

    var k = k
    for(i in order.indices) {
        val item = order[i]

        if(item <= k) {
            result++
            k -= item
        }
    }

    return result
}