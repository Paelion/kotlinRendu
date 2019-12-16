fun main(args: Array<String>) {

    var i = 1

    print("Le nombre secret est:")
    var functionNb = readLine()!!

    val essai = null

    while (functionNb != essai) {

        print("Ton essai:")
        var functionEssai = readLine()!!

        if (functionEssai == functionNb) {
            println("Bien joué, tu as fini en $i essais")
            break
        } else if (functionNb > functionEssai) {
            print("c'est + \n")
            i++
        } else if (functionNb < functionEssai) {
            print("c'est - \n")
            i++
        }
    }




}
