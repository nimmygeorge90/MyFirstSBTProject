package seventeethoctober.map

object mapmulti extends App{

  var list1 = List(1,2,4,6,8)
  var result = list1.map(x=>x*x)
  println(result)

  val set1 = Set("adg","aff","affss")
  val result1 = set1.map(_.toUpperCase())
  println(result1)

  val list2 = List("adg","aff","affss")
  val result22 = list2.flatMap(_.toUpperCase())
  val result23 = list2.flatMap(_.toLowerCase())
  println(result22)
  println(result23)


}
