package data_structure.linked_list

class LinkedList {
    private var head: Node? = null

    data class Node(var data: Int, var next: Node? = null)

    companion object {

        fun insert(list: LinkedList, data: Int) {
            val newNode = Node(data)

            // List is empty
            // Adding first node to head
            if (list.head == null)
                list.head = newNode
            else {
                // List is not empty

                var last = list.head!!

                // Traversing through the list
                while (last.next != null) {
                    last = last.next!!
                }
                // We are at the last node
                // Inserting the new node at last
                last.next = newNode
            }
        }

        fun printLinkedList(list: LinkedList) {
            // Taking the first node of the linked list
            var currentNode = list.head

            if (currentNode != null) {
                while (currentNode != null) {
                    print("${currentNode.data}\n")
                    currentNode = currentNode.next
                }
            } else {
                println("No data in linked list")
            }

        }

        fun reverseList(list: LinkedList) {
            var head = list.head
            var prev: Node? = null
            while (head != null) {
                val next = head.next
                head.next = prev
                prev = head
                head = next
            }
            list.head = prev
        }


    }

}