# Agora- Sistema de Gestión de Inventario

Proyecto en desarrollo de un sistema de inventario construido con **Spring Boot**, **Angular**, **PostgreSQL** y **Gradle**, orientado a la gestión de usuarios, productos y control de stock.

El objetivo del proyecto es aplicar buenas prácticas de desarrollo de software, arquitectura por capas y fundamentos de ingeniería, creando una API REST integrada con un frontend moderno.

Actualmente el sistema cuenta con la configuración base del backend, conexión a base de datos y primeros endpoints de prueba funcionando correctamente. El desarrollo se está realizando por fases, comenzando con los módulos principales como usuarios, roles, permisos y gestión de inventario.

### Tecnologías utilizadas
- Java + Spring Boot  
- Gradle  
- Spring Data JPA (Hibernate) 
- PostgreSQL( HikariPool)
- Angular 
- Angular material
- Git y Postman  


### Backend
Tecnologías
- Java 21 | Lenguaje de programación
- Spring Boot | Framework principal
- Spring Security | Seguridad y autenticación
- Spring Data JPA | Persistencia de datos
- PostgreSQL | Base de datos relacional
- JWT (jjwt) | Generación de tokens
- Lombok | Reducción de boilerplate
- Gradle | Gestión de dependencias 

### Frontend
- Angular 19.2 | Framework
- Angular Material  | Componentes UI
- TypeScript | Lenguaje tipado

## Arquitectura
```
┌─────────────────┐      HTTP/REST       ┌─────────────────┐
│                 │ ◄──────────────────► │                 │
│  Angular 19     │      JSON/JWT        │  Spring Boot    │
│  Frontend       │                      │  Backend API    │
│                 │                      │                 │
└─────────────────┘                      └────────┬────────┘
                                                  │
                                         ┌────────▼────────┐
                                         │   PostgreSQL    │
                                         │    Database     │
                                         └─────────────────┘
```
### Ejecución básica
Desde el directorio Frontend:

```bash
cd frontend
npm start
```
> Corre en http://localhost:4200

Desde el directorio Backend:
```bash
cd backend
.\gradlew.bat :backend:bootRun
```
> Corre en http://localhost:8080/api




