package stack

import java.util.*

// FIFO
class MyQueue() {

    // LIFO
    val stack = Stack<Int>()

    fun push(x: Int) {
        stack.push(x)
    }

    fun pop() : Int {

        return 0
    }

    fun peek() = 0

    fun empty(): Boolean {

        return true
    }

}