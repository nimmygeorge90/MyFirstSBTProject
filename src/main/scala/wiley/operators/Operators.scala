package wiley.operators

object Operators extends App{
  var a =100
  var b =50
  var c = true
  var d = false
  var results =0

  //All variables are called operands
  println("Addition is"+(a+b))
  println("Substraction is"+(a-b))
  println("Multiplication is"+(a*b))
  println("Division is"+(a/b))
//Relational operator
  if(a==b)
    {
      println("Values are same")
    }
  else
    {
      println("Values are same")
    }

  //Logical operators

  println("Logical of c || d"+(c || d))

  //bitwise operator
  println("Bitwise operator are:" +(a&b))

  //Assignment operator
  println("Assignment Operator:"+(a+=b))

}
