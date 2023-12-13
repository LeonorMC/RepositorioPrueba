package Ejerciciostema2;

import java.util.Scanner;

public class Ejercicio3 {
    
    public static void main(String[] args) {
        
        String nombre;
        double peso; 
        int estatura;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Introduzca su nombre ");
        nombre = teclado.nextLine();
        
        System.out.println("Introduzca su peso en kg ");
        peso = teclado.nextDouble();
                
        System.out.println("Introduzca su altura en cm ");
        estatura = teclado.nextInt();
        
        double IMC = (peso / (estatura * estatura) * 10000);
        System.out.println("Su IMC es: " + IMC);
        
        teclado.close();
    }
    
}