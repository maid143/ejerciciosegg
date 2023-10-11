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
public class Alumno {
    private String nombreCompleto;
    private int dni;
    private int cantidadVotos;
    private int cantidadVotosRecibidos;


    public Alumno(String nombreCompleto, int dni) {
        this.nombreCompleto = nombreCompleto;
        this.dni = dni;
        this.cantidadVotos = 0;
        this.cantidadVotosRecibidos = 0;

    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public int getDni() {
        return dni;
    }

    public int getCantidadVotos() {
        return cantidadVotos;
    }

    public int getCantidadVotosRecibidos() {
        return cantidadVotosRecibidos;
    }
    public void recibirVoto() {
        cantidadVotosRecibidos++;
    }

    public void incrementarVotos(int cantidad) {
        
        cantidadVotos = cantidadVotos + cantidad;
    }

    @Override
    public String toString() {
        return nombreCompleto + " (DNI: " + dni + ")";
    }
}

