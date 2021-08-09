package string

fun main() {
    println(myAtoi("9223372036854775808"))
}

fun myAtoi(s: String): Int {
    if (s.trim().isEmpty()) return 0

    val newStr = s.trim() // Ignoring spaces for both of the sides

    var isNegative = false
    var signExist = false
    if (newStr[0] == '-') {
        signExist = true
        isNegative = true
    } else if (newStr[0] == '+') {
        signExist = true
        isNegative = false
    }

    var result = 0.toBigInteger()

    for (i in 0 until newStr.length) {
        val char = newStr[i]


        if (i == 0 && signExist) continue
        if (char.isDigit()) {
            result = result * 10.toBigInteger() + (char - '0').toBigInteger()
        } else
            break

    }

    println(result)
    if (isNegative) result *= -1.toBigInteger()


    if (result <= Int.MIN_VALUE.toBigInteger()) return Int.MIN_VALUE
    if (result >= Int.MAX_VALUE.toBigInteger()) return Int.MAX_VALUE

    return result.toInt()
}