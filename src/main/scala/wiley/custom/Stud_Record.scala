package wiley.custom

class Stud_Record (id:Int,name:String) {
  def get(): Unit = {
    println("Student id:" + id)
    println("Student name:" + name)
  }
}
  object StudRec extends App{
    var stud1 = new Stud_Record(1,"Iza")
    var stud2 = new Stud_Record(2,"Iha")
    stud1.get()
    stud2.get()


  }


