/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.ArrayList;

/**
 *
 * @author jorge
 */
public class Juego {

    private ArrayList<Jugador> jugadores;
    private RevolverAgua revolver;

    public Juego(ArrayList<Jugador> jugadores, RevolverAgua revolver) {
        this.jugadores = jugadores;
        this.revolver = revolver;
    }

    public void llenarJuego() {
        revolver.llenarRevolver();
    }

    public Jugador jugarRonda() {
            for (Jugador jugador : jugadores) {
                if (jugador.disparo(revolver)) {
                    return jugador;
                }
            }
return null;
        }
    }

