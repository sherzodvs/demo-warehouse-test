package com.example.lessons2.projection;

import com.example.lessons2.entity.*;
import org.springframework.data.rest.core.config.Projection;

import java.sql.Date;

@Projection(types = OutputProduct.class)
public interface OutputProductPro {
    Integer getId();

    Product getProduct();

    double getAmmount();
    double getPrice();
    Output getOutput();
}
