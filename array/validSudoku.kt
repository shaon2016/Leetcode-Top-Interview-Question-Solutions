package array


fun main() {
    val hashSet = HashSet<String>()

    println(hashSet.add("asd"))
    println(hashSet.add("asd"))
}

fun isValidSudoku(board: Array<CharArray>): Boolean {

    val hashSet = HashSet<String>()

    for (i in 0 until 9) {
        for (j in 0 until 9) {
            val value = board[i][j]

            if (value != '.') {
                if (!hashSet.add("$value found in row $i") ||
                    !hashSet.add("$value found in column $j") ||
                    !hashSet.add("$value found in box ${i / 3} ${j / 3}")
                )
                    return false
            }
        }
    }

    return true
}