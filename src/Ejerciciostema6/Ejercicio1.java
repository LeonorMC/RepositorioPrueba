package Ejerciciostema6;

import java.util.Scanner;

public class Ejercicio1 {
    
    public static void main(String[] args) {
                
        Scanner teclado = new Scanner(System.in);
        int a;
        
        do
        {
            System.out.println("Introduce un número");
            a = teclado.nextInt();
            
            if (a >= 0)
            {
                System.out.println(Math.pow(a, 2));
            }

        }
        while (a >= 0 );
        System.out.println("El número es negativo");
    
    }
    
}