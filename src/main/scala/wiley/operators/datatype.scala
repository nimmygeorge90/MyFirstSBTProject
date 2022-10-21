package wiley.operators

// A program to check given integer if it is within 20 of 100 or 300
object datatype extends App{


    var given_integer = 320
      var given_integers = List(10, 79, 80, 90, 280, 310, 320, 321, 500)

      for (variable <- given_integers) {
        if ((variable >= 100 - 20 && variable <= 100 + 20) || (variable >= 300 - 20 && variable<= 300 + 20)) {
          println("True: " + variable)
        } else {
          println("False: " + variable)
        }
      }


}


