package Ejerciciostema2;

import java.util.Scanner;

public class Ejercicio7 {

    public enum Meses {ENERO,FEBRERO,MARZO,ABRIL,MAYO,JUNIO,JULIO,AGOSTO,SEPTIEMBRE,OCTUBRE,NOVIEMBRE,DICIEMBRE};
    
    public static void main(String[] args) {
        
        Meses m = Meses.MARZO;
        
        System.out.println(m);
        
        String mes= "MARZO";
        Meses.valueOf(mes);
        
        System.out.println(mes);
        
    }
    
}