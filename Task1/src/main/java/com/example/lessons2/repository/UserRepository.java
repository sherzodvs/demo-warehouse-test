package com.example.lessons2.repository;

import com.example.lessons2.entity.Currency;
import com.example.lessons2.entity.User;
import com.example.lessons2.projection.CurrencyPro;
import com.example.lessons2.projection.UserPro;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "user", collectionResourceRel = "list",excerptProjection = UserPro.class)
public interface UserRepository extends CrudRepository<User,Integer> {

}
