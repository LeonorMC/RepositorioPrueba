package Ejerciciostema5;

import java.util.Scanner;

public class Ejercicio1 {
    
    public static void main(String[] args) {
                
        Scanner teclado = new Scanner(System.in);
        int a;
        int b;
        
        do
        {
        System.out.println("Introduce el primer dígito");
        a = teclado.nextInt();
        System.out.println("Introduce el segundo dígito");
        b = teclado.nextInt();
        }
        
        while (a != b);
        System.out.println("Los dígitos son iguales");
    }
}
            
