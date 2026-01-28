package com.agora.inventario_api.models;
import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Entity
@Table(name = "users") //nombre de la tabla en la base de datos
@Data //genera getters y setters automaticamente
public class User {

    @Id //llave unica
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Con la estrategia IDENTITY para que PostgreSQL le asigne el número automáticamente
    private Long id;

    @NotBlank(message = "El nombre no puede estar vacío")
    @Column(nullable = false) //para que no se repitan correos en tu sistema.
    private String name;

    @NotBlank(message = "El correo no puede estar vacío")
    @Column(nullable = false, unique = true) //para que no se repitan correos en tu sistema.
    private String email;

    @JsonIgnore //para que no se muestre en las respuestas de la API
    @NotBlank(message = "La contraseña no puede estar vacía")   
    @Column(nullable = false)
    private String password;

    private String role; //rol del usuario (admin, user, etc.)
}
