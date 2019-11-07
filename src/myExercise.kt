
fun main(){
    myName()
    val myName = myNameSecond()
    println(myName)

    val myNameThird = myNameThird("Bita")
    println(myNameThird)

    val result = myFavoriteFood("Mac and cheese")
    println(result)
}

fun myName(){
    println("My name is Bita")
}

fun myNameSecond() : String{
    return "My name is Bita"
}

fun myNameThird(name : String) = "My name is $name"

fun myFavoriteFood(foodName : String, isFavorite : Boolean = true) =
    if(isFavorite) "$foodName my favorite food" else "$foodName not my favorite food"
