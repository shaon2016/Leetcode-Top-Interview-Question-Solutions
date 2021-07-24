package string

fun main() {
    reverseString(charArrayOf('h', 'a'))
}

fun reverseString(s: CharArray){
    var low = 0
    var high = s.size - 1

    while (low < high) {
        val t = s[low]
        s[low] = s[high]
        s[high] = t

        low++
        high--
    }

    println(s.toList().toString())
}