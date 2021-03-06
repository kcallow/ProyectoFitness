/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
* and open the template in the editor.
 */
package proyectofitness;

/**
 *
 * @author scsaenz
 */
public class Telefono {
    
    String telefono;
    
    public Telefono(String telefono) throws Exception{
        this.telefono = telefono;
        if(!verificar())
            throw new Exception("Telefono invalido.");
    }
    
    public boolean verificar(){
        return telefono.matches("^\\(?(\\d{1,3})?\\)?[- ]?\\(?(\\d{3})?\\)?[- ]?(\\d{3,4})[- ]?(\\d{4})$");
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    
}
