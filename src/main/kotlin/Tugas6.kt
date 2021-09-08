class Tinggi {
    var result: Double = 0.0
        get() = field
        set(value) { field = value }
}
fun main() {
    val tinggi = Tinggi()
    print("--Seleksi Masuk Akademi Militer--\n")
    print("Syarat Masuk Akademi Militer Wajib Tinggi 180-185\n")
    try {
        tinggi.result = readLine()!!.toDouble()
    } catch (e: NumberFormatException) {
        tinggi.result = 180.0
    }
    val result = tinggi.result
    when {
        // penggunaan rangto yang disediakan oleh kotlin
        result in 180.0..180.5 -> println("Nilai bulat : 180.0") // artinya apabila result ada diantara nilai interval 0.0 hingga 0.5 maka lakukan sebuah perintah print
        result in 180.5..181.0 -> println("Nilai bulat : 181.0")
        result in 181.0..181.5 -> println("Nilai bulat : 181.0")
        result in 181.5..182.0 -> println("Nilai bulat : 182.0")
        result in 182.0..182.5 -> println("Nilai bulat : 182.0")
        result in 182.5..183.0 -> println("Nilai bulat : 183.0")
        result in 183.0..183.5 -> println("Nilai bulat : 183.0")
        result in 183.5..184.0 -> println("Nilai bulat : 184.0")
        result in 184.0..184.5 -> println("Nilai bulat : 184.0")
        result in 184.5..185.0 -> println("Nilai bulat : 185.0")
        result in 185.0..185.5 -> println("Nilai bulat : 185.0")
        else -> println("Maaf Anda Belum Diterima Menjadi Anggota ")
    }

}