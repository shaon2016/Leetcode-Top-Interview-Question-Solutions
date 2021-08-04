package sort

fun main() {
    println(firstBadVersion(4))
}

fun firstBadVersion(n: Int): Int {
    var first = 1
    var last = n

    while (first <= last) {
        val mid = (first + last) / 2

        if (!isBadVersion(mid)) {
            first = mid + 1
        } else {
            last = mid
        }
    }

    return first
}

fun isBadVersion(version: Int): Boolean = false