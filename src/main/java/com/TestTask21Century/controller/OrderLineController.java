package com.TestTask21Century.controller;

import com.TestTask21Century.entity.OrderLine;
import com.TestTask21Century.service.OrderLineServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class OrderLineController {

    @Autowired
    private OrderLineServiceImpl orderLineService;

    @GetMapping("/orders")
    public String ordersList(Model model){
        Iterable<OrderLine> orders = orderLineService.findAll();
        model.addAttribute("orders", orders);
        return "ordersLineList";
    }

    @GetMapping("/addOrder/{id}")
    public String addOrder(@PathVariable(value = "id") long id, Model model){
        orderLineService.save(new OrderLine(0l,id,1));
        return "redirect:/orders";
    }

    @GetMapping("/detailsOrder/{id}")
    public String detailsOrder(@PathVariable(value = "id") long id, Model model){
        OrderLine orderLine =orderLineService.findById(id);
        if (orderLine == null){
            return "redirect:/orders";
        }
        model.addAttribute("orderLine", orderLine);
        return "detailsOrder";
    }

    @GetMapping("/editOrder/{id}")
    public String editOrder(@PathVariable(value = "id") long id, Model model){
        OrderLine orderLine =orderLineService.findById(id);
        if (orderLine == null){
            return "redirect:/orders";
        }
        model.addAttribute("orderLine", orderLine);
        return "editOrder";
    }

    @PostMapping("/editOrder/{id}")
    public String editingOrder(@PathVariable(value = "id") long id, @RequestParam int count, @RequestParam long goods_id, Model model){
        orderLineService.edit(new OrderLine(id,orderLineService.findById(id).getOrder_id(),goods_id,count));
        return "redirect:/orders";
    }

    @PostMapping("/order/{id}/remove")
    public String deleteOrder(@PathVariable(value = "id") long id, Model model){
        OrderLine orderLine = orderLineService.findById(id);
        orderLineService.delete(orderLine);
        return "redirect:/orders";
    }
}
