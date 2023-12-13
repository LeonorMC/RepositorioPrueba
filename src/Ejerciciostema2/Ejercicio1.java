package Ejerciciostema2;

import java.util.Scanner;

public class Ejercicio1 {
    
    public static void main(String[] args) {
        
        int a;
        int b;
        int c;
        String s;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Introduzca el primer número");
        a = teclado.nextInt();
        
        System.out.println("Introduzca el segundo número");
        b = teclado.nextInt();
        
        System.out.println("Introduzca el tercer número");
        c = teclado.nextInt();
        
        teclado.nextLine();
        
        System.out.println("Introduzca una serie de caracteres");
        s = teclado.nextLine();
        
        System.out.println("El primer número es " + a + ", el segundo es " + b + ", el tercero es " + c + " y la serie de caracteres es " + s);
        
        System.out.println("El primer número es " + a);
        System.out.println("El segundo número es " + b);
        System.out.println("El tercer número es " + c);
        System.out.println("La serie ed caracteres es " + s);
        
        System.out.println("El primer número es " + a + "\nEl segundo número es " + b + "\nEl tercer número es " + c + "\nLa serie de caracteres es " + s);
        
        teclado.close();
    }
    
}