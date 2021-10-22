package data_structure

fun main() {
    val bst = BinarySearchTree()

//    bst.root =  BinarySearchTree.Node(45)
//    bst.root!!.left =  BinarySearchTree.Node(10)
//    bst.root?.right =  BinarySearchTree.Node(90)
//    bst.root?.left?.left =  BinarySearchTree.Node(7)
//    bst.root?.left?.right =  BinarySearchTree.Node(12)
//
//    bst.traverseInSortedOrder(bst.root)

    bst.root = BinarySearchTree.Node(50)
    val root1 = bst.insert(bst.root, 30)
    val root2 = bst.insert(root1, 20)

    bst.traverseInSortedOrder(bst.root)

}

class BinarySearchTree {
    data class Node(var data: Int, var left: Node? = null, var right: Node? = null)

    var root: Node? = null

    fun insert(workingNode: Node?, data: Int): Node {
        var currentRoot = workingNode

        when {
            currentRoot == null -> {
                currentRoot = Node(data)

                return currentRoot
            }
            data < currentRoot.data -> {
                currentRoot.left = insert(currentRoot.left, data)
            }
            else -> {
                currentRoot.right = insert(currentRoot.right, data)
            }
        }

        return currentRoot
    }

    private fun search(workingNode: Node?, data: Int): Boolean {
        if (workingNode == null) return false
        if (workingNode.data == data) return true

        return if (data > workingNode.data)
            search(workingNode.right, data)
        else
            search(workingNode.left, data)
    }

    private fun traverse(workingNode: Node?) {
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
}