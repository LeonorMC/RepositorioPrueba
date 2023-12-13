package Ejerciciostema6;

import java.util.Scanner;

public class Ejercicio20 { //Dadas una base y un exponente enteros, calcular la potencia.
    
    public static void main(String[] args) {
        
        int base;
        int exp;
        double pot = 1;
        
        Scanner teclado = new Scanner(System.in);        
        
        System.out.println("Introduzca una base");
        base = teclado.nextInt();
        
        System.out.println("Introduzca un exponente");
        exp = teclado.nextInt();
                
        for (int contador = 0; contador < exp; contador ++)
        {

            pot = (pot * base);

        }
        
        System.out.println("El resultado es " + pot);
    }
    
}

