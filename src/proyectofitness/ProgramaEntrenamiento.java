/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofitness;

import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 *
 * @author callow
 */
public class ProgramaEntrenamiento {
    private ArrayList<Dia> dias = new ArrayList();
    private LocalDateTime fechaCreacion;
    private static int numero = 0;
    
    public ProgramaEntrenamiento(){
        fechaCreacion = LocalDateTime.now();
        numero++;
    }
      
    public void agregarDia(){
        dias.add(new Dia());
    }
    
    public Dia getDia(int i) throws Exception{
        if(i > dias.size())
            throw new Exception("El dia no existe");
        return dias.get(i);
    }
    
                  
    
    
}
