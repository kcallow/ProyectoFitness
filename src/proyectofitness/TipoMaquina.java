package proyectofitness;

import java.util.ArrayList;

class TipoMaquina implements Comparable<TipoMaquina> { 
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

    @Override
    public int compareTo(TipoMaquina tipoMaquinaAComparar) {
        String nombreAComparar = tipoMaquinaAComparar.getNombre().toLowerCase();
        return nombre.toLowerCase().compareTo(nombreAComparar);
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
