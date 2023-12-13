package Ejerciciostema6;

import java.util.Scanner;

public class Ejercicio2 {
    
    public static void main(String[] args) {
                
        Scanner teclado = new Scanner(System.in);
        int a;
        
        do
        {
            System.out.println("Introduce un número");
            a = teclado.nextInt();
            
            if (a != 0)
            {
                if (a > 0)
                    {
                        System.out.println("Positivo");
                    }
                else if (a < 0)
                    {
                        System.out.println("Negativo");
                    }
            }

        }
        while (a != 0);
        System.out.println("Has introducido el 0");
    
    }
    
}