package vanhack

fun main() {
    println(autocorrect("youuu should begin on Monday"))



}

fun autocorrect(text: String): String {
    var newString = ""


    val textArray = text.split(" ")
    val newArray = arrayListOf<String>()

    for (word in textArray) {
        val array = word.toCharArray()
        val setChars = hashSetOf<Char>()
        setChars.addAll(array.asList())

        if (word == "u" || word.contains("you") && setChars.size == 3
            && !word.contains("youy")) {
            newString = word.replace(word, "your client")
            newArray.add(newString)
        } else if ( word.contains("you.") && setChars.size == 4 ||  word == "u.") {
            newString = word.replace(word, "your client.")
            newArray.add(newString)
        } else newArray.add(word)
    }

    var result = ""

    for (i in newArray.indices) {
        result += newArray[i]

        if (i < newArray.size - 1) result += " "
     }

    return result
}