package proyectofitness;

import java.util.Objects;

public class Cedula {
    
    private String cedula;
    
    public Cedula(String cedula) throws Exception{
        this.cedula = cedula;
        if(!verificar())
            throw new Exception("Cedula invalida.");
    }

    public boolean verificar(){
        return cedula.matches("[0-9]+") && cedula.length() == 9;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    @Override
    public boolean equals(Object cedula){
        if(cedula == null)
            return false;
        if(!(cedula instanceof Cedula))
            return false;
        return this.cedula.equals(((Cedula) cedula).getCedula());
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.cedula);
        return hash;
    }

}
