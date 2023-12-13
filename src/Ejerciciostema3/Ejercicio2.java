package Ejerciciostema3;

import java.util.Scanner;

public class Ejercicio2 {
    
    public static void main(String[] args) {
        
        String nombre;
        int edad;
        char género;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Introduzca su nombre");
        nombre = teclado.nextLine();
        
        System.out.println("Introduzca su edad");
        edad = teclado.nextInt();
        
        teclado.nextLine();
        
        System.out.println("Introduzca su género");
        género = teclado.nextLine().toUpperCase().charAt(0);
        
        System.out.println("Hola " + nombre);
        
        if (edad<18)
        {
            System.out.println("Eres menor de edad");
        }
        
        else
        {
            System.out.println("Eres mayor de edad");
        }
        
        if (género == 'H')
        {
        System.out.println("Eres hombre");
        }
        
        else if (género == 'M')
        {
            System.out.println("Eres mujer");
        }
        
        else
        {
        System.out.println("Eres otro género");
        }
        
        teclado.close();
    }
    
}