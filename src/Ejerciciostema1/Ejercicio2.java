package Ejerciciostema1;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        double real1;
        double real2;
        int entero;
        Scanner teclado = new Scanner(System.in);
        
            System.out.println("Introduce el primer número real.");
            real1 = teclado.nextDouble();
            
            System.out.println("Introduce el segundo número real.");
            real2 = teclado.nextDouble();
            
            System.out.println("La suma de los dos números reales es: " + (real1 + real2) );
            System.out.println("La resta de los dos números reales es: " + (real1 - real2) );
            System.out.println("La multiplicación de los dos números reales es: " + (real1 * real2) );
            System.out.println("La división de los dos números reales es: " + (real1 / real2) );
            
            System.out.println("Introduce un número entero.");
            entero = teclado.nextInt();
            
            System.out.println("La multiplicación del número entero y el primer número real es: " + (entero * real1) );
            System.out.println("La división del número entero y el primer número real es: " + (entero / real1) );
            
        teclado.close();
    }   
}