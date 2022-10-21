package seventeethoctober.map

import scala.collection.immutable._
object iterateovermap extends App{
 var hashmap= HashMap("A"->"Apple","B"->"Ball","C"->"Cat")
  hashmap.foreach{
    case(key,value)=>println(key+"--->"+value)
  }
  println(hashmap("B"))
  hashmap= hashmap+("D"->"Doll")
  hashmap.foreach {
    case (key, value) => println(key + "--->" + value)
  }

}
