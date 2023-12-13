package Ejerciciostema6;

import java.util.Scanner;

public class Ejercicio5 { //Pedir números hasta que se teclee un 0, mostrar la suma de todos los números introducidos.
    
    public static void main(String[] args) {
                
        Scanner teclado = new Scanner(System.in);
        int a;
        int suma = 0;
        do
        {
            System.out.println("Introduce un dígito");
            a = teclado.nextInt();
            suma += a;
        }
        while (a != 0 );
        System.out.println("La suma de los dígitos es " + suma);
    
    }
    
}