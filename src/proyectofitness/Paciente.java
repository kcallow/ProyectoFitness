/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofitness;

import java.util.ArrayList;

/**
 *
 * @author callow
 */
public class Paciente {
    private static ArrayList<Paciente> pacientes = new ArrayList();
    
    private ProgramaEntrenamiento programaEntrenamiento;
    
    private String nombre, sexo, fechaDeNacimiento;
    private Telefono telefono;
    private Correo correo;
    private Cedula cedula;
    
    private Paciente(Cedula cedula, String nombre, String sexo, String fechaDeNacimiento, Telefono telefono, Correo correo){
        this.nombre = nombre;
        this.cedula = cedula;
        this.sexo = sexo;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.telefono = telefono;
        this.correo = correo;
    }
    
    private Paciente(Cedula cedula){
        this.cedula = cedula;
    }
    
    
    public static void agregar(String cedula, String nombre, String sexo, String fechaDeNacimiento, String telefono, String correo) throws Exception {
        Paciente nuevoPaciente = new Paciente(new Cedula(cedula), nombre, sexo, fechaDeNacimiento, new Telefono(telefono), new Correo(correo));
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
    
    public static String ver(String cedulaString) throws Exception {
        if(cedulaString.equals("")) {
            String resultado = "";
            for(Paciente paciente : pacientes)
                resultado += paciente;
            return resultado;
        }

        Cedula cedula = new Cedula(cedulaString);
        for(Paciente paciente : pacientes)
            if(paciente.getCedula().equals(cedula))
                return paciente.toString();
        throw new Exception("El paciente no existe.");
    }
    
    public static void modificar(String cedula, String nombre, String sexo, String fechaDeNacimiento, String telefono, String correo) throws Exception {
        try {
            borrar(cedula);
            agregar(nombre, sexo, cedula, fechaDeNacimiento,  telefono, correo);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public static ArrayList<Paciente> getPacientes() {
        return pacientes;
    }


    public ProgramaEntrenamiento getProgramaEntrenamiento() {
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

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Cedula getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) throws Exception {
        this.cedula = new Cedula(cedula);
    }

    public String getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(String fechaDeNacimiento) {
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
