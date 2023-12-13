package Ejerciciostema6;

import java.util.Scanner;

public class Ejercicio10 { //Pedir 15 números y escribir la suma total.
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        int a;
        int suma = 0;
        
        for (int contador = 1; contador <= 15; contador ++)
        {
            System.out.println("Introduce un número " + "(" + contador + " de 15)");
            a = teclado.nextInt();
            
            suma += a;
        }
        
        System.out.println("La suma de los 15 números introducidos es: " + suma);

    }
    
}
