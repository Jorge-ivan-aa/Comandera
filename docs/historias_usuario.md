# Historias de usuario

## Historia #001

**como:** empleado **quiero:** poder iniciar sesion **para:** acceder a los funcionalidades de la aplicacion

**Estimacion:** N/A

### Criterios de aceptacion

1. [ ] **Datos incorrectos**

- **Dado que:** quiero autenticarme
- **Cuando:** ingrese datos incorrectos
- **Entonces:** fallara la autenticacion

2. [ ] **Datos faltantes**

- **Dado que:** quiero autenticarme
- **Cuando:** no propocione los datos requeridos
- **Entonces:** fallara la autenticacion

***

## Historia #002

**como:** mesero **quiero:** regitrar los pedidos de los clientes **para:** que la cocina obtenga la informacion para la preparacion de los platos

### Criterios de aceptacion

1. [ ] **Toma de pedido sin seleccion de mesa**

- **Dado que:** Quiero tomar el pedido de un cliente
- **Cuando:** No seleccione una mesa
- **Entonces:** No me sera posible crear el pedido

2. [ ] **Toma de pedido con informacion valida**

- **Dado que:** Quiero tomar el pedido de un cliente
- **Cuando:** Seleccione una mesa disponible
- **Entonces:** El pedido se creara satisfactoriamente

***

## Historia #003

- **Como:** Mesero
- **Quiero:** poder cancelar los pedidos creados
- **Para:** mantener la informacion de los pedidos acorde a lo que desean los clientes

### Criterios de aceptacion

1. [ ] **Cancelacion de un pedido completado** 

- **Dado que:** decida eliminar un pedido
- **Cuando:** el estado del pedido sea "completado"
- **Entonces:** no se permite la eliminacion del pedido

2. [ ] **Cancelacion de un pedido entregado**

- **Dado que:** decida eliminar un pedido
- **Cuando:** el estado del pedido sea "entregado"
- **Entonces:** no se permite la eliminacion del pedido

3. [ ] **Cancelacion de un pedido estado valido**

- **Dado que:** decida eliminar un pedido
- **Cuando:** el pedido no se encuentre completado
- **Entonces:** el pedido es eliminado exitosamente

***

## Historia #004

**como** mesero **quiero** poder actualizar el estado de un pedido a "entregado" o "completado" **para** que se refleje el estado actual del pedido

**Estimacion:** ¿?

### Criterios de aceptacion

1. [ ] **Actualizar el estado de un pedido completado**
2. [ ] **Actualizar el estado de un pedido con estado valido**


***

## Historia #005

**como** mesero **quiero** visualizar la informacion basica de los pedidos creados junto a sus respectivos estados **para** poder obtener rapidamente informacion sobre los pedidos

**Estimacion:** ¿?

***

## Historia #006

**como** bartender **quiero** visualizar una lista con los pedidos del area de bar **para** facilitar la navegacion y busqueda entre los distintos pedidos

**Estimacion:** ¿?

***

## Historia #007

**como** bartender **quiero** poder acceder a la informacion detallada de un pedido **para** preparar correctamente el pedido del cliente

**Estimacion:** ¿?

***

## Historia #008

**como** bartender **quiero** marcar un pedido como preparado **para** dar a conocer a las partes interesadas sobre el estado actual del pedido

**Estimacion:** ¿?

### Criterios de aceptacion

1. [ ] **Estado de completado a preparado**

- **Dado que:** quiera cambiar el estado de un pedido
- **Cuando:** el estado del pedido sea "completado"
- **Entonces:** no se efectua el cambio

2. [ ] **Estado de pendiente a preparado**

- **Dado que:** quiera cambiar el estado de un pedido
- **Cuando:** el estado del pedido sea "pendiente"
- **Entonces:** el estado es actualizado correctamente

***

## Historia #009

**como** jefe de cocina **quiero** visualizar un listado con los pedidos del area de cocina **para** facilitar la navegacion y busqueda entre los diferentes pedidos

