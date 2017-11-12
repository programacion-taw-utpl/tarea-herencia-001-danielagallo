/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

//Importación de paquetes
import paquete_personal.Trabajador;
import paquete_laempresa.EmpresaPrivada;

/**
 *
 * @author Daniela
 */
public class Principal {

    public static void main(String[] args) {

        //Llamamos a la clase Trabajador
        Trabajador t = new Trabajador();

        //Datos de los trabajadores y llamamos a la clase trabajores
        Trabajador lista_trabajadores[] = new Trabajador[2];
        lista_trabajadores[0] = new Trabajador("Ana Luisa", "Velez Alcivar", 30, 12903939, 100, 40, 10, t.obtener_sueldo());
        lista_trabajadores[1] = new Trabajador("Mario Anibal", "Vela Narvaez", 35, 212889, 100, 50, 10, t.obtener_sueldo());

        //Llamamos a la clase EmpresaPrivada
        EmpresaPrivada emp_p = new EmpresaPrivada("Soluciones Software", "SS´s", "Loja", lista_trabajadores, 20000, 12);
        System.out.println(emp_p);
    }
}
