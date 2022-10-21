package eighteenthoctober.tuple.jdbcconnectwithDB
import java.sql._
//import java.sql.DriverManager
//import java.sql.Connection
object Insertmysql extends App {

  val driver = "com.mysql.cj.jdbc.Driver"
  val url = "jdbc:mysql://localhost:3306/MySQL"
  val username = "root"
  val password = "root"

  // connection instance creation
  var connection: Connection = null
  try {
    Class.forName(driver)
    connection = DriverManager.getConnection(url, username, password)
    var insertsql = """INSERT INTO employee(employee_id,employee_name,designation,Address) values(?,?,?,?)"""
    val preparedStatement:PreparedStatement=connection.prepareStatement(insertsql)

    preparedStatement.setString(1, "103")
    preparedStatement.setString(2, "Ila")
    preparedStatement.setString(3, "Teacher")
    preparedStatement.setString(4, "3")
    preparedStatement.execute()



  } catch {
    case e: Exception => e.printStackTrace()
  }
  finally {
    connection.close()
  }
}




