package com.agora.inventario_api.units.dto;

import com.agora.inventario_api.units.model.UnitModel;
import lombok.Data;

@Data
public class UnitResponse {
 
    private Long id;
    private String name;
    private String description;
    private Boolean status;

    public UnitResponse(UnitModel unit) {
        this.id = unit.getId();
        this.name = unit.getName();
        this.description = unit.getDescription();
        this.status = unit.getStatus();
    }
}