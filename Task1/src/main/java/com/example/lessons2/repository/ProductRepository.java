package com.example.lessons2.repository;

import com.example.lessons2.entity.Currency;
import com.example.lessons2.entity.Product;
import com.example.lessons2.projection.CurrencyPro;
import com.example.lessons2.projection.ProductPro;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "product", collectionResourceRel = "list",excerptProjection = ProductPro.class)
public interface ProductRepository extends CrudRepository<Product,Integer> {

}
