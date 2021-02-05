package com.ming.zhang.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class CarDetailsEntity extends BaseEntity {
    private Integer id;
    private Integer carClassId;
    private Integer carYearId;
    private Integer carCcId;
    private String name;
}
