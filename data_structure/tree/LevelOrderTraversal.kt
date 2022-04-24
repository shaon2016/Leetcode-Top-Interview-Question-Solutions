package tree

import java.util.*
import kotlin.collections.ArrayList

private class LevelOrderTraversal {
    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }

    fun levelOrder(root: TreeNode?): List<List<Int>> {
        if (root == null) return emptyList()

        val items: ArrayList<ArrayList<Int>> = arrayListOf()

        val queue: Queue<TreeNode> = LinkedList()
        queue.add(root)

        while (queue.isNotEmpty()) {
            // insert queue's current node to a list.
            val currentNodes = arrayListOf<TreeNode>()
            val currentItems = arrayListOf<Int>()
            while (queue.isNotEmpty()) {
                val currentNode = queue.remove()
                currentNodes.add(currentNode)
            }
            // find their left and right child and insert to queue
            currentNodes.forEach {currentNode->
                if (currentNode.left != null) queue.add(currentNode.left)
                if (currentNode.right != null) queue.add(currentNode.right)

                currentItems.add(currentNode.`val`)
            }

            items.add(currentItems)
        }

        return items
    }
}

fun main() {

}