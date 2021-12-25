/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap_presentacion;

import cap_logica.Entrenador;
import cap_logica.Futbolista;
import cap_logica.Masajista;
import cap_logica.Persona;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Sh
 */
public class Principal {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Futbolista f1 = new Futbolista("DELANTERO",1.82F,85,"GUERRERO","15/2/2000","PERUANO");
        Futbolista f2 = new Futbolista("CENTRO",1.67F,85,"CUEVA","1/11/1999","PERUANO");
        Entrenador e1 = new Entrenador(8,5,"GARECA","23/8/1940","ARGENTINO");
        Masajista m1 = new Masajista("ESPALDA","PEREZ TORO JOSE","5/5/1970","PERUANO");
        
        ArrayList<Persona> misPersonas = new ArrayList();
        
        misPersonas.add(f1);
        misPersonas.add(f2);
        misPersonas.add(e1);
        misPersonas.add(m1);
        
        for (int i = 0; i < misPersonas.size(); i++) {
            Persona p = misPersonas.get(i);
            
            System.out.println(p.mostrar());
        }
        
        System.out.println("\n\n\nMOSTRANDO SOLO FUTBOLISTAS");
        System.out.println("===========================");
        Iterator elemento = misPersonas.iterator();
        
        while(elemento.hasNext()){
            Persona p = (Persona)elemento.next();
            
            if(p instanceof Futbolista){
                System.out.println(p.mostrar());
            }
        }
     
    }
    
}
