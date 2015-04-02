package proyectofitness;

import java.util.HashMap;

/**
 *
 * @author callow
 */
public class Medicion {

    private final String unidadMedida;
    private double valor;
    public static final HashMap<String, String> unidades = new HashMap(){
        {
        unidades.put("Estatura", "metros");
        unidades.put("Peso", "kilogramos");
        unidades.put("Pliegues Triceps", "milimetros");
        unidades.put("Pliegues Subescapular", "milimetros");
        unidades.put("Pliegues Abdomen", "milimetros");
        unidades.put("Pliegues Muslo", "milimetros");
        unidades.put("Pliegues Pantorrilla", "milimetros");
        unidades.put("Pliegues Pectoral", "milimetros");
        unidades.put("Circunferencia Cuello", "centimetros");
        unidades.put("Circunferencia Biceps der", "centimetros");
        unidades.put("Circunferencia Biceps izq", "centimetros");
        unidades.put("Circunferencia Pectoral", "centimetros");
        unidades.put("Circunferencia Espalda", "centimetros");
        unidades.put("Circunferencia Cintura 1", "centimetros");
        unidades.put("Circunferencia Cintura 2", "centimetros");
        unidades.put("Circunferencia Cintura 3", "centimetros");
        unidades.put("Circunferencia Cadera", "centimetros");
        unidades.put("Circunferencia Muslo der", "centimetros");
        unidades.put("Circunferencia Muslo izq", "centimetros");
        unidades.put("Circunferencia Pantorrilla der", "centimetros");
        unidades.put("Circunferencia Pantorrilla izq", "centimetros");
        unidades.put("Frecuencia Cardiaca", "Latidos por minuto");
        unidades.put("Presion Arterial Sistolica", "mm de mercurio");
        unidades.put("Presion Arterial Diastolica", "mm de mercurio");

        }
    };

    public Medicion(String nombre, double valor) throws Exception {
        try {
            this.unidadMedida = unidades.get(nombre);
        }
        catch (Exception e) {
            throw new Exception("Nombre de medicion no es valido.");
        }
        this.valor = valor;
    }

    public String getUnidadMedida() {
        return unidadMedida;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public String toString(){
        return valor + " " + unidadMedida;
    }
}
