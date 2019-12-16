interface Animal{
    fun parler()
    fun quiSuisJe()
}


fun main(){


    val place = Animalerie()
    val lucien: Animal = Perroquet()
    val maurice: Animal  = Chien()
    val candy: Animal = Chat()

    place.add(lucien)
    place.add(maurice)
    place.add(candy)

    place.display()

}





