
class King {

    var name : String = ""
    var number : Int = 0

    private constructor()

    companion object {
        private var iKing : King? = null
        fun getInstance() : King {
            if (iKing == null) {
                iKing = King()
                iKing!!.name = "Louis"
                iKing!!.number = 14
            }
            return iKing!!
        }
    }

    override fun toString(): String {
        return "King(name='$name', number=$number)"
    }

}

fun main(args : Array<String>) {
    var k1 = King.getInstance()
    println(k1)
    var k2 = King.getInstance()
    println(k2)
    println((k1 == k2))
}