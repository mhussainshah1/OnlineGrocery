package com.example.demo.entity.repository;

import com.example.demo.entity.CustomerOrder;
import org.springframework.data.repository.CrudRepository;

public interface CustomerOrderRepository extends CrudRepository<CustomerOrder, Long> {

}
