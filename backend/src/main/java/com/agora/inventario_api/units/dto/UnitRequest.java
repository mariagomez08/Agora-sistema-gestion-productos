package com.agora.inventario_api.units.dto;
import lombok.Data;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Data

public class UnitRequest {

    @NotBlank(message = "El nombre es obligatorio")
    @Size(min = 2, max = 50, message = "El nombre debe tener entre 2 y 50 caracteres")
    private String name;

    @Size(max = 200, message = "La descripción no puede exceder 200 caracteres")
    private String description;

    @NotNull(message = "El estado no puede ser nulo")
    private Boolean status;
}
