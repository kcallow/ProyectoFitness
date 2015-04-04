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

    String toCommand(String cedula) {
        String resultado = "#Agregando mediciones a usuario " + cedula + "...\n";
        for(String nombre : this.keySet())
            resultado += "#Agregando medicion '" + nombre + "', con valor" + get(nombre) + "\n"
                    + "agregar medicion\n"
                    + cedula + "\n"
                    + nombre + "\n" 
                    + get(nombre) + "\n";
        return resultado;
    }
}
