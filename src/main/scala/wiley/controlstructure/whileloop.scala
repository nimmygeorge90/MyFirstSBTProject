package wiley.controlstructure

object whileloop extends App {
  var a=10
  while(a<20){
    println(a)
    a= a+2
  }

  a=10
  do{
    println(a)
    a+=2
  }while(a<=20)
}
