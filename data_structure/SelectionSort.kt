package com.copotronic.leetcodepractice.data_structure

// Swap the element from higher to smallest

internal class SelectionSort {
    fun sort(arr: IntArray) {
        val n = arr.size
        // One by one move boundary of unsorted subarray
        for (i in 0 until n - 1) {
            // Find the minimum element in unsorted array
            var min_idx = i
            for (j in i + 1 until n)
                if (arr[j] < arr[min_idx])
                    min_idx = j
            // Swap the found minimum element with the first element
            val temp = arr[min_idx]
            arr[min_idx] = arr[i]
            arr[i] = temp
        }
    }

    // Prints the array
    fun printArray(arr: IntArray) {
        val n = arr.size
        for (i in 0 until n) print(arr[i].toString() + " ")
        println()
    }

    companion object {
        // Driver code to test above
        @JvmStatic
        fun main(args: Array<String>) {
            val ob = SelectionSort()
            val arr = intArrayOf(64, 25, 12, 22, 11)
            ob.sort(arr)
            println("Sorted array")
            ob.printArray(arr)
        }
    }
}