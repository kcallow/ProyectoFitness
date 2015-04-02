package proyectofitness;

public class TipoEjercicio {
    private String descripcion;
    private String maquina;

    public TipoEjercicio(String descripcion, String maquina) {
        this.descripcion = descripcion;
        this.maquina = maquina;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTipoMaquina() {
        return maquina;
    }

    public void setTipoMaquina(String maquina) {
        this.maquina = maquina;
    }

    @Override
    public String toString() {
        return descripcion + ".  Usa: " + maquina;
    }

}
