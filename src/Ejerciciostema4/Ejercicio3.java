package Ejerciciostema4;

import java.util.Scanner;

public class Ejercicio3 {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Indica el mes: ");
        String mes = teclado.nextLine().toLowerCase();
        
        switch(mes){
            case "enero"      :     System.out.println("31");
                                    break;
            case "febrero"    :     System.out.println("28 o 29");
                                    break;
            case "marzo"      :     System.out.println("31");
                                    break;
            case "abril"      :     System.out.println("30");
                                    break;
            case "mayo"       :     System.out.println("31");
                                    break;
            case "junio"      :     System.out.println("30");
                                    break;
            case "julio"      :     System.out.println("31");
                                    break;
            case "agosto"     :     System.out.println("31");
                                    break;
            case "septiembre" :     System.out.println("30");
                                    break;
            case "octubre"    :     System.out.println("31");
                                    break;
            case "noviembre"  :     System.out.println("30");
                                    break;
            case "diciembre"  :     System.out.println("31");
                                    break;
            default           :     System.out.println("No reconocido");
                                    break;
                                    
        }
    }
    
}