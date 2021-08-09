package linkedList

fun main() {
    // 1,2,2,1
    val head = ListNode(1)
    head.next = ListNode(2)
    head.next?.next = ListNode(2)
    head.next?.next?.next = ListNode(1)

    isPalindrome(head)
}

fun isPalindrome(head: ListNode?): Boolean {
    var length = 0

    var dummy: ListNode? = ListNode(0)
    var reverseDummy: ListNode? = reverseList(head)
    dummy?.next = head

    while (dummy != null) {
        length++
        dummy = dummy.next
    }

    println(length)

    dummy = head

    for (i in 0 until length ) {

        println("Dummy val : ${dummy?.`val`} and ReverseDummy Val : ${reverseDummy?.`val`}")
        
        if (dummy?.`val` != reverseDummy?.`val`) {
            return false
        }
    }

    return true
}
