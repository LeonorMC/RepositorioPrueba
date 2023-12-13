package cuenta1;

public class historiacuenta1 {

    public static void main(String[] args) {
        Cuenta c1 = new Cuenta(1, 100);
        c1.depositar(50);
        System.out.println(c1.saldo);
        c1.retirar(50);
        System.out.println(c1.saldo);
        
        Cuenta c2 = new Cuenta(2, c1.saldo);
        System.out.println(c2.saldo);
    }
    
}
