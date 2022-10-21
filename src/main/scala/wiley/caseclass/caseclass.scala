package wiley.caseclass

trait flights
case class British(a:Int,b:Int) extends flights
case class Airlink(a:Int) extends flights         // Case class
case object indigo extends flights               // Case object
object MainObject{
  def main(args:Array[String]){
    flightscall(British(24,34))
    flightscall(Airlink(56))
    flightscall(indigo)
  }
  def flightscall(f:flights) = f match{
    case British(f,g)=>println("a = "+f+" b ="+g)
    case Airlink(f)=>println("a = "+f)
    case indigo=>println("No Argument")
  }
}

