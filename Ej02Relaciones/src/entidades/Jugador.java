/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author jorge
 */
public class Jugador {
    private int id;
    private String nombre;
    private boolean mojado;

    public Jugador(int id) {
        this.id = id;
        this.nombre = "jugador" + id;
        this.mojado = false;
    }

    
    public boolean disparo(RevolverAgua revolver){
        System.out.println(this.nombre + " se apunta con el revolver.");
        revolver.siguienteChorro();
        if(revolver.mojar()){
          this.mojado = true;
            System.out.println(this.nombre + " se ha mojado.");
            return true;  
        }
        else {
            System.out.println(this.nombre + " ha tenido suerte y no se ha mojado.");
            return false;
        }
    }
   @Override
    public String toString() {
      return this.nombre + " (Mojado: " + this.mojado + ")";  
    } 
}
