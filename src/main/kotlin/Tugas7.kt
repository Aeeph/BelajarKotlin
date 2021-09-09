
//perkenalan nama Mahasiswa
class Mahasiswa {
    var name : String = ""
    var nim : String = ""
    var prodi : String = ""
}
fun main (){
    val object1 = Mahasiswa()
    val object2 = Mahasiswa()
    val object3 = Mahasiswa()

    object1.name = "Hanif Hidayaturrahman"
    object1.nim = "181106041179"
    object1.prodi = "Teknik Informatika"
    object2.name = "Muslih Himawan"
    object2.nim = "181106041149"
    object2.prodi = "Teknik Mesin"
    object3.name = "Hendi Hidayat"
    object3.nim = "181106031176"
    object3.prodi = "Teknik Sipil"


    println("Nama  : ${object1.name}")
    println("Nim   : ${object1.nim}")
    println("Prodi : ${object1.prodi}\n")

    println("Nama  : ${object2.name}")
    println("Nim   : ${object2.nim}")
    println("Prodi : ${object2.prodi}\n")

    println("Nama  : ${object3.name}")
    println("Nim   : ${object3.nim}")
    println("Prodi : ${object3.prodi}\n")

}