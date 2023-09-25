class InnerClass {

    var brand = "BMW"

    inner class Inner{
        fun run() = true
        fun stop() = false
    }
}

class Smartphone{
    val battery = 4000

    inner class  GooglePixel{
        fun about() = "Pixel has $battery mAh"
    }

    fun  main(){
        Smartphone().battery
        Smartphone().GooglePixel()
        Smartphone().GooglePixel().about()

    }
}