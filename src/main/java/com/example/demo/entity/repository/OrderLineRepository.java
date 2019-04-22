package com.example.demo.entity.repository;

import com.example.demo.entity.OrderLine;
import org.springframework.data.repository.CrudRepository;

public interface OrderLineRepository extends CrudRepository<OrderLine, Long> {

}
