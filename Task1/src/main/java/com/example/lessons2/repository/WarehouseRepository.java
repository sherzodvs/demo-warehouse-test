package com.example.lessons2.repository;

import com.example.lessons2.entity.Currency;
import com.example.lessons2.entity.Warehouse;
import com.example.lessons2.projection.CurrencyPro;
import com.example.lessons2.projection.WarehousePro;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "warehouse", collectionResourceRel = "list",excerptProjection = WarehousePro.class)
public interface WarehouseRepository extends CrudRepository<Warehouse,Integer> {

}
