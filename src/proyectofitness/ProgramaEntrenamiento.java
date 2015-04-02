package proyectofitness;

import java.time.LocalDate;
import java.util.HashMap;

public class ProgramaEntrenamiento extends HashMap<Integer, Dia> {
    private LocalDate fechaCreacion;
    
    public ProgramaEntrenamiento(){
        fechaCreacion = LocalDate.now();
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    @Override
    public String toString(){
        String result = "";
        for (Integer numeroDia : keySet())
            result += numeroDia + get(numeroDia).toString() + "\n";
        return result;
    }
}
