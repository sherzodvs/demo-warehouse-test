package com.example.lessons2.projection;

import com.example.lessons2.entity.Client;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Client.class)
public interface ClientPro {
    Integer getId();
    String getName();
    String getPhoneNumber();
}
