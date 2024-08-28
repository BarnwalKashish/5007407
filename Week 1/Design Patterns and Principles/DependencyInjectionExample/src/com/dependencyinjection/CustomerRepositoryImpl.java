// CustomerRepositoryImpl.java
package com.dependencyinjection;

public class CustomerRepositoryImpl implements CustomerRepository {
    @Override
    public String findCustomerById(int id) {
        // In a real application, this would involve database operations
        return "Customer with ID: " + id;
    }
}
