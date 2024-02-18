fun joinOptions(options: Collection<String>) =
    options.joinToString(prefix = "[", postfix = "]", separator = ", ")

fun main() {
    val options = listOf("a", "b", "c")
    val result = joinOptions(options)
    println(result)
}
