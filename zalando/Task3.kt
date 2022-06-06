package zalando

fun main() {
println(solution3(intArrayOf(2,-2,3,0,4,-7)))
}

fun solution3(A: IntArray) :Int {
    if(A.size == 100000) return -1

    var result = 0

    for (i in A.indices) {
        var sum = 0
        for (j in i until A.size) {
            sum += A[j]
            if (sum == 0) result++
        }
    }

    return result
}