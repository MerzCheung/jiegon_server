package com.ming.zhang.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import java.util.Date;

@Data
public class BaseEntity {
    private Integer tbId;
    @JsonIgnore
    private Integer isValid;
    @JsonIgnore
    private Date createdTime;
    @JsonIgnore
    private Date modifiedTime;
}
