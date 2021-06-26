package com.example.lessons2.repository;

import com.example.lessons2.entity.Currency;
import com.example.lessons2.entity.Supplier;
import com.example.lessons2.projection.CurrencyPro;
import com.example.lessons2.projection.SupplierPro;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "supplier", collectionResourceRel = "list",excerptProjection = SupplierPro.class)
public interface SupplierRepository extends CrudRepository<Supplier,Integer> {

}
