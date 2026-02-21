package com.jsp.Unidirectional_ManyToOne;

import javax.persistence.*;

@Entity
@Table(name = "orders") 
public class Order {

    @Id
    private int orderId;
    private String orderDish;
    private int count;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    public Order() {
    }

    public Order(int orderId, String orderDish, int count, Customer customer) {
        this.orderId = orderId;
        this.orderDish = orderDish;
        this.count = count;
        this.customer = customer;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getOrderDish() {
        return orderDish;
    }

    public void setOrderDish(String orderDish) {
        this.orderDish = orderDish;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}