package ArrayMD;

import java.util.Scanner;

/* @author LMC */

public class AMD3 {

    public static void main(String[] args) {
        //Crear y cargar dos matrices de tamaño 3x3, 
        //sumarlas y mostrar la matriz suma.
        
        Scanner numero = new Scanner(System.in);
        
        int[][] array3_1 = new int[3][3];
        int[][] array3_2 = new int[3][3];
        int[][] array3_3 = new int[3][3];
        
        for (int i = 0; i < array3_1.length; i++){
            for(int j = 0; j < array3_1.length; j++){
                System.out.println("[" + i + "." + j + "] = ");
                array3_1[i][j] = numero.nextInt();
            }
        }
        
        System.out.println("---------------------------");
        
        for (int i = 0; i < array3_2.length; i++){
            for(int j = 0; j < array3_2.length; j++){
                System.out.println("[" + i + "." + j + "] = ");
                array3_2[i][j] = numero.nextInt();
            }
        }
        
        System.out.println("---------------------------");
        
        System.out.println("---------------------------");
        
        for (int i = 0; i < array3_1.length; i++){
            for (int j= 0; j < array3_1.length; j++){
                System.out.print(array3_1[i][j] + " ");
                
            }
            System.out.println();
        }
        
        System.out.println("------------- + ------------");
        
        for (int i = 0; i < array3_2.length; i++){
            for (int j= 0; j < array3_2.length; j++){
                System.out.print(array3_2[i][j] + " ");
                
            }
            System.out.println();
        }
        
        System.out.println("------------- = ------------");
        
        for (int i = 0; i < array3_3.length; i++){
            for(int j = 0; j < array3_3.length; j++){
                array3_3[i][j] = array3_1[i][j] + array3_2[i][j];
            }
            
        }
        
        for (int i = 0; i < array3_3.length; i++){
            for (int j= 0; j < array3_3.length; j++){
                System.out.print(array3_3[i][j] + " ");
                
            }
            System.out.println();
        }
        
    }
    
}
