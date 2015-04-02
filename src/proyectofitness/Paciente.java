package proyectofitness;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;

public class Paciente {
    public static final ArrayList<Paciente> pacientes = new ArrayList();  
    private final HashMap<String, Medicion> mediciones = new HashMap();
    
    private ProgramaEntrenamiento programaEntrenamiento;
    
    private String nombre, sexo;
    private LocalDate fechaDeNacimiento;
    private Telefono telefono;
    private Correo correo;
    private Cedula cedula;
    
    private Paciente(Cedula cedula, String nombre, String sexo, LocalDate fechaDeNacimiento, Telefono telefono, Correo correo) throws Exception{
        this.nombre = nombre;
        this.cedula = cedula;
        setSexo(sexo);
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.telefono = telefono;
        this.correo = correo;
        
    }
    
    private Paciente(Cedula cedula){
        this.cedula = cedula;
    }
    
    
    public static void agregar(String cedula, String nombre, String sexo, String fechaDeNacimiento, String telefono, String correo) throws Exception {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-uuuu");
        Paciente nuevoPaciente = new Paciente(new Cedula(cedula), nombre, sexo, LocalDate.parse(fechaDeNacimiento, formatter), new Telefono(telefono), new Correo(correo));
        if(pacientes.contains(nuevoPaciente))
            throw new Exception("Ya existe un paciente con esta cedula.  No agregado.");
        else 
            pacientes.add(nuevoPaciente);
    }
    
    public static void borrar(String cedula) throws Exception {
        //La comparacion se basa en la cedula.  Por lo que creamos un tipo solamente para propositos de comparar.
        Paciente nuevoPacienteABorrar = new Paciente(new Cedula(cedula));
        if(! pacientes.contains(nuevoPacienteABorrar))
            throw new Exception("El tipo dado no existe.  No borrado.");
        else
            pacientes.remove(nuevoPacienteABorrar);
    }
    
    @Override
    public boolean equals(Object pacienteAComparar) {
        if(pacienteAComparar == null)
            return false;
        if(! (pacienteAComparar instanceof Paciente)) 
            return false;
        Cedula cedulaAComparar = ((Paciente) pacienteAComparar).getCedula();
        return cedula.equals(cedulaAComparar);
    }
    
    public static String ver(String cedula) throws Exception {
        if(cedula.equals("")) {
            String resultado = "";
            for(Paciente paciente : pacientes)
                resultado += paciente + "\n";
            return resultado;
        }
        Paciente paciente = get(cedula);
        if(paciente == null)
            throw new Exception("El paciente no existe.");
        return paciente.toString();
    }
    
    public static void modificar(String cedula, String nombre, String sexo, String fechaDeNacimiento, String telefono, String correo) throws Exception {
        try {
            borrar(cedula);
            agregar(nombre, sexo, cedula, fechaDeNacimiento,  telefono, correo);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public static Paciente get(String cedula) {
        for(Paciente paciente : pacientes)
            if(paciente.getCedula().getCedula().equals(cedula))
                return paciente;
        return null;
    }

    public void agregarMedicion(String nombre, double valor) throws Exception{
        mediciones.put(nombre, new Medicion(nombre, valor)); 
    }

    public void borrarMedicion(String nombre) {
        mediciones.remove(nombre);
    }

    public void modificarMedicion(String nombre, double valor) throws Exception {
        if(!mediciones.containsKey(nombre))
            throw new Exception("El nombre no corresponde a ninguna medida registrada.");
        agregarMedicion(nombre, valor);
    }

    public String verMedicion(String nombre) throws Exception {
        if(nombre.equals("")) {
            String result = "";
            for (HashMap.Entry<String, Medicion> entrada : mediciones.entrySet())
                result +=  entrada.getKey() + ": " + entrada.getValue();
            return result;
        }
        else {
            if(mediciones.get(nombre) == null)
                throw new Exception ("No existe medicion con este nombre...");
            return mediciones.get(nombre).toString();
        }
    }

    public static ArrayList<Paciente> getPacientes() {
        return pacientes;
    }


    public ProgramaEntrenamiento getProgramaEntrenamiento() throws Exception {
        if(programaEntrenamiento == null)
            throw new Exception("Usuario no posee programa de entrenamiento.");
        return programaEntrenamiento;
    }

    public void setProgramaEntrenamiento(ProgramaEntrenamiento programaEntrenamiento) {
        this.programaEntrenamiento = programaEntrenamiento;
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

    public Cedula getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) throws Exception {
        this.cedula = new Cedula(cedula);
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
        return "Paciente{" + "programaEntrenamiento=" + programaEntrenamiento + ", nombre=" + nombre + ", sexo=" + sexo + ", fechaDeNacimiento=" + fechaDeNacimiento + ", telefono=" + telefono.getTelefono() + ", correo=" + correo.getCorreo() + ", cedula=" + cedula.getCedula() + '}';
    }

   

    
    
    

    
}
