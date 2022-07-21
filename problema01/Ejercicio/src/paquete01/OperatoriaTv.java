/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete01;

import java.util.ArrayList;

/**
 *
 * @author M S I
 */
public class OperatoriaTv {

    private double totalTV;
    private double tvCaro;
    private ArrayList<Televisor> listaTvs;
    private String marcasVendidas;

    public OperatoriaTv() {
    }

    public OperatoriaTv(ArrayList<Televisor> a) {
        listaTvs = a;
    }

    public void establecerListaTvs(ArrayList<Televisor> t) {
        listaTvs = t;
    }

    public void establecerTotalPrecioTvs() {
        double s = 0;
        for (int i = 0; i < listaTvs.size(); i++) {
            s = s + listaTvs.get(i).obtenerPrecio();
            System.out.println(s);
        }
        totalTV = s;
    }

    public void establecerTvCaro() {
        double s = 0;
        for (int i = 0; i < listaTvs.size(); i++) {
            if (listaTvs.get(i).obtenerPrecio() > s) {
                s = listaTvs.get(i).obtenerPrecio();
            }

        }
        tvCaro = s;

    }

    public void establecerlistaMarcasVendidas() {
        String s = "";
        for (int i = 0; i < listaTvs.size(); i++) {
            s = String.format("%s%s\n", s, listaTvs.get(i).obtenerMarca());
        }
        marcasVendidas = s;
    }

    public double obtenertotalPrecioTvs() {
        return totalTV;
    }

    public double obtenertelevisorMasCaro() {
        return tvCaro;
    }

    public String obtenerlistaMarcasVendidas() {
        return marcasVendidas;
    }

    @Override
    public String toString() {
        String Cadena;
        Cadena = String.format("Lista de TVS\n"
                + "Precio Total : %.2f\n"
                + "Televisor mas costoso: %.2f\n"
                + "Marcas Vendidas: %s\n", obtenertotalPrecioTvs(),
                obtenertelevisorMasCaro(),
                obtenerlistaMarcasVendidas());
        return Cadena;
    }

}
