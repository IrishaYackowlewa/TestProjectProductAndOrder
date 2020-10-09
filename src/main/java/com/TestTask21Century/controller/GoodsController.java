package com.TestTask21Century.controller;

import com.TestTask21Century.entity.Goods;
import com.TestTask21Century.service.GoodsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GoodsController {
    @Autowired
    private GoodsServiceImpl goodsService;

    @GetMapping("/goods")
    public String goodsList(Model model){
        Iterable<Goods> goods = goodsService.findAll();
        model.addAttribute("goods", goods);
        return "goodsList";
    }

    @PostMapping("/goods")
    public String deleteGoods(@RequestParam String name, @RequestParam double price, Model model){
        goodsService.edit(new Goods(name,price));
        return "redirect:/goods";
    }

    @GetMapping("/addGoods")
    public String addGoods(Model model){
        return "addGoods";
    }

    @PostMapping("/addGoods")
    public String addingGoods(@RequestParam String name, @RequestParam double price, Model model){
        goodsService.save(new Goods(name, price));
        return "redirect:/goods";
    }

    @GetMapping("/detailsGoods/{id}")
    public String blogDetails(@PathVariable(value = "id") long id, Model model){
        Goods goods =goodsService.findById(id);
        if (goods == null){
            return "redirect:/goods";
        }
        model.addAttribute("goods", goods);
        return "detailsGoods";
    }

    @GetMapping("/editGoods/{id}")
    public String editGoods(@PathVariable(value = "id") long id, Model model){
        Goods goods =goodsService.findById(id);
        if (goods == null){
            return "redirect:/goods";
        }
        model.addAttribute("goods", goods);
        return "editGoods";
    }

    @PostMapping("/editGoods/{id}")
    public String editingGoods(@PathVariable(value = "id") long id,@RequestParam String name, @RequestParam double price, Model model){
        goodsService.edit(new Goods(id, name, price));
        return "redirect:/goods";
    }


    @PostMapping("/goods/{id}/remove")
    public String deletePostArticle(@PathVariable(value = "id") long id, Model model){
        Goods post = goodsService.findById(id);
        goodsService.delete(post);
        return "redirect:/goods";
    }
    //@RequestMapping("/hello")
    //private String hello() {
    //	return "Hello World!";
    //}
}