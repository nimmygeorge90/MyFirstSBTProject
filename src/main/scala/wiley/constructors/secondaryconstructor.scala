package wiley.constructors

class secondaryconstructor (id:Int,name:String){
  var std:Int =0
  var temp:Double =0
  def show(): Unit={
    println(id)
    println(name)
    println(std)
    println(temp)

  }
//Auxillary Constructor
  def this(id: Int, name: String, std: Int) {
    this(id, name)
    this.std = std
  //Constructor Overloading
  /*def this(id:Int,name:String,std:Int,temp:Double) {
    this(id, name)
    this.std = std
   // this.temp =temp*/
  }

}

object Secobject extends App
{
  //var count = 0
  //while(count < 5)
    {
      println("Enter id:")
      var x = scala.io.StdIn.readInt()
      println("Enter name:")
      var y = scala.io.StdIn.readLine()
      println("Enter standard:")
      var z = scala.io.StdIn.readInt()
      println("Enter temperature:")
      var a = scala.io.StdIn.readDouble()
      var secobj = new secondaryconstructor(x,y,z)
      //var con_over = new secondaryconstructor(x,y,z,a)
      secobj.show()
     // con_over.show()
      //count = count +1
    }


}