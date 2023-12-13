package ArrayMD;

/* @author LMC */

public class AMD9 {

    public static void main(String[] args) {
        //Hacer lo mismo que el ejercicio anterior, 
        //pero con una matriz 9x9x9. Creamos un cubo con 
        //las caras puestas a 1 y el interior a 0. 
        
        int[][][] array9 = new int[9][9][9];
        
        for (int i = 0; i < array9.length; i++){
            for(int j = 0; j < array9[i].length; j++){
                for(int k = 0; k < array9[i][j].length; k++){
                    if (i == 0 || i == (array9.length - 1) || j == 0 || j == (array9[i].length - 1) || k == 0 || k == (array9[i][j].length - 1)){
                        array9[i][j][k] = 1;
                    }
                }
            }
        }
        
        for (int i = 0; i < array9.length; i++){
            for (int j= 0; j < array9[i].length; j++){
                for (int k= 0; k < array9[i][j].length; k++){
                    System.out.print(array9[i][j][k] + " ");
                }
                System.out.println();
            
            }
            System.out.println();
            
        }
        
    }
    
}
