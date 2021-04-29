package com.ming.zhang.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * @author merz
 * @Description:
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class CarListMapEntity extends BaseEntity {
    private String layerModel;
    private List<CarListEntity> carListEntitys;
}
