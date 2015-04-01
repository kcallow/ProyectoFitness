/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofitness;

/**
 *
 * @author doctorHolmes
 */
public class Telefono {
    
    String telefono;
    
    public Telefono(String telefono){
        this.telefono = telefono;
    }
    
    public boolean verificar(Telefono telefono){
        return telefono.getTelefono().matches("^\\(?(\\d{3})\\)?[- ]?(\\d{4})[- ]?(\\d{4})$");
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    
}
