package adj_practical_ans_1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
  
public class DatabseConnection {
    protected static Connection initializeDatabase()
        throws SQLException, ClassNotFoundException
    {

        String dbDriver = "com.mysql.jdbc.Driver";
        String dbURL = "jdbc:mysql:// localhost:3306/";
        String dbName = "demoprj";
        String dbUsername = "root";
        String dbPassword = "root";
  
        Class.forName(dbDriver);
        Connection con = DriverManager.getConnection(dbURL + dbName,
                                                     dbUsername, 
                                                     dbPassword);
        return con;
    }
}