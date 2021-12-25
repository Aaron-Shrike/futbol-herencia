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
public class Masajista extends Persona{
    private String especialidad;

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public Masajista() {
    }

    public Masajista(String especialidad, String nombre, String fechaNac, String nacionalidad) {
        super(nombre, fechaNac, nacionalidad);
        this.especialidad = especialidad;
    }
    
    @Override
    public String mostrar(){
        String texto = "MASAJISTA\n" + super.mostrar() + "\n" +
                        "Especialidad: " + especialidad + "\n" +
                        "--------------------------";
        
        return texto;
    } 
}
