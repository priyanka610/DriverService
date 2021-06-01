package com.hcl.wm.driverservice.client;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * This represents the customer instance
 */
@Getter
@Setter
@ToString
public class Customer {
    private String cust_Id;
    private String firstName;
    private String lastName;
    private String address;
}
