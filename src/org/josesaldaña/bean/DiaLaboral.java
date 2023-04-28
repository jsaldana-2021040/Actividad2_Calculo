package org.josesaldaña.bean;

import javax.swing.JOptionPane;

/**
 * @author José Roberto Saldaña Arrazola
 * @date 28/02/2022

 * Codigo tecnico: IN5BM
 * Carné: 2021040
 */

public class DiaLaboral {

    String opcion;
    String respuesta;

    public DiaLaboral() {

    }

    public DiaLaboral(String opcion) {
        this.opcion = opcion;
    }

    public String calcular() {
        opcion = JOptionPane.showInputDialog(null, "Ingrese un dia de la semana");
        switch (opcion) {
            case "Lunes":
            case "lunes":
                respuesta = opcion + " " + "Es un dia laboral";
                break;
            case "Martes":
            case "martes":
                respuesta = opcion + " " + "Es un dia laboral";
                break;
            case "Miercoles":
            case "miercoles":
                respuesta = opcion + " " + "Es un dia laboral";
                break;
            case "Jueves":
            case "jueves":
                respuesta = opcion + " " + "Es un dia laboral";
                break;
            case "Viernes":
            case "viernes":
                respuesta = opcion + " " + "Es un dia laboral";
                break;
            case "Sabado":
            case "sabado":
                respuesta = opcion + " " + "No es un dia laboral";
                break;
            case "Domingo":
            case "domingo":
                respuesta = opcion + " " + "No es un dia laboral";
                break;
            default:
                JOptionPane.showMessageDialog(null, opcion + " " + "Dato no valido");
        }
        return this.respuesta;
    }
}
