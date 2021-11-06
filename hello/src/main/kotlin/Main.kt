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
}

// optional parameter with default value `INFO`
fun printMessageWithPrefix(message: String, prefix: String = "INFO") {
    println("[$prefix] $message")
}