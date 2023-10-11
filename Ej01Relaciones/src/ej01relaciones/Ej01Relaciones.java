/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej01relaciones;

import entidades.Perro;
import entidades.Persona;

/**
 *
 * @author jorge
 */
public class Ej01Relaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Perro perro1 = new Perro("Max", "Golden Retriever", 2, "Mediano");
        Perro perro2 = new Perro("Luna", "Labrador", 3, "Grande");
       
        Persona persona1 = new Persona("Juan", "Perez", 30, 123456789);
        Persona persona2 = new Persona("Maria", "Gomez", 25, 987654321);
        
        persona1.adoptarPerro(perro1);
        persona2.adoptarPerro(perro2);

        System.out.println(persona1.obtenerInformacion());
        System.out.println(persona2.obtenerInformacion());
        
        
        
    }
    
}
