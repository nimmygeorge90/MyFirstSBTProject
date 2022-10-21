package seventeethoctober.enumeration
//Scala provides an Enumeration class which we can extend in order to create our enumerations.

object milkyway extends Enumeration {
  type planets = Value
  val mercury, venus, earth, mars, jupiter, saturn, uranus, neptune = Value
  val pluto = Value(9, "Pluto")
  val zoto = Value(10, "Zoto")

  def ismilkyway(plan: planets): Unit = {
    println(s"Planets ${plan.id} and ${plan}")
  }


    def biggest(plane: planets) = plane == jupiter
  
  def isplanet(planet: String): Unit = {
    val check = milkyway.values.toList.map(v => v.toString).contains(planet)
    println(s"planet $planet belongs to milkyway is ${check}")
  }

  def main(args: Array[String]): Unit = {
    println(s"The set of values of type planets that milkyway hold ${milkyway.values}")
    ismilkyway(milkyway.mercury)
    ismilkyway(milkyway.earth)
    ismilkyway(milkyway.pluto)
    ismilkyway(milkyway.zoto)
  }
}
