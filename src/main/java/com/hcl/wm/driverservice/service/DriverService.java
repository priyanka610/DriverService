package com.hcl.wm.driverservice.service;

import com.hcl.wm.driverservice.dto.Customer;
import com.hcl.wm.driverservice.dto.Driver;
import com.hcl.wm.driverservice.dto.Item;
import com.hcl.wm.driverservice.dto.Order;
import org.springframework.stereotype.Service;

/**
 * This represents the driver service
 */
@Service
public class DriverService {
    public Boolean updateOrderStatus(String updatedStatus) {
        return true;
    }

    public Order getOrderDetails(String orderId) {

        return new Order(orderId, new Item(), 20, new Customer(), new Driver(), "sdcksdcksdc", "Delivered");
    }
}
