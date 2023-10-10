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
public class medico_41 extends persona_41_{

    public medico_41(String especialidad, int experiencia, int cedula, String nombre, int edad) {
        super(nombre, edad);
        this.especialidad = especialidad;
        this.experiencia = experiencia;
        this.cedula = cedula;
    }
    
    //atributos
    String especialidad;
    int experiencia;
    int cedula;
    
    public void revision(){
    
    }
}
