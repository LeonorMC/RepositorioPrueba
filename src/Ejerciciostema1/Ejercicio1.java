package Ejerciciostema1;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        int horas;
        int días;
        Scanner teclado = new Scanner(System.in);
        
            System.out.println("Introduce el número de horas.");
            horas = teclado.nextInt();
            
            días = (horas/24);
            horas = (horas%24);
            
            System.out.println("El número de días es: " + días + " y el número de horas es: " + horas);
            
        teclado.close();
    }
}