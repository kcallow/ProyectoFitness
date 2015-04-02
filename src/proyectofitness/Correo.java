package proyectofitness;

public class Correo {
    
    private String correo;
    
    public Correo(String correo) throws Exception{
        this.correo = correo.toLowerCase();
        if(!verificar())
            throw new Exception("Correo invalido.");
    }
    
    public boolean verificar(){
        return correo.matches("^[_a-z0-9-]+(\\.[_a-z0-9-]+)*@" +
                   "[-a-z0-9]+(\\.[a-z0-9]+)*(\\.[a-z]{2,})$");
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}
