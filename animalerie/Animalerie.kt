class Animalerie{

    var list = mutableSetOf<Animal>()

    fun add(animalList : Animal){
        list.add(animalList)
    }

    fun display(){
        for (animal in list){
            print("Salut moi, ")
            animal.quiSuisJe()
            print("et je parle : ")
            animal.parler()
        }
    }
}
