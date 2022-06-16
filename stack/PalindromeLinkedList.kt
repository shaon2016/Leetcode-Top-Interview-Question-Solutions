package stack

import java.util.*

fun main() {

    val head = ListNode(1)
    head.next = ListNode(2)
//    head.next?.next = ListNode(2)
//    head.next?.next?.next = ListNode(1)

    println(isPalindrome(head))
}

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

fun isPalindrome(head: ListNode?): Boolean {
    if (head == null) return true

    val stack = Stack<Int>()

    var currentHead = head
    while (currentHead != null) {
        stack.push(currentHead.`val`)
        currentHead = currentHead.next
    }

    currentHead = head

    for (i in stack.size - 1 downTo 0) {
        if (stack[i] != currentHead?.`val`) return false
        currentHead = currentHead?.next
    }

    return true
}