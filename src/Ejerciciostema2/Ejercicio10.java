package Ejerciciostema2;

import java.util.Scanner;

public class Ejercicio10 {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        String número;
        
        System.out.print("Hola, ¿En qué curso estás?");
        número= teclado.nextLine();
        
        System.out.println("Bienvenido a " + (número.substring(0,1))+ "º de " + (número.substring(1,4)) + "grupo " + (número.substring(4,5)));

        teclado.close();
    }
    
}