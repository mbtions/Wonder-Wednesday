class Dice {
    var sides = 6
    fun roll(): Int {
        val randomNumber = (1..sides).random()
        return (randomNumber)
    }
}

fun main(){
    val myFirstDice = Dice()
    println(myFirstDice.sides)
    println(myFirstDice.roll())
}