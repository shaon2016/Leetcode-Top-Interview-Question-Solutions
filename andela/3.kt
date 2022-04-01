package andela

fun main() {
    println(numBST(intArrayOf(1, 2, 3, 4, 100).toTypedArray()).toList())
//    println(countBST())
}

fun numBST(nodeValues: Array<Int>): Array<Int> {
    val array = arrayListOf<Int>()
    nodeValues.forEach {
        var count = countBST(it)
        if (count < Int.MIN_VALUE)
            count = factorial(count)
        array.add(count.toInt())
    }

    return array.toTypedArray()
}

fun factorial(n: Long) : Long {
    val M = 1000000007;
    var f = 1L

    for (i in 1 until n)
        f *= i

    return f % M
}

fun countBST(n: Int): Long {
    return catalan(n)
}

fun catalan(n: Int): Long {
    val c: Long = binomialCoeff(2 * n, n)
    return c / (n + 1)
}

fun binomialCoeff(
    n: Int,
    k: Int
): Long {
    var k = k
    var res = 1L

    if (k > n - k) k = n - k

    for (i in 0 until k) {
        res *= n - i
        res /= i + 1
    }
    return res
}