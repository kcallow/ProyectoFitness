package proyectofitness;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class TiposEjercicio extends HashMap<String,TipoEjercicio> {
    @Override
    public String toString(){
        String resultado = "";
        for(String nombre : keySet())
            resultado += nombre + get(nombre).toString() + "\n";
        return resultado;
    }

    public String toCommand(){
        String resultado = "#Agregando tipos de ejercicio del sistema...\n";
        for(String nombre : keySet())
            resultado += "#Agregando tipo de ejercicio: " + nombre + "...\n"
                    + "agregar tipo-ejercicio\n" 
                    + nombre + "\n" 
                    + get(nombre).toCommand() + "\n";
        return resultado;
    }

    public void updateTipoMaquina(String nombreViejo, String nombreNuevo) throws Exception {
        for(TipoEjercicio tipoEjercicio : values())
            if(tipoEjercicio.getTipoMaquina().equals(nombreViejo))
                tipoEjercicio.setTipoMaquina(nombreNuevo);
    }

    public void borrarTiposConMaquina(String nombreMaquina) {
        for (Iterator<Map.Entry<String, TipoEjercicio>> iterator = entrySet().iterator(); iterator.hasNext();){
            String nombreActual = iterator.next().getValue().getTipoMaquina();
            if(nombreActual.equals(nombreMaquina))
                iterator.remove();
        }

    }
    
}
