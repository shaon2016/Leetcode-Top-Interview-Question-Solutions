package com.copotronic.leetcodepractice.data_structure

// Java program for implementation of Bubble Sort
// Swap the element from smallest to higher
internal class BubbleSort {
    fun bubbleSort(arr: IntArray) {
        val n = arr.size
        for (i in 0 until n - 1)
            for (j in 0 until n - i - 1)
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j+1] and arr[i]
                    val temp = arr[j]
                    arr[j] = arr[j + 1]
                    arr[j + 1] = temp
                }
    }

    /* Prints the array */
    fun printArray(arr: IntArray) {
        val n = arr.size
        for (i in 0 until n) print(arr[i].toString() + " ")
        println()
    }

    companion object {
        // Driver method to test above
        @JvmStatic
        fun main(args: Array<String>) {
            val ob = BubbleSort()
            val arr = intArrayOf(64, 34, 25, 12, 22, 11, 90)
            ob.bubbleSort(arr)
            println("Sorted array")
            ob.printArray(arr)
        }
    }
}