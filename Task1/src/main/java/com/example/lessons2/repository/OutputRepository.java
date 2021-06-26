package com.example.lessons2.repository;

import com.example.lessons2.entity.Input;
import com.example.lessons2.entity.Output;
import com.example.lessons2.projection.InputPro;
import com.example.lessons2.projection.OutputPro;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "output", collectionResourceRel = "list",excerptProjection = OutputPro.class)
public interface OutputRepository extends CrudRepository<Output,Integer> {

}
