package com.TestTask21Century.entity;

import javax.persistence.*;

@Entity
@Table(name = "GOODS")
public class Goods {
    @Id
    @GeneratedValue
    @Column(name = "id", length = 6, nullable = false)
    private Long id;
    private String name;
    private double price;

    protected Goods(){}

    public Goods(String name, double price) {
        this.name = name;
        this.price = price;
    }
    public Goods(Long id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
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

    @Override
    public String toString() {
        return "Goods{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
//CREATE TABLE GOODS(ID INT PRIMARY KEY,
//   NAME VARCHAR(255),
//   PRICE DECIMAL (18, 2)
//);