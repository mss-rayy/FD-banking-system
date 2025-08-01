package kh.edu.ctasd;

import kh.edu.ctasd.model.Customer;
import kh.edu.ctasd.view.CustomerView;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {
//        Customer customer = new
//                Customer(
//                UUID.randomUUID().toString(),
//                "odinn",
//                "odinn@gmail.com",
//                "02734567",
//                "Female",
//                false);
//        CustomerView customerView = new CustomerView();
//        customerView.customerFeatures();
        String url = "jdbc:postgresql://localhost:5432/fd-banking-system";
        String user = "postgres";
        String password = "170823";
        String sql = """
                  insert into customers (uuid, full_name, email, phone, gender, is_deleted)
                  values (?, ?, ?, ?, ?, ?)
                """;
        // 1. add driver
        // 2. create connection
        //3. create statement object

        try (Connection connection = DriverManager.getConnection(url, user, password)
        ) {
            PreparedStatement statement = connection.prepareStatement(sql);

            statement.setString(1, UUID.randomUUID().toString());
            statement.setString(2, "Thai");
            statement.setString(3, "thai@gmail.com");
            statement.setString(4, "034567897");
            statement.setString(5, "other");
            statement.setBoolean(6, true);

            int rowUpdate = statement.executeUpdate();

            System.out.println(rowUpdate);

        } catch (SQLException e) {
            System.out.println("SQLException: " + e.getMessage());
        }
    }
}