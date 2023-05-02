package com.example.demo.entity;

import jakarta.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Customer implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private LocalDateTime customerSince;

    @OneToMany(mappedBy = "customer")
    private Set<CustomerOrder> customerOrders;

    public Customer() {
        customerOrders = new HashSet<>();
    }

    public Customer(String name, LocalDateTime customerSince) {
        this();
        this.name = name;
        this.customerSince = customerSince;
    }

    public Set<CustomerOrder> getCustomerOrders() {
        return customerOrders;
    }

    public void setCustomerOrders(Set<CustomerOrder> customerOrders) {
        this.customerOrders = customerOrders;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String Name) {
        this.name = Name;
    }

    public LocalDateTime getCustomerSince() {
        return customerSince;
    }

    public void setCustomerSince(LocalDateTime customerSince) {
        this.customerSince = customerSince;
    }
}
