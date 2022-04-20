package samsung_test

//#
//# Given an array with the lengths of various metal rods, repeatedly perform the following:
//#
//#   1. Count the number of rods.
//#   2. Find the rod(s) with the shortest length.
//#   3. Discard any rod of that length.
//#   4. Cut that shortest length from each of the longer rods. These are offcuts.
//#   5. Discard all offcuts.
//#   6. Repeat until there are no more rods.
//#
//# Maintain an array of the numbers of rods at the beginning of each round of actions and return that array.

fun main() {
    println(rodOffcut(arrayOf(5, 4, 4, 2, 2, 8)).toList())
}

public fun <T : Comparable<T>> Array<out T>.minOrNull(): T? {
    if (isEmpty()) return null
    var min = this[0]
    for (i in 1..lastIndex) {
        val e = this[i]
        if (min > e) min = e
    }
    return min
}

fun rodOffcut(lengths: Array<Int>): Array<Int> {
    var newLength = lengths.clone()
    val rods = arrayListOf<Int>()


    while (newLength.isNotEmpty()) {
        rods.add(newLength.size)

        val cutLength = newLength.minOrNull()

        val newLength2 = arrayListOf<Int>()
        for (l in newLength) {
            if (l > cutLength!!) {
                newLength2.add(l - cutLength)
            }
        }
        newLength = newLength2.toTypedArray()
    }

    return rods.toTypedArray()
}