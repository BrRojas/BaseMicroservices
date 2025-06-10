# 🧱 BaseMicroservices

Este repositorio contiene una arquitectura base de microservicios en Java utilizando Spring Boot. El objetivo es construir un sistema escalable, modular y seguro, comenzando por un servicio de autenticación (`auth-service`) basado en JWT.

---

## 📦 Estructura del proyecto

```
BaseMicroservices/
├── auth-service/          # Microservicio de autenticación con JWT
│   ├── src/
│   ├── pom.xml
│   └── ...
└── README.md
```

---

## 🔐 auth-service

Microservicio encargado de la autenticación y autorización de usuarios mediante JWT.

### 📁 Paquetes principales:
- `model`: entidades JPA (como Usuario)
- `repository`: interfaces de acceso a datos
- `dto`: objetos de transferencia de datos
- `config`: configuración general
- `security`: configuración de seguridad con Spring Security y JWT
- `utils`: utilidades como generación de tokens

### 🔄 Endpoints principales

| Método | Endpoint             | Descripción                  |
|--------|----------------------|------------------------------|
| POST   | `/api/auth/login`    | Autenticación de usuario     |
| POST   | `/api/auth/register` | Registro de nuevo usuario    |
| GET    | `/api/auth/profile`  | Perfil del usuario autenticado |

---

## 🚀 Cómo ejecutar el proyecto

### 1. Requisitos
- Java 17+
- Maven o IDE compatible (IntelliJ, VS Code, etc.)
- Base de datos configurada (ej: MySQL o PostgreSQL)

### 2. Clonar el repositorio
```bash
git clone https://github.com/BrRojas/BaseMicroservices.git
cd BaseMicroservices/auth-service
```

### 3. Configurar propiedades
Editar el archivo `application.properties` o `application.yml` en `auth-service/src/main/resources/` con tus credenciales de base de datos y JWT secret.

### 4. Ejecutar el servicio
```bash
./mvnw spring-boot:run
```
o desde tu IDE favorito con la clase `AuthServiceApplication.java`.

---

## 🧪 Tests

*Se planea agregar pruebas unitarias y de integración con JUnit + Mockito.*

---

## 🛠️ Tecnologías utilizadas
- Java 17
- Spring Boot
- Spring Security + JWT
- Maven

---

## 📌 Próximos pasos

- [ ] Agregar microservicio de cuentas (`account-service`)
- [ ] Implementar Eureka Server y API Gateway
- [ ] Dockerizar los servicios
- [ ] Documentar endpoints con OpenAPI (opcional)
