/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package interfaz;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import proyectofitness.ProyectoFitness;


/**
 *
 * @author scsaenz
 */
public class AplFitness {
    
    public static String saveFile = "saveFile.txt";
    
    public static void main(String [] args) throws Exception {
        ProyectoFitness.cargarArchivo(saveFile);
        VentanaPrincipal ventanaPrincipal = new VentanaPrincipal();
        ventanaPrincipal.setVisible(true);
        if(!ventanaPrincipal.isVisible())
            ProyectoFitness.guardarArchivo(saveFile);
    }

}
