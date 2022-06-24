package practice

import data_structure.BinarySearchTree

fun main() {
    val mainNode = BinarySearchTree.Node(data = 5)
    mainNode.left = BinarySearchTree.Node(data = 4)
    mainNode.left?.left = BinarySearchTree.Node(data = 2)
    mainNode.left?.right = BinarySearchTree.Node(data = 3)

    mainNode.right = BinarySearchTree.Node(data = 7)
    mainNode.right?.left = BinarySearchTree.Node(data = 6)
    mainNode.right?.right = BinarySearchTree.Node(data = 8)

    if (findANoFromTree(mainNode, 9) == 9)
        println("Found")
    else println("Not Found")
}

fun findANoFromTree(node: BinarySearchTree.Node?, desiredNo: Int): Int {
    if (node == null) return -1

    val noLeft = findANoFromTree(node.left, desiredNo)
    val noRight = findANoFromTree(node.right, desiredNo)

    if (noLeft == desiredNo || noRight == desiredNo || node.data == desiredNo)
        return desiredNo
    return -1
}
