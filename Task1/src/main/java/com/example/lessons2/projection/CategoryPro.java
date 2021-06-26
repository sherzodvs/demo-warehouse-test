package com.example.lessons2.projection;

import com.example.lessons2.entity.Category;
import com.example.lessons2.entity.Measurement;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Category.class)
public interface CategoryPro {
    Integer getId();
    String getName();
    boolean isActive();
    Category getParentCategory();
}
