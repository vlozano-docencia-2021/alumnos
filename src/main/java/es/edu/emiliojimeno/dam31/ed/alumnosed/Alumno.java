/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.edu.emiliojimeno.dam31.ed.alumnosed;

/**
 *
 * @author vicen
 */
public class Alumno {
    private String nombre;
    private String curso;
    
    public Alumno(String nombre, String curso){
        this.nombre = nombre;
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", curso=" + curso + '}';
    }
    
    
}
