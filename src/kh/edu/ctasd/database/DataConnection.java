package kh.edu.ctasd.database;

import kh.edu.ctasd.model.Customer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DataConnection {

    private static Connection connection; // singleton instance
    private static  String url = "jdbc:postgresql://localhost:5432/fd-banking-system";
    private static String user = "postgres";
    private static String password = "170823";

    private DataConnection(){}

    public static Connection getConnection(){

        try{
            if(connection == null || connection.isClosed()){
                connection = DriverManager.getConnection(url,user, password);
            }
        } catch (SQLException e){
            System.out.println("Connection Failed! Check output console");
            e.printStackTrace();
        }

        return connection;
    }

}
