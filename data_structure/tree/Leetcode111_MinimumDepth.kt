package data_structure.tree

import java.util.*

fun main() {
    val root = TreeNode(2)

    root.right = TreeNode(3)
    root.right?.right = TreeNode(5)
    root.right?.right?.right = TreeNode(7)

    println(minDepth(root))
}

/**
 *                2
 *           1         3
 *       -1     12         5
 *                            7
 * */

fun minDepth(root: TreeNode?): Int {
    if (root == null) return 0

    var level = 0
    val queue: LinkedList<TreeNode> = LinkedList()
    queue.add(root)

    var isNoLeafFound = false

    while (queue.isNotEmpty()) {
        level++

        val children = arrayListOf<TreeNode>()

        while (queue.isNotEmpty()) {
            val current = queue.remove()

            if (current.left == null && current.right == null) {
                isNoLeafFound = true
                break
            }

            if (current.left != null) {
                children.add(current.left!!)
            }

            if (current.right != null) {
                children.add(current.right!!)
            }

        }

        if (isNoLeafFound) break
        queue.addAll(children)
    }

    return level
}