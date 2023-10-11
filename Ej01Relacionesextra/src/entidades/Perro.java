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
public class Perro {
  private String nombre;
    private boolean adoptado;

    public Perro(String nombre) {
        this.nombre = nombre;
        this.adoptado = false;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean isAdoptado() {
        return adoptado;
    }

    public void serAdoptado() {
        adoptado = true;
    }

}  

