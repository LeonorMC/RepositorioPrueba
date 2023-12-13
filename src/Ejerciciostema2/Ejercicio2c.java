package Ejerciciostema2;

import java.util.Scanner;

public class Ejercicio2c {
    
    public static void main(String[] args) {
        
        int x;
        double y = 0;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Introduzca el primer número");
        x = teclado.nextInt();
        
        System.out.println("Introduzca el segundo número");
        y = teclado.nextDouble();
                
        System.out.println("La expresión z = 200 * y + x es igual a " + (200 * y + x));
        
        double z1 = (200 * y + x);
        float z2 = (float) (200 * y + x);
        int z3 = (int) (200 * y + x);
        
        System.out.println("La variable en tipo double es: " + z1);
        System.out.println("La variable en tipo float es: " + z2);
        System.out.println("La variable en tipo entero es: " + z3);
        
        teclado.close();
    }
    
}