package Especialhalloween;

import java.util.Scanner;

public class Victima {

    public static void main(String[] args) {
        
        Scanner tl = new Scanner(System.in);
        
        String nombre;
        int edad;
        int altura;
        
        System.out.println("Introduce tu nombre");
        nombre = tl.nextLine();
        
        System.out.println("Introduce tu edad");
        edad = tl.nextInt();
        
        System.out.println("Introduce tu altura");
        altura = tl.nextInt();
        
        Persona p = new Persona(nombre, edad, altura);
    }
    public static Persona(){
    
    }
    
}
