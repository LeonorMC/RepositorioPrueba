package juegos;

import java.util.Random;
import java.util.Scanner;

/*@LMC*/

public class ppt {

    public static void main(String[] args) {
        
        int opcionj1;
        int opcionj2;
        int jugador1 = 0;
        int jugador2 = 0;
        Random op2 = new Random();
        Scanner tl = new Scanner(System.in);
        
        System.out.println("---------------------------");
        
        System.out.println("JUGUEMOS A PIEDRA PAPEL O TIJERA");
        
        System.out.println("---------------------------");
        
        System.out.println("OPCIONES: \n 0 = piedra \n 1 = papel \n 2 = tijera");
        
        System.out.println("---------------------------");
        
        while (jugador1 < 3 && jugador2 < 3){
            System.out.println("Jugador 1");
            opcionj1 = tl.nextInt();
            opcionj2 = (int) (Math.random() * 3);

            switch (opcionj1){
                case 0:
                    System.out.println("piedra");
                    break;
                case 1:
                    System.out.println("papel");
                    break;
                case 2:
                    System.out.println("tijera");
                    break;
                default:
                    System.out.println("Error");
            }
            if (opcionj1 >=0 && opcionj1<=2){

                System.out.println("---------------------------");

                System.out.println("Jugador 2");
                System.out.println(opcionj2);
                if (opcionj2 == 0){
                    System.out.println("piedra");
                }
                else if (opcionj2 == 1){
                    System.out.println("papel");
                }
                else if (opcionj2 == 2){
                    System.out.println("tijera");
                }

                System.out.println("---------------------------");

                System.out.println("Resultado");
                if (opcionj2 == opcionj1){
                    System.out.println("Empate");
                }
                else if (opcionj1 == 0 && opcionj2 == 1){
                    System.out.println("piedra vs PAPEL");
                    System.out.println("---------------------------");
                    System.out.println("Gana jugador 2");
                    jugador2 ++;
                }
                else if (opcionj1 == 0 && opcionj2 == 2){
                    System.out.println("PIEDRA vs tijera");
                    System.out.println("---------------------------");
                    System.out.println("Gana jugador 1");
                    jugador1 ++;
                }
                else if (opcionj1 == 1 && opcionj2 == 0){
                    System.out.println("PAPEL vs piedra");
                    System.out.println("---------------------------");
                    System.out.println("Gana jugador 1");
                    jugador1 ++;
                }
                else if (opcionj1 == 1 && opcionj2 == 2){
                    System.out.println("papel vs TIJERA");
                    System.out.println("---------------------------");
                    System.out.println("Gana jugador 2");
                    jugador2 ++;
                }
                else if (opcionj1 == 2 && opcionj2 == 0){
                    System.out.println("tijera vs PIEDRA");
                    System.out.println("---------------------------");
                    System.out.println("Gana jugador 2");
                    jugador2 ++;
                }
                else if (opcionj1 == 2 && opcionj2 == 1){
                    System.out.println("TIJERA vs papel");
                    System.out.println("---------------------------");
                    System.out.println("Gana jugador 1");
                    jugador1 ++;
                }
                System.out.println("---------------------------");
                if (jugador1 == 3){
                    System.out.println("HA GANADO EL JUGADOR 1");
                    System.out.println("---------------------------");
                }
                else if (jugador2 == 3){
                    System.out.println("HA GANADO EL JUGADOR 2");
                    System.out.println("---------------------------");
                }
            
            }
        }
        
    }

}
