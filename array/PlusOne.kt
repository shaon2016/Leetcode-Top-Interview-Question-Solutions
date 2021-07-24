package array

fun main() {
    println(plusOne(intArrayOf(4,3,2,1)).toList().toString())

}

fun plusOne(digits: IntArray): IntArray {

    for (i in digits.size - 1 downTo 0) {
        if (digits[i] < 9) {
            digits[i] = digits[i] + 1
            return digits
        }
        digits[i] = 0
    }

    val output = ArrayList<Int>()
    output.add(0, 1)
    output.addAll(digits.toList())

    return output.toIntArray()
}

//229
// 999