import kotlin.math.abs

fun main() {
    println(solutionTask2(268))
}
fun solutionTask2(N: Int): Int {
    var N = N
    val digit = 5
    if (N == 0) return digit * 10
    val neg = N / abs(N)
    N = abs(N)
    var n = N
    var ctr = 0
    while (n > 0) {
        ctr++
        n /= 10
    }
    var pos = 1
    var maxVal = Int.MIN_VALUE
    for (i in 0..ctr) {
        val newVal = N / pos * (pos * 10) + digit * pos + N % pos
        if (newVal * neg > maxVal) {
            maxVal = newVal * neg
        }
        pos *= 10
    }
    return maxVal
}

fun solution1(N: Int): Int {
    val digit = 5
    if (N == 0) return digit * 10

    var isNegative = false

    // Checking this number is negative or not
    if (N < 0) isNegative = true

    // Making the number no negative
    val str = abs(N).toString()

    var newStr = ""
    var i = 0

    while (i < str.length) {
        val currentNum: Int = str[i] - '0'

        if (isNegative) {
            if (currentNum > digit) {
                newStr += digit
                break
            }
        } else {
            if (currentNum < digit) {
                newStr += digit
                break
            }
        }
        newStr += currentNum

        i++
    }

    // placing the rest of the number
    while (i < str.length) {
        val currentNum: Int = str[i++] - '0'
        newStr += currentNum
    }

    var newNumber = newStr.toInt()
    if (isNegative) newNumber *= -1

    return newNumber
}