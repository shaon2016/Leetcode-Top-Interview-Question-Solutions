package zalando

fun main() {
println(solution3(intArrayOf(3,0)))
}

fun solution3(A: IntArray): Int {
    var count = 0

    for (i in A.indices) {
        var sum = A[i]
        for (j in i until A.size) {
            if (i != j) {
                sum += A[j]
            }

            if (sum == 0) count++
        }
    }

    return if (count == 0) -1 else count
}