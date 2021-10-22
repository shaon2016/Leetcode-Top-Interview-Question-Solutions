fun main() {
    println(solution1(0))
}

fun solution1(N: Int): Int {
    val str = N.toString()

    var isNegative = false

    if (str[0] == '-') isNegative = true

    var newStr = ""

    var replaced5 = false

    for (i in str.indices) {
        if (str[i] == '-') continue

        val currentNum: Int = str[i] - '0'

        if (isNegative) {

            if (currentNum > 5 && !replaced5) {
                newStr += 5
                replaced5 = true
            }

        } else {
            if (currentNum < 5 && !replaced5) {
                newStr += 5
                replaced5 = true
            }

        }
        newStr += currentNum

    }

    var newNumber = newStr.toInt()
    if (isNegative) newNumber *= -1

    return newNumber
}