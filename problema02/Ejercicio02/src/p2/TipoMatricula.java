/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p2;

import java.util.ArrayList;
import p1.*;
import p1.MatriculaColegio;

/**
 *
 * @author reroes
 */
public class TipoMatricula {

    private double promedioMatriculas;
    private MatriculaCampamento campamento;
    private MatriculaColegio colegio;
    private ArrayList<Matricula> matri;
    // private MatriculaEscuela escuela;
    // private MatriculaJardin jardin;
    // private MatriculaMaternal maternal;
    // private MatriculaMaternal maternal2;

    public void establecerMatri(ArrayList<Matricula> a) {
        matri = a;
    }

    public void establecerPromedioTarifas() {
        double suma = 0;
        for (int i = 0; i < obtenerMatri().size(); i++) {
            suma = suma + obtenerMatri().get(i).obtenerTarifa();
        }
        promedioMatriculas = suma / obtenerMatri().size();

    }

    public ArrayList<Matricula> obtenerMatri() {
        return matri;
    }

    public double obtenerPromedioTarifas() {
        return promedioMatriculas;
    }

    @Override
    public String toString() {
        String Cadena;
        Cadena = String.format("Promedio: %.2f", promedioMatriculas);
        return Cadena;

    }

}
