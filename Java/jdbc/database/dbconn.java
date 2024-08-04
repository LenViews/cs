package jdbc.database;

import java.sql.Connection;
import java.sql.DriverManager;

public class dbconn {
    public Connection con = getConnection();

    private Connection getConnection(){
        Connection connection = null;

        //Step 1. Load Driver

            //To load a driver, we invoke the forname found in the class
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException cnfe) {
            System.out.println("Could not load driver"+cnfe.getMessage());
        }
        return connection;

        //Step 2. Establish connection

            // To establish a connection we use the get connection method from the driver manager class
            // This method will always require 3 parameters
            //     1. URL
            //     2. Username
            //     3. Database Password

            // "DRIVER:dbVendor://Server:portNumber/DBName"
        // DriverManager.getConnection("jdbc:mysql://localhost/Test", "root", "");
    }

}