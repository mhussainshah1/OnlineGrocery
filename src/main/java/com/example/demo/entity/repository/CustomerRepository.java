package com.example.demo.entity.repository;

import com.example.demo.entity.Customer;
import org.springframework.data.repository.CrudRepository;

/**
 * @author m_hus
 */
public interface CustomerRepository extends CrudRepository<Customer, Long> {

}
