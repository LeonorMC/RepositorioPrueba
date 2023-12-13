package Ejerciciostema6;

public class Ejercicio8 { 
    
    public static void main(String[] args) {
                
        int a = 100;
        
        System.out.println("Escribir todos los números del 100 al 0 de 7 en 7 (con do-while)");
        do
        {
            
            System.out.println(a);
            a -= 7;
            
        }
        while (a >= 0);
       
        System.out.println("Cuenta finalizada");
        
        ////////
        
        System.out.println("Escribir todos los números del 100 al 0 de 7 en 7(con for)");
        
        for (int b = 100; b >= 0; b -= 7)
        {

            System.out.println(b);

        }
        System.out.println("Cuenta finalizada");
    }
    
}
