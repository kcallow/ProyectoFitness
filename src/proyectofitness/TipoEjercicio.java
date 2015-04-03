package proyectofitness;

public class TipoEjercicio {
    private String descripcion;
    private String maquina;

    public TipoEjercicio(String descripcion, String maquina) throws Exception {
        if(!ProyectoFitness.maquinas.containsKey(maquina))
            throw new Exception("Maquina no existe para tipo de ejercicio");
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

    public void setTipoMaquina(String maquina) throws Exception {
        if(!ProyectoFitness.maquinas.containsKey(maquina))
            throw new Exception("Maquina no existe para tipo de ejercicio");
        this.maquina = maquina;
    }

    @Override
    public String toString() {
        return descripcion + ".  Usa: " + maquina;
    }

    public String toCommand() {
        return descripcion + "\n" + maquina + "\n";
    }

}
