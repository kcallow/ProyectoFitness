package proyectofitness;

import static java.lang.Math.log;
import java.util.HashMap;

public class Mediciones extends HashMap<String, Double> {
    
    @Override
    public String toString(){
        String resultado = "";
        for(String nombre : this.keySet())
            resultado += nombre + ": " + get(nombre).toString() + ",";
        return resultado;
    }

    String toCommand(String cedula, String fechaCreacion) {
        String resultado = "#Agregando mediciones del "+ fechaCreacion +" a usuario " + cedula + "...\n";
        for(String nombre : this.keySet())
            resultado += "#Agregando medicion '" + nombre + "', con valor" + get(nombre) + "\n"
                    + "agregar medicion\n"
                    + cedula + "\n"
                    + fechaCreacion + "\n"
                    + nombre + "\n" 
                    + get(nombre) + "\n";
        return resultado;
    }

    public Double getPorcentajeGrasaCorporal() {
        Double estatura = get("Estatura");
        Double peso = get("Peso");
        System.out.println(peso + " " + " " + estatura + " " + peso / estatura / estatura);
        return peso / estatura / estatura;
    }

    public Double getPorcentajeMasaMuscular() {
        Double estatura = get("Estatura");
        Double cintura = get("Circunferencia Cintura 1");
        Double cuello = get("Circunferencia Cuello");
        Double resultado = 0.0;
        try{
                resultado = 495/(1.0324-0.19077*(log(cintura-cuello))+0.15456*(log(estatura)))-450;
        } 
        catch (Exception e) { }
        System.out.println(estatura + " " + cintura + " " + cuello + " " + resultado);
        return resultado;
    }

    public Integer getFrecuenciaCardiaca(Integer edad) {
        return 220 - edad;
    }

    public Double getRelacionCinturaCadera() {
        Double cintura = get("Circunferencia Cintura 1");
        Double cadera = get("Circunferencia Cadera");
        return cintura / cadera;
    }
    
}
