package wiley.activities

//Create a Scala class that has three constructors with one, two and three parameters respectively.
//It should display the output on object instantiation and the output should be:
// First_name, Last_name, age.
//Use Auxiliary Constructors

package wiley.constructors

class constructorpractice(id:Int,name:String) {
  //parameters passed to the class are immutable and cannot be changed
  var std = 1
  var school: String = ""

  def show(): Unit = {
    println(id)
    println(name)
    println(std)
    println(school)
  }
  def this(id:Int, name:String, std:Int) {
    this(id,name)
    this.std = std
  }
  //Constructor overloading
  def this(id:Int, name:String, std:Int, school:String) {
    this(id,name)
    this.std = std
    this.school = school
  }

  def increasestd(): Unit = {
    std += 1
  }
  def changeschool(s:String): Unit = {
    school = s
  }

}

object constructorform extends App {
  var first = new constructorpractice(1, "Iza", 1)
  first.show()
  first.increasestd()
  first.show()
  var second = new constructorpractice(1,"Iha", 2, "StAnn's")
  second.show()
  second.increasestd()
  second.changeschool("St Xaviers")
  second.show()


  for (x <- List(first,second)) {

  }


}
