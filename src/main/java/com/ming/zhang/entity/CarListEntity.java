package com.ming.zhang.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author merz
 * @Description:
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class CarListEntity extends BaseEntity {
    private Integer id;
    private String layerModel;
    private String name;
    private String img;
}
