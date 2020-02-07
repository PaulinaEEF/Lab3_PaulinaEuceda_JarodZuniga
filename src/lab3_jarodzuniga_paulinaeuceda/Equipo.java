/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_jarodzuniga_paulinaeuceda;

import java.util.ArrayList;

/**
 *
 * @author Rosa
 */
public class Equipo {
    private String nombre;
    private String año_crea;
    private int num_campeonatos;
    private String dueño;
    ArrayList<Jugadas> jugadas=new ArrayList();
    ArrayList<Persona> personal=new ArrayList();

    public Equipo(String nombre, String año_crea, int num_campeonatos, String dueño) {
        this.nombre = nombre;
        this.año_crea = año_crea;
        this.num_campeonatos = num_campeonatos;
        this.dueño = dueño;
    }

    public Equipo() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAño_crea() {
        return año_crea;
    }

    public void setAño_crea(String año_crea) {
        this.año_crea = año_crea;
    }

    public int getNum_campeonatos() {
        return num_campeonatos;
    }

    public void setNum_campeonatos(int num_campeonatos) {
        this.num_campeonatos = num_campeonatos;
    }

    public String getDueño() {
        return dueño;
    }

    public void setDueño(String dueño) {
        this.dueño = dueño;
    }

    public ArrayList<Jugadas> getJugadas() {
        return jugadas;
    }

    public void setJugadas(ArrayList<Jugadas> jugadas) {
        this.jugadas = jugadas;
    }

    public ArrayList<Persona> getPersonal() {
        return personal;
    }

    public void setPersonal(ArrayList<Persona> personal) {
        this.personal = personal;
    }

    @Override
    public String toString() {
        return "Equipo{" + "nombre=" + nombre + ", a\u00f1o_crea=" + año_crea + ", num_campeonatos=" + num_campeonatos + ", due\u00f1o=" + dueño + ", jugadas=" + jugadas + ", personal=" + personal + '}';
    }
    
}
