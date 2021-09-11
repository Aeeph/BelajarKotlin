
//open class SepedaMotor{
//    open fun slogan(){
//
//    }
//}
//
//class Honda: SepedaMotor(){
//    override fun slogan(){
//        println("One Heart")
//    }
//}
//
//class Yamaha: SepedaMotor(){
//    override fun slogan(){
//        println("Semakin Didepan")
//    }
//}
//
//fun main(args: Array<String>){
//    val yamaha = Yamaha()
//    val honda = Honda()
//
//    yamaha.slogan()
//    honda.slogan()
//}


open class AirMinum{
    open fun minum(){

    }
}
class Aqua: AirMinum(){
    fun minuman(){
        println("Aqua Minuman Sehat")
    }
}

class Sanqua: AirMinum(){
    fun minuman(){
        println("Sanqua Minuman Pilihan")
    }
}
class Yasmin: AirMinum(){
    fun minuman(){
        println("Yasmin Minuman Keluarga ")
    }
}

fun main (args: Array<String>){
    val aqua = Aqua()
    val sanqua = Sanqua()
    val yasmin = Yasmin()

    aqua.minuman()
    sanqua.minuman()
    yasmin.minuman()
}
