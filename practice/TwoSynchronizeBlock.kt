package practice

class TwoSynchronizeBlock {
    var i = 0
    var j = 0

    fun increment() {
        println("called 1")
        synchronized(i) {
            repeat((0 until 10).count()) {
                println("First: I -> ${i++} j -> ${j++}")
            }
        }
        println("called 2")
        synchronized(j) {
            repeat((0 until 10).count()) {
                println("Second: I -> ${i++} j -> ${j++}")
            }
        }
        println("called 3")
    }
}

fun main() {
    val o = TwoSynchronizeBlock()
    o.increment()
    o.increment()
}