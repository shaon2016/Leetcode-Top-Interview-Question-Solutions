package data_structure.tree

import java.util.*
import kotlin.collections.ArrayList

fun main() {
    val node = TreeNode(1)
    node.left = TreeNode(2)
    node.right = TreeNode(3)
    node.left?.right = TreeNode(4)
    node.right?.right = TreeNode(5)

    println(levelOrder(node).toString())
}

fun levelOrder(root: TreeNode?): List<List<Int>> {
    if (root == null) return arrayListOf()

    val list = arrayListOf<ArrayList<Int>>()
    val queue: Queue<TreeNode?> = LinkedList()

    queue.add(root)
    list.add(arrayListOf(root.`val`))

    while (queue.isNotEmpty()) {
        val currentNodeList = arrayListOf<TreeNode>()
        val currentValues = arrayListOf<Int>()

        while (queue.isNotEmpty()) {
            val current = queue.remove()

            if (current?.left != null) {
                currentNodeList.add(current.left!!)
                currentValues.add(current.left!!.`val`)
            }

            if (current?.right != null) {
                currentNodeList.add(current.right!!)
                currentValues.add(current.right!!.`val`)
            }
        }


        queue.addAll(currentNodeList)

        if (currentValues.isNotEmpty())
            list.add(currentValues)
    }


    return list
}
