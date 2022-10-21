package wiley.controlstructure

object yieldconcepts extends App {


  var result = for (a <- 1 to 10) yield a
  for (i <- result) {
    println(i)

  }

  for (i <- 1 to 20 by 2) {
    println(i)
  }

}
