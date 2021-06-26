package com.example.lessons2.projection;

import com.example.lessons2.entity.Currency;
import com.example.lessons2.entity.Input;
import com.example.lessons2.entity.Supplier;
import com.example.lessons2.entity.Warehouse;
import org.springframework.data.rest.core.config.Projection;

import javax.persistence.ManyToOne;
import java.sql.Date;

@Projection(types = Input.class)
public interface InputPro {
    Integer getId();

    Date getDate();

    Warehouse getWarehouse();


    Supplier getSupplier();


    Currency getCurrency();

    String getFactureNumber();
    String getCode();
}
