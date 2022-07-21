/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1;

import java.util.ArrayList;
import p2.Estudiante;
import p3.Correo;
import p3.Dominio;
import p3.*;

/**
 *
 * @author reroes
 */
public class Principal {

    public static void main(String[] args) {
        /*
        El mini-sistema debe permitir que se genere
        diversos correos para un estudiante.
        Para Gmail
        Para Outlook
        Para Yahoo
        Para utpl.edu.ec
        Para gobiernoec.gob 
         */

        Estudiante e = new Estudiante();
        e.establecerNombres("René Elizalde");
        e.establecerUserName("rrelizalde");

//        Estudiante w = new Estudiante();
//        w.establecerNombres("Jordan Peña");
//        w.establecerUserName("JJordP");
        ArrayList<Correo> lista = new ArrayList<>();

        DominioGmail dominio = new DominioGmail();
        dominio.establecerDominio("gmail.com");
        Correo c = new Correo();
        c.establecerDominio(dominio);
        c.establecerUserName(e.obtenerUserName());
        c.establecerCorreo();

        DominioGobierno dominioGo = new DominioGobierno();
        dominioGo.establecerDominio("gobiernoec.gob");
        Correo ad = new Correo();
        ad.establecerDominio(dominioGo);
        ad.establecerUserName(e.obtenerUserName());
        ad.establecerCorreo();

        DominioOutlook dominioOu = new DominioOutlook();
        dominioOu.establecerDominio("outlook.com");
        Correo ad2 = new Correo();
        ad2.establecerDominio(dominioOu);
        ad2.establecerUserName(e.obtenerUserName());
        ad2.establecerCorreo();
        
        DominioUtpl utpl = new DominioUtpl();
        utpl.establecerDominio("utpl.edu.ec");
        Correo ad3 = new Correo();
        ad3.establecerDominio(utpl);
        ad3.establecerUserName(e.obtenerUserName());
        ad3.establecerCorreo();
        
        DominioYahoo yahoo = new DominioYahoo();
        yahoo.establecerDominio("yahoo.es");
        Correo ad4 = new Correo();
        ad4.establecerDominio(yahoo);
        ad4.establecerUserName(e.obtenerUserName());
        ad4.establecerCorreo();
        lista.add(c);
        lista.add(ad);
        lista.add(ad2);
        lista.add(ad3);
        lista.add(ad4);

        e.establecerCorreos(lista);

        System.out.printf("%s\n", e);

    }

}
