package practice

fun main() {
    println(maxProfit(intArrayOf(7,12,14,3,1)))
}

fun maxProfit(prices: IntArray): Int {
    if (prices.isEmpty()) return 0

    var profit = 0

    for (i in 1  until prices.size) {
        if(prices[i] - prices[i-1] > 0) {
            profit += prices[i] - prices[i-1]
        }
    }

    return profit
}