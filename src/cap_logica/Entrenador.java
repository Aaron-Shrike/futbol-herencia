/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap_logica;

/**
 *
 * @author Sh
 */
public class Entrenador extends Persona{
    private int añosEntrenando;
    private int nroEquipos;

    public int getAñosEntrenando() {
        return añosEntrenando;
    }

    public void setAñosEntrenando(int añosEntrenando) {
        this.añosEntrenando = añosEntrenando;
    }

    public int getNroEquipos() {
        return nroEquipos;
    }

    public void setNroEquipos(int nroEquipos) {
        this.nroEquipos = nroEquipos;
    }

    public Entrenador() {
        super();
        this.añosEntrenando = 0;
        this.nroEquipos = 0;
    }

    public Entrenador(int añosEntrenando, int nroEquipos, String nombre, String fechaNac, String nacionalidad) {
        super(nombre, fechaNac, nacionalidad);
        this.añosEntrenando = añosEntrenando;
        this.nroEquipos = nroEquipos;
    }
    
    @Override
    public String mostrar(){
        String texto = "ENTRENADOR\n" + super.mostrar() + "\n" +
                        "Años de Entrenador: " + añosEntrenando + "\n" +
                        "Nro de Equipos: " + nroEquipos + "\n" +
                        "--------------------------";
        
        return texto;
    } 
    
}
