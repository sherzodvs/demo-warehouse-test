package com.example.lessons2.repository;

import com.example.lessons2.entity.Attachment;
import com.example.lessons2.entity.Input;
import com.example.lessons2.projection.AttachmentPro;
import com.example.lessons2.projection.InputPro;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "input", collectionResourceRel = "list",excerptProjection = InputPro.class)
public interface InputRepository extends CrudRepository<Input,Integer> {

}
