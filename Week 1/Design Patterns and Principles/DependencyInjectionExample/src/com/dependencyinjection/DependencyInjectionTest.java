// DependencyInjectionTest.java
package com.dependencyinjection;

public class DependencyInjectionTest {
    public static void main(String[] args) {

        CustomerRepository customerRepository = new CustomerRepositoryImpl();

        CustomerService customerService = new CustomerService(customerRepository);

        String customerDetails = customerService.getCustomerById(1);

        System.out.println(customerDetails);
    }
}
