package com.agora.inventario_api.units.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.agora.inventario_api.units.dto.UnitResponse;
import com.agora.inventario_api.units.repository.UnitRepository;
import com.agora.inventario_api.units.model.UnitModel;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class UnitService {

    private UnitRepository unitRepository;

    public UnitService(UnitRepository unitRepository){
        this.unitRepository = unitRepository;
    }


    public List<UnitResponse> GetAllUnits(){
        List<UnitModel> listUnitModel= unitRepository.findAll();
        List<UnitResponse> listUnitResponse = new ArrayList<>();
        for(UnitModel unitModel : listUnitModel){
            listUnitResponse.add(new UnitResponse(unitModel));
        }
        return listUnitResponse;
    }
   

}

