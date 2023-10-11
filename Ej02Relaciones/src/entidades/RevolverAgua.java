/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.Random;
import entidades.Jugador;

/**
 *
 * @author jorge
 */
public class RevolverAgua {

    private int posicionActual;
    private int posicionAgua;

    public RevolverAgua() {
        this.posicionActual = 0;
        this.posicionAgua = new Random().nextInt(6); // 6 posiciones en el tambor

    }

    public void llenarRevolver() {
        this.posicionActual = new Random().nextInt(6);
        this.posicionAgua = new Random().nextInt(6);
    }

    public boolean mojar() {
        return this.posicionActual == this.posicionAgua;
    
    }
     public void siguienteChorro (){
     
    this.posicionActual  = (this.posicionActual + 1) % 6;

    
    }
     @Override
    public String toString() {
        return "Posición Actual: " + this.posicionActual + ", Posición Agua: " + this.posicionAgua;
}
}