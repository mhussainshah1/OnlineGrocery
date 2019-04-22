package com.example.demo.entity;

import javax.persistence.*;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Customer)) {
            return false;
        }
        Customer other = (Customer) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.example.demo.entity.Customer[ id=" + id + " ]";
    }
}
