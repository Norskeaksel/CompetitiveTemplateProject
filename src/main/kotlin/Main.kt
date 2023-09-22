fun solve(n: Int): Int {
    return 0
}

fun main() {
    while (true) {
        val n = readlnOrNull()?.toInt() ?: break
        val ans = solve(n)
        println(ans)
    }
}