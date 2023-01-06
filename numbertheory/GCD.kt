package numbertheory

// a boro holeo modulus korle seta dekha jay je
// a choto and b boro always

fun main() {
    println("FINAL GCD: ${gcd(36, 10)}")
}

private fun gcd(a: Int, b: Int): Int {
    println("Per recursion -> a: $a b: $b")

    if (a == 0) return b

    return gcd(b % a, a)
}