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
public class calculadora_41 {
      
    //atributos
    int a; 
    int b;
    int totals;
    int totalr;
    int totalm;
     
    //metodo
     
    public void preguntar(){
        a = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer número: "));
        b = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo número: "));
    }
     
    public void multiplicar (){
        totalm = a * b;
        JOptionPane.showMessageDialog(null, "La multiplicación es: " + totalm);
    }
    
    public void sumar (){
        totals = a + b;
        JOptionPane.showMessageDialog(null, "La suma es: " + totals);
    }
    
    public void resta(){
        totalr = a - b;
        JOptionPane.showMessageDialog(null, "La resta es: " + totalr);
    }
}
