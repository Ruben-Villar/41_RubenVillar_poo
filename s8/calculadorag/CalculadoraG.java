/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadorag;

/**
 *
 * @author Lab02
 */
public class CalculadoraG {

     int a;
     int b;
     
//sobrecarga de constructores
     
     
     public CalculadoraG(int a, int b){
         this.a = a;
         this.b = b;
    }
     
    public CalculadoraG(int a) {
        this.a = a;
    }
     
     
  
//sobre carga de metodos
     
    public void sumar(int a, int b){
       System.out.println("la suma es" + (a+b));
    }
    
     public int sumar(int a){
        return a+b;
    }
}
