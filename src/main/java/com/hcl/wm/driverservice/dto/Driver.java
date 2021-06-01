package com.hcl.wm.driverservice.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * This represents the driver instance
 */
@Document
@Getter
@Setter
@ToString
public class Driver {
    private String driver_id;
    private String driver_name;
}
