package com.example.lessons2.projection;


import com.example.lessons2.entity.Supplier;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Supplier.class)
public interface SupplierPro {
    Integer getId();
    String getName();
    boolean isActive();
    String getPhoneNumber();
}
