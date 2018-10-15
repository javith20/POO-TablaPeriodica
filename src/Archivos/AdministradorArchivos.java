/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Archivos;

import java.io.File;
import java.util.ArrayList;


/**
 *
 * @author Javith
 */
public class AdministradorArchivos {

    private final File dirElementos = new File("elementos/");

    private LectorXML lectorXML;

    private ArrayList<Element> Elementos = new ArrayList<>();

    public AdministradorArchivos() {
        lectorXML = new LectorXML();
        cargarElementos();
    }

    private void cargarElementos() {
        ArrayList<String> aux;
        //Recorre lista de atributos de el xml
        for (int indice = 0; dirElementos.list().length > indice; indice++) {
            aux = lectorXML.getListaElementos(dirElementos.getAbsolutePath() + "\\" + dirElementos.list()[indice], "Element");
            Element nuevo;
            nuevo = new Element(aux.get(0), aux.get(1), Integer.parseInt(aux.get(2)), aux.get(3), aux.get(4), aux.get(5), aux.get(6), aux.get(8),aux.get(7));
            aux.clear();
            Elementos.add(nuevo);
        }
    }

    public ArrayList<Element> getElementos() {
        return Elementos;
    }

}
