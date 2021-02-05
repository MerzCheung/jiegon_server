package com.ming.zhang.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class CarAccumulatorConfigEntity extends BaseEntity {
    private Integer carDetailsId;
    private String type;
    private String name;
    private String capacity;
    private String specification;
    private String pillarType;
    private String fixedPolarity;
}
