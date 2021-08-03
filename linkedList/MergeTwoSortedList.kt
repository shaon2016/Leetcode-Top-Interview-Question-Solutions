package linkedList

fun main() {}

fun mergeTwoLists(l1: ListNode?, l2: ListNode?): ListNode? {
    var dummyNode: ListNode? = ListNode(0)
    var l11 = l1
    var l22 = l2

    var currentNode = dummyNode

    while (l11 != null && l22 != null) {
        if (l11.`val` > l22.`val`) {
            currentNode?.next = l22

            l22 = l22.next
        } else if (l11.`val` < l22.`val`) {
            currentNode?.next = l11
            l11 = l11.next
        }

        currentNode = currentNode?.next
    }

    if (l11 != null) {
        currentNode?.next = l11
    }
    if (l22 != null) {
        currentNode?.next = l22
    }


    return dummyNode?.next
}