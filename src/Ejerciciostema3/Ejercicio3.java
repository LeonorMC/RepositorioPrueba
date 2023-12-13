package Ejerciciostema3;

import java.util.Scanner;

public class Ejercicio3 {
    
    public static void main(String[] args) {
        
        int nota;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Introduce tu nota");
        nota = teclado.nextInt();

        if (nota < 0 || nota > 10)
        {
            System.out.println("El valor no es válido");
        }
        else if (nota < 5)
        {
            System.out.println("La nota es suspenso");
        }
        else if (nota >= 5 && nota < 7)
        {
            System.out.println("La nota es aporbada");
        }
        else if (nota >= 7 && nota < 9)
        {
            System.out.println("La nota es notable");
        }
        else if (nota >= 9 && nota < 10)
        {
            System.out.println("La nota es sobresaliente");
        }
        else if (nota == 10)
        {
            System.out.println("La nota es matrícula de honor");
        }
    }
}