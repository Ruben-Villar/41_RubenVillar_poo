/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S11_41_E01;

/**
 *
 * @author ING RUBER VILLAR PDA
 */
public class taxista_41 extends persona_41_{

    public taxista_41(int horastrab, String nomcar, String placa, String nombre, int edad) {
        super(nombre, edad);
        this.horastrab = horastrab;
        this.nomcar = nomcar;
        this.placa = placa;
    }
    
    //atributos 
    int horastrab;
    String nomcar;
    String placa;
    
    public void manejar(){
    
    }
    
    public void kilometro(){
    
    }
    
}
