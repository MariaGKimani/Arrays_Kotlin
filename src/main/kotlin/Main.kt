import jdk.jshell.SourceCodeAnalysis.QualifiedNames

fun main() {
    create("Maria","34","Deo","23")
    integers()
    towns()
   var x = words("maria", "irene", "Gladys")
    println(x.contentToString())

}
//A FUNCTION THAT TAKES IN 4 STRINGS AND CREATES AN ARRAY OUT OF THEM THEN PRINTS OUT THE ARRAY
fun create(nam: String,name: String,names: String,namess: String){
    var creation = arrayOf(nam,name,names,namess)
    println(creation.contentToString())
}

//A FUNCTION THAT GIVEN THE VAR CITIES PRINTS OUT THE NAME OF THE CITIES IN THE CORRECT GRAMMATICAL CASE
fun towns(){
    var cities = arrayOf("harare", "mumbai", "dodoma", "jakarta")
    var city = cities.map { it.capitalize() }.toTypedArray()
    println(city.contentToString())


}

//PRINT SUM OF THE SECOND AND FIFTH ELEMENTS
//PRINT OUT ELEMENTS IN ASCENDING ORDER
fun integers(){
    var numbers = arrayOf(32, 17,4,213,78,43,90,31,3,73,11,158,62)
    var number = numbers[1]+ numbers[4]
    println(number)
    println(numbers.indexOf(158))
    println(numbers.sortedArray().contentToString())
}
//FUNCTION THAT TAKES IN 3 NAMES RETURNS A STRING ARRAY CONTAINING ALL THREE NAMES
fun words(mar: String,Ir: String,Gla: String) : Array<String> {
    var man= arrayOf<String>("mar","Ir","Gla")
    return man
}