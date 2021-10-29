package tree


private class ValidBSTSolution {
    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }

    fun isValidBST(root: TreeNode?): Boolean {
        return valid(root, Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY)
    }

    fun valid(root: TreeNode?, left: Double, right: Double): Boolean {
        if (root == null) return true

        if (!(left < root.`val` && root.`val` < right)) return false

        return valid(root.left, left, root.`val`.toDouble()) &&
                valid(root.right, root.`val`.toDouble(), right)
    }

}

fun main() {
    val vv = ValidBSTSolution()

}

