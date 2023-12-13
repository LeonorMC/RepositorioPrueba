package Ejerciciostema1;

import java.util.Scanner;

public class Ejercicio0 {

    public static void main(String[] args) {
        int radio;
        int altura;
        Scanner teclado = new Scanner(System.in);
        
            System.out.println("Introduce el radio.");
            radio = teclado.nextInt();
            
            System.out.println("Introduce la altura.");
            altura = teclado.nextInt();
            
            double elevado = Math.pow(radio, 2);
            
            System.out.println("El volumen del cilindro es: " + (Math.PI * elevado * altura) );
            
        teclado.close();
    }
}