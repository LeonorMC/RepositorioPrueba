package cuenta1;

public class Cuenta {
    double saldo;
    int numCuenta;
    
    public Cuenta(int cuenta, double inicial) {
        this.numCuenta = cuenta;
        this.saldo = inicial;
    }
    
    double saldo(){
        return this.saldo;
    }
    
    void depositar (double cantidad){
        this.saldo = this.saldo + cantidad;
    }
    void retirar (double cantidad){
        this.saldo = this.saldo - cantidad;
    }
    
    public void transferencia (Cuenta c2, double cantidad){
        if (cantidad <= this.saldo){
            this.saldo -= cantidad;
            this.saldo += cantidad;
        }
    }
    public void transferencia2 (Cuenta c2, double cantidad){
        if (cantidad <= this.saldo){
            this.retirar(cantidad);
            this.depositar(cantidad);
        }
    }
    @Override
    public String toString(){
        return ("La cuenta " + this.numCuenta + "tiene un saldo de " + this.saldo + " euros");
    }
}
