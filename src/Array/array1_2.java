package Array;

import java.util.Scanner;

public class array1_2 {

    public static void main(String[] args) {
        Scanner tl = new Scanner (System.in);
        
        int [] nums = new int [6];
        System.out.println("Indique 6 números");
        
        for (int i = 0; i < nums.length; i++){
            nums [i] = tl.nextInt();
        }
        for (int i = 0; i < nums.length; i++){
            System.out.print(nums[i] + " ");
        }
        
        tl.nextLine();
        tl.nextLine();
        
        String [] cads = new String [6];
        System.out.println("Indique 6 cadenas");
        
        for (int i = 0; i < cads.length; i++){
            cads [i] = tl.nextLine();
        }
        for (int i = 0; i < cads.length; i++){
            System.out.print(cads[i] + " ");
        }
        
        tl.nextLine();
        
        char [] cars = new char [6];
        System.out.println("Indique 6 caracteres");
        
        for (int i = 0; i < cars.length; i++){
            cars [i] = tl.nextLine().charAt(0);
        }
        for (int i = 0; i < nums.length; i++){
            System.out.print(cars[i] + " ");
        }
        
    }
    
    public static String longitudMax (String[] cads){
        
        /*
        int longitud = 0;
        String max = null;
        for(int i = 0; i < cads.length; i++){
            if (cads[i].length() > longitud){
                longitud = cads[i].length();
                max = cads[1];
            }
        }
        
        return max;
        */
        
        String palabra = "";
        for (String s : cads){
            if (s.length() > palabra.length()){
                palabra = s;
            }
        }
        return palabra;
        
               
    }
    
}
