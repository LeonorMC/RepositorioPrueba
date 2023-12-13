package Ejerciciostema2;

import java.util.Scanner;

public class Ejercicio6 {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Introduce la nota del primer trimestre");
        double nota1 = teclado.nextDouble();
        System.out.println("Introduce la nota del segundo trimestre");
        double nota2 = teclado.nextDouble();
        System.out.println("Introduce la nota del tercer trimestre");
        double nota3 = teclado.nextDouble();
        
        System.out.println("La media en el expediente es: " + (double)(nota1 + nota2 + nota3)/3);
        
        System.out.println("La media en el expediente es: " + (int)(nota1 + nota2 + nota3)/3);

        teclado.close();

    }
    
}