package com.hcl.wm.driverservice;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Customer API", version = "2.0", description = "Customers Information"))
public class DriverserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(DriverserviceApplication.class, args);
    }

}
