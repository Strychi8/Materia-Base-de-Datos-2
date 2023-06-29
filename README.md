# BD2 - 2023
Trabajo Practico Cuatrimestral de la materia Base de Datos 2 de la Universidad Nacional de Lanus

# Descripcion del problema
- RELEVAMIENTO

Una cadena de farmacias nos pide informatizar la operatoria de su negocio. Como resultado de su
relevamiento, obtenemos la siguiente información:

La farmacia vende medicamentos y productos de perfumería.

Algunos clientes tienen obra social y otros son privados.

De todos los clientes se registran apellido, nombre, DNI, domicilio (calle, número, localidad, provincia), obra
social si la tiene (nombre de la obra social y número de afiliado)

De los empleados se requiere conocer el apellido, nombre, DNI, CUIL, domicilio (calle, número, localidad,
provincia) y obra social a la que aporta (nombre de la obra social y número de afiliado).
De cada producto se requiere conocer si es un medicamento o producto de perfumería, una descripción, el
laboratorio que lo produce, un código numérico y el precio.

De cada venta se registra: fecha, número de ticket, total de la venta, forma de pago (efectivo, tarjeta o débito),
productos vendidos con sus cantidades, precio unitario y total; empleado que atendió al cliente y el empleado que
realizó el cobro en caja.

De cada sucursal se conoce que empleados pertenecen a la misma, el domicilio (calle, número, localidad,
provincia) y cuál de los empleados es encargado de la misma. El número de ticket se emite con un punto de venta
distinto para cada sucursal (el punto de venta de identifica con los primeros cuatro números del ticket fiscal, ej:
0001-00001234 es punto de venta 1)

# Como levantar el proyecto
Como primer paso se debe comprobar que se tenga instalado:
- Java 18 o superior
- MongoDB (uso MongoDBCompass, se puede usar MongoDBAtlas)
- Eclipse (puede ser otro IDE)



