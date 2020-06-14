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
public class Perritos extends Thread{
    private Plato plato;
    private int perro;

    public Perritos(Plato plato, int perro) {
        this.plato = plato;
        this.perro = perro;
    }
    
    @Override
    public void run() {
            try {
                plato.comiendoPerro(perro);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }

        } 
    } 

    

