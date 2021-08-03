package data_structure.sorting

fun main() {
    println(QuickSort.sort(intArrayOf(4, 2, 1,0,1)).toList().toString())
}

class QuickSort {

    companion object {
        fun sort(a: IntArray): IntArray {
            quickSort(a, 0, a.size - 1)

            return a
        }

        private fun quickSort(a: IntArray, start: Int, end: Int) {
            if (start < end) {
                val partitionIndex = partition(a, start, end)

                quickSort(a, start, partitionIndex - 1)
                quickSort(a, partitionIndex + 1, end)
            }
        }

        private fun partition(a: IntArray, start: Int, end: Int): Int {
            var partitionIndex = start
            val pivot = a[end]

            var i = start
            while (i < end) {
                if (a[i] <= pivot) {
                    swap(a, i, partitionIndex)
                    partitionIndex++
                }
                i++
            }
            swap(a, partitionIndex, end)

            return partitionIndex
        }

        private fun swap(a: IntArray, valueIndex1: Int, valueIndex2: Int) {
            val temp = a[valueIndex1]
            a[valueIndex1] = a[valueIndex2]
            a[valueIndex2] = temp
        }
    }
}

