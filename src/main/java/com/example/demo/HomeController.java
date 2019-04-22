package com.example.demo;

import com.example.demo.entity.repository.CustomerOrderRepository;
import com.example.demo.entity.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.time.LocalDate;

@Controller
public class HomeController {

    @Autowired
    ProductRepository productRepository;

    @Autowired
    CustomerOrderRepository customerOrderRepository;

    @RequestMapping("/")
    public String page(Model model, HttpServletRequest request) {
        request.getSession(true).setAttribute("user", new User("John", "Apricot", "Antarctica", null));
        model.addAttribute("today", LocalDate.now());
        return "home";
    }

    @RequestMapping("/product/list")
    public String getProductList(Model model) {
        model.addAttribute("prods", productRepository.findAll());
        return "/product/list";
    }

    @RequestMapping("/product/productcomments")
    public String getProductComment(@RequestParam("prodId") Long prodId, Model model) {
        model.addAttribute("prod", productRepository.findById(prodId).get());
        return "/product/productcomments";
    }

    @RequestMapping("/order/list")
    public String getOrderList(Model model) {
        model.addAttribute("orders", customerOrderRepository.findAll());
        return "/order/list";
    }

    @RequestMapping("/order/details")
    public String getOrderDetail(@RequestParam("orderId") Long orderId, Model model) {
        model.addAttribute("order", customerOrderRepository.findById(orderId).get());
        return "/order/details";
    }

    @RequestMapping("/subscribe")
    public String getSubscribe() {
        return "subscribe";
    }

    @RequestMapping("/userprofile")
    public String getUserProfile() {
        return "userprofile";
    }
}