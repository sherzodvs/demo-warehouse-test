package com.example.lessons2.repository;

import com.example.lessons2.entity.InputProduct;
import com.example.lessons2.entity.OutputProduct;
import com.example.lessons2.projection.InputProductPro;
import com.example.lessons2.projection.OutputProductPro;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "outputproduct", collectionResourceRel = "list",excerptProjection = OutputProductPro.class)
public interface OutputProductRepository extends CrudRepository<OutputProduct,Integer> {

}
