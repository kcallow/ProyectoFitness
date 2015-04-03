package proyectofitness;

import java.time.LocalDate;

public class Paciente {
    private final ProgramaEntrenamiento programaEntrenamiento = new ProgramaEntrenamiento();
    private final Mediciones mediciones = new Mediciones();
    
    private String nombre, sexo;
    private LocalDate fechaDeNacimiento;
    private Telefono telefono;
    private Correo correo;
    
    public Paciente(String nombre, String sexo, LocalDate fechaDeNacimiento, Telefono telefono, Correo correo) throws Exception{
        this.nombre = nombre;
        setSexo(sexo);
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.telefono = telefono;
        this.correo = correo;
        
    }
    
    public ProgramaEntrenamiento getProgramaEntrenamiento() {
        return programaEntrenamiento;
    }

    public Mediciones getMediciones() {
        return mediciones;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
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
        return nombre + ", " + sexo + ", " + fechaDeNacimiento + ", " + telefono.getTelefono() + ", " + correo.getCorreo();
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
                + programaEntrenamiento.toCommand(cedula) + "\n" 
                + mediciones.toCommand(cedula) + "\n";
    }
}
