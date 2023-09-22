fun readStrings() = readln().split(" ")
fun readInts() = readStrings().map { it.toInt() }

fun solve(a: Int, b: Int): String {
    return ""
}

fun main() {
    while (true) {
        val (a, b) = readInts()
        if (a == 0 && b == 0) break
        val ans = solve(a, b)
        println(ans)
    }
}