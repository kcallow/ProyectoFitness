package proyectofitness;

import java.util.HashMap;

public class Mediciones extends HashMap<String, Double> {
    @Override
    public String toString(){
        String resultado = "";
        for(String nombre : this.keySet())
            resultado += nombre + ": " + get(nombre).toString() + "\n";
        return resultado;
    }
}
