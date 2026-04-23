# Tests Unitarios - Mercadaw

## Descripción

En esta práctica se han desarrollado **tests unitarios con JUnit** para comprobar el correcto funcionamiento de la aplicación **Mercadaw**, que simula un sistema de compra online.

Se han validado principalmente:
- Gestión de clientes
- Inserción de productos
- Cálculo del importe
- Aplicación de promociones
- Autenticación

---

## Clases testeadas

Se han realizado pruebas sobre las siguientes clases:

- `Cliente`
- `Pedido`
- `Mercadaw`

(No se ha testeado la entrada por teclado de `AppZonaClientes` porque no es recomendable en tests unitarios)

---

## Casos de prueba realizados

### 1. Inserción de productos
Se comprueba que al añadir un producto:
- Se guarda correctamente en el pedido
- Se incrementa la cantidad si ya existe

---

### 2. Producto inexistente
Se verifica que:
- Al intentar acceder a un producto que no existe (`valueOf`)
- Se lanza una excepción (`IllegalArgumentException`)

---

### 3. Cálculo del importe
Se comprueba que:
- El importe total del pedido es la suma de los precios de los productos añadidos

---

### 4. Promoción 3x2
Se valida que:
- Por cada 3 productos iguales, solo se pagan 2

---

### 5. Descuento del 10%
Se comprueba que:
- El importe total se reduce correctamente en un 10%

---

### 6. Promociones combinadas
Se verifica que:
- Primero se aplica el 3x2
- Después el descuento del 10%
- El resultado final es correcto

---

### 7. Autenticación
Se comprueba que:
- Un cliente con usuario y contraseña correctos puede autenticarse
- Se usa `equals()` para validar los datos

---

## Casos límite considerados

- Producto inexistente
- Pedido vacío (no genera errores)
- Aplicación de promociones múltiples
- Comparación de objetos `Cliente`

---

## Herramientas utilizadas

- Java
- JUnit 5

---

## Cobertura

Se han cubierto los métodos principales relacionados con:
- Inserción de productos
- Gestión del pedido
- Promociones
- Autenticación

(La captura de cobertura se adjunta en el repositorio)

---

## Conclusión

Los tests unitarios permiten asegurar que la lógica principal de la aplicación funciona correctamente y detectar errores en el cálculo o en las promociones.

Además, ayudan a mejorar la calidad del código y facilitan su mantenimiento.

---