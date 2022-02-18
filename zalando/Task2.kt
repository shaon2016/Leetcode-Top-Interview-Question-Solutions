import kotlin.math.abs

fun main() {
    println(solution1(-999))
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