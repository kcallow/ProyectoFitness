package proyectofitness;

import java.util.HashMap;

public class TiposMedicion extends HashMap<String,String> {
    public TiposMedicion() {
        super();
        fill();
    }
    @Override
    public String toString(){
        String resultado = "";
        for(String nombre : this.keySet())
            resultado += nombre + get(nombre) + "\n";
        return resultado;
    }

    private void fill() {
        put("Estatura", "metros");
        put("Peso", "kilogramos");
        put("Pliegues Triceps", "milimetros");
        put("Pliegues Subescapular", "milimetros");
        put("Pliegues Abdomen", "milimetros");
        put("Pliegues Muslo", "milimetros");
        put("Pliegues Pantorrilla", "milimetros");
        put("Pliegues Pectoral", "milimetros");
        put("Circunferencia Cuello", "centimetros");
        put("Circunferencia Biceps der", "centimetros");
        put("Circunferencia Biceps izq", "centimetros");
        put("Circunferencia Pectoral", "centimetros");
        put("Circunferencia Espalda", "centimetros");
        put("Circunferencia Cintura 1", "centimetros");
        put("Circunferencia Cintura 2", "centimetros");
        put("Circunferencia Cintura 3", "centimetros");
        put("Circunferencia Cadera", "centimetros");
        put("Circunferencia Muslo der", "centimetros");
        put("Circunferencia Muslo izq", "centimetros");
        put("Circunferencia Pantorrilla der", "centimetros");
        put("Circunferencia Pantorrilla izq", "centimetros");
        put("Frecuencia Cardiaca", "Latidos por minuto");
        put("Presion Arterial Sistolica", "mm de mercurio");
        put("Presion Arterial Diastolica", "mm de mercurio");
    }
}
