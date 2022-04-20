package string

import java.util.*


fun main() {
    println(isValid("){"))
}

fun isValid(s: String): Boolean {
    if (s.isEmpty() || s.length == 1) return false

    val stack = Stack<Char>()

    var i = 0
    while (i < s.length) {
        val currentBracket = s[i]

        if (currentBracket == '(' || currentBracket == '{' || currentBracket == '[') {
            stack.push(currentBracket)
        } else {
            // No element inserted but need to pop exmp. ){
            if (stack.isEmpty()) return false

            when (stack.pop()) {
                '(' -> {
                    if (currentBracket != ')') return false
                }
                '{' -> {
                    if (currentBracket != '}') return false
                }
                '[' -> {
                    if (currentBracket != ']') return false
                }
            }
        }

        i++
    }

    // inserted into stack but still has element. exmp: ((
    if (stack.isNotEmpty()) return false
    return true
}
