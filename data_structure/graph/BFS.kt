package data_structure.graph

import java.util.*

data class Vertex(
    val data: Int,
    var visited: Boolean = false,
    var neighbours: List<Vertex> = LinkedList(),
)

class BFS(private val startVertex: Vertex) {
    fun traverse() {
        val queue: Queue<Vertex> = LinkedList()
        queue.add(startVertex)

        while (queue.isNotEmpty()) {
            // remove and poll method remove an item from queue
            // But remove throws exception if queue empty
            // poll return null if q empty
            val currentVertex = queue.remove()

            if (!currentVertex.visited) {
                currentVertex.visited = true
                println(currentVertex.data)
                queue.addAll(currentVertex.neighbours)
            }
        }

    }
}

fun main() {
    val v0 = Vertex(0)
    val v1 = Vertex(1)
    val v2 = Vertex(2)
    val v3 = Vertex(3)

    v0.neighbours = LinkedList(arrayListOf(v1, v2))
    v1.neighbours = LinkedList(arrayListOf(v2))
    v2.neighbours = LinkedList(arrayListOf(v0, v3))
    v3.neighbours = LinkedList(arrayListOf(v3))

    BFS(v2).traverse()
}