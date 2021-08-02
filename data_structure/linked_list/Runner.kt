package com.mediasoft.connectmediasoft.data_structure.linked_list

import data_structure.linked_list.LinkedList

fun main() {
    val linkedList = LinkedList()

    LinkedList.insert(linkedList, 1)
    LinkedList.insert(linkedList, 2)
    LinkedList.insert(linkedList, 3)

    LinkedList.printLinkedList(linkedList)

   // LinkedList.reverseList(linkedList)

   // println("Reverse Linked list")
   // LinkedList.printLinkedList(linkedList)

}