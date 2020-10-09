package com.TestTask21Century.controller;

import com.TestTask21Century.entity.Order;
import com.TestTask21Century.service.OrderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class OrderController {
    @Autowired
    OrderServiceImpl orderService;

    @GetMapping("/doOrder")
    public String doOrder(Model model){
        return "doOrder";
    }

    @PostMapping("/doOrder")
    public String registrationOrder(@RequestParam String client, @RequestParam String address, Model model){
        java.util.Date utilDate = new java.util.Date();
        java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
        orderService.save(new Order(client, sqlDate,address));
        return "redirect:/orders";
    }
}
