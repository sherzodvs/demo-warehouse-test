package com.example.lessons2.projection;

import com.example.lessons2.entity.Input;
import com.example.lessons2.entity.InputProduct;
import com.example.lessons2.entity.Product;
import org.springframework.data.rest.core.config.Projection;

import javax.persistence.ManyToOne;
import java.sql.Date;

@Projection(types = InputProduct.class)
public interface InputProductPro {
    Integer getId();

    Product getProduct();

    double getAmmount();
    double getPrice();

    Date getExpireDate();

    Input getInput();
}
