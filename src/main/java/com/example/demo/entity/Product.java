package com.example.demo.entity;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Product implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private double price;

    private boolean inStock;

    @OneToMany(mappedBy = "product")
    private Set<OrderLine> orderLines;

    @OneToMany(mappedBy = "product")
    private Set<ProductComment> productComments;

    public Product() {
        orderLines = new HashSet<>();
        productComments = new HashSet<>();
    }

    public Product(String name, boolean inSock, double price) {
        this();
        this.name = name;
        this.price = price;
        this.inStock = inSock;
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

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isInStock() {
        return inStock;
    }

    public void setInStock(boolean inStock) {
        this.inStock = inStock;
    }

    public Set<OrderLine> getOrderLines() {
        return orderLines;
    }

    public void setOrderLines(Set<OrderLine> orderLines) {
        this.orderLines = orderLines;
    }

    public Set<ProductComment> getProductComments() {
        return productComments;
    }

    public void setProductComments(Set<ProductComment> productComments) {
        this.productComments = productComments;
    }
}
