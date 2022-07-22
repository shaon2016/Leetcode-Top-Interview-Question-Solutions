package data_structure.tree

import kotlin.math.abs
import kotlin.math.max

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
 

    fun isBalanced(root: TreeNode?) = dfs(root)[0] as Boolean

    private fun dfs(root: TreeNode?): ArrayList<Any> {
        if (root == null) return arrayListOf(true, 0) // tree is empty and it is already balanced

        val left = dfs(root.left)
        val right = dfs(root.right)

        val isBalanced = (left[0] as Boolean && right[0] as Boolean)
                && abs(left[1] as Int - right[1] as Int) < 2

        return arrayListOf(isBalanced, 1 + max(left[1] as Int, right[1] as Int))
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

//    val tn = TreeNode(35)
//    tn.left = TreeNode(21)
//    tn.left?.left = TreeNode(13)
//    tn.left?.right = TreeNode(29)
//    tn.left?.right?.right = TreeNode(32)
//
//    tn.right = TreeNode(48)
//    tn.right?.right = TreeNode(79)

    //[1,null,2,null,3]
//    val tn = TreeNode(1)
//    tn.right = TreeNode(2)
//    tn.right?.right = TreeNode(3)

    //[1,2,3,4,5,6,null,8]
//    val tn = TreeNode(1)
//    tn.left = TreeNode(2)
//    tn.right = TreeNode(3)
//    tn.left?.left = TreeNode(4)
//    tn.left?.right = TreeNode(5)
//    tn.right?.left = TreeNode(6)
//    tn.left?.left?.left = TreeNode(8)

//[1,2,2,3,null,null,3,4,null,null,4]
//    val tn = TreeNode(1)
//    tn.left = TreeNode(2)
//    tn.right = TreeNode(2)
//    tn.left?.left = TreeNode(3)
//    tn.right?.right = TreeNode(3)
//    tn.left?.left?.left = TreeNode(4)
//    tn.right?.right?.right = TreeNode(4)

//    [1,2,3,4,5,null,6,7,null,null,null,null,8]
//    val tn = TreeNode(1)
//    tn.left = TreeNode(2)
//    tn.right = TreeNode(3)
//    tn.right?.right = TreeNode(6)
//    tn.right?.right?.left = TreeNode(8)
//    tn.left?.left = TreeNode(4)
//    tn.left?.left?.left = TreeNode(7)
//    tn.left?.right = TreeNode(5)

    //3,9,20,null,null,15,7
    val tn = TreeNode(3)
    tn.left = TreeNode(9)
    tn.right = TreeNode(20)
    tn.right?.left = TreeNode(15)
    tn.right?.right = TreeNode(7)
    println(bbt.isBalanced(tn))
}
