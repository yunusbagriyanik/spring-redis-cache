package com.yunusbagriyanik.springrediscache.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Document("users")
@Data
public class User implements Serializable {
    @Id
    private String id;
    private String username;
    private String email;
    private Membership membership;
}
