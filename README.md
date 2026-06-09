# Tienda Toallas

Sistema web desarrollado con Spring Boot, Thymeleaf y MySQL para la gestión y venta de toallas.

## Tecnologías

- Java 17
- Spring Boot
- Spring Data JPA
- Thymeleaf
- MySQL
- Maven
- Bootstrap 5

## Funcionalidades (plan)

- Catálogo de productos
- Gestión de clientes
- Carrito de compras
- Registro de compras
- Panel administrativo básico

## Estructura del proyecto

src/main/java/com/gutierrezor/tiendatoallas
├── controller
├── entity
├── repository
├── service
├── dto
└── config

## Instalación rápida

```bash
git clone https://github.com/Gutierrezor/tiendatoallas.git
cd tiendatoallas
./mvnw spring-boot:run
```

## Base de datos

Crear una base de datos en MySQL:

```sql
CREATE DATABASE datatienda;
```

## Variables de entorno

Copiar `.env.example` a `.env` y completar las variables `DB_URL`, `DB_USER`, `DB_PASSWORD`.

## Docker (opcional)

Levantar MySQL con `docker-compose` (crear `docker-compose.yml` si deseas):

```bash
docker compose up -d
```

## Autor

Julián Gutiérrez

## Ejecutar

Usando el wrapper de Maven:

```bash
./mvnw spring-boot:run
```

Levantar base de datos con Docker Compose:

```bash
docker compose up -d
```
