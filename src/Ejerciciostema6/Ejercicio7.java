package Ejerciciostema6;

import java.util.Scanner;

public class Ejercicio7 { //Pedir un número N, y mostrar todos los números del 1 al N.
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);        
        int a;
        int b = 1;
        
        System.out.println("Introduzca un número");
        a = teclado.nextInt();
        
        do
        {
            
            System.out.println(b);
            b++;
            
        }
        while (a != b);
        System.out.println(a);
       
        System.out.println("Cuenta finalizada");
    }
    
}