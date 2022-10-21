package seventeethoctober.enumeration

object donutenumeration extends App {
  object Donut extends Enumeration {

    type Donut = Value
    val Glazed = Value("Glaze is for g")
    val Strawberry = Value("Strawberry is for s")
    val Plain = Value("Plain is for p")
    val Vannila = Value("Vannila is for v")

  }
  println(s"Vannila donut => ${Donut.Vannila}")
  println(s"Vannila id ${Donut.Vannila.id}")
  println(s"All values ${Donut.values}")

  Donut.values.foreach{
    case d if(d == Donut.Strawberry ||d == Donut.Glazed)=>println("Favourite keep it")
    case _ => println("Rejected"+_)
  }
}
