package ArrayMD;

import java.util.Arrays;
import java.util.Scanner;

/* @author LMC */

public class AMD10 {

    public static void main(String[] args) {
        //Crea una matriz irregular que almacene los nombres de los alumnos de tu grupo de clase. 
        //Observa que hay 4 hileras de mesas de distinta longitud.
        
        /*
        Scanner tl = new Scanner(System.in);
        
        String[][] alumnos = new String[4][];
        alumnos[0] = new String[8];
        alumnos[1] = new String[7];
        alumnos[2] = new String[7];
        alumnos[3] = new String[6];
        
        for (int i=0; i < alumnos.length; i++){
            for (int j = 0; j < alumnos[i].length; j++){
                System.out.println("Nombre alumno mesa " + i + " silla " + j);
                alumnos[i][j] = tl.nextLine();
            }
        }
        
        for (String[] s : alumnos){
            System.out.println(Arrays.toString(s));
        }
        */
        
        String[] fila1 = {"Laura", "Daniel", "Manuel", "Rubén", "Juan Luis", "Diego", "Darío", "Brenda"};
        String[] fila2 = {"David", "Alejandro", "Mario", "Lisandro", "Jorge", "Daniel", "Hugo"};
        String[] fila3 = {"Joel", "Alejandro", "Nerea", "Franshesca", "Iván", "Carlos", "Cristhoper"};
        String[] fila4 = {"Raúl", "David", "Carlos", "Marcos", "Patricia", "Leonor"};
        
        String[][] alumnos = new String[4][];
        alumnos[0] = fila1;
        alumnos[1] = fila2;
        alumnos[2] = fila3;
        alumnos[3] = fila4;
        
        for (String[] s : alumnos){
            System.out.println(Arrays.toString(s));
        }
        
    }
    
}