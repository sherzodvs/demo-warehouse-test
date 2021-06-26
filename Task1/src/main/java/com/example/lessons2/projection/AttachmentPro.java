package com.example.lessons2.projection;

import com.example.lessons2.entity.Attachment;
import com.example.lessons2.entity.Client;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Attachment.class)
public interface AttachmentPro {
    Integer getId();
    String getName();
    Long getSize();
    String getContentType();
}
