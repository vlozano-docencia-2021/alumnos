/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.edu.emiliojimeno.dam31.ed.alumnosed;

import java.util.ArrayList;

/**
 *
 * @author vicen
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
  
        Alumno vLozano = new Alumno("vLozano","20/21");
        alumnos.add(vLozano);
        Alumno rOrtega = new Alumno("rOrtega","20/21");
        alumnos.add(rOrtega);
        
        
        for(Alumno a : alumnos){
            System.out.println(a);
        }
        
    }
    
}
