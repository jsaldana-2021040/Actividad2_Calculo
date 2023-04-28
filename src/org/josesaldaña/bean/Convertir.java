package org.josesaldaña.bean;

import javax.swing.JOptionPane;

/**
 * @author José Roberto Saldaña Arrazola
 * @date 28/02/2022

 * Codigo tecnico: IN5BM
 * Carné: 2021040
 */

public class Convertir {

    double celsius;
    double resultado;

    public Convertir() {

    }

    public Convertir(double celsius) {
        this.celsius = celsius;
    }

    public double calcular() {
        this.celsius = Double.parseDouble(JOptionPane.showInputDialog("Inserte la temperatura en celsius"));
        this.resultado = (1.8 * this.celsius) + 32;
        return this.resultado;
    }

    public double getCelsius() {
        return this.celsius;
    }

    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }

    public double getResultado() {
        return this.resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }
}
