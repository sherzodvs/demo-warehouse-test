package com.example.lessons2.projection;

import com.example.lessons2.entity.User;
import com.example.lessons2.entity.Warehouse;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = User.class)
public interface UserPro {
    Integer getId();
    String getFirstName();
    String getLastName();
    String getPhoneNumber();
    String getCode();
    boolean isActive();
    Warehouse getWarehouse();
}
