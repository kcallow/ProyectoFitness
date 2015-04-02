package proyectofitness;

import java.util.HashMap;

public class Dia extends HashMap<Integer,Ejercicio>{
    @Override
    public String toString(){
        String resultado = "";
        for(Integer numeroEjercicio : this.keySet())
            resultado += numeroEjercicio + get(numeroEjercicio).toString() + "\n";
        return resultado;
    }
}
