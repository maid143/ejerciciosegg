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
public class Persona {
   private String nombre;
    private Perro perroAdoptado;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public Perro getPerroAdoptado() {
        return perroAdoptado;
    }

      
    
    public void adoptarPerro(Perro perro) {
        this.perroAdoptado = perro;
    }

    @Override
    public String toString() {
        return nombre + ":" + (perroAdoptado != null ? perroAdoptado.getNombre() : "Sin perro");
    }

   
      
}
