package Bicijava;

public class BiciC {
    private int numPlatos = 3;
    private int numPiñon = 11;
    private double velocidadActual = 1;
    private int platoActual = 0;
    private int piñonActual = 0;
    
    public BiciC (double velocidadActual, int platoActual, int piñonActual){
        setVelocidadActual (velocidadActual);
        setPlatoActual (platoActual);
        setPiñonActual (piñonActual);
    }
    
    public int getNumPlatos(){
        return numPlatos;
    }
    
    public void setNumPlatos(int numPlatos){
        if (numPlatos > 0)
        this.numPlatos = numPlatos;
    }
    
    public int getNumPiñon(){
        return numPiñon;
    }
    
    public void setNumPiñon(int numPiñon){
        if (numPiñon > 0)
        this.numPiñon = numPiñon;
    }
    
    public double getVelocidadActual(){
        return velocidadActual;
    }
    
    public void setVelocidadActual(double velocidad){
        if (velocidad > 0)
        this.velocidadActual = velocidad;
    }
    
    public int getPlatoActual(){
        return platoActual;
    }
    
    public void setPlatoActual(int platoActual){
        if (platoActual > 0)
        this.platoActual = platoActual;
    }
    
    public int getPiñonActual(){
        return piñonActual;
    }
    
    public void setPiñonActual(int piñonActual){
        if (piñonActual > 0)
        this.piñonActual = piñonActual;
    }
    
    public void ponerEnMarcha(){
        velocidadActual = 1;
    }
    
    public void acelerar (){
        if (velocidadActual == 0){
            ponerEnMarcha();
        }
        else{
            velocidadActual *= 2;
        }
    }
    
    public void frenar (){
        if (velocidadActual < 1){
            velocidadActual = 0;
        }
        else{
            velocidadActual /= 2;
        }
    }
    
    public void cambiarPlato (int plato){
        platoActual = plato;
    }
    
    public void cambiarPiñon (int piñon){
        piñonActual = piñon;
    }
    @Override
    public StringtoString(){
        return "Bicicleta"
                + " numPlatos = " + numPlatos + "numPiñones = " + numPiñon 
    }

}