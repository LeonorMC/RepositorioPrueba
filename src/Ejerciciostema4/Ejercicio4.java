package Ejerciciostema4;

import java.util.Scanner;

public class Ejercicio4 {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        char letra;
        System.out.println("Introduce una letra");
        letra = teclado.nextLine().toLowerCase().charAt(0);
        
        if (letra >= 'a' && letra <='z' || letra == 'ñ'){
            switch (letra){
                case 'a'    :   System.out.println("Vocal");
                                break;
                case 'b'    :   System.out.println("Consonante");
                                break;
                case 'c'    :   System.out.println("Consonante");
                                break;
                case 'd'    :   System.out.println("Consonante");
                                break;
                case 'e'    :   System.out.println("Vocal");
                                break;
                case 'f'    :   System.out.println("Consonante");
                                break;
                case 'g'    :   System.out.println("Consonante");
                                break;
                case 'h'    :   System.out.println("Consonante");
                                break;
                case 'i'    :   System.out.println("Vocal");
                                break;
                case 'j'    :   System.out.println("Consonante");
                                break;
                case 'k'    :   System.out.println("Consonante");
                                break;
                case 'l'    :   System.out.println("Consonante");
                                break;
                case 'm'    :   System.out.println("Consonante");
                                break;
                case 'n'    :   System.out.println("Consonante");
                                break;
                case 'ñ'    :   System.out.println("Consonante");
                                break;
                case 'o'    :   System.out.println("Vocal");
                                break;
                case 'p'    :   System.out.println("Consonante");
                                break;
                case 'q'    :   System.out.println("Consonante");
                                break;
                case 'r'    :   System.out.println("Consonante");
                                break;
                case 's'    :   System.out.println("Consonante");
                                break;
                case 't'    :   System.out.println("Consonante");
                                break;
                case 'u'    :   System.out.println("Vocal");
                                break;
                case 'v'    :   System.out.println("Consonante");
                                break;
                case 'w'    :   System.out.println("Consonante");
                                break;
                case 'x'    :   System.out.println("Consonante");
                                break;
                case 'y'    :   System.out.println("Consonante");
                                break;
                case 'z'    :   System.out.println("Consonante");
                                break;
                default     :   System.out.println("No reconocido");
                                break;
            }
        } 
        else
        {
            System.out.println("No reconocido");
            
        }
            
    }
    
}