**Estimacion:** ¿?

***

## Historia #010

**como** jefe de cocina **quiero** poder acceder a la informacion detallada de un pedido **para** preparar correctamente el pedido del cliente

**Estimacion:** ¿?

***

## Historia #011

**como** jefe de cocina **quiero** marcar un pedido como preparado **para** dar a conocer a las partes interesadas sobre el estado actual del pedido

**Estimacion:** ¿?

### Criterios de aceptacion

1. [ ] **Estado de completado a preparado**

- **Dado que:** quiera cambiar el estado de un pedido
- **Cuando:** el estado del pedido sea "completado"
- **Entonces:** no se efectua el cambio

2. [ ] **Estado de pendiente a preparado**

- **Dado que:** quiera cambiar el estado de un pedido
- **Cuando:** el estado del pedido sea "pendiente"
- **Entonces:** el estado es actualizado correctamente

***

## Historia #012

**como** administrador **quiero** poder crear productos **para** enriquecer el catalogo y las posibles opciones para el menu del dia

**Estimacion:** ¿?

### Criterios de aceptacion

1. [ ] **Crear un producto sin los datos necesarios**

- **Dado que:** quiera crear un producto
- **Cuando:** no proporcione la informacion pertinente
- **Entonces:** no se podra crear el producto

2. [ ] **Crear un producto con datos incorrectos**

- **Dado que:** quiera crear un producto
- **Cuando:** no proporcione la informacion en el formato requerido
- **Entonces:** no se podra crear el producto

3. [ ] **Crear un producto con nombre en uso**

- **Dado que:** quiera crear un producto
- **Cuando:** propocione un nombre que ya se encuentre en uso por otro producto
- **Entonces:** no se podra crear el producto

***

## Historia #013

**como** administrador **quiero** poder eliminar un producto **para** mantener un catalogo limpio

**Estimacion:** ¿?

***

## Historia #014

**como** adminsitrador **quiero** poder cambiar la informacion de un producto **para** mantenerla actualizada

**Estimacion:** ¿?

### Criterios de aceptacion

1. [ ] **Crear un producto con datos incorrectos**

- **Dado que:** quiera cambiar la informacion de un producto
- **Cuando:** no proporcione la informacion en el formato requerido
- **Entonces:** no se podra actualizar la informacion del producto

2. [ ] **Crear un producto con nombre en uso**

- **Dado que:** quiera cambiar la informacion de un producto
- **Cuando:** propocione un nombre que ya se encuentre en uso por otro producto
- **Entonces:** no se podra actualizar la informacion del producto

***

## Historia #015

**como** administrador **quiero** poder visualizar el listado de los producto **para** mantenerme informado de los productos del restaurante

**Estimacion:** ¿?

### Criterios de aceptacion

1. [ ] **Filtrado por nombre**

- **Dado que:** quiera visualizar un listado de productos y opte por filtrar
- **Cuando:** ingrese como dato el nombre para un producto
- **Entonces:** solo se visualizaran los productos que coincidan con el nombre del producto

2. [ ] **Filtrado por categoria**

- **Dado que:** quiera visualizar un listado de productos y opte por filtrar
- **Cuando:** ingrese como dato la(s) categoria(s) para los productos
- **Entonces:** solo se visualizaran los productos que pertenescan a la categoria

***

## Historia #016

**como** administrador **quiero** poder obtener la informacion detallada de un producto **para** consultar la actual informacion de un producto

**Estimacion:** ¿?

***

## Historia #017

**como** administrador **quiero** poder crear un menu del dia **para** designar los productos que estaran en venta 

**Estimacion:** ¿?

### Criterios de aceptacion

1. [ ] **Agregar un producto ya presente**

- **Dado que:** quiera crear un nuevo menu del dia
- **Cuando:** incluya dos (2) veces un mismo producto en el mismo
- **Entonces:** solo se tomara una (1) vez el producto y el menu sera creado satifcatoriamente

