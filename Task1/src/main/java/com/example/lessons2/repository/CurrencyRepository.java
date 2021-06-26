package com.example.lessons2.repository;

import com.example.lessons2.entity.Currency;
import com.example.lessons2.projection.CurrencyPro;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "currency", collectionResourceRel = "list",excerptProjection = CurrencyPro.class)
public interface CurrencyRepository extends CrudRepository<Currency,Integer> {

}
