# semaforos-java-sistemas-operativos
Ejercicio que representa el codigo de la cena de los filosofos- 
Es un problema clásico de las ciencias de la computación propuesto por Edsger Dijkstra en el año 1.965.

<h4> Enunciado </h4>
Cinco (5) Filósofos se sientan alrededor de una mesa y pasan su vida cenando y pensando.
 
Cada filósofo tiene un plato de fideos y un tenedor a la izquierda de su plato.
Para comer los fideos son necesarios dos tenedores y cada filósofo sólo puede tomar los que están a su izquierda y derecha.

Si cualquier filósofo agarra un tenedor y el otro está ocupado, se quedará esperando, con el tenedor en la mano, hasta que pueda coger el otro tenedor, para luego empezar a comer.

Si dos (2) filósofos cercanos y adyacentes intentan tomar el mismo tenedor a una vez, se produce una condición de carrera, es decir, ambos compiten por tomar el mismo tenedor, y uno de ellos se queda sin comer.

Si todos los filósofos cogen el tenedor que está a su derecha al mismo tiempo, entonces todos se quedarán esperando eternamente, porque alguien debe liberar el tenedor que les falta. Nadie lo hará porque todos se encuentran en la misma situación (esperando que alguno deje sus tenedores). Entonces todos los filósofos mueren de hambre.

Este bloqueo mutuo se denomina interbloqueo o deadlock.

El problema consiste en encontrar un algoritmo que permita que los filósofos nunca se mueran de hambre..

<h4>Este ejercicio emplea este mismo problema, solo que es representado con perritos.</h4>
<h4>Referencia</h4>
http://www.cartagena99.com/recursos/alumnos/apuntes/La%20cena%20de%20los%20filosofos.pdf
