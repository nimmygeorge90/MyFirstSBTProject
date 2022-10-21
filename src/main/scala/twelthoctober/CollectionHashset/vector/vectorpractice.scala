package twelthoctober.CollectionHashset.vector

object vectorpractice extends App{
  var vector: Vector[Int]=Vector(5,2,3,7,8,1,2)
  var vector2=Vector(3.6,1,34,1,5,6)
  var vector3:Vector[String]=Vector.empty
  println(vector)
  println(vector2)
  println(vector3)

  //Append an element
  vector3 = vector3 :+"Racing"
  vector3 = vector3 :+"temp"
  println(vector3)
  var mergevector = vector2.concat(vector3)
  println(mergevector)
  println(mergevector.reverse)
  var fourthvector = vector2.sorted
  println(mergevector)


  //instead of for loop we can use as:
  val from1to5 = 1 to 5
  println(s"$from1to5")
  from1to5.foreach(print(_))

  val list1to100 =(1 to 100).toList
  list1to100.foreach((elem:Int)=>println(elem))
  from1to5 foreach (print(_))
//in set
  val setfrom1to300 = (1 to 300).toSet
  println(setfrom1to300)
  //in array
  val arrayfrom1to300 = (1 to 300).toArray
  arrayfrom1to300.foreach(println(_))
//In seq
  val seqfrom1to10 = (1 to 10).toSeq
  seqfrom1to10.foreach(println(_))

  //In characters
  val seqfromatoz = ('a' to 'z').toSeq
  seqfromatoz.foreach(println(_))

  val setfromatoz = ('a' to 'z').toSet
  setfromatoz.foreach(println(_))

  val arrayfromatoz = ('a' to 'z').toArray
  arrayfromatoz.foreach(println(_))
}
