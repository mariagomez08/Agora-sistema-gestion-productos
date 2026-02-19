package com.agora.inventario_api.units.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.agora.inventario_api.units.model.UnitModel;

@Repository
public interface UnitRepository extends JpaRepository<UnitModel, Long> {


}
