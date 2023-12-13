package FEDERICO;

public class Gato {
    private String nombre;
    private boolean vigilia;
    
    public Gato (String nombre){
        this.vigilia = true;
        this.nombre = nombre;
    }
    public void maulla (Persona p) {
        System.out.println("Miauuuuuu");
        p.oyeMaullido(this);
    }
    public void zapato(){
        System.out.println("Chof");
        this.vigilia = false;
    }
    
}
