package dsi

import data_structure.BinarySearchTree


private fun main() {
    val mainNode = BinarySearchTree.Node(data = 5)
    mainNode.left = BinarySearchTree.Node(data = 4)
    mainNode.left?.left = BinarySearchTree.Node(data = 2)
    mainNode.left?.right = BinarySearchTree.Node(data = 3)

    mainNode.right = BinarySearchTree.Node(data = 7)
    mainNode.right?.left = BinarySearchTree.Node(data = 6)
    mainNode.right?.right = BinarySearchTree.Node(data = 8)


    val sum = sumABinaryNode(mainNode)
    println(System.currentTimeMillis() * 0.001)
    println(sum)
}

//                  5
//
//          4		    	7
//
//      2		3		6		8
//
//  Find the sum of node 7. Use recursion or stack:
// Output: 7 + 6 + 8 = 21

private fun sumABinaryNode(node: BinarySearchTree.Node?): Int {
    if (node == null) return 0
    if (node.left == null && node.right == null) return node.data

    val sumLeft = sumABinaryNode(node.left)
    val sumRight = sumABinaryNode(node.right)

    // Adding extra node.data why?
    // with left and right summation we are also adding the root data
    return sumLeft + sumRight + node.data
}