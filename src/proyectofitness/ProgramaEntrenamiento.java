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
    private LocalDateTime fecha;
    private static int numero = 0;
    
    public ProgramaEntrenamiento(){
        fecha = LocalDateTime.now();
        numero++;
    }
      
    public void agregarDia(){
        dias.add(new Dia());
    }
    
    public void agregarEjercicio(Ejercicio ejercicio) throws Exception{
        dias.get(dias.size() - 1).agregarEjercicio(ejercicio);
    }
    
    public int getNumero(){
        return numero;
    }
    
    
    
                  
    
    
}
