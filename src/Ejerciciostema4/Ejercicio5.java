package Ejerciciostema4;

import java.util.Scanner;

public class Ejercicio5 {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        String operacion;
        double num1;
        double num2;
        double resultado = 0;
        
        System.out.println("Introduzca el signo de la operación matemática a realizar ( +, -, *, /)");
        operacion = teclado.nextLine();
        System.out.println("Introduzca el primer dígito");
        num1 = teclado.nextDouble();
        System.out.println("Introduzca el segundo dígito");
        num2 = teclado.nextDouble();
        
        switch(operacion)
        {
            
            case "+"    :   resultado = num1 + num2;
                            System.out.println("El resultado es: " + resultado);
                            break;
            case "-"    :   resultado = num1 - num2;
                            System.out.println("El resultado es: " + resultado);
                            break;
            case "*"    :   resultado = num1 * num2;
                            System.out.println("El resultado es: " + resultado);
                            break;
            case "/"    :   resultado = num1 / num2;
                            System.out.println("El resultado es: " + resultado);
                            break;
            default     :   System.out.println("Error: operación no reconocida");
                            break;           
        }

    }

}