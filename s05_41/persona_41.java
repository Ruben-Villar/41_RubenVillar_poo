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
public class persona_41 {
    String nombre;
    int edad;
    String ciudadOrigen;

    public void preguntar() {
        nombre = JOptionPane.showInputDialog("Ingrese el nombre de la persona: ");
        String edadStr = JOptionPane.showInputDialog("Ingrese la edad de la persona: ");
        edad = Integer.parseInt(edadStr);
        ciudadOrigen = JOptionPane.showInputDialog("Ingrese la ciudad de origen de la persona: ");
    }

    public void mostrarInfo() {
        JOptionPane.showMessageDialog(null, "Nombre de la persona: " + nombre);
        JOptionPane.showMessageDialog(null, "Edad de la persona: " + edad);
        JOptionPane.showMessageDialog(null, "Ciudad de origen de la persona: " + ciudadOrigen);
    }

    public static void main(String[] args) {
        persona_41 persona = new persona_41();
        persona.preguntar();
        persona.mostrarInfo();

        int edadPersona = persona.edad;
        int edadEnMeses = edadPersona * 12;
        int edadEnDias = edadPersona * 365; 

        JOptionPane.showMessageDialog(null, "Edad de la persona en meses: " + edadEnMeses);
        JOptionPane.showMessageDialog(null, "Edad de la persona en días: " + edadEnDias);
    }
}
