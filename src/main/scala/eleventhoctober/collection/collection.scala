package eleventhoctober.collection

object testscala extends App {
  var set1 = Set("abc","def","ghi","jkl")
  var flights:Set[String] =Set("British","AirIndia","Airfrance","Qatar")
  println(flights.head)
  println(flights.tail)
  println(set1.isEmpty)
 println(set1 union flights) //union
  println(set1 ++ flights)
  println(set1 diff flights)
  println(set1 intersect flights)//intersect
  println(flights.size)
  flights +="Singapore" //tp add the elements
  println(set1 & flights)
}
