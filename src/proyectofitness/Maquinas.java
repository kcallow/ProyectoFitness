package proyectofitness;

import java.util.HashMap;

public class Maquinas extends HashMap<String,String> {
    @Override
    public String toString(){
        String resultado = "";
        for(String nombre : this.keySet())
            resultado += nombre + ": " + get(nombre).toString() + "\n";
        return resultado;
    }
}
