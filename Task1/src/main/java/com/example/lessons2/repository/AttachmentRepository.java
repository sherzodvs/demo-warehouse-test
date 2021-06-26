package com.example.lessons2.repository;

import com.example.lessons2.entity.Attachment;
import com.example.lessons2.entity.Supplier;
import com.example.lessons2.projection.AttachmentPro;
import com.example.lessons2.projection.SupplierPro;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "attachment", collectionResourceRel = "list",excerptProjection = AttachmentPro.class)
public interface AttachmentRepository extends CrudRepository<Attachment,Integer> {

}
