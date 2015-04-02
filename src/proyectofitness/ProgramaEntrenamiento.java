/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofitness;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 *
 * @author callow
 */
public class ProgramaEntrenamiento {
    private final ArrayList<Dia> dias = new ArrayList();
    private LocalDate fechaCreacion;
    private static int numero = 0;
    
    // fecha.format(DateTimeFormatter.ofPattern("dd MM uuuu"))
    
    public ProgramaEntrenamiento(){
        fechaCreacion = LocalDate.now();
        numero++;
    }
      
    public void agregarDia(){
        dias.add(new Dia());
    }
    
    public Dia getDia(int i) throws Exception{
        if(i > dias.size() || i < 0)
            throw new Exception("El dia no existe");
        return dias.get(i);
    }
    public void agregarEjercicio(Ejercicio ejercicio) throws Exception{
        dias.get(dias.size() - 1).agregarEjercicio(ejercicio);
    }      
    
    public void borrarDia(int i) throws Exception{
        if(i > dias.size() || i < 0)
            throw new Exception("El dia no existe");
        dias.remove(i);
    }
    
    
    
    
}
