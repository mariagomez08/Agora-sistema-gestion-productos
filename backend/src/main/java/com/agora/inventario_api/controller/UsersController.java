package com.agora.inventario_api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController

public class UsersController {

        @GetMapping("/users") //endpoint de prueba para usuarios
        public Map<String, String> users() {
        Map<String, String> response = new HashMap<>();
        response.put("message", "Endpoint de usuarios activo");
        return response;
    }
}
