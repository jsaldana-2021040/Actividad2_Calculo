package org.josesaldaña.bean;

import javax.swing.JOptionPane;

/**
 * @author José Roberto Saldaña Arrazola
 * @date 28/02/2022

 * Codigo tecnico: IN5BM
 * Carné: 2021040
 */

public class VerificarVocal {

    String letra;
    String resultado;

    public VerificarVocal() {

    }

    public VerificarVocal(String letra) {
        this.letra = letra;
    }

    public String verificar() {

        letra = JOptionPane.showInputDialog("Ingrese la Vocal");
        if (this.letra.equalsIgnoreCase("a") || this.letra.equalsIgnoreCase("e") || this.letra.equalsIgnoreCase("i") || this.letra.equalsIgnoreCase("o") || this.letra.equalsIgnoreCase("u")) {
            resultado = (letra + " " + "Es una vocal");
        } else {
            resultado = (letra + " " + "No es una vocal");
        }
        return resultado;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }
}
