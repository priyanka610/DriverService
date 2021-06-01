package com.hcl.wm.driverservice.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * This represents the order instance
 */
@Document
@Getter
@Setter
@ToString
public class Order {

    private String id;
    private Item item;
    private int qty;
    private Customer customer;
    private Driver driver;
    private String invoice;
    private String orderStatus;

    public Order(String id, Item item, int qty, Customer customer, Driver driver, String invoice, String orderStatus) {
        this.id = id;
        this.item = item;
        this.qty = qty;
        this.customer = customer;
        this.driver = driver;
        this.invoice = invoice;
        this.orderStatus = orderStatus;
    }
}
