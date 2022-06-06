package array

fun main() {
    println(intersect(intArrayOf(1, 2, 2, 1), intArrayOf(2, 2)).toList().toString())

}

fun intersect(nums1: IntArray, nums2: IntArray): IntArray {
    val outputArray = arrayListOf<Int>()
    val arrayList = arrayListOf<Int>()

    nums1.forEach {
        arrayList.add(it)
    }

    nums2.forEach {
        if (arrayList.contains(it)) {
            arrayList.remove(it)
            outputArray.add(it)
        }

    }
//    nums1.sort()
//    nums2.sort()
//    val outputArray = arrayListOf<Int>()
//
//    var one = 0
//    var two = 0
//
//    while (one < nums1.size && two < nums2.size) {
//        when {
//            nums1[one] == nums2[two] -> {
//                outputArray.add(nums1[one])
//                one++
//                two++
//            }
//            nums1[one] < nums2[two] -> one++
//            else -> two++
//        }
//    }

    return outputArray.toIntArray()
}