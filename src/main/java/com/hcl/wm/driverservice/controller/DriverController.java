package com.hcl.wm.driverservice.controller;

import com.hcl.wm.driverservice.dto.Order;
import com.hcl.wm.driverservice.service.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * This represents the rest resource
 */
@RestController
@RequestMapping("/driver")
public class DriverController {

    @Autowired
    DriverService service;

    //updatedStatus can be PickedUp, Delivered
    @GetMapping("/{updatedStatus}")
    Boolean updateStatus(@PathVariable String updatedStatus) {
        return service.updateOrderStatus(updatedStatus);
    }

    @GetMapping("/getOrderDetails/{orderId}")
    Order getOrderDetails(@PathVariable String orderId) {
        return service.getOrderDetails(orderId);
    }
}
