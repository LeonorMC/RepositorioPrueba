package Ejerciciostema2;

import java.util.Scanner;

public class Ejercicio8 {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("C1x + C2 = 0");
        
        System.out.println("Introduce el primer dígito");
        double C1 = teclado.nextDouble();
        System.out.println("Introduce el segundo dígito");
        double C2 = teclado.nextDouble();
        
        System.out.println("X = " + (double)((- C2)/C1));

        teclado.close();

    }
    
}