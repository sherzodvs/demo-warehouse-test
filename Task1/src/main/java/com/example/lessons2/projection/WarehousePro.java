package com.example.lessons2.projection;

import com.example.lessons2.entity.Currency;
import com.example.lessons2.entity.Warehouse;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Warehouse.class)
public interface WarehousePro {
    Integer getId();
    String getName();
    boolean isActive();

}
