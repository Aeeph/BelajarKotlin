fun main(args: Array<String>) {

    print("Masukan Angka Max 100!\n")
    var angkaawal = 1
    val batasangka = readLine()!!.toInt()
    while (true){
        println("angka $angkaawal")
        angkaawal++

        if (angkaawal > batasangka){
        break
        }
    }
    println("Angka Ganjil")
    for (angkaawal in 1..batasangka){
        if (angkaawal % 2 == 0){
            continue
        }
        println("angka $angkaawal\n")
    }
    println("Angka Ganjil")

}