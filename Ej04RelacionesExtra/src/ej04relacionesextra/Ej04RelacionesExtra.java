/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej04relacionesextra;

import entidades.Alumno;
import entidades.Simulador;
import java.util.List;

/**
 *
 * @author jorge
 */
public class Ej04RelacionesExtra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        Simulador simulador = new Simulador();
        simulador.generarAlumnos(12);
        simulador.imprimirListadoAlumnos();
        System.out.println("\n---Votación---\n");
        simulador.votacion();
        System.out.println("\n---Resultados---\n");
        simulador.mostrarResultados();
    }
}
    
    

