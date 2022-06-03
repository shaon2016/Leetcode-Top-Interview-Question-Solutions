package vanhack

fun main() {
    println(minimumSwaps(arrayListOf(3, 1, 2, 4)))
}

fun minimumSwaps(arr: ArrayList<Int>): Int {

    val n = arr.size

    val arrPosition = ArrayList<Pair<Int, Int>>()
    for (i in 0 until n) arrPosition.add(Pair(arr[i], i))

    arrPosition.sortWith(Comparator { o1, o2->
        if (o1.first > o2.first) -1 else if (o1.first == o2.first) 0 else 1
    })



    val visited = Array(n) { false }

    var ans = 0

    for (i in 0 until n) {
        if (visited[i] || arrPosition[i].second == i) continue

        var newSize = 0
        var j = i

        while (!visited[j]) {
            visited[j] = true

            j = arrPosition[j].second

            newSize++
        }

        if (newSize > 0)
            ans += newSize - 1
    }


    return ans
}

