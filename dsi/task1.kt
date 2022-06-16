package dsi

/**

(1 + 2 + … n) + ( 2 + 3 + … n) + (3 + 4 + …. n)+ ….. + n = ?

Example

n = 3
(1+2+3) + (2+3) + 3 = 14

 */

fun main() {
    println(findSum(4))
}

private fun findSum(n: Int): Int {
    var sum = 0
    var subtractPerIterator = 0
    for (i in 1 until n + 1) {
        sum += (n * (n + 1)) / 2 - subtractPerIterator

        subtractPerIterator += i
    }

    return sum
}
