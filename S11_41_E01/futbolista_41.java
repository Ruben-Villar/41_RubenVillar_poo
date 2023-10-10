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
public class futbolista_41 extends persona_41_{

    public futbolista_41(int dorsal, String posicion, String pais, String nombre, int edad) {
        super(nombre, edad);
        this.dorsal = dorsal;
        this.posicion = posicion;
        this.pais = pais;
    }
    
    //atributos
    int dorsal;
    String posicion;
    String pais;
    
    public void correr(){
    
    }
    
    public void asistencia(){
    }
}
