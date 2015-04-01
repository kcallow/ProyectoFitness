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
public class Cedula {
    
    private String cedula;
    
    public Cedula(String cedula) throws Exception{
        this.cedula = cedula;
        if(!verificar())
            throw new Exception("Cedula invalida.");
    }
    public boolean verificar(){
        return cedula.matches("[0-9]+") && cedula.length() == 8;
    }

    public String getCedula() {
        return cedula;
    }

    public void setID(String cedula) {
        this.cedula = cedula;
    }
    
}
