/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author jorge
 */
public class Baraja {

    private ArrayList<Carta> cartas;
    private ArrayList<Carta> monton;

    public Baraja() {
        cartas = new ArrayList<>();
        monton = new ArrayList<>();

        String[] palos = {"Espadas", "Bastos", "Oros", "Copas"};
        for (String palo : palos) {
            for (int numero = 1; numero <= 12; numero++) {
                if (numero != 8 && numero != 9) {
                    cartas.add(new Carta(numero, palo));
                }
            }
        }
    }
    public void barajar() {
        Collections.shuffle(cartas);
    }
    public Carta siguienteCarta(){
        if(!cartas.isEmpty()){
         Carta carta = cartas.remove(0);
            monton.add(carta);
            return carta;
        } else {
            return null;   
        }
    }
    public int cartasDisponibles() {
        return cartas.size();
    }
     public ArrayList<Carta> darCartas(int cantidad) {
        ArrayList<Carta> cartasDadas = new ArrayList<>();
        for (int i = 0; i < cantidad; i++) {
            Carta carta = siguienteCarta();
            if (carta != null) {
                cartasDadas.add(carta);
            }
        }
       return cartasDadas; 
}
public ArrayList<Carta> cartasMonton(){
    return monton;
}
public ArrayList<Carta> getCartas(){
    return cartas;
}
}