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

    @Override
    public String toString(){
        return ejercicios.toString();
    }
}
