package Juego;
import java.util.Random;
import java.util.Scanner;

public class juego {

    public static void main(String[] args) {
        int num;
        int marcador1;
        int marcador2;
        String opción;
        
        ficha j1 = new ficha();
        ficha j2 = new ficha();
        
        while (j1.getPosicion() < 5 && j2.getPosicion()){
            System.out.println("Turno de J1 :");
            System.out.println("*1* avanza");
            
            opción = entrada.nextLine().toLowerCase();
            
            switch (opción){
                case "1" : case "avanzar":
                    j1.avanzar();
                    marcador1 ++;
                    break;
                    
                case "2" : case "saltar" :
                    j1.retroceder();
                    marcador1 --;
                    
            }
        }
    }
    
}
