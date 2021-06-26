package com.example.lessons2.repository;

import com.example.lessons2.entity.Category;
import com.example.lessons2.entity.Warehouse;
import com.example.lessons2.projection.CategoryPro;
import com.example.lessons2.projection.ClientPro;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "category", collectionResourceRel = "list",excerptProjection = CategoryPro.class)
public interface ClategoryRepository extends CrudRepository<Category,Integer> {

}
