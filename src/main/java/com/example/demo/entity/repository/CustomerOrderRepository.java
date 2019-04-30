package com.example.demo.entity.repository;

import com.example.demo.entity.CustomerOrder;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CustomerOrderRepository extends CrudRepository<CustomerOrder, Long> {
    List<CustomerOrder> findAllByCustomerId(long id);
}
