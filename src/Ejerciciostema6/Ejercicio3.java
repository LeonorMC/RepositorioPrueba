package Ejerciciostema6;

import java.util.Scanner;

public class Ejercicio3 {
    
    public static void main(String[] args) {
                
        Scanner teclado = new Scanner(System.in);
        int a;
        
        do
        {
            System.out.println("Introduce un número");
            a = teclado.nextInt();
            
            if (a != 0)
            {
                if (a % 2 == 0)
                    {
                        System.out.println("Par");
                    }
                else if (a % 2 != 0)
                    {
                        System.out.println("Impar");
                    }
            }

        }
        while (a != 0);
        System.out.println("Has introducido el 0");
    
    }
    
}