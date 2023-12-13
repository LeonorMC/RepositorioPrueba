package ArrayMD;

import java.util.Scanner;

/* @author LMC */

public class AMD2 {

    public static void main(String[] args) {
        //Crear y cargar una tabla de tamaño 4x4 y 
        //decir si es simétrica o no, es decir si se obtiene 
        //la misma tabla al cambiar las filas por columnas.
        
        Scanner tl = new Scanner(System.in);
        
        int[][] array2 = new int[4][4];
        boolean comprobador;

        for (int i = 0; i < array2.length; i++){
            for(int j = 0; j< array2.length; j++){
                System.out.println("[" + i + "." + j + "] = ");
                array2[i][j] = tl.nextInt();
            }
        }
        
        System.out.println("---------------------------");
        
        for (int i = 0; i < array2.length; i++){
            for (int j= 0; j < array2.length; j++){
                System.out.print(array2[i][j] + " ");
                
            }
            System.out.println();
        }
        
        System.out.println("---------------------------");
        
        comprobador = true;
        int control = array2.length - 1;
        int i = 0;
        while (i < control && comprobador == true){
            int j = 0;
            while (j < control && comprobador == true){
                if (array2[i][j] != array2[j][i]){
                    comprobador = false;
                }
                j++;
            }
            i++;
            
        }
        if (comprobador){
            System.out.println("La matriz es simétrica");
        }
        else{
            System.out.println("La matriz no es simétrica");
        }
        
    }
    
}
