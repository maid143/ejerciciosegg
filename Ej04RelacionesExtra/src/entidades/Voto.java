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
public class Voto {
  private Alumno votante;
    private List<Alumno> votados;

    public Voto(Alumno votante, List<Alumno> votados) {
        this.votante = votante;
        this.votados = votados;
    }

    public Alumno getVotante() {
        return votante;
    }

    public List<Alumno> getVotados() {
        return votados;
    }
}
   
