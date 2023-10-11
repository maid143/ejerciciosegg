/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej02relaciones;

import entidades.Juego;
import entidades.Jugador;
import entidades.RevolverAgua;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class Ej02Relaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de jugadores (entre 1 y 6): ");
        int numJugadores = scanner.nextInt();

        if (numJugadores < 1 || numJugadores > 6) {
            numJugadores = 6;
            System.out.println("Número de jugadores fuera de rango. Se establecerán 6 jugadores por defecto.");
        }

        ArrayList<Jugador> jugadores = new ArrayList<>();
        for (int i = 1; i <= numJugadores; i++) {
            jugadores.add(new Jugador(i));
        }

        RevolverAgua revolver = new RevolverAgua();
        Juego juego = new Juego(jugadores, revolver);   
       while (true) {
            Jugador jugadorMojado = juego.jugarRonda();
            System.out.println(revolver);

            if (jugadorMojado != null) {
                System.out.println("El juego ha terminado. " + jugadorMojado + " se ha mojado.");
                break;
            }

            System.out.println("Presione Enter para continuar con la siguiente ronda...");
            scanner.nextLine(); // Espera a que el usuario presione Enter para continuar
            scanner.nextLine(); // Consumir el Enter
        }
    }
}





    
    
    
