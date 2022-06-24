package other

fun main() {
    println(findNearestLargestNo(12001))
}


private fun findNearestLargestNo(givenNo: Int): Int {
    val givenNoCharArray = givenNo.toString().toCharArray()

    val storeAllPossibleNo = ArrayList<Int>()

    permutationsHelper(givenNoCharArray, storeAllPossibleNo, givenNo, 0)

    storeAllPossibleNo.sortDescending()

    if(storeAllPossibleNo.isNotEmpty()) return storeAllPossibleNo.first()

    return -1
}

private fun permutationsHelper(
    givenNoCharArray: CharArray,
    storeAllPossibleNo: ArrayList<Int>,
    givenNo: Int,
    pos: Int
) {
    if (pos >= givenNoCharArray.size - 1) {

        val numberString = StringBuilder()

        for (element in givenNoCharArray) {
            numberString.append(element.toString())
        }

        val currentNo = numberString.toString().toInt()

        if (currentNo < givenNo)
            storeAllPossibleNo.add(currentNo)

        return
    }
    for (i in pos until givenNoCharArray.size) {
        var t = givenNoCharArray[pos]
        givenNoCharArray[pos] = givenNoCharArray[i]
        givenNoCharArray[i] = t
        permutationsHelper(givenNoCharArray, storeAllPossibleNo, givenNo, pos + 1)
        t = givenNoCharArray[pos]
        givenNoCharArray[pos] = givenNoCharArray[i]
        givenNoCharArray[i] = t
    }
}
