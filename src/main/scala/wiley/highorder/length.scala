package wiley.highorder

object length extends App {


    var letters = add("h","e","l","l","o")
    println(letters)

    def add(args: String*): String = {
      var builtString = ""
      for (x <- args) {
        builtString += x
      }
      builtString
    }

}
