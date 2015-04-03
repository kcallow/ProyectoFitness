package proyectofitness;

import java.time.LocalDate;
import java.util.HashMap;

public class ProgramaEntrenamiento extends HashMap<Integer, Dia> {
    private LocalDate fechaCreacion, fechaInicio, fechaFin;
    private String descripcion, objetivos;
    private Integer asistencia;
    
    public ProgramaEntrenamiento(){
        fechaCreacion = LocalDate.now();
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
            result += numeroDia + ": "+ get(numeroDia).toString() + "\n";
        return result;
    }
    
    public String toCommand(String cedula) {
        String result = "#Agregando el programa de entrenamiento de " + cedula + "...\n";
        for (Integer numeroDia : keySet())
            result += "#Agregando dia #" + numeroDia + "\n"
                    + "agregar dia\n" 
                    + cedula + "\n" 
                    + numeroDia + "\n"
                    + get(numeroDia).toCommand(cedula) + "\n"; 
        return result;
    }

    @Override
    public void clear() {
        super.clear();
        fechaCreacion = fechaInicio = fechaFin = null;
        descripcion = objetivos = "";
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
        this.descripcion = descripcion;
    }

    public String getObjetivos() {
        return objetivos;
    }

    public void setObjetivos(String objetivos) {
        this.objetivos = objetivos;
    }

    public int getAsistencia() {
        return asistencia;
    }

    public void setAsistencia(int asistencia) {
        this.asistencia = asistencia;
    }
}