***

## Historia #018

**como** administrador **quiero** poder modificar un menu del dia **para** mantener al dia las opciones en el menu

**Estimacion:** ¿?

### Criterios de aceptacion

1. [ ] **Agregar un producto ya presente**

- **Dado que:** quiera actualizar el menu del dia
- **Cuando:** incluya un producto que ya se encuentre presente
- **Entonces:** solo se tomara una (1) vez el producto y el menu sera creado satifcatoriamente

***

## Historia #019

**como** administrador **quiero** poder crear una categoria **para** @TODO

**Estimacion:** ¿?

### Criterios de aceptacion

1. [ ] **Datos faltantes**

- **Dado que:** quiera crear una categoria
- **Cuando:** no incluya todos los datos requeridos
- **Entonces:** no se creara la categoria

2. [ ] **Datos incorrectos**

- **Dado que:** quiera crear una categoria
- **Cuando:** los datos no cumplan con el formato necesario
- **Entonces:** no se creara la categoria

3. [ ] **Nombre en uso**

- **Dado que:** quiera crear una categoria
- **Cuando:** el nombre de la categoria ya se encuentre en uso
- **Entonces:** no se permitira la creacion de la categoria

***

## Historia #020

**como** administrador **quiero** poder eliminar una categoria **para** @TODO

**Estimacion:** ¿?

***

## Historia #021

**como** administrador **quiero** poder visualizar un listado con las categorias disponibles **para** @TODO

**Estimacion:** ¿?

***

## Historia #022

**como** administrador **quiero** poder asignar una categoria a un producto **para** enriquecer la informacion del producto

**Estimacion:** ¿?

***

## Historia #023

**como** administrador **quiero** remover una categoria de un producto **para** mantener actualizada la informacion de un producto

**Estimacion:** ¿?

***

## Historia #024

**como** administrador **quiero** poder crear un nuevo empleado **para** @TODO

**Estimacion:** ¿?

### Criterios de aceptacion

1. [ ] ****

***

## Historia #025

**como** administrador **quiero** poder modificar la informacion de un empleado **para** mantener actualizados los datos del empleado

**Estimacion:** ¿?

### Criterios de aceptacion

1. [ ] ****

***

## Historia #026

**como** administrador **quiero** poder eliminar un empleado **para** @TODO

**Estimacion:** ¿?

***

## Historia #027

**como** administrador **quiero** poder obtener la informacion detallada de un empleado **para** conocer los datos actuales del empleado

**Estimacion:** ¿?

***

## Historia #028

**como** administrador **quiero** poder asignar roles a un empleado **para** designar las responsabilidades y funciones del empleado

**Estimacion:** ¿?

### Criterios de aceptacion

1. [ ] **Rol ya presente**

- **Dado que:** quiera agregar roles a un empleado
- **Cuando:** agrege roles con los que ya cuenta el empleado
- **Entonces:** no se contaran los roles "duplicados" y se asignaran correctamente los demas roles

***

## Historia #029

**como** administrador **quiero** poder remover roles de un empleado **para** designar las responsabilidades y funciones del empleado

**Estimacion:** ¿?

***

## Historia #030

**como** administrador **quiero** poder iniciar sesion **para** tener acceso a las funcionalidades que me corresponden en el software

**Estimacion:** ¿?

### Criterios de aceptacion

1. [ ] **Datos incorrectos**

- **Dado que:** quiero autenticarme
- **Cuando:** no propocione los datos con el formato requerido
- **Entonces:** fallara la autenticacion

2. [ ] **Datos faltantes**

- **Dado que:** quiero autenticarme
- **Cuando:** no propocione los datos requeridos
- **Entonces:** fallara la autenticacion

3. [ ] **Credenciales incorrectas**

- **Dado que:** quiero autenticarme
- **Cuando:** no propocione las credenciales correctas para el inicio de sesion
- **Entonces:** fallara la autenticacion
