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
//Heredamos de la clase Empresa
public class EmpresaPrivada extends Empresa {

    //Atributos de la clase
    private double ventas_mensual_fijo;
    private int numero_sucursales;

    //Constructores
    public EmpresaPrivada(String n, String sig, String c, Trabajador[] t, double ventas_m_f, int num_s) {
        super(n, sig, c, t);
        ventas_mensual_fijo = ventas_m_f;
        numero_sucursales = num_s;
    }

    //Utilizamos los Médotos establecer y obtener
    public void establecer_ventas_mensual_fijo(double ventas_m_f) {
        ventas_mensual_fijo = ventas_m_f;
    }

    public double obtener_ventas_mensual_fijo() {
        return ventas_mensual_fijo;
    }

    public void establecer_numero_sucursales(int num_s) {
        numero_sucursales = num_s;
    }

    public int obtener_numero_sucursales() {
        return numero_sucursales;
    }

    //Sobrescribimos el método toString 
    @Override
    public String toString() {
        return String.format("%s"
                + "Ventas: $%s\n"
                + "Sucursales: %s\n"
                + "Lista Trabajadores:\n"
                + "\n%s", super.toString(), obtener_ventas_mensual_fijo(), obtener_numero_sucursales(), lista_trabajadores());
    }
}
