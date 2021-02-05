package com.ming.zhang.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class CarAccumulatorListEntity extends BaseEntity {
    private Integer id;
    private Integer carDetailsId;
    private String name;
}
