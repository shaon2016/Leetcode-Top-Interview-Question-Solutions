package hackerank_basic_test

fun main() {
    val numbers = intArrayOf(5, 10, 10)
    var twoDarray = Array(1) { Array(3) { 0 } }
    twoDarray[0][0] = 1
    twoDarray[0][1] = 2
    twoDarray[0][2] = 5

    println(findSum(numbers.toTypedArray(), twoDarray).toList())
}

fun findSum(numbers: Array<Int>, queries: Array<Array<Int>>): Array<Long> {
    val arr = ArrayList<Long>()

    for (i in queries.indices) {
        val firstIndex = queries[i][0]
        val lastIndex = queries[i][1]
        val number = queries[i][2]

        var sum = 0L
        for (j in firstIndex - 1 until lastIndex) {
            if (numbers[j] == 0) {
                sum += number
            }

            sum += numbers[j]
        }

        arr.add(sum)
    }

    return arr.toTypedArray()
}

//fun findSum(numbers: Array<Int>, queries: Array<Array<Int>>): Array<Long> {
//    val arr = ArrayList<Long>()
//    for (i in queries.indices) {
//        var sum = 0
//        for (j in queries[i][0] - 1 until queries[i][1]) {
//            sum += if (numbers[j] == 0) {
//                queries[i][2]
//            } else {
//                numbers[j]
//            }
//        }
//        arr.add(sum.toLong())
//    }
//    return arr.toTypedArray()
//}