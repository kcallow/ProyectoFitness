package proyectofitness;

import static java.lang.Math.log;
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

    public double getPorcentajeGrasaCorporal() {
        Double estatura = get("Estatura");
        Double peso = get("Peso");
        return peso / estatura / estatura;
    }

    public double getPorcentajeMasaMuscular() {
        Double estatura = get("Estatura");
        Double cintura = get("Circunferencia Cintura 1");
        Double cuello = get("Circunferencia Cuello 1");
        return 495/(1.0324-0.19077*(log(cintura-cuello))+0.15456*(log(estatura)))-450;
    }

    public double getFrecuenciaCardiaca(Integer edad) {
        return 220 - edad;
    }

    public double getRelacionCinturaCadera() {
        Double cintura = get("Circunferencia Cintura 1");
        Double cadera = get("Circunferencia Cadera");
        return cintura / cadera;
    }
    
}
