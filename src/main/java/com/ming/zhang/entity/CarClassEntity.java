package com.ming.zhang.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class CarClassEntity extends BaseEntity {
    private Integer id;
    private Integer carListId;
    private String carType;
    private String carStyle;
}
