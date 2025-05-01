# Método de Jacobi - Métodos Numéricos

## Descripción
Este proyecto implementa el **método de Jacobi**, un algoritmo iterativo de métodos numéricos utilizado para resolver sistemas de ecuaciones lineales de la forma \( Ax = b \). El método es aplicable a matrices \( A \) que son **diagonalmente dominantes** o simétricas y definidas positivas, y aproxima la solución \( x \) iterativamente.

## Propósito
El objetivo de este código es:
- Resolver un sistema de ecuaciones lineales utilizando el método de Jacobi.
- Demostrar la implementación del método en un programa en Java con Maven.
- Proporcionar una herramienta educativa para estudiantes de métodos numéricos.

## Cómo funciona
El método de Jacobi sigue estos pasos:
1. Se parte de un sistema de ecuaciones lineales \( Ax = b \), donde \( A \) es una matriz \( n \times n \), \( x \) es el vector de incógnitas y \( b \) es el vector de términos constantes.
2. Se selecciona una aproximación inicial \( x^{(0)} \) (generalmente un vector de ceros).
3. Para cada iteración \( k \), se calcula una nueva aproximación para cada componente del vector \( x \). Para la variable \( x_i \) en la iteración \( k+1 \), se usa la siguiente fórmula:

   ![Fórmula del Método de Jacobi](https://github.com/Yovanygt/metodo_jacobi/raw/main/jacobi_formula.png)

   Donde:
   - \( x_i^{(k+1)} \): Nuevo valor de la \( i \)-ésima variable en la iteración \( k+1 \).
   - \( b_i \): Término constante de la ecuación \( i \).
   - \( a_{ij} \): Elemento de la matriz \( A \) en la posición \( (i, j) \).
   - \( x_j^{(k)} \): Valor actual de la \( j \)-ésima variable en la iteración \( k \).
   - \( a_{ii} \): Elemento diagonal de la matriz \( A \) (debe ser no nulo).
   - La suma incluye todos los términos excepto cuando \( j = i \).
4. Se verifica si la diferencia entre los valores nuevos \( x^{(k+1)} \) y los anteriores \( x^{(k)} \) es menor que una tolerancia dada.
5. Si no, se repite el proceso hasta que se cumpla la tolerancia o se alcance un número máximo de iteraciones.

## Requisitos
- Java 8 o superior.
- Maven para la gestión de dependencias.
- Un entorno de desarrollo como IntelliJ IDEA, Eclipse o similar.

## Uso
1. Clona este repositorio:
   ```
   git clone https://github.com/Yovanygt/metodo_jacobi.git
   ```
2. Navega al directorio del proyecto y compila con Maven:
   ```
   mvn clean install
   ```
3. Ejecuta el programa desde tu entorno de desarrollo o con Maven:
   ```
   mvn exec:java -Dexec.mainClass="tu.paquete.principal.ClasePrincipal"
   ```
   (Ajusta `tu.paquete.principal.ClasePrincipal` según el nombre de tu clase principal).
4. Ingresa los datos del sistema de ecuaciones (matriz \( A \), vector \( b \), aproximación inicial y tolerancia) cuando se soliciten.

## Estructura del Proyecto
- `src/`: Contiene el código fuente en Java.
- `pom.xml`: Archivo de configuración de Maven con las dependencias del proyecto.
- `target/`: Directorio generado por Maven con los archivos compilados (no versionado en Git).

## Licencia
Este proyecto está bajo la licencia MIT. Consulta el archivo `LICENSE` para más detalles (si aplica).

