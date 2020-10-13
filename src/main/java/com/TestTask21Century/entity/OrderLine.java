package com.TestTask21Century.entity;

import javax.persistence.*;

@Entity
@Table(name = "ORDER_LINE")
public class OrderLine {
    @Id
    @GeneratedValue(generator = "increment")
    private Long id;
    private Long order_id;
    private Long goods_id;
    private int count;

    protected OrderLine() {
    }

    public OrderLine(Long id, Long order_id, Long goods_id, int count) {
        this.id = id;
        this.order_id = order_id;
        this.goods_id = goods_id;
        this.count = count;
    }

    public OrderLine(Long order_id, Long goods_id, int count) {
        this.order_id = order_id;
        this.goods_id = goods_id;
        this.count = count;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getOrder_id() {
        return order_id;
    }

    public void setOrder_id(Long order_id) {
        this.order_id = order_id;
    }

    public Long getGoods_id() {
        return goods_id;
    }

    public void setGoods_id(Long goods_id) {
        this.goods_id = goods_id;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
//CREATE TABLE ORDER_LINE (ID INT PRIMARY KEY,
//   ORDER_ID INT,
//   GOODS_ID INT,
//   COUNT INT
//);

