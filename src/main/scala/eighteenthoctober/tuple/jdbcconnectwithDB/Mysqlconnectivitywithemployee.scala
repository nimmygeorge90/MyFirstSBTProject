package eighteenthoctober.tuple.jdbcconnectwithDB
import java.sql._
object Mysqlconnectivitywithemployee  extends App {

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
    val resultSet = statement.executeQuery("select employee_id,employee_name from employee.employee; ")
    while (resultSet.next()) {
      val employee_id = resultSet.getString("employee_id")
      val employee_name = resultSet.getString("employee_name")
      println(s"employee_id  is $employee_id and employee_name of the movie is $employee_name")

     var insertsql = "INSERT INTO employee.employee(employee_id,employee_name,designation,Address) values(?,?,?,?);"
      val preparedStatement: PreparedStatement = connection.prepareStatement(insertsql)

      preparedStatement.setString(1, "104")
      preparedStatement.setString(2, "Isa")
      preparedStatement.setString(3, "engineer")
      preparedStatement.setString(4, "4")
      preparedStatement.execute()


    }


  } catch {
    case e: Exception => e.printStackTrace()
  }
  finally {
    connection.close()
  }


}