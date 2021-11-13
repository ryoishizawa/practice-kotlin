fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments at Run/Debug configuration
    println("Program arguments: ${args.joinToString()}")

    printMessageWithPrefix("Message Test")
    printMessageWithPrefix("Message Test for Warning", "WARN")
    // named arguments
    printMessageWithPrefix(prefix = "ERROR", message = "Message Test for Error")

    // infix functions
    infix fun Int.t(str: String) = str.repeat(this)
    println(3 t "Bye ")

    val pair = "A" to "Z"
    println(pair)

    // array
    val asc = Array(5) { i -> (i * i).toString() }
    println("=== array ===")
    asc.forEach { println(it) }
    println("=== modify array ===")
    println(asc[3])
    asc[3] = "3412"
    println(asc[3])
    // compile error
    // val asc2: Array<Any> = asc
    // Type projections
    val asc2: Array<out Any> = asc
    asc2.forEach { println(it) }
}

// optional parameter with default value `INFO`
fun printMessageWithPrefix(message: String, prefix: String = "INFO") {
    println("[$prefix] $message")
}