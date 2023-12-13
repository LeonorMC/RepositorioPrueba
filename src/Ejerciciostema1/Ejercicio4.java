package Ejerciciostema1;

import java.util.Scanner;

public class Ejercicio4 {
    
    public static void main(String[] args) {
        
        long lunes;
        long martes;
        long miércoles;
                
        Scanner teclado = new Scanner(System.in);
        
            System.out.println("Introduce número de huevos recogidos el lunes.");
            lunes = teclado.nextLong();
            
            System.out.println("Introduce número de huevos recogidos el martes.");
            martes = teclado.nextLong();
            
            System.out.println("Introduce número de huevos recogidos el miércoles.");
            miércoles = teclado.nextLong();
            
            double media = (lunes + martes + miércoles) / 3;
            
            System.out.println("La media de huevos recogidos diariamente es: " + media);
            
            double mes = media * 30;
            
            System.out.println("Se estima que en un mes de 30 días se pueden recoger " + mes + " huevos.");
            
            double beneficios = mes * 0.18;
            
            System.out.println("En un mes se obtendrán unos beneficios de " + beneficios + " euros");
                    
        teclado.close();
    }
}