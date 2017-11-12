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

//Heredamos los atributos y métodos de la clase Persona
public class Trabajador extends Persona {

    //Atributos de la clase Trabajador
    private double costo_seguro, costo_por_hora;
    private int horas_trabajadas;

    //Constructores
    public Trabajador(String n, String a, int e, int c, double costo_s, int hrs_t, double costo_h, double s) {
        super(n, a, e, c);
        costo_seguro = costo_s;
        horas_trabajadas = hrs_t;
        costo_por_hora = costo_h;
    }

    public Trabajador() {

    }

    //Utilizamos los métodos establecer y obtener 
    public void establecer_costo_seguro(double costo_s) {
        costo_seguro = costo_s;
    }

    public double obtener_costo_seguro() {
        return costo_seguro;
    }

    public void establecer_horas_trabajadas(int hrs_t) {
        horas_trabajadas = hrs_t;
    }

    public int obtener_horas_trabajadas() {
        return horas_trabajadas;
    }

    public void establecer_costo_por_hora(double costo_h) {
        costo_por_hora = costo_h;
    }

    public double obtener_costo_por_hora() {
        return costo_por_hora;
    }

    //Método para obtener el sueldo
    public double obtener_sueldo() {
        double sueldo;
        sueldo = ((horas_trabajadas * costo_por_hora) + costo_seguro);
        return sueldo;
    }

    //Sobreescribimos el método toString
    @Override
    public String toString() {
        String cadena = String.format("%s\n"
                + "\t\tSeguro: $%s\n"
                + "\t\tHoras trabajadas: %s\n"
                + "\t\tValor por Hora: %s\n"
                + "\t\tSueldo: $%s\n", super.toString(), obtener_costo_seguro(), obtener_horas_trabajadas(),
                obtener_costo_por_hora(), obtener_sueldo());
        return cadena;
    }

}
