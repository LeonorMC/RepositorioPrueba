package Ejerciciostema6;

import java.util.Scanner;

public class Ejercicio6 { //Pedir números hasta que se introduzca uno negativo, y calcular la media.
    
    public static void main(String[] args) {
                
        Scanner teclado = new Scanner(System.in);
        int a;
        int suma = 0;
        double media;
        int cont = 0;
        do
        {
            System.out.println("Introduce un número");
            a = teclado.nextInt();
            suma += a;
            cont ++;
        }
        while (a >= 0 );
        media = suma / cont;
        System.out.println("La media de los números introducidos es: " + media);
    
    }
    
}