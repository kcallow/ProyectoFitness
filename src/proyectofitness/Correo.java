/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor
 */
package proyectofitness;

/**
 *
 * @author scsaenz
 */
class Correo {
    
    private String correo;
    
    public Correo(String correo){
        this.correo = correo.toLowerCase();
    }
    
    public boolean verificar(){
        return correo.matches("^[_a-z0-9-]+(\\.[_a-z0-9-]+)*@" +
                   "[a-z0-9]+(\\.[a-z0-9]+)*(\\.[a-z]{2,})$");
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}
