package com.example.springbootwebappwithh2;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {

    Customer findCustomerById(Integer id);

    Integer countCustomerByFirstNameAndLastName(String s, String d);

    List<Customer> findAllByFirstName(String firstName);
}
