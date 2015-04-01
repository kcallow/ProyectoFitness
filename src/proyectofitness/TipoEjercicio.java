package proyectofitness;

import java.util.ArrayList;

public class TipoEjercicio {
    private static final ArrayList<TipoEjercicio> tiposEjercicio = new ArrayList();
    private String nombre, descripcion;
    private TipoMaquina maquina;

    public static void agregar(String nombre, String descripcion, String maquina) throws Exception {
        TipoEjercicio nuevoTipoEjercicio = new TipoEjercicio(nombre,descripcion, maquina);
        if(tiposEjercicio.contains(nuevoTipoEjercicio))
            throw new Exception("Ya existe un tipo de ejercicio con este nombre.  No agregado.");
        else 
            tiposEjercicio.add(nuevoTipoEjercicio);
    }

    public static void borrar(String nombre) throws Exception {
        //La comparacion se basa en el nombre.  Por lo que creamos un tipo solamente para propositos de comparar.
        TipoEjercicio tipoEjercicioABorrar = new TipoEjercicio(nombre,"",null);
        if(! tiposEjercicio.contains(tipoEjercicioABorrar))
            throw new Exception("El tipo dado no existe.  No borrado.");
        else
            tiposEjercicio.remove(tipoEjercicioABorrar);
    }

    public static void modificar(String nombre, String descripcion, String maquina) throws Exception {
        borrar(nombre);
        agregar(nombre, descripcion, maquina);
    }

    public static String ver(String nombre) throws Exception {
        if(nombre.equals("")) {
            String resultado = "";
            for(TipoEjercicio ejercicio : tiposEjercicio)
                resultado += ejercicio;
            return resultado;
        }
        nombre = nombre.toLowerCase();

        for(TipoEjercicio ejercicio : tiposEjercicio)
            if(ejercicio.getNombre().toLowerCase().equals(nombre))
                return ejercicio.getDescripcion();
        throw new Exception("El tipo dado no existe.");
    }

    @Override
    public boolean equals(Object tipoEjercicioAComparar) {
        if(tipoEjercicioAComparar == null)
            return false;
        if(! (tipoEjercicioAComparar instanceof TipoEjercicio)) 
            return false;
        String nombreAComparar = ((TipoEjercicio) tipoEjercicioAComparar).getNombre().toLowerCase();
        return nombre.toLowerCase().equals(nombreAComparar);
    }

    private TipoEjercicio(String nombre, String descripcion, String maquina) throws Exception {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.maquina = TipoMaquina.getTipoMaquina(maquina);
    }

    public static TipoEjercicio getTipoEjercicio(String nombre) throws Exception {
        nombre = nombre.toLowerCase();
        for(TipoEjercicio tipoEjercicio : tiposEjercicio)
            if(tipoEjercicio.getNombre().toLowerCase().equals(nombre))
                return tipoEjercicio;
        throw new Exception("Tipo de ejercicio especificado no existe.");
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

    public TipoMaquina getTipoMaquina() {
        return maquina;
    }

    public void setTipoMaquina(String maquina) throws Exception {
        this.maquina = TipoMaquina.getTipoMaquina(maquina);
    }
    
}
