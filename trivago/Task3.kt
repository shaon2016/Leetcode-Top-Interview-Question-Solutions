package trivago

fun main() {
    val hi = Hi()

    val u = University(hi)

    println(u.getPaidCoursesWithTheNumbersOfSubscribedStudents(3))
}

class Hi : Repository<Student> {
    val s1 = Student(
        id = 1,
        name = "asd",
        subscribedCourses = arrayListOf(
            Course(id = 1, name = "Maths", isPaid = false),
            Course(id = 2, name = "Arts", isPaid = true)
        )
    )
    val s2 = Student(
        id = 1,
        name = "asd",
        subscribedCourses = arrayListOf(
            Course(id = 3, name = "History", isPaid = true),
            Course(id = 4, name = "Biology", isPaid = true)
        )
    )
    val s3 = Student(
        id = 1,
        name = "asd",
        subscribedCourses = arrayListOf(
            Course(id = 5, name = "Physics", isPaid = true),
            Course(id = 3, name = "History", isPaid = true)
        )
    )

    override fun get(): Iterable<Student> {
        return arrayListOf(s1, s2, s3)
    }
}

class University(private val repository: Repository<Student>) {
    fun getPaidCoursesWithTheNumbersOfSubscribedStudents(coursesCount: Int): Map<Course, Int> {
        val map = HashMap<Course, Int>()

        repository.get().forEach { student ->
            student.subscribedCourses.forEach { course ->
                if (course.isPaid) {
                    if (map.containsKey(course)) {
                        map[course] = map[course]!!.plus(1)
                    } else {
                        map.putIfAbsent(course, 1)
                    }
                }
            }
        }


        return map.toList().sortedByDescending { (_, value) -> value }.subList(0, coursesCount)
            .toMap()
    }
}

interface Repository<T> {
    fun get(): Iterable<T>
}

typealias Id = Int

data class Student(val id: Id, val name: String, val subscribedCourses: List<Course>)

data class Course(val id: Id?, val name: String, val isPaid: Boolean)