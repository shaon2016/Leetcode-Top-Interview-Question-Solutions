package array

fun main() {
    println(intersect(intArrayOf(1,2,2,1), intArrayOf(2,2)).toList().toString())

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

    return outputArray.toIntArray()
}