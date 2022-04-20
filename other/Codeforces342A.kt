package other

fun main() {
    var n = 0
    var x = 0
    var count = intArrayOf(0, 0, 0, 0, 0, 0, 0, 0)

    n = Integer.valueOf(readLine())

    (0 until n).forEach {
        x = Integer.valueOf(readLine())
        count[x]++
    }


    if (count[5] == 0 && count[7] == 0 && count[2] >= count[4] && count[1] == count[4] + count[6] && count[2] + count[3] == count[4] + count[6]) {

        var i = 0

        while (i < count[4]) {
            println("1 2 4")
            i++
        }
        count[2] -= count[4]

        i = 0
        while (i < count[2]) {
            println("1 2 6")
            i++
        }
        i = 0
        while (i < count[2]) {
            println("1 3 6")
            i++
        }


    } else {
        println("-1")
    }

}

