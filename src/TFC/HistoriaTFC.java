package TFC;

import java.time.LocalDate;

public class HistoriaTFC {

    public static void main(String[] args) {
        TFC t1 = new TFC();
        t1.setNombre("nombre");
        t1.setApellido1("apellido1");
        
        TFC t2 = new TFC("nombre", "apellido1", "apellido2");
        t2.setTrabajo("trabajo");
        
        TFC t3 = new TFC ("nombre", "apellido1", "apellido2", "trabajo", "resumen", LocalDate.of(2023,11,02));
    }
    
}
