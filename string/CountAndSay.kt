package string

fun main() {
    countAndSay(5)
}

fun countAndSay(n: Int): String {
    // As per question n will contain at least 1
    if (n == 1) return "1"
    if (n == 2) return "11"  // First 2 at least fixed for us

    var str = "11" // if n >= 3, we assign str = 11 for out next work

    var i = 3  // n >= 3 so we start work from 3

    while (i <= n) {
        var workingStr = "" // For processing out count and say

        var count = 1
        var j = 0
        while (j < str.length - 1) { // As we checking the last position with its previous
            if (str[j] == str[j + 1]) {
                count++  // if present and next char is same so count
            } else {
                // next char is not same so we assign
                workingStr += "$count${str[j]}"
                // count will be again one for the next char
                count = 1
            }

            j++
        }
        workingStr += "$count${str[j]}"  // for the last character
        i++
        str = workingStr
    }
    return str
}