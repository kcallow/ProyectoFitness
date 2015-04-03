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
            result += numeroDia + ": "+ get(numeroDia).toString() + "\n";
        return result;
    }
    
    public String toCommand(String cedula) {
        String result = "#Agregando el programa de entrenamiento de " + cedula + "...\n";
        for (Integer numeroDia : keySet())
            result += "#Agregando dia #" + numeroDia + "\n"
                    + "agregar dia\n" 
                    + cedula + "\n" 
                    + numeroDia + "\n"
                    + get(numeroDia).toCommand(cedula) + "\n"; 
        return result;
    }
}
