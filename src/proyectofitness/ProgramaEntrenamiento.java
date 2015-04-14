package proyectofitness;

import java.time.LocalDate;
import java.util.HashMap;

public class ProgramaEntrenamiento extends HashMap<Integer, Dia> {
    private LocalDate fechaCreacion, fechaInicio, fechaFin;
    private String descripcion, objetivos;
    private Integer asistencia;
    
    public ProgramaEntrenamiento(LocalDate fechaCreacion, LocalDate fechaInicio, LocalDate fechaFin, String descripcion, String objetivos){
        this.fechaCreacion = fechaCreacion;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        setDescripcion(descripcion);
        setObjetivos(objetivos);
        asistencia = 0;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    @Override
    public String toString(){
        String result = "";
        for (Integer numeroDia : keySet())
            result += numeroDia + ". "+ get(numeroDia).toString() + "\n";
        return result;
    }
    
    public String toCommand(String cedula) {
        String result = "#Agregando el programa de entrenamiento de " + cedula + "...\n"
                + "agregar programa\n"
                + cedula + "\n"
                + fechaCreacion.format(ProyectoFitness.formatoFecha) + "\n"
                + fechaInicio.format(ProyectoFitness.formatoFecha) + "\n"
                + fechaFin.format(ProyectoFitness.formatoFecha) + "\n"
                + descripcion + "\n"
                + objetivos + "\n";
                
        for (Integer numeroDia : keySet())
            result += "#Agregando dia #" + numeroDia + "\n"
                    + "agregar dia\n" 
                    + cedula + "\n" 
                    + numeroDia + "\n"
                    + get(numeroDia).toCommand(cedula, numeroDia) + "\n"; 
        return result;
    }

    @Override
    public void clear() {
        super.clear();
        fechaCreacion = fechaInicio = fechaFin = null;
        descripcion = objetivos = null;
        setAsistencia(null);
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion.replace("\n", "  ");
    }

    public String getObjetivos() {
        return objetivos;
    }

    public void setObjetivos(String objetivos) {
        this.objetivos = objetivos.replace("\n", "  ");
    }

    public int getAsistencia() {
        return asistencia;
    }

    public void setAsistencia(Integer asistencia) {
        this.asistencia = asistencia;
    }

}
