package proyectofitness;

import java.util.HashMap;

public class Dia extends HashMap<Integer,Ejercicio>{
    @Override
    public String toString(){
        String resultado = "";
        for(Integer numeroEjercicio : this.keySet())
            resultado += numeroEjercicio + ": " + get(numeroEjercicio).getTipoEjercicio() + ".  ";
        return resultado;
    }

    public String toCommand(String cedula, Integer numeroDia) {
        String resultado = "#Agregando ejercicios a " + cedula + "...\n";
        for(Integer numeroEjercicio : this.keySet())
            resultado += "#Agregando ejercicio #" + numeroEjercicio + ":  " + get(numeroEjercicio).getTipoEjercicio() + "\n"
                    + "agregar ejercicio\n" 
                    + cedula + "\n" 
                    + numeroDia + "\n"
                    + numeroEjercicio + "\n" 
                    + get(numeroEjercicio).toCommand() + "\n";
        return resultado;
    }
}
