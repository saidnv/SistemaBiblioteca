👨‍💻👩‍💻 Integrantes del Proyecto

Robinson Said Nolasco Vallejos

Belinda Adela Yata Pinaud
--------------------------------------

📝 Descripción del Proyecto

Este proyecto implementa un Sistema de Gestión de Biblioteca desarrollado en Java con Spring Framework bajo la Arquitectura Hexagonal (Ports & Adapters).

La arquitectura hexagonal permite desacoplar el dominio de la infraestructura, facilitando la mantenibilidad, escalabilidad y la posibilidad de cambiar tecnologías (base de datos, frameworks, interfaces) sin afectar la lógica principal.

El sistema gestiona los procesos principales de una biblioteca, tales como:

Registro y administración de usuarios.

Gestión de libros, autores, categorías y editoriales.

Control de ejemplares disponibles.

Registro y seguimiento de préstamos y devoluciones.

🏛️ Arquitectura

El proyecto sigue la Arquitectura Hexagonal, dividiéndose en las siguientes capas:

Dominio (Core):
Contiene las entidades y lógica de negocio principal del sistema.

Aplicación (Use Cases):
Casos de uso que orquestan las operaciones del dominio.

Infraestructura (Adapters):
Implementaciones concretas (repositorios, controladores REST, conexión a la base de datos).

Puertos (Ports):
Interfaces que definen contratos para la comunicación entre capas.

🗄️ Modelo de Base de Datos

El sistema se conecta a una base de datos MySQL con las siguientes tablas principales:

usuarios → Registro de lectores de la biblioteca.

autores → Información de autores de libros.

editoriales → Editoriales relacionadas a los libros.

categorias → Clasificación de los libros.

libros → Información general de los libros (con relaciones a autores, editoriales y categorías).

ejemplares → Identificación de copias individuales de cada libro.

prestamos → Registro de préstamos realizados por usuarios.

detalle_prestamo → Seguimiento detallado de los ejemplares prestados y devueltos.

⚙️ Tecnologías Utilizadas

Java 17

Spring Boot

Spring Data JPA

MySQL

Maven

Arquitectura Hexagonal (Ports & Adapters)

REST API para la comunicación con clientes externos
