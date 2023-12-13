package FEDERICO;

public class Persona {
    private String nombre;
    private boolean vigilia;
    
    public Persona (String nombre){
        this.vigilia = false;
        this.nombre = nombre;
    }
    public void oyeMaullido (Gato g) {
        this.vigilia = true;
        System.out.println("Zapatazo");
        g.zapato();
        this.vigilia = false;
    }
    
}