package eighteenthoctober.tuple
import scala.io.Source

object readingfile extends App{
  println(Source.fromFile("C:\\Users\\nimmy\\OneDrive\\Desktop\\scala\\Demo.txt").mkString)
  Source.fromFile("C:\\Users\\nimmy\\OneDrive\\Desktop\\scala\\Demo.txt").getLines().foreach(z => println("Line content is " + z))

  Source.fromFile("C:\\Users\\nimmy\\OneDrive\\Desktop\\scala\\Demo.txt").getLines().take(1).foreach(println)

  Source.fromFile("C:\\Users\\nimmy\\OneDrive\\Desktop\\scala\\Demo.txt").getLines().slice(0, 2).foreach(println)

  println(Source.fromFile("C:\\Users\\nimmy\\OneDrive\\Desktop\\scala\\Demo.txt").toList)

  println(Source.fromFile("C:\\Users\\nimmy\\OneDrive\\Desktop\\scala\\Demo.txt").toArray)

}







