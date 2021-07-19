package array

fun main() {
    print(maxProfit(intArrayOf(7,1,5,3,6,4)))
}

fun maxProfit(prices: IntArray): Int {
    var profit = 0
    if (prices.size == 1) return profit

    for (i in 1 until prices.size) {
        if (prices[i] > prices[i - 1]) profit += prices[i] - prices[i - 1]
    }

    return profit
}

