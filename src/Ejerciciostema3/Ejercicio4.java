package Ejerciciostema3;

import java.util.Scanner;

public class Ejercicio4 {
    
    public static void main(String[] args) {
        
        int edad;
        double cuota = 800;
        String socios;
        
        Scanner teclado = new Scanner(System.in);
                
        System.out.println("Socios");
        
        System.out.println("Introduzca su edad");
        edad = teclado.nextInt();
        
        teclado.nextLine();
                    
        if (edad < 0 || edad > 110)
        {
            System.out.println("Valor no válido");
        }
        else if (edad >= 0 && edad < 21)
        {
            System.out.println("¿Son tus padres socios?");
            socios = teclado.nextLine().toUpperCase();
                       
            if (socios.equals("SI"))
            {
                System.out.println("Tienes un descuento del 45%, es decir, tu cuota es de " + (cuota * 0.45) + " euros");
            }
            else if (socios.equals("NO"))
            {
                System.out.println("Tienes un descuento del 25%, es decir, tu cuota es de " + (cuota * 0.25) + " euros");
            }
            else 
            {
                System.out.println("No te he entendido");
            }
        }
        else if (edad >= 21 && edad < 65)
        {
            System.out.println("No tienes descuento, es decir, tu cuota es de 800 euros");
        }
        else if (edad >= 65 && edad <= 110)
        {
            System.out.println("Tienes un descuento del 40%, es decir, tu cuota es de " + (cuota * 0.40) + " euros");
        }
        
    }
    
}