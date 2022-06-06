fun main() {
    me({
        println(it)
    }, {
        return@me
        println(it)
    })

    println("Do this")
}

inline fun me(myName: (String) -> Unit, crossinline myAge: (Int) -> Unit) {
    myName("Christiano")
    myAge(36)
}

//inline fun <reified T : Any> Gson.fromJson(json: JsonElement): T =
//    this.fromJson(json, T::class.java)

