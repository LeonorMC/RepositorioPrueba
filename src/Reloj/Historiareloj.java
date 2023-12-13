package Reloj;

public class Historiareloj {

    public static void main(String[] args) {
        reloj r1 = new reloj ();
        reloj r2 = new reloj (20, 15, 36);
        reloj r3 = new reloj (86399);

        System.out.println("RELOJ POR DEFECTO" + r1.toString());
        System.out.println("RELOJ DEFINIDO" + r2.toString());
        System.out.println("RELOJ DADO EN SEGUNDOS" + r3.toString());
        
        System.out.println("CONTADOR");
        
        for (int i = 0; i < 60; i++){
            r1.tick();
            r2.tick();
            r3.tick();
            
            System.out.println(r1.toString() + ":" + r2.toString() + ":" + r3.toString());
        }
    }
    
}
