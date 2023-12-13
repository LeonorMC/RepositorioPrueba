package ArrayMD;

/* @author LMC */

public class AMD8 {

    public static void main(String[] args) {
        //Crear una matriz “marco” de tamaño 8x6: 
        //todos sus elementos deben ser 0 salvo los de 
        //los bordes que deben ser 1. Mostrarla.
        
        int[][] array8 = new int[8][6];
        
        for (int i = 0; i < array8.length; i++){
            for(int j = 0; j < array8[i].length; j++){
                if (i == 0 || i == (array8.length - 1)){
                    array8[i][j] = 1;
                }
                if (j == 0 || j == (array8[i].length - 1)){
                    array8[i][j] = 1;
                }
            }
        }
        
        for (int i = 0; i < array8.length; i++){
            for (int j= 0; j < array8[i].length; j++){
                System.out.print(array8[i][j] + " ");
            }
            System.out.println();
        }
        
    }
    
}