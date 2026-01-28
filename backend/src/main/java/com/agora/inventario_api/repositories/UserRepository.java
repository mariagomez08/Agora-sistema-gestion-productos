package com.agora.inventario_api.repositories;

import com.agora.inventario_api.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository

public interface UserRepository extends JpaRepository<User, Long> { //User: Le dice a JPA que este repositorio es exclusivamente para la tabla de usuarios.
    //Le indica que la "Llave Primaria" (el ID) de esa tabla es de tipo numérico largo.
   
    Optional<User> findByEmail(String email);
}
