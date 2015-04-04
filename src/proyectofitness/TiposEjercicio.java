package proyectofitness;

import java.util.HashMap;

public class TiposEjercicio extends HashMap<String,TipoEjercicio> {
    @Override
    public String toString(){
        String resultado = "";
        for(String nombre : this.keySet())
            resultado += nombre + get(nombre).toString() + "\n";
        return resultado;
    }

    public String toCommand(){
        String resultado = "#Agregando tipos de ejercicio del sistema...\n";
        for(String nombre : this.keySet())
            resultado += "#Agregando tipo de ejercicio: " + nombre + "...\n"
                    + "agregar tipo-ejercicio\n" 
                    + nombre + "\n" 
                    + get(nombre).toCommand() + "\n";
        return resultado;
    }

    void updateNombreMaquina(String nombreViejo, String nombreNuevo) throws Exception {
        for(TipoEjercicio tipoEjercicio : this.values())
            if(tipoEjercicio.getTipoMaquina().equals(nombreViejo))
                tipoEjercicio.setTipoMaquina(nombreNuevo);
    }
    
}
