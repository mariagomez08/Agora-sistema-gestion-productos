package com.agora.inventario_api.units.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Entity
@Data  // Lombok genera automáticamente getters, setters, toString, equals, hashCode
@Table(name = "units") // Especifica el nombre de la tabla en la base de datos
public class UnitModel {

    @Id //llave unica
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Con la estrategia IDENTITY para que PostgreSQL le asigne el número automáticamente
    private Long id;

    @NotBlank(message = "El nombre  de la unidad no puede estar vacío")
    @Column(nullable = false)
    private String name;

    private String description;

    @NotNull(message = "El estado no puede ser nulo")
    @Column(nullable = false)
    private Boolean status;
    
}
