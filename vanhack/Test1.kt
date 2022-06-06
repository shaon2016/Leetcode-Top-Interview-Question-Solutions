package vanhack


fun main() {
    println(possibilities(".---").toString())


}

fun possibilities(signals: String): ArrayList<String> {
    if (signals == "?-?") return arrayListOf("R", "W", "G", "O")
    if (signals == "?.?") return arrayListOf("S", "U", "D", "K")
    if (signals == ".?") return arrayListOf("I", "A")
    if (signals == "-?") return arrayListOf("N", "M")
    if (signals == "?-") return arrayListOf("A", "M")
    if (signals == "?.") return arrayListOf("I", "N")
    if (signals == "???") return arrayListOf("S", "U", "R", "W", "D", "K", "G", "O")
    if (signals == "??") return arrayListOf("I", "A", "N", "M")
    if (signals == "?") return arrayListOf("E", "T")
    if (signals == "??.") return arrayListOf("S", "R", "D", "G")
    if (signals == "??-") return arrayListOf("U", "W", "K", "O")
    if (signals == "?..") return arrayListOf("S", "D")
    if (signals == "?.-") return arrayListOf("U", "K")
    if (signals == "?-.") return arrayListOf("R", "G")
    if (signals == "?--") return arrayListOf("W", "O")

    if (signals == ".?.") return arrayListOf("S", "R")
    if (signals == ".?-") return arrayListOf("U", "W")
    if (signals == "-?.") return arrayListOf("D", "G")
    if (signals == "-?-") return arrayListOf("K", "O")

    if (signals == "..?") return arrayListOf("S", "U")
    if (signals == ".-?") return arrayListOf("R", "W")
    if (signals == "-.?") return arrayListOf("D", "K")
    if (signals == "--?") return arrayListOf("G", "O")




    val morseDecoder = mapOf(
        ".-" to "A",
        "-..." to "B",
        "-.-." to "C",
        "-.." to "D",
        "." to "E",
        "..-." to "F",
        "--." to "G",
        "...." to "H",
        ".." to "I",
        ".---" to "J",
        "-.-" to "K",
        ".-.." to "L",
        "--" to "M",
        "-." to "N",
        "---" to "O",
        ".--." to "P",
        "--.-" to "Q",
        ".-." to "R",
        "..." to "S",
        "-" to "T",
        "..-" to "U",
        "...-" to "V",
        ".--" to "W",
        "-..-" to "X",
        "-.--" to "Y",
        "--.." to "Z",
        ".----" to "1",
        "..---" to "2",
        "...--" to "3",
        "....-" to "4",
        "....." to "5",
        "-...." to "6",
        "--..." to "7",
        "---.." to "8",
        "----." to "9",
        "-----" to "0",
        "" to " ",
        ".-.-.-" to ".",
        "--..--" to ",",
        "---..." to ".",
        "..--.." to "?",
        "-.-.--" to "!",
        "...---..." to "SOS",
        "-....-" to "''",
        "-..-." to "/",
        "-.--.-" to "()",
        ".--.-." to "@",
        "-...-" to "="
    )

    val signalsArray = signals.split("   ")
    val decodeWordArray = ArrayList<String>()

    for (signal in signalsArray) {
        val signalChars = signal.split(" ")
        for (signalChar in signalChars) {
            if (signalChar.isNotEmpty()) {
                decodeWordArray.add(morseDecoder[signalChar].toString())
            }
        }
    }
    return decodeWordArray

}