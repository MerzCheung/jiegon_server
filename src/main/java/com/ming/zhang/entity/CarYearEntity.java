package com.ming.zhang.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class CarYearEntity extends BaseEntity {
    private Integer value;
    private Integer carClassId;
    private String text;
}
