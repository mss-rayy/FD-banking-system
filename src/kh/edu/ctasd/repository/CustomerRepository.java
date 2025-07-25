package kh.edu.ctasd.repository;


import kh.edu.ctasd.controller.CustomerController;
import kh.edu.ctasd.model.Customer;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

//Get data from database
public class CustomerRepository {

//    build in memory data of Customer
    public List<Customer> getCustomerData(){

        List<Customer> customerList = new ArrayList<>();

        Customer customer = new Customer();

        customer.setId(UUID.randomUUID());
        customer.setFullName("Seyha");
        customer.setEmail("seyha@gamil.com");
        customer.setPhone("078234567");
        customer.setGender("M");
        customer.setDeleted(false);

        Customer customer2 = new Customer();
        customer2.setId(UUID.randomUUID());
        customer2.setFullName("Endy");
        customer2.setEmail("endy@gamil.com");
        customer2.setPhone("09723456");
        customer2.setGender("M");
        customer2.setDeleted(false);

        customerList.add(customer);
        customerList.add(customer2);

        return customerList;
    }
}
