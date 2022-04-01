package practice

fun main() {
    println(intersect(intArrayOf(1,2,2,1), intArrayOf(2,2)).toList().toString())
}

fun intersect(nums1: IntArray, nums2: IntArray): IntArray {
    nums1.sort()
    val mid = nums1.size / 2

    val list = ArrayList<Int>()

    nums2.forEach { no2 ->
        if (no2 >= nums1[mid]) {
            for (i in mid until nums1.size) {
                if(no2 == nums1[i])
                    list.add(no2)
            }
        } else {
            for (i in mid - 1 downTo 0) {
                if(no2 == nums1[i])
                    list.add(no2)
            }
        }
    }

    return list.toIntArray()
}

// 4,4,8,9,9
// 4,9,5

