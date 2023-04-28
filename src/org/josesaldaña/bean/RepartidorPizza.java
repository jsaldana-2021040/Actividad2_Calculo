package org.josesaldaña.bean;

import javax.swing.JOptionPane;

/**
 * @author José Roberto Saldaña Arrazola
 * @date 28/02/2022

 * Codigo tecnico: IN5BM
 * Carné: 2021040
 */

public class RepartidorPizza {

    double entrada;
    int tiempo = 45;
    double resultado;

    public RepartidorPizza() {

    }

    public RepartidorPizza(int entrada, int resultado) {
        this.entrada = entrada;
        this.resultado = resultado;
    }

    public double calcular() {
        this.entrada = Double.parseDouble(JOptionPane.showInputDialog("Inserte la distancia en km"));
        this.resultado = this.entrada * this.tiempo;
        return this.resultado;
    }

    public double getEntrada() {
        return this.entrada;
    }

    public void setEntrada(int entrada) {
        this.entrada = entrada;
    }

    public double getResultado() {
        return this.resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }

}
