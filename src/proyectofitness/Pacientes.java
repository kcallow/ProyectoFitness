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
}
