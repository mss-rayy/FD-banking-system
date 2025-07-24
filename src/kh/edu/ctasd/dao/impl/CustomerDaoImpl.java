package kh.edu.ctasd.dao.impl;

import kh.edu.ctasd.dao.CustomerDao;
import kh.edu.ctasd.model.Customer;

import java.util.List;

public class CustomerDaoImpl implements CustomerDao {

    Customer customer = new Customer();

    @Override
    public void addCustomer(Customer customer) {
    //        perform logic
    }

    @Override
    public Customer getAllCustomer() {

        return customer;
    }
}
