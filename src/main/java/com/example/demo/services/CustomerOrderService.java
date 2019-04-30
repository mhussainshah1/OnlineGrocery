package com.example.demo.services;

import com.example.demo.entity.CustomerOrder;
import com.example.demo.entity.repository.CustomerOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerOrderService {

    @Autowired
    CustomerOrderRepository customerOrderRepository;

    public CustomerOrderService() {
    }

    public List<CustomerOrder> findAll() {
        List<CustomerOrder> customerOrders = new ArrayList<>();
        customerOrderRepository.findAll().forEach(customerOrders::add);
        return customerOrders;
    }

    public CustomerOrder findById(long id) {
        return customerOrderRepository.findById(id).get();
    }

    public List<CustomerOrder> findByCustomerId(final Integer customerId) {
        return customerOrderRepository.findAllByCustomerId(customerId);
    }
}
