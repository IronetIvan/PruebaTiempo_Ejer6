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
public class Tiempo {

    private int seg;

    public Tiempo(int horas, int minutos, int segundos) {
        this.seg = (horas * 3600) + (minutos * 60) + segundos;
    }

    public Tiempo(int s) {
        this.seg = s;
    }

    public String toString() {
        int segundos = this.seg;
        int horas = segundos / 3600;
        segundos -= horas * 3600;
        int minutos = segundos / 60;
        segundos -= minutos * 60;

        if (this.seg < 0) {
            return "-(" + (-horas) + "h " + (-minutos) + "m " + (-segundos) + "s)";
        } else {
            return horas + "h " + minutos + "m " + segundos + "s";
        }
    }

    private int getSegundos() {
        return this.seg;
    }

    public Tiempo suma(Tiempo t) {
        return new Tiempo(this.seg + t.getSegundos());
    }

    public Tiempo resta(Tiempo t) {
        return new Tiempo(this.seg - t.getSegundos());
    }
}
