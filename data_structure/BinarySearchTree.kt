package data_structure

import kotlin.math.min

fun main() {
    val bst = BinarySearchTree()

    bst.insert(80)
    bst.insert(30)
    bst.insert(50)
    bst.insert(20)
    bst.insert(40)
    bst.insert(70)
    bst.insert(60)

    bst.delete(bst.root, 50)
    bst.traverseInSortedOrder(bst.root)

}

class BinarySearchTree {
    data class Node(var data: Int, var left: Node? = null, var right: Node? = null)

    var root: Node? = null

    private fun insertInToBST(workingNode: Node?, data: Int): Node {
        var currentRoot = workingNode

        when {
            currentRoot == null -> {
                currentRoot = Node(data)

                return currentRoot
            }
            data < currentRoot.data -> {
                currentRoot.left = insertInToBST(currentRoot.left, data)
            }
            else -> {
                currentRoot.right = insertInToBST(currentRoot.right, data)
            }
        }

        return currentRoot
    }

    fun insert(data: Int) {
        root = insertInToBST(root, data)
    }

    fun search(workingNode: Node?, data: Int): Boolean {
        if (workingNode == null) return false
        if (workingNode.data == data) return true

        return if (data > workingNode.data)
            search(workingNode.right, data)
        else
            search(workingNode.left, data)
    }

    fun traverse(workingNode: Node?) {
        if (workingNode != null) {
            print("${workingNode.data} ")

            traverse(workingNode.left)
            traverse(workingNode.right)
        }
    }

    fun traverseInSortedOrder(workingNode: Node?) {
        if (workingNode != null) {
            traverseInSortedOrder(workingNode.left)

            print("${workingNode.data} ")

            traverseInSortedOrder(workingNode.right)
        }
    }

    fun delete(root: Node?, data: Int): Node? {
        if (root == null) return root

        when {
            data < root.data -> root.left = delete(root.left, data)
            data > root.data -> root.right = delete(root.right, data)
            // data is found
            else -> {
                // node with only one child or no child
                if (root.left == null) return root.right
                else if (root.right == null) return root.left

                // Node with two children

                // Replacing it with min value
                root.data = findMin(root.right!!)
                root.right = delete(root.right, root.data)
            }
        }

        return root;
    }

    private fun findMin(root: Node): Int {
        var currentRoot = root
        var minValue = currentRoot.data
        while (currentRoot.left != null) {
            minValue = currentRoot.left!!.data
            currentRoot = currentRoot.left!!
        }

        return minValue
    }
}