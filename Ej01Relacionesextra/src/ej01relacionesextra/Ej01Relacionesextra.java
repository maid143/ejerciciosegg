/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej01relacionesextra;

import entidades.Perro;
import entidades.Persona;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
/**
 *
 * @author jorge
 */
public class Ej01Relacionesextra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Persona> personas = new ArrayList<>();
        ArrayList<Perro> perros = new ArrayList<>();
        Map<Perro, Persona> adopciones = new HashMap<>();

        System.out.println("Bienvenido al programa de adopción de perros.");

        // Ingresar nombres de perros
        System.out.print("Ingrese nombres de perros (separe los nombres por comas): ");
        String nombresPerros = scanner.nextLine();
        String[] nombresPerrosArray = nombresPerros.split(", ");
        for (String nombrePerro : nombresPerrosArray) {
            perros.add(new Perro(nombrePerro));
        }

        // Ingresar nombres de personas
        System.out.print("Ingrese nombres de personas (separe los nombres por comas): ");
        String nombresPersonas = scanner.nextLine();
        String[] nombresPersonasArray = nombresPersonas.split(", ");
        for (String nombrePersona : nombresPersonasArray) {
            personas.add(new Persona(nombrePersona));
        }
        System.out.println("Ahora, cada persona elige un perro para adoptar:");

        for (Persona persona : personas) {
            System.out.println(persona.getNombre() + ", elige un perro para adoptar:");

            // Mostrar perros disponibles para adopción
            for (Perro perro : perros) {
                if (!perro.isAdoptado()) {
                    System.out.println("- " + perro.getNombre());
                }
            }
            String nombrePerroElegido = scanner.nextLine();
            boolean perroEncontrado = false;
            for (Perro perro : perros) {
                if (perro.getNombre().equalsIgnoreCase(nombrePerroElegido) && !perro.isAdoptado()) {
                    persona.adoptarPerro(perro);
                    perro.serAdoptado();
                    adopciones.put(perro, persona);
                    perroEncontrado = true;
                    break;
                }
            }
            if (!perroEncontrado) {
                System.out.println("El perro no está disponible o no existe.");
            }
        }
        System.out.println("Personas con sus respectivos perros adoptados:");
        for (Persona persona : personas) {
            System.out.println(persona);
        }
    }
}
