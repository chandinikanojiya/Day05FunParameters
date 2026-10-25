fun birthdayGreeting(name:String,age:Int):String{     // parameter lga kr dekhte hai  ,, hum ek se jada parameter and datat type de skte h
    val message=" happy birthday $name"
val age =" you u $age years old"
    return "$message\n$age"  //dono ek sth retun krne k liye string interpolation kiya h

}
fun main(){
    println(birthdayGreeting("chandu",20))
    println(birthdayGreeting("hemu",20))

}