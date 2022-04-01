package andela

// Do they belong
// triangle

fun main() {
    println(length(2, 1, 3, 4))
}

fun pointsBelong(
    x1: Int,
    y1: Int,
    x2: Int,
    y2: Int,
    x3: Int,
    y3: Int,
    xp: Int,
    yp: Int,
    xq: Int,
    yq: Int
): Int {
    // checking no  degenerate triangle or not
    val ab = length(x1, y1, x2, y2)
    val bc = length(x2, y2, x3, y3)
    val ac = length(x1, y1, x3, y3)

    if (
        !((Math.abs(ab) + Math.abs(bc) > Math.abs(ac)) &&
                Math.abs(bc) + Math.abs(ac) > Math.abs(ab) &&
                Math.abs(ab) + Math.abs(ac) > Math.abs(bc))
    ) return 0

    // Checking P is inside or not
    val ABC = area(x1, y1, x2, y2, x3, y3)

    val PBC = area(xp, yp, x2, y2, x3, y3)

    val PAC = area(x1, y1, xp, yp, x3, y3)

    val PAB = area(x1, y1, x2, y2, xp, yp)

    var isPInside = false
    if (ABC == PBC + PAC + PAB) isPInside = true

    // Checking is q is inside or not

    val QBC = area(xq, yq, x2, y2, x3, y3)

    val QAC = area(x1, y1, xq, yq, x3, y3)

    val QAB = area(x1, y1, x2, y2, xq, yq)

    var isQInside = false
    if (ABC == QBC + QAC + QAB) isQInside = true

    if(isPInside && !isQInside) return 1
    if(!isPInside && isQInside) return 2
    if(isPInside && isQInside) return 3
    if(!isPInside && !isQInside) return 4

    return 0
}

fun length(x1: Int, y1: Int, x2: Int, y2: Int): Double {
    return Math.sqrt(
        (Math.pow((x2 - x1).toDouble(), 2.0)) + Math.pow(
            (y2 - y1).toDouble(),
            2.0
        )
    )
}

fun area(
    x1: Int, y1: Int, x2: Int, y2: Int,
    x3: Int, y3: Int
): Double {
    return Math.abs((x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2)) / 2.0)
}
