package data_structure.linked_list

fun deleteDuplicates(head: ListNode?): ListNode? {
    var last = head
    while (last?.next != null) {
        if (last.next!!.data == last.data) {
            last.next = last.next!!.next
        } else
            last = last.next
    }

    return head
}