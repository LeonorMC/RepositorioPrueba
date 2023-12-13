package ArrayMD;

import java.util.Scanner;

/* @author LMC */

public class AMD7 {

    public static void main(String[] args) {
        //Utilizando dos tablas de tamaño 5x9 y 9x5, 
        //cargar la primera con datos por teclado y 
        //trasponerla en la segunda.
        
        Scanner tl = new Scanner(System.in);
        
        int[][] array7_1 = new int[5][9];
        int[][] array7_2 = new int[9][5];
        
        for (int i = 0; i < array7_1.length; i++){
            for(int j = 0; j < array7_1[i].length; j++){
                System.out.println("[" + i + "." + j + "] = ");
                array7_1[i][j] = tl.nextInt();
            }
        }
        
        System.out.println("---------------------------");
        
        for (int i = 0; i < array7_1.length; i++){
            for (int j= 0; j < array7_1[i].length; j++){
                System.out.print(array7_1[i][j] + " ");
            }
            System.out.println();
        }
        
        System.out.println("---------------------------");
        
        for (int i = 0; i < array7_2.length; i++){
            for(int j = 0; j < array7_2[i].length; j++){
                array7_2[i][j] = array7_1[j][i];
            }
        }
        
        for (int i = 0; i < array7_2.length; i++){
            for (int j= 0; j < array7_2[i].length; j++){
                System.out.print(array7_2[i][j] + " ");
            }
            System.out.println();
        }
        
    }
    
}