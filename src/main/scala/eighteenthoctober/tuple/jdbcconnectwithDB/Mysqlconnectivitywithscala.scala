package eighteenthoctober.tuple.jdbcconnectwithDB
import java.sql._
//import java.sql.DriverManager
//import java.sql.Connection
object Mysqlconnectivitywithscala extends App {
  val driver = "com.mysql.cj.jdbc.Driver"
  val url = "jdbc:mysql://localhost:3306/MySQL"
  val username = "root"
  val password = "root"

  // connection instance creation
  var connection: Connection = null

  try {
    Class.forName(driver)
    connection = DriverManager.getConnection(url, username, password)

    val statement = connection.createStatement()

    val resultSet = statement.executeQuery("select title,genre from movies.movies; ")
    while (resultSet.next()) {
      val title = resultSet.getString("title")
      val genere = resultSet.getString("genre")
      println(s"title of move is $title and gener of the movie is $genere")

    }


  } catch {
    case e: Exception => e.printStackTrace()
  }
  finally {
    connection.close()
  }


}