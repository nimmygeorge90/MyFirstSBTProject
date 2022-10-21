package twelthoctober.CollectionHashset

object typehierarchy extends App{
  println("Step1 Declare a variable of type Any")
  val favouriteitem:Any="Glazed Donut"
  println(favouriteitem)
  println(" Declare a variable of type AnyRef"+"")
  val pizza:AnyRef="Cheese pizza"
  println(pizza)
  println(" Declare a variable of type AnyVal" + "")
  val pricepizza: AnyVal = 4.5
  println(pricepizza)


   //Nil = Empty Singleton object
  val myList=Nil
  println(myList.length)

}
