/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Especialhalloween;

/**
 *
 * @author developer
 */
public class Persona {
    
    String nombre;
    int edad;
    int altura;
    
    public Persona(String nombre, int edad, int altura){
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
    }
    public class Truco{
        private int sustos = 0;
        
        public int getSustos(){
            return sustos;
        }
        public void setSustos(){
            if (sustos > 0){
                this.sustos = sustos;
            }
        }
    }
}
