package kh.edu.ctasd.service;

import kh.edu.ctasd.dto.CustomerResponse;
import kh.edu.ctasd.model.Customer;

import java.util.List;

public interface CustomerService {

//    get all customer
    List<CustomerResponse> getAllCustomers();

//    Return type , name , parameter
    CustomerResponse findCustomerByEmail(String email);

}
