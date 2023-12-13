package Ejerciciostema2;

import java.util.Scanner;

public class Ejercicio4 {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ejercicio 1: ");
        
        System.out.println("Introduce el ancho");
        double ancho = teclado.nextDouble();
        
        System.out.println("Introduce el largo");
        double largo = teclado.nextDouble();
        
        double perímetro1 = (2 * largo + 2 * ancho);
        System.out.println("El perímetro del rectángulo es: " + perímetro1);
        
        double área1 = (largo * ancho);
        System.out.println("El área del rectángulo es: " + área1);
        
        System.out.println("Ejercicio 2: ");
        
        System.out.println("Introduce el radio");
        double radio1 = teclado.nextDouble();        
        double diámetro = (radio1 * 2);
        
        double perímetro2 = (Math.PI * diámetro);        
        System.out.println("El perímetro del círculo es: " + perímetro2);
        
        double radioc = (radio1*radio1);
        double área2 = (Math.PI * radioc);
        System.out.println("El área del círculo es: " + área2);
        
        System.out.println("Ejercicio 3: ");
        
        System.out.println("Introduce el lado ");
        double lado = teclado.nextDouble();
        
        double perímetro3 = (lado * 4);
        System.out.println("El perímetro del cuadrado es: " + perímetro3);
        
        double área3 = (lado * lado);
        System.out.println("El área del cuadrado es: " + área3);
        
        teclado.close();

    }
    
}