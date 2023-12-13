package Reloj;

public class reloj {
    
    private int horas;
    private int minutos;
    private int segundos;
    
    public reloj (int horas, int minutos, int segundos){
        setHoras(horas);
        setMinutos(minutos);
        setSegundos(segundos);
    }
    
    public reloj () {
    this.horas = 0;
    this.minutos = 0;
    this.segundos = 0;
    }
    
    public reloj (int segundosEnBruto){
        ponerEnHora(segundosEnBruto);
    }
    
    public void ponerEnHora(int segundos){
        this.horas = (segundos / 3600) % 24;
        segundos %= 3600;
        this.minutos = segundos / 60;
        this.segundos = segundos % 60;
    }
    
    public int getHoras(){
        return horas;
    }
    
    public int getMinutos(){
        return minutos;
    }
    
    public int getSegundos(){
        return segundos;
    }    
    
    public void setHoras (int horas){
        if (horas >= 0 && horas <= 23){
            this.horas = horas;
        }
    }
    
    public void setMinutos (int minutos){
        if (minutos >= 0 && minutos <= 59){
            this.minutos = minutos;
        }
    }
    
    public void setSegundos (int segundos){
        if (segundos >= 0 && segundos <= 59){
            this.segundos = segundos;
        }
    }
    
    public void tick (){
        segundos ++;
        if (segundos >= 60){
            segundos = 0;
            minutos ++;
            if (minutos >= 60){
                segundos = 0;
                minutos = 0;
                horas ++;
                if (horas >= 24){
                    horas = 0;
                }
            }
        }    
    }
    
    @Override
    public String toString(){
        return horas + ":" + minutos + ":" + segundos;
    }
}
