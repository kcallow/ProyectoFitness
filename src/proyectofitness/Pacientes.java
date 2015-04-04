package proyectofitness;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class Pacientes extends HashMap<Cedula, Paciente> {
    @Override
    public String toString(){
        String resultado = "";
        for(Cedula cedula : this.keySet())
            resultado += cedula + get(cedula).toString() + "\n";
        return resultado;
    }

    public String toCommand() {
        String resultado = "#Agregando a todos los pacientes...\n";
        for(Cedula cedula : this.keySet())
            resultado += get(cedula).toCommand(cedula.getCedula()) + "\n";
        return resultado;
    }

    public void borrarEjerciciosDeTipos(ArrayList<String> tiposEjercicio) {
        for(String tipoEjercicio : tiposEjercicio)
            borrarEjerciciosDeTipo(tipoEjercicio);
    }
    
    public void borrarEjerciciosDeTipo(String tipoEjercicio) {
        for(Paciente paciente : values())
            if(paciente.getProgramaEntrenamiento() != null)
                for(Dia dia : paciente.getProgramaEntrenamiento().values())
                    for(Iterator<Entry<Integer, Ejercicio>> iterator = dia.entrySet().iterator(); iterator.hasNext();){
                        String tipoActual = iterator.next().getValue().getTipoEjercicio();
                        if(tipoActual.equals(tipoEjercicio))
                            iterator.remove();
            }
    }
}
