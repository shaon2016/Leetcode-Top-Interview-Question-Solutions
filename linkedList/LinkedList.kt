package linkedList

class LinkedList {
    data class Node(var data: Int, var next: Node? = null)

    var head: Node? = null

    companion object {
        fun insert(list: LinkedList, data: Int) {
            val newNode = Node(data)

            if (list.head == null) {
                list.head = newNode
            } else {
                var last = list.head!!

                while (last.next != null) {
                    last = last.next!!
                }

                last.next = newNode
            }
        }

        fun reverse() {

        }
    }
}