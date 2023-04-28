package org.josesaldaña.bean;

import javax.swing.JOptionPane;

/**
 * @author José Roberto Saldaña Arrazola
 * @date 28/02/2022

 * Codigo tecnico: IN5BM
 * Carné: 2021040
 */

public class Promedio {

    double calificacion1;
    double calificacion2;
    double calificacion3;
    double resultado;

    public Promedio() {

    }

    public Promedio(double calificacion1, double calificacion2, double calificacion3) {
        this.calificacion1 = calificacion1;
        this.calificacion2 = calificacion2;
        this.calificacion3 = calificacion3;
    }

    public double calcular() {
        this.calificacion1 = Double.parseDouble(JOptionPane.showInputDialog("Inserte la primera calificacion"));
        this.calificacion2 = Double.parseDouble(JOptionPane.showInputDialog("Inserte la segunda calificacion"));
        this.calificacion3 = Double.parseDouble(JOptionPane.showInputDialog("Inserte la tercera calificacion"));

        this.resultado = (this.calificacion1 + this.calificacion2 + this.calificacion3) / 3;
        return this.resultado;
    }

    public double getCalificacion1() {
        return this.calificacion1;
    }

    public void setCalificacion1(int calificacion1) {
        this.calificacion1 = calificacion1;
    }

    public double getCalificacion2() {
        return this.calificacion2;
    }

    public void setCalificacion2(int calificacion2) {
        this.calificacion2 = calificacion2;
    }

    public double getCalificacion3() {
        return this.calificacion3;
    }

    public void setCalificacion3(int calificacion3) {
        this.calificacion3 = calificacion3;
    }

    public double getResultado() {
        return this.resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }
}
