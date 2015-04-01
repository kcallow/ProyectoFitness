package proyectofitness;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

class TipoMaquina  { 
    private static final ArrayList<TipoMaquina> tiposMaquina = new ArrayList();

    private String nombre, descripcion;

    public static void agregar(String nombre, String descripcion) throws Exception {
        TipoMaquina nuevoTipoMaquina = new TipoMaquina(nombre,descripcion);
        if(tiposMaquina.contains(nuevoTipoMaquina))
            throw new Exception("Ya existe un tipo de maquina con este nombre.  No agregado.");
        else 
            tiposMaquina.add(nuevoTipoMaquina);
    }

    public static void borrar(String nombre) throws Exception {
        //La comparacion se basa en el nombre.  Por lo que creamos un tipo solamente para propositos de comparar.
        TipoMaquina tipoMaquinaABorrar = new TipoMaquina(nombre,"");
        if(! tiposMaquina.contains(tipoMaquinaABorrar))
            throw new Exception("El tipo dado no existe.  No borrado.");
        else
            tiposMaquina.remove(tipoMaquinaABorrar);
    }

    public static void modificar(String nombre, String descripcion) throws Exception {
        try {
            borrar(nombre);
            agregar(nombre, descripcion);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public static String ver(String nombre) throws Exception {
        if(nombre.equals("")) {
            String resultado = "";
            for(TipoMaquina maquina : tiposMaquina)
                resultado += maquina.getNombre() + ":\t" + maquina.getDescripcion() + "\n";
            return resultado;
        }

        TipoMaquina tipoMaquina = new TipoMaquina(nombre, "");
        for(TipoMaquina maquina : tiposMaquina)
            if(maquina.equals(tipoMaquina))
                return maquina.getDescripcion();
        throw new Exception("El tipo dado no existe.");
    }

    
    @Override
    public boolean equals(Object tipoMaquinaAComparar) {
        if(tipoMaquinaAComparar == null)
            return false;
        if(! (tipoMaquinaAComparar instanceof TipoMaquina)) 
            return false;
        String nombreAComparar = ((TipoMaquina) tipoMaquinaAComparar).getNombre().toLowerCase();
        return nombre.toLowerCase().equals(nombreAComparar);
    }

    private TipoMaquina(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public static TipoMaquina getTipoMaquina(String nombre) throws Exception {
        nombre = nombre.toLowerCase();
        for(TipoMaquina tipoMaquina : tiposMaquina)
            if(tipoMaquina.getNombre().toLowerCase().equals(nombre))
                return tipoMaquina;
        throw new Exception("Tipo de maquina especificado no existe.");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    } 
}
