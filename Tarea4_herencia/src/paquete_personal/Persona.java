/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete_personal;

/**
 *
 * @author Daniela
 */
public class Persona {

    //Atributos de la clase Persona
    private String nombres, apellidos;
    private int edad, cedula;

    //Constructores
    public Persona(String n, String a, int e, int c) {
        nombres = n;
        apellidos = a;
        edad = e;
        cedula = c;
    }

    public Persona() {

    }

    //Utilizamos los métodos establecer y obtener 
    public void establecer_nombres(String n) {
        nombres = n;
    }

    public String obtener_nombres() {
        return nombres;
    }

    public void establecer_apellidos(String a) {
        apellidos = a;
    }

    public String obtener_apellidos() {
        return apellidos;
    }

    public void establecer_edad(int e) {
        edad = e;
    }

    public int obtener_edad() {
        return edad;
    }

    public void establecer_cedula(int c) {
        cedula = c;
    }

    public int obtener_cedula() {
        return cedula;
    }

    //Sobreescribimos el método toString
    @Override
    public String toString() {
        return String.format("\t%s %s\n"
                + "\t\t%d años de edad\n"
                + "\t\tCI: %s",
                obtener_nombres(), obtener_apellidos(), obtener_edad(), obtener_cedula());
    }
}
