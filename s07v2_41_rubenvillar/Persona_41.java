/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s07v2_41_rubenvillar;

/**
 *
 * @author ING RUBER VILLAR PDA
 */
public class Persona_41 {
      // Atributos de la clase Persona
    public String nombre;
    public int edad;
    public String direccion;

    // Constructor de la clase Persona
    public Persona_41(String nombre, int edad, String direccion) {
        this.nombre = nombre;
        this.edad = edad;
        this.direccion = direccion;
    }

    // Otro constructor para permitir crear una Persona sin dirección
    public Persona_41(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.direccion = "Dirección no especificada";
    }

    // Métodos para acceder y modificar los atributos
    public String getNombre() {
        return nombre;
    }
    
    public boolean flot(boolean a){
        return a;
    }
    
        public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Dirección: " + direccion);
    }
}
