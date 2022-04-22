package other

fun transform(input: String): String {
        val chars = input.toCharArray()
        val charSet: MutableSet<Char> = HashSet()
        for (c in chars) {
            charSet.add(c)
        }
        val sb = StringBuilder()
        for (character in charSet) {
            sb.append(character)
        }
        return sb.toString()
    }

fun main() {
    println(transform("abbcbbb"))
}