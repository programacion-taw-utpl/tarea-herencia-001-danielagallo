/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete_laempresa;

//Importación de paquetes
import paquete_personal.Trabajador;

/**
 *
 * @author Daniela
 */
public class Empresa {

    //Atributos de la clase Empresa
    private String nombres, siglas, ciudad;
    private Trabajador[] trabajadores;

    //Constructores
    public Empresa(String n, String sig, String c, Trabajador[] t) {
        nombres = n;
        siglas = sig;
        ciudad = c;
        trabajadores = t;
    }

    //Utilizamos los Médotos establecer y obtener

    public void establecer_nombres(String n) {
        nombres = n;
    }

    public String obtener_nombres() {
        return nombres;
    }

    public void establecer_siglas(String sig) {
        siglas = sig;
    }

    public String obtener_siglas() {
        return siglas;
    }

    public void establecer_ciudad(String c) {
        ciudad = c;
    }

    public String obtener_ciudad() {
        return ciudad;
    }

    public void establecer_trabajadores(Trabajador[] t) {
        trabajadores = t;
    }

    public Trabajador[] ontener_trabajadores() {
        return trabajadores;
    }

    //Método para obtener todo el listado de trabajadores
    public String lista_trabajadores() {
        String lista = " ";
        for (int i = 0; i < trabajadores.length; i++) {
            lista += "\t" + (i + 1) + ")" + this.trabajadores[i].toString();
        }
        return lista;
    }

    //Sobreescribimos el método toString
    @Override
    public String toString() {
        return String.format("Empresa: %s\n"
                + "Siglas: %s\n"
                + "Ciudad: %s\n", obtener_nombres(), obtener_siglas(), obtener_ciudad());
    }
}
