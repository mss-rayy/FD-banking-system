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
        Customer customer = customerRepository.getCustomerByEmail(email);
//        Map data
        CustomerResponse customerResponse = new CustomerResponse(
                customer.getFullName(),
                customer.getEmail(),
                customer.getGender()
        );
        return customerResponse;
    }
}
