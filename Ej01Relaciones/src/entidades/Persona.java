/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.List;

/**
 *
 * @author jorge
 */
public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private int documento;
    private Perro perro;

    public Persona(String nombre, String apellido, int edad, int documento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.documento = documento;
        
    }
    public void adoptarPerro(Perro perro) {
        this.perro = perro;
    }

    public String obtenerInformacion() {
        String informacion = "Persona: " + nombre + " " + apellido + ", edad: " + edad + ", documento: " + documento;
        if (perro != null) {
            informacion += "\n" + perro.toString();
        }
        return informacion;
    }
    
}
