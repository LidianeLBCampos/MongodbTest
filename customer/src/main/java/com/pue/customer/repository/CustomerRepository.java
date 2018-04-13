package com.pue.customer.repository;

import com.pue.customer.domain.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface CustomerRepository extends MongoRepository<Customer, Long>{

    public Customer findByFirstName(String firstName);
    public List<Customer> findByLastName(String lastName);
}
