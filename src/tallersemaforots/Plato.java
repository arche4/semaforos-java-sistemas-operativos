/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallersemaforots;

import static java.lang.Thread.sleep;
import java.util.Arrays;
import java.util.concurrent.Semaphore;

/**
 *
 * @author manue
 */
public class Plato {

    private int tiempoEncomerPerro, tiempoServirCommida;
    private Semaphore mutex = new Semaphore(1, true);
    private Semaphore haycomida = new Semaphore(0, true);
    private Semaphore noHaycomida = new Semaphore(0, true);
    String[] cantidadPerros;

    public Plato(int tiempoEncomerPerro, int tiempoServirCommida) {
        noHaycomida = new Semaphore(1, true);
        this.tiempoEncomerPerro = tiempoEncomerPerro * 1000;
        this.tiempoServirCommida = tiempoServirCommida * 1000;

    }

    public void setMostrarPerros(String[] cantidadPerros) {
        this.cantidadPerros = cantidadPerros;
    }

    public void servirComida() throws InterruptedException {

        System.out.println("####### El cuidador quiere servir la comida #######");
        if (noHaycomida.availablePermits() == 0) {
            System.out.println("####### El cuidado duerme ZZzzzz, mientras espera que el perro coma #######");
        }
        noHaycomida.acquire();
        mutex.acquire();
        System.out.println("####### El cuidador esta serviendo la comida, se demora " + tiempoServirCommida / 1000 + " Segundos #######");
        sleep(tiempoServirCommida);

        mutex.release();
        haycomida.release();
        System.out.println("####### El cuidador dejo de servir la comida, porque ya esta lleno #######");

    }

    

    public void comiendoPerro(int i) throws InterruptedException {

        if (haycomida.availablePermits() == 0) {
            System.out.println("####### El perro quiere comer, pero el cuidador esta preparando o la esta sirviendo la comida, el perrito duerme ZZzzzz #######");

        }
        haycomida.acquire();
        mutex.acquire();

        System.out.println("####### El PERRO " + i + " Esta comiendo, y se demora " + tiempoEncomerPerro / 1000 + " Segundos #######");
        sleep(tiempoEncomerPerro);
        System.out.println("####### El PERRO " + i + " Termino de comer y se va, es decir plato vacio #######");

        cantidadPerros[i - 1] = "-INDIO COMIDO INDIO MALAGRADECIDO :)";
        System.out.println("                                                        "
                + "Perros Restantes:  " + Arrays.toString(cantidadPerros) + "\n \n");
        mutex.release();
        noHaycomida.release();

    }

}
