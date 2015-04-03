package proyectofitness;

import java.util.HashMap;

public class Maquinas extends HashMap<String,String> {
    @Override
    public String toString(){
        String resultado = "";
        for(String nombre : this.keySet())
            resultado += nombre + ": " + get(nombre) + "\n";
        return resultado;
    }

    public String toCommand() {
        String resultado = "#Agregando todas las maquinas al sistema...\n";
        for(String nombre : this.keySet())
            resultado += "#Agregando maquina: " + nombre + "...\n"
                    + "agregar maquina\n" 
                    + nombre + "\n" 
                    + get(nombre) + "\n";
        return resultado;
    }
}
