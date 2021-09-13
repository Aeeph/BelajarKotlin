class Sepatu(val name: String?,
            var ukuran: Ukuran?){
  inner class Ukuran(val buildingNumber: String,
                val warna: String,
                val nomer: String,
                val harga: String){
      val contextName = name

        fun displayUkuran(){
            println(" ${this.contextName} resides at ${this.warna}, ${nomer}, ${harga}")
        }
    }
}

class Nanya {
    class Nested {
        fun printMessage(message: String){
            println(message)
        }
    }
}

class Baju {
    val warna = "Biru"
    val ukuran = "XL"
    val harga  = "50000"

    inner class Nested {
        fun printMessage(){
            println("Baju $warna Ukuran $ukuran harga $harga")
        }

    }
}


fun main(array: Array<String>){

    val sepatu = Sepatu("Hanif", null)
    sepatu.ukuran = sepatu.Ukuran("32","Hitam","40","250.000\n")

    sepatu.ukuran?.displayUkuran()

    val nanya = Nanya.Nested()
    nanya.printMessage("Mau baju apa Hanif?\n")

    val baju = Baju().Nested()
    baju.printMessage()
}