package com.example.lessons2.repository;

import com.example.lessons2.entity.Client;
import com.example.lessons2.entity.Warehouse;
import com.example.lessons2.projection.ClientPro;
import com.example.lessons2.projection.WarehousePro;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "client", collectionResourceRel = "list",excerptProjection = ClientPro.class)
public interface ClientRepository extends CrudRepository<Client,Integer> {

}
