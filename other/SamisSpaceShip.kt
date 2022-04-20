package other

fun main() {
    val str = "SOSSOT"

    var i = 0
    var count = 0

    val a = "SOS"

    while (i < str.length) {
        if (str[i] != a[0]) count++
        if (str[i+1] != a[1]) count++
        if (str[i + 2] != a[2]) count++

        i += 3
    }

    println(count)
}

