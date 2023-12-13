package Ejerciciostema2;

public class Ejercicio2a {
    
    public static void main(String[] args) {
        
        int x = 3;
        double y = 5.15684987468;
                
        System.out.println("La expresión z = 200 * y + x es igual a " + (200 * y + x));
        
        double z1 = (200 * y + x);
        float z2 = (float) (200 * y + x);
        int z3 = (int) (200 * y + x);
        
        System.out.println("La variable en tipo double es: " + z1);
        System.out.println("La variable en tipo float es: " + z2);
        System.out.println("La variable en tipo entero es: " + z3);
    }
    
}