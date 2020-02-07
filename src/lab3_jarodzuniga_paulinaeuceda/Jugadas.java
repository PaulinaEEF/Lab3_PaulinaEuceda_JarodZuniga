/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_jarodzuniga_paulinaeuceda;

import java.util.Random;

/**
 *
 * @author Rosa
 */
public class Jugadas {
    private String descripcion;
    private int porcentaje;

    public Jugadas() {
    }

    public Jugadas(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(int porcentaje) {
        this.porcentaje = porcentaje;
    }

    @Override
    public String toString() {
        return "Jugadas{" + "descripcion=" + descripcion + ", porcentaje=" + porcentaje + '}';
    }
    
}
