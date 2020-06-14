/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallersemaforots;

import static java.lang.Thread.sleep;

/**
 *
 * @author manue
 */
public class Cuidador extends Thread{

    private Plato plato;
    private int iteraciones;
    private int tiempoPreparacion;

    public Cuidador(Plato plato, int iteraciones, int tiempoPreparacion) {
        this.plato = plato;
        this.iteraciones = iteraciones;
        this.tiempoPreparacion = tiempoPreparacion;
    }

    @Override
    public void run() {
        for (int i = 0; i < iteraciones; i++) {
            //System.out.println(" ------Productor " + i + " llega------");
            try {
                System.out.println(":####### Cuidador preparando una comida deliciosa ####### \n");
                sleep(tiempoPreparacion);
                plato.servirComida();
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }

}
