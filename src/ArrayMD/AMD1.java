package ArrayMD;

/* @author LMC */

public class AMD1 {

    public static void main(String[] args) {
        // Crear una tabla bidimensional M de tamaño 5x5 y 
        //rellenarla de la siguiente forma: 
        //la posición M [ i , j ] debe contener i+j. 
        //Después se debe mostrar su contenido.
               
        int[][] array1 = new int[5][5];

        for (int i = 0; i < array1.length; i++){
            for(int j = 0; j < array1.length; j++){
                array1 [i][j] = (i + j);
            }

        }
        for (int i = 0; i < array1.length; i++){
            for (int j= 0; j < array1.length; j++){
                System.out.print(array1[i][j] + " ");
            }
            System.out.println();
        }
        
    }
    
}
