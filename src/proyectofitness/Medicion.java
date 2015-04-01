package proyectofitness;

/**
 *
 * @author callow
 */
public class Medicion {
<<<<<<< HEAD
    
    
    
=======

    private final String nombre, unidadMedida;
    private int valor;

    public Medicion(String nombre, String unidadMedida, int valor) {
        this.nombre = nombre;
        this.unidadMedida = unidadMedida;
        this.valor = valor;
    }

    public Medicion(String nombre, String unidadMedida) {
        //Si no se da el valor, se inicializa a 0
        this(nombre, unidadMedida, 0);
    }

    public String getNombre() {
        return nombre;
    }

    public String getUnidadMedida() {
        return unidadMedida;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
>>>>>>> 4636cd7e1fc05af967c9e6504d4b80aa5011404c
}
