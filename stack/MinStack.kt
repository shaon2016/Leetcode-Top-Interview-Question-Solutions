package stack

import java.util.*

class MinStack {

//    private var stack: Array<Int> = Array(0) { 0 }

//    fun push(`val`: Int) {
//        if (stack.isNotEmpty()) {
//            val newStack = IntArray(stack.size + 1)
//
//            for (i in newStack.size - 1 downTo 1)
//            // new stack size will be greater than stack by 1
//                newStack[i] = stack[i - 1]
//
//            stack = newStack.toTypedArray()
//            stack[0] = `val`
//        } else {
//            stack = Array(1) { `val` }
//        }
//    }
//
//    fun pop() {
//        for (i in 0 until stack.size - 2) {
//            stack[i] = stack[i + 1]
//        }
//    }
//
//    fun top() = if (stack.isNotEmpty()) stack[0] else intArrayOf()
//
//    fun getMin() = findMin()
//
//    private fun findMin(): Int {
//        var min = Int.MAX_VALUE
//
//        for (i in stack.indices) {
//            if (min > stack[i])
//                min = stack[i]
//        }
//
//        return if (min == Int.MAX_VALUE) 0 else min
//    }


    private val stack = Stack<Int>()

    fun push(`val`: Int) {
        stack.push(`val`)
    }

    fun pop() {
        stack.pop()
    }

    fun top() = stack.peek()

    fun getMin() = stack.minOrNull() ?: 0

    private fun findMin(): Int {
        var min: Long = Long.MAX_VALUE

        for (i in stack.indices) {
            if (min > stack[i])
                min = stack[i].toLong()
        }

        return if (min == Long.MAX_VALUE) 0 else min.toInt()
    }
}

fun main() {
    val obj = MinStack()
    obj.push(-2)
    obj.push(0)
    obj.push(-3)
    println(obj.getMin())
    obj.pop()
    println(obj.top())
    println(obj.getMin())
}