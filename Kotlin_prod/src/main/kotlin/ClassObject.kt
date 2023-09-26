fun main() {
val helloWorld = object {
    val  hello = "hello"
    val world = "world"

    override fun toString() = "$hello $world"
}
    println(helloWorld.toString())
}