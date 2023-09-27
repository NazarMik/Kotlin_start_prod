interface Car{

    fun drive()
    fun hasRat(): Boolean{
        return false
    }
}


class Toyota : Car{
    override fun drive() {
        println("Drive!!!")
    }
}