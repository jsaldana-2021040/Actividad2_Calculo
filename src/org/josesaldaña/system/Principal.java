package org.josesaldaña.system;

import javax.swing.JOptionPane;
import org.josesaldaña.bean.Convertir;
import org.josesaldaña.bean.DiaLaboral;
import org.josesaldaña.bean.Promedio;
import org.josesaldaña.bean.RepartidorPizza;
import org.josesaldaña.bean.VerificarVocal;

/**
 * @author José Roberto Saldaña Arrazola
 * @date 28/02/2022

 * Codigo tecnico: IN5BM
 * Carné: 2021040
 */

public class Principal {

    public static void main(String[] args) {

        String respuesta = "";
        int opcion;

        do {
            opcion = Byte.parseByte(JOptionPane.showInputDialog(""
                    + "MENÚ Principal \n"
                    + "1. Repartidor de Pizza \n"
                    + "2. Promedio de calificaciones \n"
                    + "3. Celsius a Fahrenheit \n"
                    + "4. Dia laboral \n"
                    + "5.  Verificar si es vocal \n"
                    + "6. salir"
                    + "\n"
                    + "Elija su opcion: \n"));

            switch (opcion) {
                case 1:
                    RepartidorPizza rp = new RepartidorPizza();
                    double resultadoPizza = rp.calcular();

                    JOptionPane.showMessageDialog(null, "El resultado es: " + String.format("%.2f", resultadoPizza));
                    respuesta = JOptionPane.showInputDialog("Desea realizar otra operacion? (s/n)");
                    break;
                case 2:
                    Promedio p = new Promedio();
                    double resultadoPromedio = p.calcular();

                    JOptionPane.showMessageDialog(null, "El resultado es: " + String.format("%.2f", resultadoPromedio));
                    respuesta = JOptionPane.showInputDialog("Desea realizar otra operacion? (s/n)");
                    break;
                case 3:
                    Convertir c = new Convertir();
                    double resultadoConversion = c.calcular();

                    JOptionPane.showMessageDialog(null, "El resultado es: " + String.format("%.2f", resultadoConversion));
                    respuesta = JOptionPane.showInputDialog("Desea realizar otra operacion? (s/n)");
                    break;
                case 4:
                    DiaLaboral dl = new DiaLaboral();
                    String resultadoLaboral = dl.calcular();

                    JOptionPane.showMessageDialog(null, resultadoLaboral);
                    respuesta = JOptionPane.showInputDialog("Desea realizar otra operacion? (s/n)");
                    break;
                case 5:
                    VerificarVocal vv = new VerificarVocal();
                    String resultadoVerificar = vv.verificar();

                    JOptionPane.showMessageDialog(null, resultadoVerificar);
                    respuesta = JOptionPane.showInputDialog("Desea realizar otra operacion? (s/n)");
                    break;
                case 6:
                    respuesta = JOptionPane.showInputDialog("Esta Seguro que desea salir? (s/n)");
                    if (respuesta.equalsIgnoreCase("s")) {
                        respuesta = "n";
                    } else {
                        respuesta = "s";
                    }
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opcion no valida");
                    respuesta = JOptionPane.showInputDialog("Desea realizar otra operacion? (s/n)");
            }
        } while (respuesta.equalsIgnoreCase("s"));
    }
}