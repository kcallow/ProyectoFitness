package proyectofitness;

import java.util.HashMap;

/**
 *
 * @author callow
 */
public class Medicion {

    private final String nombre, unidadMedida;
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
    
    

    public Medicion(String nombre, double valor) {
        this.nombre = nombre;
        this.unidadMedida = unidades.get(nombre);
        this.valor = valor;
        }
    
    

    public Medicion(String nombre) {
        //Si no se da el valor, se inicializa a 0
        this(nombre, 0);
    }

    public String getNombre() {
        return nombre;
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
}
