package kh.edu.ctasd.controller;

import kh.edu.ctasd.dto.CustomerResponse;
import kh.edu.ctasd.service.CustomerService;
import kh.edu.ctasd.service.impl.CustomerServiceImpl;

import java.util.List;

public class CustomerController {

    private final CustomerService customerService;

    public CustomerController() {
        customerService = new CustomerServiceImpl();
    }

    public List<CustomerResponse> getAllCustomers() {
        return customerService.getAllCustomers();
    }

    public CustomerResponse findCustomerByEmail(String email) {
        return customerService.findCustomerByEmail(email);
    }
}