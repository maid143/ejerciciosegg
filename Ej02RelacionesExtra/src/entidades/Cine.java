/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.Random;

/**
 *
 * @author jorge
 */
public class Cine {

    private String peliculaEnReproduccion;
    private double precioEntrada;
    private char[][] sala;
    private int filas;
    private int columnas;

    public Cine(String peliculaEnReproduccion, double precioEntrada, int filas, int columnas) {
        this.peliculaEnReproduccion = peliculaEnReproduccion;
        this.precioEntrada = precioEntrada;
        this.filas = filas;
        this.columnas = columnas;
        this.sala = new char[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                sala[i][j] = ' ';
            }
        }
    }

public void mostrarSala(){
    System.out.println("Sala de Cine:"+ peliculaEnReproduccion);
        for (int i = filas - 1; i >= 0; i--) {    
        for (int j = 0; j < columnas; j++) {
             System.out.print((i+1) + "" + (char)('A' + j) + "" + sala[i][j] + "|");   
            }
            System.out.println();
}
}
public boolean venderEntrada(Espectador espectador){
    Random rand = new Random();
    int fila, columna;
    if(espectador.getEdad()<18 || espectador.getDinero()< precioEntrada){
        return false;
    }
do{
    fila=rand.nextInt(filas);
    columna=rand.nextInt(columnas);
}while (sala[fila][columna]=='X');
sala[fila][columna]= 'X';
return true;

}
}

