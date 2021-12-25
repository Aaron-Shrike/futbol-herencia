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
public class Futbolista extends Persona{
    private String posicion;
    private float altura;
    private float peso;

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public Futbolista() {
        super();
        this.posicion = "";
        this.altura = 0;
        this.peso = 0;
    }

    public Futbolista(String posicion, float altura, float peso, String nombre, String fechaNac, String nacionalidad) {
        super(nombre, fechaNac, nacionalidad);
        this.posicion = posicion;
        this.altura = altura;
        this.peso = peso;
    }

    @Override
    public String mostrar(){
        String texto = "FUTBOLISTA\n" + super.mostrar() + "\n" +
                        "Posicion: " + posicion + "\n" +
                        "Altura: " + altura + "\n" +
                        "Peso: " + peso + "\n" +
                        "--------------------------";
        
        return texto;
    } 
}
