/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avm.indiv03;

/**
 *
 * @author Usuario
 */
public class Usuario {

    /**
     * @param args the command line arguments
     */
    private String nombre, apellidos, dni;
    private int edad;
        
    Usuario(String nombre, String apellidos, String dni, int edad){
        this.apellidos = apellidos;
        this.nombre = nombre;
        this.dni = dni;
        this.edad = edad;
        }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
                       
    public String toString(){
    return ("Nombre: " +this.nombre +"  Apellidos: " +this.apellidos +"  DNI: " +this.dni +"  Edad: " +this.edad);
    }
}
