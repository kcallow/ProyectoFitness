package proyectofitness;

import java.util.HashMap;

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
}
