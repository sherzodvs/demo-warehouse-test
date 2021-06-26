package com.example.lessons2.projection;

import com.example.lessons2.entity.Currency;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Currency.class)
public interface CurrencyPro {
    Integer getId();
    String getName();
    boolean isActive();
}
