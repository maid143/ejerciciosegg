/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

/**
 *
 * @author jorge
 */
public class Simulador {

    private List<String> nombres = new ArrayList<>();
    private List<String> apellidos = new ArrayList<>();
    private List<Integer> dnis = new ArrayList<>();
    private List<Alumno> alumnos = new ArrayList<>();
    private HashSet<Integer> dnisAsignados = new HashSet<>();

    public Simulador() {
        cargarNombres();
        cargarApellidos();
        cargarDnis();
    }

    public void cargarNombres() {
        // Agrega nombres a la lista de nombres
        // Puedes personalizar esta lista con nombres reales
        nombres.add("Juan");
        nombres.add("María");
        nombres.add("Carlos");
        nombres.add("Jorge");
        nombres.add("Melisa");
        nombres.add("Emilio");
        nombres.add("Nacho");
        nombres.add("Amalia");
        nombres.add("Gabriel");
        nombres.add("Azul");
        nombres.add("Celeste");
        nombres.add("Jeronimo");
        // Agrega más nombres...
    }

    public void cargarApellidos() {
        // Agrega apellidos a la lista de apellidos
        // Puedes personalizar esta lista con apellidos reales
        apellidos.add("González");
        apellidos.add("Pérez");
        apellidos.add("López");
        apellidos.add("Arenas");
        apellidos.add("Garcia");
        apellidos.add("Martinez");
        apellidos.add("Juarez");
        apellidos.add("Puebla");
        apellidos.add("Tanti");
        apellidos.add("Tesoro");
        apellidos.add("Massa");
        apellidos.add("Milei");
        // Agrega más apellidos...
    }

    public void cargarDnis() {
        // Genera números de DNI aleatorios en un rango
        Random rand = new Random();
        for (int i = 0; i < 12; i++) {
            int dni = 10000000 + rand.nextInt(99999999); // Genera un DNI aleatorio
           boolean duplicado = false;
            for (int existente : dnis) {
                if (existente == dni) {
                    duplicado = true;
                    i--;
                    break;
                }
            }

            // Si no es un duplicado, agrégalo a la lista
            if (!duplicado) {
                dnis.add(dni);
            }
        }

        // Ahora, dnis contiene 12 DNIs únicos
        for (int dni : dnis) {
            System.out.println(dni);
        }
    }

        
    
       
    public String generarNombreAleatorio() {
        Random rand = new Random();
        String nombre = nombres.get(rand.nextInt(nombres.size()));
        String apellido = apellidos.get(rand.nextInt(apellidos.size()));
        return nombre + " " + apellido;
    }

    public int generarDniAleatorio() {
        Random rand = new Random();
        int index = rand.nextInt(dnis.size());
        int dni = dnis.get(index);
        dnis.remove(index); // Evita duplicados
        return dni;
    }

    public void generarAlumnos(int cantidadAlumnos) {
        for (int i = 0; i < cantidadAlumnos; i++) {
            String nombre = generarNombreAleatorio();
            int dni = generarDniAleatorio();
            Alumno alumno = new Alumno(nombre, dni);
            alumnos.add(alumno);
        }
    }

    public void imprimirListadoAlumnos() {
        System.out.println("Listado de Alumnos:");
        for (Alumno alumno : alumnos) {
            System.out.println(alumno.toString());
        }
    }
public void votacion() {
        Random rand = new Random();
        for (Alumno votante : alumnos) {
            List<Alumno> votados = new ArrayList<>();
            // Evita que el votante se vote a sí mismo
            HashSet<Alumno> votadosSet = new HashSet<>();
            votadosSet.add(votante);

            // Genera tres votos aleatorios
            while (votados.size() < 3) {
                int index = rand.nextInt(alumnos.size());
               
                Alumno votado = alumnos.get(index);
              if (!votadosSet.contains(votado) && !votado.equals(votante)){
                //if (!votadosSet.contains(votado)) {
                    votados.add(votado);
                    votadosSet.add(votado);
                }
            }
            for (Alumno votado : votados) {
            votado.recibirVoto();
        }
            // Registra los votos y aumenta la cantidad de votos del votante
            Voto voto = new Voto(votante, votados);
            System.out.println(votante.getNombreCompleto() + " ha votado por: ");
            for (Alumno votado : votados) {
                System.out.println("- " + votado.getNombreCompleto());
            }
        }
    }
    
    public void mostrarResultados() {
        System.out.println("Resultados de la votación:");
        for (Alumno alumno : alumnos) {
            System.out.println(alumno.getNombreCompleto()+ " DNI: " + alumno.getDni() + " - Votos: " + alumno.getCantidadVotosRecibidos());
        }
    }
}
