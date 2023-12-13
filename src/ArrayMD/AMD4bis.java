package ArrayMD;

import java.util.Scanner;

/* @author LMC */

public class AMD4bis {

    public static void main(String[] args) {
        //Crear y cargar una tabla de cualquier tamaño,
        //cuadrada o rectangular,
        //trasponerla y mostrarla.
        
        Scanner tl = new Scanner(System.in);
        
        int n;
        int m;
        
        System.out.println("Introduce las dimensiones de la matriz");
        n = tl.nextInt();
        m = tl.nextInt();
        
        int[][] array4 = new int[n][m];
        
        for (int i = 0; i < array4.length; i++){
            for(int j = 0; j < array4.length; j++){
                array4[i][j] = (int) (Math.random() * 10 + 1);
            }
        }
        
        for (int i = 0; i < array4.length; i++){
            for (int j= 0; j < array4.length; j++){
                System.out.print(array4[i][j] + " ");
            }
            System.out.println();
        }
        
        System.out.println("---------------------------");
        
        for (int i = 0; i < array4.length; i++){
            for (int j= 0; j < array4[i].length; j++){
                System.out.print(array4[j][i] + " ");
            }
            System.out.println();
        }
        
    }
    
}
