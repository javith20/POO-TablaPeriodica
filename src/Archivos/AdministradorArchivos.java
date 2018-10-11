/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Archivos;

import com.sun.xml.internal.ws.api.pipe.Fiber;
import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Javith
 */
public class AdministradorArchivos {

    private final File dirElementos = new File("BaseDatos//Vehiculos//");
    

    private LectorXML lectorXML;
    private SimpleDateFormat formatoString = new SimpleDateFormat("dd/MM/yyyy");

    private ArrayList<Elemento> Elemento = new ArrayList<>();
    

    public AdministradorArchivos() {
        lectorXML = new LectorXML();
        cargarElementos();
       
    }

    private void cargarElementos() {
        ArrayList<String> aux; 
        //Recorre lista de atributos de el xml
        for (int indice = 0; dirElementos.list().length > indice; indice++) {
            aux = lectorXML.getListaElementos(dirElementos.getAbsolutePath() + "\\" + dirElementos.list()[indice], "Vehiculo");
            Elemento nuevo;
            nuevo = new Elemento(aux.get(0), aux.get(1), aux.get(2), Integer.parseInt(aux.get(3)), Integer.parseInt(aux.get(4)), Double.parseDouble(aux.get(5)), aux.get(6), aux.get(7), aux.get(8));
            aux.clear();
            Elemento.add(nuevo);
        }
    }

    
    public ArrayList<Elemento> getViajes() {
        return Elementos;
    }

}
