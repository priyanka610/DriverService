package com.hcl.wm.driverservice.client;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
public class OrderResponse {

    private String updatedStatus;
    private Boolean updatedStatusFlag;
}
