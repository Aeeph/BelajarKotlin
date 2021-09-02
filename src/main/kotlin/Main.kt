fun main(args: Array<String>) {
    // Try adding program arguments at Run/Debug configuration
    println("Program arguments: ${args.joinToString()}")

    print("Masukan Tinggi Anda! \n")
    val tinggi = readLine()
        println("$tinggi")
    if (tinggi != null) {
        if (tinggi >= 150.toString()) {
            println("Kamu Cukup Tinggi")
        } else {
            println("Maaf Kamu Pendek")
        }
    }


}