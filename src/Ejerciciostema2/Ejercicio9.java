package Ejerciciostema2;

import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        String numero;
        
        System.out.print("Dame un numero de 5 digitos: ");
        numero= teclado.nextLine();
        
        System.out.println((numero.substring(0,1))+ " " + (numero.substring(1,2)) + " " + (numero.substring(2,3)) + " "+ (numero.substring(3,4)) + " "+ (numero.substring(4,5)));

        teclado.close();

    }
    
}