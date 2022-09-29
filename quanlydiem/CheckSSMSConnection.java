/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quanlydiem;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;


/**
 *
 * @author ASUS
 */
public class CheckSSMSConnection {

    /**
     * @param args the command line arguments
     */
    
    
        /**
         * @return
         * @throws SQLException
         * @throws ClassNotFoundException
         */
        public static Connection getMyConnection() throws SQLException,ClassNotFoundException
        {
            return SSMSConnection.getSSMSConnection();
        }
    
    public static void main(String[] args) throws SQLException,ClassNotFoundException {
        // TODO code application logic here
        System.out.println("Get connection ...");
        
        Connection conn = CheckSSMSConnection.getMyConnection();
        
        System.out.println("Get connection "+ conn);
        System.out.println("Done!");
        
    }
    
}
