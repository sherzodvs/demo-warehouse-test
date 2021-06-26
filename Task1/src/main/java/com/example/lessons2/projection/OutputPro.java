package com.example.lessons2.projection;

import com.example.lessons2.entity.*;
import org.springframework.data.rest.core.config.Projection;

import java.sql.Date;

@Projection(types = Output.class)
public interface OutputPro {
    Integer getId();

    Date getDate();

    Warehouse getWarehouse();


    Client getClient();


    Currency getCurrency();

    String getFactureNumber();
    String getCode();
}
