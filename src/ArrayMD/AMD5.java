package ArrayMD;

/* @author LMC */

public class AMD5 {

    public static void main(String[] args) {
        //Crear una tabla de tamaño 7x7 y rellenarla 
        //de forma que los elementos de la diagonal principal 
        //sean 1 y el resto 0. A ese tipo de matrices se les 
        //llama Matriz Identidad.
        
        int[][] array5 = new int[7][7];
        
        for (int i = 0; i < array5.length; i++){
            array5[i][i] = 1;
        }
        
        for (int i = 0; i < 7; i++){
            for (int j= 0; j < 7; j++){
                System.out.print(array5[i][j] + " ");
                
            }
            System.out.println();
        }
    }
    
}
