package kh.edu.ctasd.service.impl;

import kh.edu.ctasd.dto.CustomerResponse;
import kh.edu.ctasd.model.Customer;
import kh.edu.ctasd.repository.CustomerRepository;
import kh.edu.ctasd.service.CustomerService;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {

    //    1. define object
    private final CustomerRepository customerRepository;

    //    2. Inject object
    public CustomerServiceImpl() {
        customerRepository = new CustomerRepository();
    }

    @Override
    public List<CustomerResponse> getAllCustomers() {
//        All customers
        List<Customer> customers = customerRepository.getCustomerData();

//        Domain MODEL => DTO

        return customers.stream()
                .map(
                        (customer -> new CustomerResponse(
                                customer.getFullName(),
                                customer.getGender(),
                                customer.getEmail()
                        ))
                ).toList();
    }

    @Override
    public CustomerResponse findCustomerByEmail(String email) {
        //logic
        List<Customer> customers =  customerRepository.getCustomerData();

        Customer foundCustomer = customers.stream()
                .filter((customer -> customer.getEmail().equals(email)))
                .findFirst()
                .orElseThrow(()-> new RuntimeException("Customer not found"));

//        Map data
        CustomerResponse customerResponse = new CustomerResponse(
                foundCustomer.getFullName(),
                foundCustomer.getEmail(),
                foundCustomer.getGender()
        );
        return customerResponse;
    }
}
