package data_structure.tree

class SortedArrayToBST {
    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }

    fun sortedArrayToBST(nums: IntArray): TreeNode? {
        val start = 0
        val end = nums.size - 1

        return convertSortedArrayToBST(nums, start, end);
    }

    private fun convertSortedArrayToBST(
        nums: IntArray,
        start: Int,
        end: Int
    ): TreeNode? {
        if (start > end) return null
        val mid = (start + end) / 2
        val root = TreeNode(nums[mid])

        root.left = convertSortedArrayToBST(nums, start, mid - 1)
        root.right = convertSortedArrayToBST(nums, mid + 1, end)

        return root
    }


}

fun main() {

}