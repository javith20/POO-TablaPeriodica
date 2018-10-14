/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TablaPeriodica;

/**
 *
 * @author David
 */
public class Element {
    private String nombre;
    private String simbolo;
    private int numeroAtomico;
    private String bloque;
    private String grupo;
    private String periodo;
    private String masaAtomica;
    private String rutaImagen;

    public Element(String nombre, String simbolo, int numeroAtomico, String bloque, String grupo, String periodo, String masaAtomica, String rutaImagen) {
        this.nombre = nombre;
        this.simbolo = simbolo;
        this.numeroAtomico = numeroAtomico;
        this.bloque = bloque;
        this.grupo = grupo;
        this.periodo = periodo;
        this.masaAtomica = masaAtomica;
        this.rutaImagen = rutaImagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSimbolo() {
        return simbolo;
    }

    public void setSimbolo(String simbolo) {
        this.simbolo = simbolo;
    }

    public int getNumeroAtomico() {
        return numeroAtomico;
    }

    public void setNumeroAtomico(int numeroAtomico) {
        this.numeroAtomico = numeroAtomico;
    }

    public String getBloque() {
        return bloque;
    }

    public void setBloque(String bloque) {
        this.bloque = bloque;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public String getMasaAtomica() {
        return masaAtomica;
    }

    public void setMasaAtomica(String masaAtomica) {
        this.masaAtomica = masaAtomica;
    }

    public String getRutaImagen() {
        return rutaImagen;
    }

    public void setRutaImagen(String rutaImagen) {
        this.rutaImagen = rutaImagen;
    }
    
}
