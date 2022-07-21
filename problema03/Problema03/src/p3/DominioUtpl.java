/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p3;

/**
 *
 * @author M S I
 */
public class DominioUtpl implements Dominio {

    private String domg;

    @Override
    public void establecerDominio(String g) {
        domg = String.format("%s", g);
    }

    @Override
    public String obtenerDominio() {
        return domg;
    }
}
