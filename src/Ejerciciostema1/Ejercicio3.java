package Ejerciciostema1;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        double pesetas;
        
        Scanner teclado = new Scanner(System.in);
        
            System.out.println("Introduce el número de pesetas.");
            pesetas = teclado.nextDouble();
            
            double euros = (pesetas/166.386);
            
            System.out.println("El número de euros es: " + euros);
            
        teclado.close();
    }
}