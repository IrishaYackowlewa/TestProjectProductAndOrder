package com.TestTask21Century.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "`ORDER`")
public class Order {
    @Id
    @GeneratedValue
    @Column(name = "id", length = 6, nullable = false)
    private Long id;
    private String client;
    private Date date;
    private String address;

    protected Order(){}

    public Order(String client, Date date, String address) {
        this.client = client;
        this.date = date;
        this.address = address;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
//CREATE TABLE `ORDER`(ID INT PRIMARY KEY,
//   CLIENT VARCHAR(255),
//   ADDRESS VARCHAR(255),
//   DATE DATE
//)
