/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlydiem;

/**
 *
 * @author ASUS
 
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SSMSConnection {
    public static Connection getSSMSConnection() throws ClassNotFoundException,SQLException
    {
        String hostname = "localhost";
        String db = "QUANLYDIEM";
        String port = "1433";
        String username = "sa";
        String password = "123456";
        
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        
//        String connectURL = "jdbc:sqlserver://" + hostname + ":" + port + ";databaseName=" + db + ";" + "integratedSecurity=true"+ ";";
        String connectURL = "jdbc:sqlserver://" +hostname + ":"+port+";DatabaseName=" + db + ";encrypt=true;trustServerCertificate=true;";

        Connection conn = DriverManager.getConnection(connectURL, username, password);
        
        return conn;        
    }
}
