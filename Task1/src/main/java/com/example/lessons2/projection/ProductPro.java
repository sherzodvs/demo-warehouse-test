package com.example.lessons2.projection;

import com.example.lessons2.entity.Attachment;
import com.example.lessons2.entity.Category;
import com.example.lessons2.entity.Measurement;
import com.example.lessons2.entity.Product;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Product.class)
public interface ProductPro {
    Integer getId();
    String getName();
    Category getCategory();
    Attachment getPhoto();
    String getCode();
    Measurement getMeasurement();
}
