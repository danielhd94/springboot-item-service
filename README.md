# Spring boot item service

El servicio de items es un servicio web que se encarga de generar detalle para un carrito de compra, consumiendo el microservicio de productos para obtener la información de los productos relacionados.

## Características

- Obtiene la información de los productos relacionados llamando al microservicio de productos.
- Permite obtener información detallada de un item específico, incluyendo los detalles del producto asociado.

## Tecnologías utilizadas

- Java: Lenguaje de programación principal.
- Spring Boot: Framework para el desarrollo de aplicaciones Java.
- Spring Cloud: Conjunto de herramientas para crear arquitecturas de microservicios.
- Feign: Biblioteca para consumir servicios web RESTful.
- H2 Database: Base de datos en memoria utilizada para desarrollo y pruebas.

## Configuración

1. Clona este repositorio: `git clone https://github.com/danielhd94/springboot-item-service.git`
2. Navega al directorio del proyecto: `cd springboot-item-service`
3. Abre el proyecto en tu IDE preferido (como Spring Tools Suite).
4. Ejecuta la aplicación. Se creará automáticamente la base de datos H2 en memoria.

## Endpoints

## Endpoints

A continuación se presentan los endpoints disponibles en el servicio de items:

- `GET /list`: Obtiene una lista de todos los items, incluyendo los detalles de los productos asociados.
- `GET /detail/{id}`: Obtiene información detallada de un item específico, incluyendo los detalles del producto asociado.

## Consumo del microservicio de productos

El servicio de items consume el microservicio de productos para obtener la información de los productos relacionados. Asegúrate de que el microservicio de productos esté en ejecución y configurado correctamente.

## Contribuciones

Las contribuciones son bienvenidas. Si deseas mejorar este servicio de items, puedes realizar un fork del repositorio, hacer tus cambios y enviar un pull request.

## Autor

Daniel Hernandez

## Licencia

Este proyecto está bajo la Licencia MIT. Consulta el archivo LICENSE para obtener más información.

## Contacto

Si tienes alguna pregunta o sugerencia sobre el servicio de items, puedes contactarme en danielhd94@hotmail.com.
