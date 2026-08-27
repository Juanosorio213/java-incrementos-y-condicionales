
INFORMACION DEL ESTUDIANTE

Juan sebastian Osorio

Tecnologia en desarrollo de software

21 de agosto de 2026


OBJETIVO DE LA ACTIVIDAD

Preincremento (++i): Incrementa el valor de la variable en 1 antes de que se evalúe o se utilice en la expresión actual.

Posincremento (i++): Utiliza el valor actual de la variable en la expresión y después realiza el incremento en 1.

Uso de las estructuras condicionales en Java


Permiten alterar el flujo de ejecución del programa basándose en la evaluación de expresiones booleanas.

if, else if, else: Evalúan condiciones de forma secuencial; ejecutan un bloque de código si la condición se cumple y ofrecen alternativas en cascada.

switch: Evalúa una variable frente a múltiples valores posibles (case), optimizando la legibilidad frente a múltiples if-else anidados.

EVIDENCIAS

INCREMENTOS

<img width="1366" height="768" alt="Incrementos" src="https://github.com/user-attachments/assets/cec38292-5f38-4649-a8e5-3a3bfd54e78a" />

Explicación del código: Este programa demuestra la diferencia entre el operador de pre-incremento (++a) y el post-incremento (c++).

En el pre-incremento (++a), la variable a primero aumenta su valor en 1 y luego se asigna/utiliza.

En el post-incremento (c++), la variable d toma el valor actual de c (5) y después se incrementa c en 1.

Resultado en consola: Muestra que a = 6 y b = 6 (porque a se incrementó antes). En cambio, para la segunda parte, c = 6 (se incrementó después) pero d = 5 (conservó el valor original antes del incremento).

EJERCICIO1


<img width="1366" height="768" alt="Ejercicio1" src="https://github.com/user-attachments/assets/c8359650-c9a0-42e0-8928-8983811ca152" />


Explicación del código: Corresponde a un programa para calcular descuentos en un supermercado según el valor gastado. 

Resultado en consola: El usuario ingresó una compra de 5000000. El programa procesó el descuento correspondiente del 20.0% (equivalente a 1000000.0), dejando un total a pagar de 4000000.0.

 EJERCICIO2
 
 <img width="1366" height="768" alt="Ejercicio2" src="https://github.com/user-attachments/assets/7645dea1-6871-4311-86dc-19966e9c3f17" />

 
Explicación del código: Implementa condicionales anidadas (if dentro de otro if) para evaluar el acceso a un conjunto o sistema. Verifica tres condiciones en cadena: si tiene tarjeta, si la tarjeta está activa y si no tiene deudas pendientes.

Resultado en consola: Al responder afirmativamente a la tarjeta y su activación, y de manera negativa a las deudas (No), la lógica evalúa todas las restricciones de forma exitosa y arroja el mensaje "Acceso permitido".

 EJERCICIO3
 
<img width="1366" height="768" alt="Ejercicio3" src="https://github.com/user-attachments/assets/6132a549-6af0-4877-aca8-1b633415c420" />

 
Explicación del código: Evalúa las condiciones para clasificar a un conductor de transporte según su calificación, la cantidad de viajes realizados y su disponibilidad actual.

Resultado en consola: Con una calificación de 5, un total de 501 viajes y el conductor disponible (Si), el sistema valida los criterios y determina que se trata de un "Es conductor premium".

EJERCICIO4

<img width="1366" height="768" alt="Ejercicio4" src="https://github.com/user-attachments/assets/cce5c368-9c0b-41cc-9654-455be1fb69a5" />

 
Explicación del código: Utiliza un sistema de conteo con una variable acumuladora (contador++) para evaluar de manera conjunta tres requisitos independientes de un crédito: ingresos, puntaje crediticio y antigüedad laboral. Dependiendo de cuántas condiciones se cumplan (cuánto valga el contador), se otorga un veredicto (Credito aprobado, condicionado o rechazado).

Resultado en consola: Con los datos ingresados, el contador acumuló las validaciones necesarias para otorgar un veredicto de "Credito condicionado".

 EJERCICIO5

<img width="1366" height="768" alt="Ejercicio5" src="https://github.com/user-attachments/assets/4ee60d83-2442-4c31-8102-7afb73f897c4" />


Explicación del código: Simula el sistema de categorías y beneficios de una aerolínea mediante rangos de cantidad de vuelos (vuelos) y el estado de la membresía activa (Si/No). Utiliza operadores lógicos (&& y ||) para filtrar al pasajero en diferentes niveles (Oro, Plata, Básica o acceso VIP).

Resultado en consola: Al ingresar 71 vuelos (lo que supera el rango mayor a 70) y una membresía activa (Si), el sistema activa de forma correcta la condición exclusiva que muestra "Eres categoría Oro" y "Tienes acceso VIP".

CONCLUSIONES

¿Cuál es la principal diferencia entre ++variable y variable++?
++variable (Pre-incremento): Incrementa el valor de la variable en 1 antes de que la instrucción actual sea evaluada o utilizada en una operación.

variable++ (Post-incremento): Utiliza el valor actual de la variable en la instrucción en curso y después realiza el incremento en 1 para futuras operaciones.

Ejemplo visual de tu código (Incrementos.jpg): Cuando asignas b = ++a, a pasa a ser 6 de inmediato. En cambio, con d = c++, d toma el valor inicial de c (5) y c solo se convierte en 6 después de esa asignación.

 ¿Qué estructura if considera más adecuada para situaciones complejas y por qué?
Para situaciones complejas con múltiples condiciones interdependientes (como los validadores de crédito o aerolíneas en tus ejercicios), la estructura más adecuada es el uso de operadores lógicos (&&, ||) combinados con estructuras claras de if-else if-else, o bien el empleo de contadores/banderas de control.

Por qué: Evita el exceso de anidamiento profundo (conocido como Arrow Anti-pattern o código en pirámide), lo que hace que el código sea mucho más legible, fácil de mantener y menos propenso a errores lógicos cuando se requiere evaluar varios criterios simultáneos.

 ¿Qué dificultades encontró durante el desarrollo?
Manejo de entradas del usuario: Sintonizar correctamente los tipos de datos al capturar información con la clase Scanner (por ejemplo, evitar conflictos al mezclar nextInt() o nextDouble() con nextLine()).

Lógica de condiciones múltiples: Asegurar que los operadores lógicos (&& y ||) evaluaran los rangos numéricos de forma precisa sin excluir casos límite (como los valores exactos en los rangos de la aerolínea o del transporte).

 ¿Qué aprendizajes obtuvo durante la actividad?
Dominio de operadores avanzados: Comprensión clara de la ejecución interna de los operadores de incremento y su impacto en la asignación de variables.

Estructuras de decisión robustas: Consolidación en el uso de condicionales anidadas y múltiples para resolver problemas del mundo real que requieren validaciones escalonadas.

Buenas prácticas de desarrollo: Organización de proyectos en Java mediante entornos de desarrollo (NetBeans) y estructuración de la documentación y evidencias para repositorios en GitHub.
