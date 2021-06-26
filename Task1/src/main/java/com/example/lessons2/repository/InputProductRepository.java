package com.example.lessons2.repository;

import com.example.lessons2.entity.Input;
import com.example.lessons2.entity.InputProduct;
import com.example.lessons2.projection.InputPro;
import com.example.lessons2.projection.InputProductPro;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "inputproduct", collectionResourceRel = "list",excerptProjection = InputProductPro.class)
public interface InputProductRepository extends CrudRepository<InputProduct,Integer> {

}
