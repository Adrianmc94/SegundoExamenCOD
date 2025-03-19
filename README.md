## Examen COD Test Unitarios:
## Pasos a seguir:

### 2. Tests Unitarios

En la clase MainTest se encuentran los siguientes tests:
- **Test Parametrizado para comprobarDNI**: Confirma que el método comprobarDNI devuelva el string correcto.
- **Test de error**: Confirma que aparezca un mensaje si el DNI tiene una longitud de menos de 8 caracteres.
- **Test de longitud incorrecta**: Confirma que el DNI debe tener exactamente 8 caracteres.
- **Test de cálculo de la letra**: Confirma que el cálculo de la letra para un dNI sea correcta.

### 3. Corrección de errores  

El código original no comprobaba que el DNI tuviera exactamente 8 caracteres. Lo solucioné con el metodo comprobarDNI y calcularLetraDNI. Con la excepción calcularLetraDNI sale un mensaje si el DNI tiene una longitud incorrecta.

