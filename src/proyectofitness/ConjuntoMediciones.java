package proyectofitness;

import java.time.LocalDate;
import java.util.HashMap;
import static proyectofitness.ProyectoFitness.formatoFecha;

public class ConjuntoMediciones  extends HashMap<LocalDate, Mediciones> {
    
    public String toCommand(String cedula){
        String resultado = "";
        for (LocalDate fechaMedicion : keySet())
            resultado += "agregar mediciones" + "\n"
                    + cedula + "\n"
                    + fechaMedicion.format(formatoFecha) + "\n" 
                    + get(fechaMedicion).toCommand(cedula,fechaMedicion.format(formatoFecha)) + "\n";
        return resultado;
    }
    
}
