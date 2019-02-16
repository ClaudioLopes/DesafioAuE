package desafioaue;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseLocator {
    
    private static DatabaseLocator instance = new DatabaseLocator();
    private DatabaseLocator(){}
    public static DatabaseLocator getInstance(){
        return instance;
    }
    
    Connection getConnection() throws SQLException, ClassNotFoundException{
        Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/DataBase","root", "root");
        return conn;
    }
}
