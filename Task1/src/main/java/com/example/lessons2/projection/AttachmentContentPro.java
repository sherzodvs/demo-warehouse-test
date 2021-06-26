package com.example.lessons2.projection;

import com.example.lessons2.entity.Attachment;
import com.example.lessons2.entity.AttachmentContent;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = AttachmentContent.class)
public interface AttachmentContentPro {
    Integer getId();
    byte[] getBytes();
    Attachment getAttachment();
}
