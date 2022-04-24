package data_structure.tree

import kotlin.math.abs

/**
 * Example:
 * var ti = TreeNode(5)
 * var v = ti.`val`
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */


class BalancedBinaryTree {
    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }

    fun isBalanced(root: TreeNode?): Boolean {
        if (root == null) return true

        val lHeight = findTreeHeight(root.left)
        val rHeight = findTreeHeight(root.right)

        if(abs(lHeight - rHeight) > 1) return false
        return true
    }

    private fun findTreeHeight(root: TreeNode?): Int {
        if (root == null) return 0

        val lHeight = findTreeHeight(root.left)
        val rHeight = findTreeHeight(root.right)

        return if (lHeight > rHeight) lHeight + 1
        else rHeight + 1
    }

}

fun main() {
    val bbt = BalancedBinaryTree()

//    val tn = BalancedBinaryTree.TreeNode(35)
//    tn.left = BalancedBinaryTree.TreeNode(21)
//    tn.left?.left = BalancedBinaryTree.TreeNode(13)
//    tn.left?.right = BalancedBinaryTree.TreeNode(29)
//    tn.left?.right?.right = BalancedBinaryTree.TreeNode(32)
//
//    tn.right = BalancedBinaryTree.TreeNode(48)
//    tn.right?.right = BalancedBinaryTree.TreeNode(79)

    //[1,null,2,null,3]
//    val tn = BalancedBinaryTree.TreeNode(1)
//    tn.right = BalancedBinaryTree.TreeNode(2)
//    tn.right?.right = BalancedBinaryTree.TreeNode(3)

    //[1,2,3,4,5,6,null,8]
//    val tn = BalancedBinaryTree.TreeNode(1)
//    tn.left = BalancedBinaryTree.TreeNode(2)
//    tn.right = BalancedBinaryTree.TreeNode(3)
//    tn.left?.left = BalancedBinaryTree.TreeNode(4)
//    tn.left?.right = BalancedBinaryTree.TreeNode(5)
//    tn.right?.left = BalancedBinaryTree.TreeNode(6)
//    tn.left?.left?.left = BalancedBinaryTree.TreeNode(8)

//[1,2,2,3,null,null,3,4,null,null,4]
//    val tn = BalancedBinaryTree.TreeNode(1)
//    tn.left = BalancedBinaryTree.TreeNode(2)
//    tn.right = BalancedBinaryTree.TreeNode(2)
//    tn.left?.left = BalancedBinaryTree.TreeNode(3)
//    tn.right?.right = BalancedBinaryTree.TreeNode(3)
//    tn.left?.left?.left = BalancedBinaryTree.TreeNode(4)
//    tn.right?.right?.right = BalancedBinaryTree.TreeNode(4)

//    [1,2,3,4,5,null,6,7,null,null,null,null,8]
    val tn = BalancedBinaryTree.TreeNode(1)
    tn.left = BalancedBinaryTree.TreeNode(2)
    tn.right = BalancedBinaryTree.TreeNode(3)
    tn.right?.right = BalancedBinaryTree.TreeNode(6)
    tn.right?.right?.left = BalancedBinaryTree.TreeNode(8)
    tn.left?.left = BalancedBinaryTree.TreeNode(4)
    tn.left?.left?.left = BalancedBinaryTree.TreeNode(7)
    tn.left?.right = BalancedBinaryTree.TreeNode(5)

    println(bbt.isBalanced(tn))
}
