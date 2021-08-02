package data_structure.linked_list

fun main() {

}

/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class ListNode(var data: Int) {
    var next: ListNode? = null
}

// Leetcode problem
fun reverseList(head: ListNode?): ListNode? {
    var headA = head
    var prev: ListNode? = null
    while (headA != null) {
        val next = headA.next
        headA.next = prev
        prev = headA
        headA = next
    }
    return prev
}