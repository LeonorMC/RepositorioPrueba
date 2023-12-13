package Bicijava;

public class BiciMC {

    public static void main(String[] args) {
        BiciC bici1 = new BiciC(1, 1, 1); 
        System.out.println("Nº platos: " + bici1.getNumPlatos());
        
        bici1
                
        bici1.acelerar();
        System.out.println(bici1.velocidadActual);
        bici1.cambiarPlato(-3);
        System.out.println("Bici: plato --> " + bici1.piñonActual);
        
        bici1.frenar();
        System.out.println(bici1);
        
        bici1
    }
    
}
