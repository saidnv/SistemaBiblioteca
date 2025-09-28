👨‍💻👩‍💻 Integrantes del Proyecto

Robinson Said Nolasco Vallejos

Belinda Adela Yata Pinaud

BIDEO DOCUMENTACION:
https://drive.google.com/drive/folders/15P2UUc10qJwjG3FNL9G5k4fcwttnNgyA?usp=sharing

--------------------------------------

📝 Descripción del Proyecto

Este proyecto implementa un Sistema de Gestión de Biblioteca desarrollado en Java con Spring Framework bajo la Arquitectura Hexagonal (Ports & Adapters).

La arquitectura hexagonal permite desacoplar el dominio de la infraestructura, facilitando la mantenibilidad, escalabilidad y la posibilidad de cambiar tecnologías (base de datos, frameworks, interfaces) sin afectar la lógica principal.

El sistema gestiona los procesos principales de una biblioteca, tales como:

Registro y administración de usuarios.

Gestión de libros, autores, categorías y editoriales.

Control de ejemplares disponibles.

Registro y seguimiento de préstamos y devoluciones.

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

REST API para la comunicación con clientes externos
