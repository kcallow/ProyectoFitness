package proyectofitness;

import java.util.ArrayList;

public class Dia {
    private ArrayList<Ejercicio> ejercicios = new ArrayList();


    public void agregarEjercicio (Ejercicio ejercicio) throws Exception {
        //Si el numero del ejercicio ya se encuentra en ese dia, tirar error
        if(ejercicios.contains(ejercicio))
            throw new Exception("El numero dado ya existe para este dia.  Ejercicio no agregado.");
        else
            ejercicios.add(ejercicio);
    }

    public void borrarEjercicio(int numero) throws Exception {
        for(Ejercicio ejercicio : ejercicios)
            if(ejercicio.getNumero() == numero) {
                ejercicios.remove(ejercicio);
                return;
            }
        throw new Exception("Indice invalido.  No se ha modificado la lista de ejercicios...");
    }

    public void modificarEjercicio(Ejercicio ejercicio) throws Exception {
        try {
            borrarEjercicio(ejercicio.getNumero());
            agregarEjercicio(ejercicio);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public String verEjercicio(int numero) throws Exception {
        if(numero == -1){
            return toString();
        }
        else {
            for(Ejercicio ejercicio : ejercicios)
                if(ejercicio.getNumero() == numero)
                    return ejercicio.toString();
            throw new Exception("Numero no corresponde a ningun ejercicio registrado.");
        }
    }

    @Override
    public String toString(){
        String resultado = "";
        for(Ejercicio ejercicio : ejercicios)
            resultado += ejercicio.toString() + "\n";
        return resultado;
    }
}
