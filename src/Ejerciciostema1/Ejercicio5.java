package Ejerciciostema1;

import java.util.Scanner;

public class Ejercicio5 {
    
    public static void main(String[] args) {
        
        int edad;
        String nombre;
        
        Scanner teclado = new Scanner(System.in);
            
            System.out.println("Introduce tu edad: ");
            edad = teclado.nextInt();
            
            teclado.nextLine(); //limpiar el buffer
            
            System.out.println("Introduce tu nombre: ");
            nombre = teclado.nextLine();
            
            System.out.println("Hola " + nombre + ", tienes " + edad + " años.");
            
        teclado.close();
    }
    
}