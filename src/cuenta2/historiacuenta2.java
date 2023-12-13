package cuenta2;

import cuenta1.Cuenta;

public class historiacuenta2 {

    public static void main(String[] args) {
        Cuenta c1 = new Cuenta(1, 200);
        Cuenta c2 = new Cuenta(2, 300);
        
        System.out.println("ANTES");
        System.out.println(c1.toString());
        System.out.println(c2.toString());
        System.out.println("DESPUÉS");
        
        c1.transferencia2(c2, 100);
        System.out.println(c1.toString());
        System.out.println(c2.toString());
        
        c1.transferencia2(c2, 100);
        
    }
}
