package proyectofitness;

public class Ejercicio implements Comparable<Ejercicio>{
    private TipoEjercicio tipoEjercicio;   
    private int numero, series, repeticiones, peso1, peso2, peso3, tiempoDescanso;

    @Override
    public int compareTo(Ejercicio ejercicioAComparar) {
        return numero - ejercicioAComparar.getNumero();
    }

    public Ejercicio(String nombreTipoEjercicio, int numero, int series, int repeticiones, int peso1, int peso2, int peso3, int tiempoDescanso) throws Exception {
        try {
            this.tipoEjercicio = TipoEjercicio.getTipoEjercicio(nombreTipoEjercicio);
            this.numero = numero;
            this.series = series;
            this.repeticiones = repeticiones;
            this.peso1 = peso1;
            this.peso2 = peso2;
            this.peso3 = peso3;
            this.tiempoDescanso = tiempoDescanso;
        } catch (Exception ex) {
            throw ex;
        }
    }

    public TipoEjercicio getTipoEjercicio() {
        return tipoEjercicio;
    }

    public void setTipo(TipoEjercicio tipoEjercicio) {
        this.tipoEjercicio = tipoEjercicio;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public int getRepeticiones() {
        return repeticiones;
    }

    public void setRepeticiones(int repeticiones) {
        this.repeticiones = repeticiones;
    }

    public int getPeso1() {
        return peso1;
    }

    public void setPeso1(int peso1) {
        this.peso1 = peso1;
    }

    public int getPeso2() {
        return peso2;
    }

    public void setPeso2(int peso2) {
        this.peso2 = peso2;
    }

    public int getPeso3() {
        return peso3;
    }

    public void setPeso3(int peso3) {
        this.peso3 = peso3;
    }

    public int getTiempoDescanso() {
        return tiempoDescanso;
    }

    public void setTiempoDescanso(int tiempoDescanso) {
        this.tiempoDescanso = tiempoDescanso;
    }
}
