package data_structure.tree

import java.util.*
import kotlin.collections.ArrayList

fun main() {
    val node = SortedArrayToBST.TreeNode(1)
    node.left = SortedArrayToBST.TreeNode(2)
    node.right = SortedArrayToBST.TreeNode(3)
    node.left?.right = SortedArrayToBST.TreeNode(4)
    node.right?.right = SortedArrayToBST.TreeNode(5)

    println(levelOrder(node).toString())
}

fun levelOrder(root: SortedArrayToBST.TreeNode?): List<List<Int>> {
    if (root == null) return arrayListOf()

    val list = arrayListOf<ArrayList<Int>>()
    val queue: Queue<SortedArrayToBST.TreeNode?> = LinkedList()

    queue.add(root)
    list.add(arrayListOf(root.`val`))

    while (queue.isNotEmpty()) {
        val current = queue.remove()

        val currentNodeList = arrayListOf<SortedArrayToBST.TreeNode>()
        val currentValues = arrayListOf<Int>()

        if (current?.left != null) {
            currentNodeList.add(current.left!!)
            currentValues.add(current.left!!.`val`)
        }

        if (current?.right != null) {
            currentNodeList.add(current.right!!)
            currentValues.add(current.right!!.`val`)
        }

        queue.addAll(currentNodeList)

        if (currentValues.isNotEmpty())
            list.add(currentValues)
    }


    return list
}