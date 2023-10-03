fun readStrings() = readln().split(" ")
fun readInt() = readln().toInt()
fun readInts() = readStrings().map { it.toInt() }
fun readLong() = readln().toLong()
fun readLongs() = readStrings().map { it.toLong() }
fun readDouble() = readln().toDouble()
fun readDoubles() = readStrings().map { it.toDouble() }

fun main() {
    val n = 1 //readInt()
    repeat (n) {
        val line = readln()
        val ans = solve(line)
        println(ans)
    }
}

fun solve(line:String): String {
    return ""
}

