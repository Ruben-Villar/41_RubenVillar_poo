/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s05_41;

import javax.swing.JOptionPane;

/**
 *
 * @author ING RUBER VILLAR PDA
 */
public class animal_41 {
      String nombre;
    String raza;
    int edad;
    String color;

    public void preguntar() {
        nombre = JOptionPane.showInputDialog("Ingrese el nombre del gato: ");
        raza = JOptionPane.showInputDialog("Ingrese la raza del gato: ");
        String edadStr = JOptionPane.showInputDialog("Ingrese la edad del gato: ");
        edad = Integer.parseInt(edadStr);
        color = JOptionPane.showInputDialog("Ingrese el color del gato: ");
    }

    public void mostrarInfo() {
        JOptionPane.showMessageDialog(null, "Nombre del gato: " + nombre);
        JOptionPane.showMessageDialog(null, "Raza del gato: " + raza);
        JOptionPane.showMessageDialog(null, "Edad del gato: " + edad);
        JOptionPane.showMessageDialog(null, "Color del gato: " + color);
    }
}
