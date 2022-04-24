package tree

private class Symmetric {
    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }

    fun isSymmetric(root: TreeNode?): Boolean {
        if (root == null) return true

        return valid(root.left, root.right)
    }

    private fun valid(left: TreeNode?, right: TreeNode?): Boolean {
        if (left == null && right == null) return true

        if (left?.`val` != right?.`val`) return false


        return valid(left?.left, right?.right) && valid(left?.right, right?.left)
    }


}

fun main() {
    val s = Symmetric()
    val tn = Symmetric.TreeNode(1)
    tn.left = Symmetric.TreeNode(2)
    tn.right = Symmetric.TreeNode(2)
    tn.right = Symmetric.TreeNode(3)

    println(s.isSymmetric(tn))
}