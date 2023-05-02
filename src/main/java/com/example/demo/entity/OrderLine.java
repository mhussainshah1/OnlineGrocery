package com.example.demo.entity;

import jakarta.persistence.*;
import java.io.Serializable;

@Entity
public class OrderLine implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private float amount;

    private double purchasePrice;

    @ManyToOne
    private CustomerOrder customerOrder;

    @ManyToOne
    private Product product;

    public OrderLine() {
    }

    public OrderLine(float amount, double purchasePrice, CustomerOrder customerOrder, Product product) {
        this.amount = amount;
        this.purchasePrice = purchasePrice;
        this.customerOrder = customerOrder;
        this.product = product;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public double getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(double purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public CustomerOrder getCustomerOrder() {
        return customerOrder;
    }

    public void setCustomerOrder(CustomerOrder customerOrder) {
        this.customerOrder = customerOrder;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
