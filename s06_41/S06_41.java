/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s06_41;

import java.util.Scanner;

/**
 *
 * @author ING RUBER VILLAR PDA
 */
public class S06_41 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          //estudiante
        estudiante_41 estudiante = new estudiante_41("Ruben", "Villar", 17);
        estudiante.mostrarInformacion();
        estudiante.saludar();
        estudiante.saludar("¡Hola a todos!");
        System.out.println("Nombre Completo: " + estudiante.obtenerNombreCompleto());
        
        //calculadora
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Ingrese el segundo número: ");
        double num2 = scanner.nextDouble();
        // Uso del constructor con valores predeterminados
        calculadora_41 calculadora = new calculadora_41(num1, num2);
    }
    
}
