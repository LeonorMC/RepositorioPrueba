package Ejerciciostema3;

import java.util.Scanner;

public class Ejercicio5_Halloween {
    
    public static void main(String[] args) {
        
        String nombre;
        int edad;
        long altura;
        String truco;
        String trato;
        int caramelos = 0;
        int sustos = 0;
        String respuesta;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Introduzca su edad");
        edad = teclado.nextInt();
                
        teclado.nextLine();
        
        System.out.println("Introduzca su nombre");
        nombre = teclado.nextLine();
        
        System.out.println("Introduzca su altura");
        altura = teclado.nextInt();
        
        teclado.nextLine();

        System.out.println("¿Truco o Trato?");
        respuesta = teclado.nextLine().toUpperCase();
        
        if (respuesta.equals("TRUCO"))
        {
            if (edad%2 == 0)
            {
                sustos += 2;
            }
            else if (edad%2 != 0)
            {
                sustos += 0;
            }
            if (altura > 100)
            {
                sustos += 3;
            }
            else if (altura < 100)
            {
                sustos += 0;
            }
            
        }
        
        teclado.close();
    }
    
}