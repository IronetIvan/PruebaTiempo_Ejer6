/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebatiempo_ejer6;

/**
 *
 * @author Usuario DAM 1
 */
public class PruebaTiempo_Ejer6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tiempo t1 = new Tiempo(1, 30, 50);
        Tiempo t2 = new Tiempo(2, 40, 45);
        Tiempo t3 = new Tiempo(4, 35, 20);
        
            System.out.println(t1 + " + " + t2 + " = " + t1.suma(t2));
            System.out.println(t2 + " - " + t3 + " = " + t2.resta(t3));
  }
}