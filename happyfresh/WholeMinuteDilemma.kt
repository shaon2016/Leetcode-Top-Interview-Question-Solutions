package happyfresh

fun playlist(songs: Array<Int>): Long {
    val map: MutableMap<Int, Int> = HashMap()
    var count = 0L
    for (s in songs) {
        println((60 - s % 60) % 60)
        if (map.containsKey((60 - s % 60) % 60)) {
            count += map[(60 - s % 60) % 60]!!
        }
        map[s % 60] = map.getOrDefault(s % 60, 0) + 1
    }
    return count
}

fun numPairsDivisibleBy60(time: IntArray): Int {
    val map: MutableMap<Int, Int> = HashMap()
    var count = 0
    for (t in time) {
        // Checking the other value that makes 60 contains or not
        if (map.containsKey((60 - t % 60) % 60)) {
            count += map[(60 - t % 60) % 60]!!
        }
        map[t % 60] = map.getOrDefault(t % 60, 0) + 1
    }
    return count
}

fun main() {
    println(playlist(intArrayOf(30, 20, 150, 100, 40).toTypedArray()))
}