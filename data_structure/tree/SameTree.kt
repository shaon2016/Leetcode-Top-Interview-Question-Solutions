package data_structure.tree

fun isSameTree(p: TreeNode?, q: TreeNode?): Boolean {
    if (p == null && q == null) return true
    if (p == null || q == null) return false
    if (p.`val` != q.`val`) return false

    return isSameTree(p.left, q.left) && isSameTree(p.right, q.right)
}

fun main() {
    val p = TreeNode(1)
    p.left = TreeNode(2)
    p.right = TreeNode(3)
    val q = TreeNode(1)
    q.left = TreeNode(2)
    q.right = TreeNode(3)

    println(isSameTree(p, q))
}