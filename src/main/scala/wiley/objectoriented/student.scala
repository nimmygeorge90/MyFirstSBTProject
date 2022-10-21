package wiley.objectoriented

class student {
  var id: Int = 0
  var name: String = null
}
object  StudentExecute extends App{
  var s = new student()
  var s1 = new student()
  println(s.id+"  "+s.name)
 // println("Student id"+s1.id+" Name "+s1.name)

}
