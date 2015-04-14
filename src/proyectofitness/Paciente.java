package proyectofitness;

import java.time.LocalDate;

public class Paciente {
    private ProgramaEntrenamiento programaEntrenamiento;
    private ConjuntoMediciones mediciones = new ConjuntoMediciones();
    
    private String nombre, sexo;
    private LocalDate fechaDeNacimiento;
    private Telefono telefono;
    private Correo correo;
    
    public Paciente(String nombre, String sexo, LocalDate fechaDeNacimiento, Telefono telefono, Correo correo) throws Exception{
        setNombre(nombre);
        setSexo(sexo);
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.telefono = telefono;
        this.correo = correo;
    }

    public int getEdad() {
        return LocalDate.now().compareTo(fechaDeNacimiento);
    }
    
    public ProgramaEntrenamiento getProgramaEntrenamiento() {
        return programaEntrenamiento;
    }

    public ConjuntoMediciones getMediciones() {
        return mediciones;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) throws Exception {
        if(nombre.equals(""))
            throw new Exception("Nombre no puede ser vacio.");
        this.nombre = nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) throws Exception {
        if(!sexo.equals("M") && !sexo.equals("F"))
            throw new Exception("Sexo invalido.  Debe ser M, F o O.");
        this.sexo = sexo;
    }

    public LocalDate getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public Telefono getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) throws Exception {
        this.telefono = new Telefono(telefono);
    }

    public Correo getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) throws Exception {
        this.correo = new Correo(correo);
    }

    @Override
    public String toString() {
        return nombre + ", " + sexo + ", " + fechaDeNacimiento.format(ProyectoFitness.formatoFecha) + ", " + telefono.getTelefono() + ", " + correo.getCorreo();
    }

    public String toCommand(String cedula) {
        return "#Agregando paciente " + nombre + ", cedula " + cedula + "...\n"
                + "agregar paciente\n" 
                + cedula + "\n"
                + nombre + "\n" 
                + sexo + "\n" 
                + fechaDeNacimiento.format(ProyectoFitness.formatoFecha) + "\n" 
                + telefono.getTelefono() + "\n" 
                + correo.getCorreo() + "\n" 
                + (programaEntrenamiento != null ? programaEntrenamiento.toCommand(cedula) : "") + "\n"
                + mediciones.toCommand(cedula) + "\n";
    }


    void borrarProgramaEntrenamiento() {
        programaEntrenamiento.clear();
    }

    void agregarProgramaEntrenamiento(LocalDate fechaCreacion, LocalDate fechaInicio, LocalDate fechaFin, String descripcion, String objetivos) {
        programaEntrenamiento = new ProgramaEntrenamiento(fechaCreacion, fechaInicio, fechaFin, descripcion, objetivos);
    }
}
