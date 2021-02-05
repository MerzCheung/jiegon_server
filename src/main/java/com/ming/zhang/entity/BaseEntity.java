package com.ming.zhang.entity;

import lombok.Data;

import java.util.Date;

@Data
public class BaseEntity {
    private Integer tbId;
    private Integer isValid;
    private Date createdTime;
    private Date modifiedTime;
}
