package kh.edu.ctasd.dao;

import kh.edu.ctasd.model.Customer;

import java.util.List;

public interface CustomerDao {

//    create customer
    void addCustomer(Customer customer);

//    return type
    Customer getAllCustomer();
}
