package array

fun main() {
    rotate(
        arrayOf(
            intArrayOf(5, 1, 9, 11),
            intArrayOf(2, 4, 8, 10),
            intArrayOf(13, 3, 6, 7),
            intArrayOf(15, 14, 12, 16),
        )
    )
}

fun rotate(matrix: Array<IntArray>) {
    for (i in matrix.indices) {
        for (j in i until matrix.size) {
            val temp = matrix[i][j]
            matrix[i][j] = matrix[j][i]
            matrix[j][i] = temp
        }

        println(matrix[i].toList().toString())

        reverseArray(matrix[i], 0, matrix[i].size - 1)
    }
}

