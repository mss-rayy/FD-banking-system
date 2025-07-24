package kh.edu.ctasd.controller;

import kh.edu.ctasd.dao.CustomerDao;
import kh.edu.ctasd.dao.impl.CustomerDaoImpl;
import kh.edu.ctasd.model.Customer;

public class CustomerController {

    CustomerDao customerDao = new CustomerDaoImpl();

    public Customer getCustomers(){

        System.out.println(customerDao.getAllCustomer());

        return customerDao.getAllCustomer();
    }

}
