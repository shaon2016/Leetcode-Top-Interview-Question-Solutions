package string

fun main() {
    println(reverse(547))
}

fun reverse(x: Int): Int {

    var reversedInt = 0L

    var n = x

    while (n != 0) {
        reversedInt = (n % 10) + (reversedInt * 10)

        n /= 10
    }

    return if (reversedInt in Int.MIN_VALUE..Int.MAX_VALUE)
        reversedInt.toInt()
    else 0
}