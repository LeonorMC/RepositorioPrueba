package ArrayMD;

/* @author LMC */

public class AMD6 {

    public static void main(String[] args) {
        // Crear y cargar una tabla de tamaño 10x10, 
        //mostrar la suma de cada fila y de cada columna.
        
        int[][] array6 = new int[10][10];
        int suma = 0;
        
        for (int i = 0; i < array6.length; i++){
            for(int j = 0; j < array6.length; j++){
                array6[i][j] = (int) (Math.random() * 10);
            }
        }
        
        for (int i = 0; i < array6.length; i++){
            for (int j= 0; j < array6.length; j++){
                System.out.print(array6[i][j] + " ");
            }
            System.out.println();
        }
        
        System.out.println("---------------------------");
        
        for (int i = 0; i < array6.length; i++){
            for (int j = 0; j < array6.length; j++){
                suma += array6[i][j];
            }
            System.out.println("La suma de la fila " + i + " es igual a " + suma);
            suma = 0;
        }
        
        System.out.println("---------------------------");
        
        for (int i = 0; i < array6.length; i++){
            for (int j = 0; j < array6.length; j++){
                suma += array6[j][i];
            }
            System.out.println("La suma de la columna " + i + " es igual a " + suma);
            suma = 0;
        }
        
    }
    
}
