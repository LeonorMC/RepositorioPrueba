package Ejerciciostema6;

import java.util.Scanner;

public class Ejercicio4 { //Pedir números hasta que se teclee uno negativo, y mostrar cuántos números se han introducido.
    
    public static void main(String[] args) {
                
        Scanner teclado = new Scanner(System.in);
        double a;
        int cont = 0;
        
        do
        {
            System.out.println("Introduce un número");
            a = teclado.nextInt();
            cont ++;

        }
        while (a >= 0 );
        System.out.println("Has introducido " + cont + " números");
    
    }
    
}