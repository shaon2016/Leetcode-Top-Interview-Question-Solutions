package linkedList

fun main() {
    reverseList(ListNode(5))
}

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

fun reverseList(head: ListNode?): ListNode? {
    if (head == null) return null

    var prev: ListNode? = null
    var head2 = head

    while (head2!!.next != null) {
        val next = head2.next
        head2.next = prev
        prev = head2
        head2 = next!!
    }

    head2.next = prev
    prev = head2

    return prev
}