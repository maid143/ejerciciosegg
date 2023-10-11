/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej02relacionesextra;

import entidades.Cine;
import entidades.Espectador;

/**
 *
 * @author jorge
 */
public class Ej02RelacionesExtra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cine cine = new Cine("El Gran Estreno", 10.0, 8 , 6);
        for (int i = 1; i <= 50; i++) {
            Espectador espectador = new Espectador("Espectador " + i, 10 + i, 20.0 + i);
            boolean entradaVendida = cine.venderEntrada(espectador);
            if (entradaVendida) {
                System.out.println(espectador.getNombre() + " compró una entrada.");
            } else {
                System.out.println(espectador.getNombre() + " no puede ver la película.");
            }
        }
        // Mostrar la sala
        cine.mostrarSala();
    }
    }
    

