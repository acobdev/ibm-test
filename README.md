# IBM Test
Proyecto en Spring Boot que sirve como prueba técnica para la entrevista de trabajo en Tenea/IBM/banco Santander. Realizado por Álvaro Cobano.

## Instrucciones técnicas:
Debemos desarrollar un pequeño programa Java Spring Boot que consulte a una BBDD para traernos un array de resultados con los datos de proveedor (usando JPA). Dicho programa debe incluir los test unitarios con JUnit5. El programa debe recibir un parámetro de entrada, el cual será el código del cliente, y realizar una consulta a la tabla de proveedores en la base de datos. Si el código dado no posee ningún registro asociado, el programa debe devolver un array vacío.

## Diseño de datos:
**TABLA:** Proveedores
**CAMPOS:** id_proveedor, nombre, fecha_alta, cod_cliente

## Método de ejecución:
Para ejecutar este programa, deberemos localizar la clase Java 'Principal', localizada en src/main/java y que contiene el método 'main', y hacer click derecho presionar la opción "Run" o "Run As". Tras unos instantes en el que el framework Spring levanta los servicios, aparecerá en la terminal un mensaje indicando que la aplicación se está ejecutando y escuchando en el puerto 8080, puesto por defecto.

Una vez con el servicio activo, podremos enviar una solicitud HTTP empleando Postman. Entonces, la aplicación Spring Boot responderá a dicha solicitud y proporcionará los resultados esperados.

## Dependencias utilizadas:
1. **Spring Boot Starter Data JPA:** Dependencia diseñada para usar JPA (Java Persistance APIs), necesaria para Hibernate.
2. **Spring Boot Web:** Dependencia diseñada para crear aplicaciones Spring MVC que funcionen mediante microservicios RESTful.
3. **Spring Boot DevTools:** Herramientas para desarrollo de aplicaciones Spring Boot.
4. **Spring Boot Starter Test:** Dependencia diseñada para crear tests de aplicaciones Spring Boot, en el que se incluye JUnit5.

## Ficheros de entrega:
- Aplicación Spring Boot.
- Clases testing unitarias en JUnit.
- Colección Postman con llamada HTTP.
- Script de base de datos utilizado.