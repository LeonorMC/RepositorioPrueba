package Ejerciciostema3;

import java.util.Scanner;

public class Ejercicio1 {
    
    public static void main(String[] args) {
        
        int a;
                
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Introduzca un número");
        a = teclado.nextInt();
        
        if (a%2==0)
        {
            System.out.println("El número es par");
        }
        
        else
        {
            System.out.println("El número es impar");
        }
    }
    
}