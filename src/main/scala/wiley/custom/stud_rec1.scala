package wiley.custom

class stud_rec1 (id:Int,name:String){
  def get_input(): Unit={
    println(id)
    println(name)
  }

}

object  MainStud extends App{

  var id = scala.io.StdIn.readInt()
  var name = scala.io.StdIn.readLine()
  var student = new stud_rec1(id,name)
  student.get_input()


}
