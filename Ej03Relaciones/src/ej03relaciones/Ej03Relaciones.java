package ej03relaciones;

import entidades.Baraja;
import entidades.Carta;
import java.util.ArrayList;

/**
 *
 * @author jorge
 */
public class Ej03Relaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Baraja baraja = new Baraja();
        
        baraja.barajar();
        System.out.println("Barajando la baraja ....");
        
        Carta siguiente = baraja.siguienteCarta();
        while (siguiente != null){
            System.out.println("Siguiente Carta: " + siguiente);
            siguiente = baraja.siguienteCarta();
        }
        System.out.println("No hay mas cartas en la baraja");
        System.out.println("Cartas disponibles: " + baraja.cartasDisponibles());
        int ccarta = 7;
        ArrayList<Carta> cartasDadas = baraja.darCartas(5);
        
        if(!cartasDadas.isEmpty()){
            System.out.println("Cartas Dadas: " + cartasDadas); 
       
        }else{
            System.out.println("No hay suficientes cartas en la baraja.");
        }
        ArrayList<Carta> monton = baraja.cartasMonton();
        if(!monton.isEmpty()){
            for (Carta cartam : monton)
            System.out.println("Cartas del Montón: "+ cartam);
        }else{
            System.out.println("El monton esta vacío.");
        }
        ArrayList<Carta> todasLasCartas = baraja.getCartas();
        System.out.println("Todas las cartas en la Baraja: "+ todasLasCartas);
    }
    }

