package kh.edu.ctasd.repository;


import kh.edu.ctasd.controller.CustomerController;
import kh.edu.ctasd.database.DataConnection;
import kh.edu.ctasd.model.Customer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

//Get data from database
public class CustomerRepository {

    //    build in memory data of Customer
    public List<Customer> getCustomerData() {
        List<Customer> customersList = new ArrayList<>();

        try (
                Connection con = DataConnection.getConnection();
                PreparedStatement statement = con.prepareStatement("SELECT * from customers");
                ResultSet result = statement.executeQuery();
        ) {
            while (result.next()) {
                Customer customer = new Customer();

                customer.setId(result.getString("uuid"));
                customer.setFullName(result.getString("full_name"));
                customer.setEmail(result.getString("email"));
                customer.setPhone(result.getString("phone"));
                customer.setGender(result.getString("gender"));
                customer.setDeleted(result.getBoolean("is_deleted"));

                customersList.add(customer);
            }

        } catch (SQLException e) {
            System.out.println("Connection Failed! Check output console");
        }

        return customersList;
    }

    //    find customer by email
    public Customer getCustomerByEmail(String email) {
        Customer customer = new Customer();

        try (
                Connection con = DataConnection.getConnection();
                PreparedStatement statement = con.prepareStatement("SELECT * FROM customers WHERE email = ?");
        ) {
            statement.setString(1, email);
            ResultSet result = statement.executeQuery();

            if (result.next()) {
                customer.setId(result.getString("uuid"));
                customer.setFullName(result.getString("full_name"));
                customer.setEmail(result.getString("email"));
                customer.setPhone(result.getString("phone"));
                customer.setGender(result.getString("gender"));
                customer.setDeleted(result.getBoolean("is_deleted"));
            }

        } catch (SQLException e) {
            System.out.println("Connection Failed! Check output console");
        }

        return customer;
    }
}
//JDBC - 1. driver, 2. create connection,