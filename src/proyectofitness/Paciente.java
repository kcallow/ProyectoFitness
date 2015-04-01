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
public class Paciente implements Comparable<Paciente>{
    private static ArrayList<Paciente> pacientes = new ArrayList();
    
    private ProgramaEntrenamiento programaEntrenamiento;
    
    private String nombre, sexo, fechaDeNacimiento;
    private Telefono telefono;
    private Correo correo;
    private Cedula cedula;
    
    public Paciente(String nombre, String sexo, Cedula cedula, String fechaDeNacimiento, Telefono telefono, Correo correo){
        this.nombre = nombre;
        this.cedula = cedula;
        this.sexo = sexo;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.telefono = telefono;
        this.correo = correo;
    }
    
    public Paciente(String nombre){
        this.nombre = nombre;
    }
    
    
    public static void agregar(String nombre, String sexo, Cedula cedula, String fechaDeNacimiento, Telefono telefono, Correo correo) throws Exception {
        Paciente nuevoPaciente = new Paciente(nombre, sexo, cedula, fechaDeNacimiento, telefono, correo);
        if(pacientes.contains(nuevoPaciente))
            throw new Exception("Ya existe un tipo de ejercicio con este nombre.  No agregado.");
        else 
            pacientes.add(nuevoPaciente);
    }
    
    public static void borrar(String nombre) throws Exception {
        //La comparacion se basa en el nombre.  Por lo que creamos un tipo solamente para propositos de comparar.
        Paciente nuevoPacienteABorrar = new Paciente(nombre);
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
        String nombreAComparar = ((Paciente) pacienteAComparar).getNombre().toLowerCase();
        return nombre.toLowerCase().equals(nombreAComparar);
    }
    
    public static String ver(String nombre) throws Exception {
        if(nombre.equals("")) {
            String resultado = "";
            for(Paciente paciente : pacientes)
                resultado += paciente.getNombre() + ":\t" + paciente.getSexo() + "\t" 
                        + paciente.getCedula() + "\t" + paciente.getCorreo() + "\t" + paciente.getProgramaEntrenamiento() + "\t" 
                        + paciente.getTelefono() +"\n";
            return resultado;
        }
        nombre = nombre.toLowerCase();

        for(Paciente paciente : pacientes)
            if(paciente.getNombre().toLowerCase().equals(nombre))
                return paciente.toString();
        throw new Exception("El paciente no existe.");
    }
    
    public static void modificar(String nombre, String sexo, Cedula cedula, String fechaDeNacimiento, Telefono telefono, Correo correo) throws Exception {
        borrar(nombre);
        agregar(nombre, sexo, cedula, fechaDeNacimiento,  telefono, correo);
    }
    
    @Override
    public int compareTo(Paciente pacienteAComparar) {
        String nombreAComparar = pacienteAComparar.getNombre().toLowerCase();
        return nombre.toLowerCase().compareTo(nombreAComparar);
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

    public void setCedula(String cedula) {
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

    public void setTelefono(String telefono) {
        this.telefono = new Telefono(telefono);
    }

    public Correo getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = new Correo(correo);
    }

    @Override
    public String toString() {
        return "Paciente{" + "programaEntrenamiento=" + programaEntrenamiento + ", nombre=" + nombre + ", sexo=" + sexo + ", fechaDeNacimiento=" + fechaDeNacimiento + ", telefono=" + telefono + ", correo=" + correo + ", cedula=" + cedula + '}';
    }

   

    
    
    

    
}
