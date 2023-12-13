package ArrayMD;

/* @author LMC */

public class AMD4 {

    public static void main(String[] args) {
        //Crear y cargar una tabla de tamaño 3x3, 
        //trasponerla y mostrarla.
        
        int[][] array4 = new int[3][3];
        
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
            for (int j= 0; j < array4.length; j++){
                System.out.print(array4[j][i] + " ");
            }
            System.out.println();
        }
        
    }
    
}
