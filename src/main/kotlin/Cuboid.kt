class Cuboid(
    private var length: Int,
    private var breadth: Int,
    private var width: Int
) {
    constructor(): this(2,2,2) //default values in case no arguments are passed into the primary constructor
    {
        println("No arguments passed... Using secondary constructor arguments as default")
    }

    private val volume
        get() = length * breadth * width

    fun getVolume() {
        println("The volume of your cuboid with length: ${length}cm, breadth: ${breadth}cm and width: ${width}cm is ${volume}cm^3")
    }
}