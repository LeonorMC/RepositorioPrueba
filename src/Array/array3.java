package Array;

import java.util.Arrays;
import java.util.Random;

public class array3 {

    public static void main(String[] args) {
        
        Random azar = new Random();
        
        int[] num1 = new int [10];
        int[] num2 = new int [10];
        
        for (int i = 0; i < 10; i++){
            num1[i] = azar.nextInt(20)+1;
            num2[i] = azar.nextInt(20)+1;
        }
        
        int[] numr = new int [10];
        
        for (int i = 0; i < 10; i++){
            numr[i] = num1[i] + num2[i];
        }
        
        System.out.println(Arrays.toString(num1));
        System.out.println(Arrays.toString(num2));
        System.out.println(Arrays.toString(numr));
        
    }
    
}
