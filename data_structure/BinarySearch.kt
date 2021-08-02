package com.copotronic.leetcodepractice.data_structure

// Java implementation of recursive Binary Search
internal class BinarySearch {
    // Returns index of x if it is present in arr[l..
// r], else return -1
    fun binarySearch(arr: IntArray, l: Int, r: Int, x: Int): Int {
        if (r >= l) {
            val mid = l + (r - l) / 2
            // If the element is present at the
// middle itself
            if (arr[mid] == x) return mid
            // If element is smaller than mid, then
// it can only be present in left subarray
            return if (arr[mid] > x) binarySearch(arr, l, mid - 1, x) else binarySearch(
                arr,
                mid + 1,
                r,
                x
            )
            // Else the element can only be present
// in right subarray
        }
        // We reach here when element is not present
// in array
        return -1
    }

    companion object {
        // Driver method to test above
        @JvmStatic
        fun main(args: Array<String>) {
            val ob = BinarySearch()
            val arr = intArrayOf(2, 3, 4, 10, 40)
            val n = arr.size
            val x = 10
            val result = ob.binarySearch(arr, 0, n - 1, x)
            if (result == -1) println("Element not present") else println("Element found at index $result")
        }
    }
}