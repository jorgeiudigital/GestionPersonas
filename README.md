# Proyecto de Gestión de Personas

Este proyecto es una aplicación en Java que permite gestionar información sobre personas, realizando diversas operaciones como contar, filtrar, calcular promedios y mostrar información específica. Está desarrollado utilizando Maven como herramienta de construcción.

## Estructura del Proyecto

### `Model.Persona`
Clase que representa a una persona con los siguientes atributos:
- `nombre`: Nombre de la persona.
- `apellido`: Apellido de la persona.
- `edad`: Edad de la persona.
- `genero`: Género de la persona (M/F).
- `sueldoHora`: Sueldo por hora de la persona.
- `cargo`: Cargo de la persona.

Incluye un constructor, getters y setters para manipular los datos.

### `Services.ServicePersona`
Clase de servicio que encapsula la lógica de negocio relacionada con la gestión de personas. Proporciona los siguientes métodos:
- `contarPersonas`: Devuelve la cantidad total de personas en la lista.
- `calcularPromedioEdades`: Calcula el promedio de las edades de las personas en la lista.
- `contarMayoresDeEdad`: Cuenta cuántas personas son mayores de edad (edad >= 18).
- `filtrarPorNombreConA`: Filtra y devuelve una lista de personas cuyos nombres comienzan con la letra "A".
- `filtrarPorApellidoConM`: Filtra y devuelve una lista de personas cuyos apellidos contienen la letra "M".
- `mostrarSueldoDirectoresMasculinos`: Calcula y muestra el sueldo por 8 horas de trabajo de las personas que tienen el cargo de "Director" y género masculino, ignorando mayúsculas y minúsculas en las comparaciones.

### `Main`
Clase principal que permite interactuar con el usuario para ingresar datos de personas y realizar las operaciones disponibles en la clase de servicio.

## Requisitos

- **Java**: Versión 8 o superior.
- **Maven**: Para la gestión de dependencias y construcción del proyecto.

## Ejecución

1. Clona el repositorio:
   ```bash
   git clone https://github.com/jorgeiudigital/GestionPersonas.git