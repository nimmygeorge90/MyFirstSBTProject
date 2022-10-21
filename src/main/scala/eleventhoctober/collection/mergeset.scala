package eleventhoctober.collection

object mergeset extends App {
    var set1 = Set("abc", "def", "ghi", "jkl")
    var flights: Set[String] = Set("British", "AirIndia", "Airfrance", "Qatar")
    flights += "Singapore" //to add the elements
    println(flights)
    flights -= "Singapore" //to remove the elements
    println(flights)

}
