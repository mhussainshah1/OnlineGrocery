package com.example.demo;

import com.example.demo.entity.*;
import com.example.demo.entity.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.HashSet;
import java.util.Set;

@Component
public class DataLoader implements CommandLineRunner {

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    ProductRepository productRepository;

    @Autowired
    CustomerOrderRepository customerOrdersRepository;

    @Autowired
    OrderLineRepository orderLineRepository;

    @Autowired
    ProductCommentRepository productCommentRepository;

    @Override
    public void run(String... args) throws Exception {
        //Customer
        Customer cust1 = new Customer(
                "James Cucumber",
                LocalDateTime.of(2006, Month.APRIL, 2, 13, 20));
        customerRepository.save(cust1);

        Customer cust2 = new Customer(
                "Anna Lettuce",
                LocalDateTime.of(2005, Month.JANUARY, 30, 17, 14));
        customerRepository.save(cust2);

        Customer cust3 = new Customer(
                "Boris Tomato",
                LocalDateTime.of(2008, Month.DECEMBER, 2, 9, 53));
        customerRepository.save(cust3);

        Customer cust4 = new Customer(
                "Shannon Parsley",
                LocalDateTime.of(2009, Month.MARCH, 24, 10, 45));
        customerRepository.save(cust4);

        Customer cust5 = new Customer(
                "Susan Cheddar",
                LocalDateTime.of(2007, Month.OCTOBER, 1, 15, 02));
        customerRepository.save(cust5);

        Customer cust6 = new Customer(
                "George Garlic",
                LocalDateTime.of(2010, Month.MAY, 18, 20, 30));
        customerRepository.save(cust6);

        //Product
        Product prod1 = new Product("Fresh Sweet Basil", true, 4.99);
        productRepository.save(prod1);

        Product prod2 = new Product("Italian Tomato", false, 1.25);
        productRepository.save(prod2);

        Product prod3 = new Product("Yellow Bell Pepper", true, 2.50);
        productRepository.save(prod3);

        Product prod4 = new Product("Old Cheddar", true, 18.75);
        productRepository.save(prod4);

        Product prod5 = new Product("Extra Virgin Coconut Oil", true, 6.34);
        productRepository.save(prod5);

        Product prod6 = new Product("Organic Tomato Ketchup", true, 1.99);
        productRepository.save(prod6);

        Product prod7 = new Product("Whole Grain Oatmeal Cereal", true, 3.07);
        productRepository.save(prod7);

        Product prod8 = new Product("Traditional Tomato & Basil Sauce", true, 2.58);
        productRepository.save(prod8);

        Product prod9 = new Product("Quinoa Flour", true, 3.02);
        productRepository.save(prod9);

        Product prod10 = new Product("Grapefruit Juice", true, 2.58);
        productRepository.save(prod10);

        Product prod11 = new Product("100% Pure Maple Syrup", true, 5.98);
        productRepository.save(prod11);

        Product prod12 = new Product("Marinara Pasta Sauce", false, 2.08);
        productRepository.save(prod12);

        Product prod13 = new Product("Vanilla Puff Cereal", false, 1.75);
        productRepository.save(prod13);

        Product prod14 = new Product("Extra Virgin Oil", false, 5.01);
        productRepository.save(prod14);

        Product prod15 = new Product("Roasted Garlic Pasta Sauce", true, 2.40);
        productRepository.save(prod15);

        Product prod16 = new Product("Canned Minestrone Soup", true, 2.19);
        productRepository.save(prod16);

        Product prod17 = new Product("Almond Milk 1L", true, 3.24);
        productRepository.save(prod17);

        Product prod18 = new Product("Organic Chicken & Wild Rice Soup", true, 3.17);
        productRepository.save(prod18);

        Product prod19 = new Product("Purple Carrot, Blackberry, Quinoa & Greek Yogurt", true, 8.88);
        productRepository.save(prod19);

        Product prod20 = new Product("Pumpkin, Carrot and Apple Juice", false, 3.90);
        productRepository.save(prod20);

        Product prod21 = new Product("Organic Canola Oil", true, 10.13);
        productRepository.save(prod21);

        Product prod22 = new Product("Potato Corn Tortilla Chips", true, 2.44);
        productRepository.save(prod22);

        Product prod23 = new Product("Canned Corn Chowder Soup", true, 2.30);
        productRepository.save(prod23);

        Product prod24 = new Product("Organic Lemonade Juice", true, 2.48);
        productRepository.save(prod24);

        Product prod25 = new Product("Spicy Basil Dressing", true, 4.72);
        productRepository.save(prod25);

        Product prod26 = new Product("Sweet Agave Nectar", true, 6.46);
        productRepository.save(prod26);

        Product prod27 = new Product("Dark Roasted Peanut Butter", false, 3.48);
        productRepository.save(prod27);

        Product prod28 = new Product("Unsweetened Lemon Green Tea", true, 18.34);
        productRepository.save(prod28);

        Product prod29 = new Product("Whole Grain Flakes Cereal", true, 3.52);
        productRepository.save(prod29);

        Product prod30 = new Product("Berry Chewy Granola Bars", true, 4.00);
        productRepository.save(prod30);

        //Orders
        CustomerOrder orders1 = new CustomerOrder(
                LocalDateTime.of(2009, Month.JANUARY, 12, 10, 23),
                cust4);
        customerOrdersRepository.save(orders1);

        OrderLine orderLine11 = new OrderLine(2, 0.99, orders1, prod2);
        orderLineRepository.save(orderLine11);

        OrderLine orderLine12 = new OrderLine(4, 2.50, orders1, prod3);
        orderLineRepository.save(orderLine12);

        OrderLine orderLine13 = new OrderLine(1, 15.50, orders1, prod4);
        orderLineRepository.save(orderLine13);

        CustomerOrder order2 = new CustomerOrder(
                LocalDateTime.of(2010, Month.JUNE, 9, 21, 01),
                cust6);
        customerOrdersRepository.save(order2);

        OrderLine orderLine21 = new OrderLine(5, 3.75, order2, prod1);
        orderLineRepository.save(orderLine21);

        OrderLine orderLine22 = new OrderLine(2, 17.99, order2, prod4);
        orderLineRepository.save(orderLine22);

        CustomerOrder order3 = new CustomerOrder(
                LocalDateTime.of(2010, Month.JULY, 18, 22, 32),
                cust1);
        customerOrdersRepository.save(order3);

        OrderLine orderLine32 = new OrderLine(8, 5.99, order3, prod1);
        orderLineRepository.save(orderLine32);

        //ProductComment
        //another way of saving through a set into the table of database
        Set<ProductComment> productComments = new HashSet<>();
        productComments.add(new ProductComment("I'm so sad this product is no longer available!", prod2));
        productComments.add(new ProductComment("When do you expect to have it back?", prod2));

        productComments.add(new ProductComment("Very tasty! I'd definitely buy it again!", prod13));
        productComments.add(new ProductComment("My kids love it!", prod13));
        productComments.add(new ProductComment("Good, my basic breakfast cereal. Though maybe a bit in the sweet side...", prod13));
        productComments.add(new ProductComment("Not that I find it bad, but I think the vanilla flavouring is too intrusive", prod13));
        productComments.add(new ProductComment("I agree with the excessive flavouring, but still one of my favourites!", prod13));
        productComments.add(new ProductComment("Cheaper than at the local store!", prod13));
        productComments.add(new ProductComment("I'm sorry to disagree, but IMO these are far too sweet", prod13));
        productComments.add(new ProductComment("Good. Pricey though.", prod13));

        productComments.add(new ProductComment("Made bread with this and it was great!", prod9));
        productComments.add(new ProductComment("Note: this comes actually mixed with wheat flour", prod9));

        productComments.add(new ProductComment("Awesome Spanish oil. Buy it now.", prod14));
        productComments.add(new ProductComment("Would definitely buy it again. Best one I've tasted", prod14));
        productComments.add(new ProductComment("A bit acid for my taste, but still a very nice one.", prod14));
        productComments.add(new ProductComment("Definitely not the average olive oil. Really good.", prod14));

        productComments.add(new ProductComment("Great value!", prod16));

        productComments.add(new ProductComment("My favourite :)", prod24));

        productComments.add(new ProductComment("Too hard! I would not buy again", prod30));
        productComments.add(new ProductComment("Taste is OK, but I agree with previous ProductComment that bars are too hard to eat", prod30));
        productComments.add(new ProductComment("Would definitely NOT buy again. Simply unedible!", prod30));
        productCommentRepository.saveAll(productComments);
    }
}