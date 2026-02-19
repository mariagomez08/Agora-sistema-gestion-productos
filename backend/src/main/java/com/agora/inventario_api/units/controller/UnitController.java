package com.agora.inventario_api.units.controller;

import org.springframework.web.bind.annotation.*;

import com.agora.inventario_api.units.service.UnitService;



@RestController
@RequestMapping("/v1/units")
public class UnitController {

    private UnitService unitService;

    public UnitController(UnitService unitService){
        this.unitService = unitService;
    }



}
