package seventeethoctober.map
//A Map is an Iterable consisting of pairs of keys and values 
object mapest extends App {
  var map1 = Map(("A","Apple"),("B","Ball"))
  var map2 = Map("A"->"Apple","B"->"Ball")
  var emptymap:Map[String,String]= Map.empty[String,String]
  println(map1)
  println(map2)
  println(emptymap)

  //Adding an element
  map2 =map2+("D"->"Dog")
  println(map2)

  //Removing an element
  map2 = map2 - ("D")
  println(map2)

}
