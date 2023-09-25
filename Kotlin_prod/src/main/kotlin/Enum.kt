import Enum

fun main() {
 val light = Enum.RED

    if (light == Enum.RED){
        //......
    }
    Enum.GREEN.name
    Enum.ORANGE.ordinal
    Enum.RED.ring
}


enum class Enum constructor(val ring : String){
    RED("ring, ring"),
    GREEN("?"),
    ORANGE("Stop")
}