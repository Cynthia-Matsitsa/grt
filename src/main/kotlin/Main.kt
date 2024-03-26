fun main() {
    var student = User(30.5, 22,"Cynthia","Anita B")
    println(student.weight)
    println(student.Age)
    println(student.Name)
    println(student.Lab)

}
data class User(var weight:Double,var Age:Int,var Name:String,var Lab:String)