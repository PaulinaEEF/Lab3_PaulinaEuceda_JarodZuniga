/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_jarodzuniga_paulinaeuceda;

/**
 *
 * @author Rosa
 */
public class Dueño extends Persona{
    private int ganancia;
    private String ciudad_natal;

    public Dueño() {
    }

    public Dueño(int ganancia,String nombre, String apellido, int añospro,int salario) {
        super(nombre, apellido, añospro, salario);
        this.ganancia = ganancia;
    }

    public String getCiudad_natal() {
        return ciudad_natal;
    }

    public void setCiudad_natal(String ciudad_natal) {
        this.ciudad_natal = ciudad_natal;
    }

    public double getGanancia() {
        return ganancia;
    }

    public void setGanancia(int ganancia) {
        this.ganancia = ganancia;
    }

    @Override
    public String toString() {
        return "Due\u00f1o{" + "ganancia=" + ganancia + ", ciudad_natal=" + ciudad_natal + '}';
    }
    
}
