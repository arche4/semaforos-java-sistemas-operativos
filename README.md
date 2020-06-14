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

El problema consiste en encontrar un algoritmo que permita que los filósofos nunca se mueran de hambre.


<h4> Algunas posibles soluciones. </h4>

<h4> Por turno cíclico. </h4>

        Se empieza por un filósofo, que si quiere puede comer y después pasa su turno al de la derecha. Cada filósofo sólo puede comer en su turno. Sin embargo, surge el problema de que si la cantidad de  filósofos es muy alto, uno puede morir de hambre antes de llegue su turno.

<h4> Varios turnos</h4>

       Se establecen varios turnos. Para hacerlo más claro supongamos que cada filósofo que puede comer (es su turno) tiene una ficha que después pasa a la derecha. Si por ejemplo hay 5 comensales podemos poner 2 fichas en posiciones alternas (entre dos de las fichas quedarían dos filósofos).
También se establece turnos de tiempo fijo. Por ejemplo cada 10 minutos se pasan las fichas (y los turnos) a la derecha.
       Ahora con relación al tiempo que pueden tardar los filósofos en comer y en volver a tener hambre, el tiempo de turno establecido puede hacer que sea peor solución que la anterior. Por el contrario si el tiempo de turno se aproxima al tiempo medio que tarda un filósofo en comer, este caso puede lograr muy buenos resultados. En conclusión, Si el tiempo medio de comer de los filósofos es similar al tiempo medio en volver a tener hambre entonces la solución se aproxima al óptimo.
<h4> Colas de tenedores</h4>
       Cuando un filósofo quiere comer se pone en la cola de los dos tenedores que necesita.
Cuando un tenedor está libre lo toma y cuando toma los dos tenedores, come y después los deja libre.
       Ahora analicemos desde el punto de vista de los tenedores, cada tenedor sólo puede tener dos filósofos en cola y siempre serán los mismos. Esto también crea el problema de que si todos quieren comer a la vez y todos empiezan tomando el tenedor de su derecha se bloquea el sistema (deadlock).
       <h4> Resolución de conflictos en colas de tenedores</h4>

       Cada vez que un filósofo tiene un tenedor espera un tiempo aleatorio para conseguir el segundo tenedor. Si en ese tiempo no queda libre el segundo tenedor, suelta el que tiene y vuelve a ponerse en cola para sus dos tenedores.
        Por ejemplo, si un filósofo A suelta un tenedor (es porque ha comido ó porque ha esperado demasiado tiempo con el tenedor en la mano y lo suelta) pero, si todavía desea comer vuelve a ponerse en la cola de sus tenedores.
        Si el filósofo adyacente B ya está en esa misma cola de sus tenedores y tiene hambre, lo agarra y si no el filosofo A lo agarra nuevamente.

Es importante que el tiempo de espera sea aleatorio o se mantendrá el bloqueo del sistema.

<h4> El portero del comedor</h4>

         Se indica a los filósofos que abandonen la mesa cuando no tengan hambre y que no regresen a ella hasta que vuelvan a estar hambrientos (cada filósofo siempre se sienta en la misma silla). La misión del portero es controlar el número de filósofos en la sala, limitando su número a n-1, pues si hay n-1 comensales seguro que al menos uno puede comer con los dos tenedores.

<h4>Este ejercicio emplea este mismo problema, solo que es representado con perritos.</h4>
<h4>Referencia</h4>
http://uptaebpnfisistemassoperativos.blogspot.com/2015/08/sincronizacion-por-semaforos-cena-de.html#:~:text=%2DSincronizaci%C3%B3n%20por%20Sem%C3%A1foros%3A%20Cena%20de%20Fil%C3%B3sofos,-Cena%20de%20los&text=Es%20un%20problema%20cl%C3%A1sico%20de,procesos%20en%20un%20sistema%20operativo.
