package Juego;

public class ficha {
    
    private int posicion;
    
    public void ficha(){
        
    }
    public int getPosicion(){
        return this.posicion;
    }
    public void setPosicion (int posicion){
        if (posicion >= 0){
            this.posicion = posicion;
        }
    }
    
    public void avanzar(){
        this.posicion ++;
    }
    public void retroceder(){
        if (this.posicion > 0){
            this.posicion ++;
        }
        public void saltos (int numSaltos){
            this.posicion += numSaltos;
        }
    }
        
    @Override
    public String 
}
