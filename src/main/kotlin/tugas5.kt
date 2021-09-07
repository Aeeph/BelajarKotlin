fun main(args : Array<String>) {

    //single line comment (Membuat deklarasi kodingan)
    var i = 2
    val kota = arrayListOf("Bogor", "Jakarta", "Bekasi")
    for (i in kota){
        println("Kota : $i")
    }

    /* multiple comment
    *membuat pengulangan menggunakan forEach
    */
    kota.forEach{
        println("kota : $it")
    }

}
