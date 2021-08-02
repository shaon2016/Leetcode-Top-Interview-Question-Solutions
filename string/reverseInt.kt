package string

fun main() {
    reverse(1534236469)
}

fun reverse(x: Int): Int {

    var reversedInt = 0L

    var n = x

    var firstTime = true
    while (n != 0) {
        if (firstTime) {
            reversedInt = (n % 10).toLong()
            firstTime = false
        } else {
            reversedInt = (n % 10) + (reversedInt * 10)

        }

        n /= 10
    }

    return if (reversedInt in Int.MIN_VALUE..Int.MAX_VALUE)
        reversedInt.toInt()
    else 0
}