package linkedList

fun main() {
    val head = ListNode(1)
    head.next = ListNode(2)
    head.next?.next = ListNode(3)
    head.next?.next?.next = ListNode(4)
    head.next?.next?.next?.next = ListNode(5)

    removeNthFromEnd(head, 2)
}

fun removeNthFromEnd(head: ListNode?, n: Int): ListNode? {

    if (head == null) return head

    var dummy = head

    var length = 1

    while (dummy?.next != null) {
        length++
        dummy = dummy.next
    }

    dummy = head

    for (i in 1 until (length - n)) {
        dummy = dummy?.next
    }

    dummy?.next = dummy?.next?.next

    return dummy
}