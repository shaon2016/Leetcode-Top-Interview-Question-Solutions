package com.copotronic.leetcodepractice.data_structure

// Java program for implementation of Insertion Sort
internal class InsertionSort {
    /*Function to sort array using insertion sort*/
    fun sort(arr: IntArray) {
        val n = arr.size
        for (i in 1 until n) {
            val key = arr[i]
            var j = i - 1
            /* Move elements of arr[0..i-1], that are
			greater than key, to one position ahead
			of their current position */
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j]
                j = j - 1
            }
            arr[j + 1] = key
        }
    }

    companion object {
        /* A utility function to print array of size n*/
        fun printArray(arr: IntArray) {
            val n = arr.size
            for (i in 0 until n) print(arr[i].toString() + " ")
            println()
        }

        // Driver method
        @JvmStatic
        fun main(args: Array<String>) {
            val arr = intArrayOf(12, 11, 13, 5, 6)
            val ob = InsertionSort()
            ob.sort(arr)
            printArray(arr)
        }
    }
} /* This code is contributed by Rajat Mishra. */