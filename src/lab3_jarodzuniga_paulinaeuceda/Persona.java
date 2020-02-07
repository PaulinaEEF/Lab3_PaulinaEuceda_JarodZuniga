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
public class Persona {
    protected String nombre;
    protected String apellido;
    protected int añospro;
    protected int salario;

    public Persona() {
    }

    public Persona(String nombre, String apellido, int añospro, int salario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.añospro = añospro;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getAñospro() {
        return añospro;
    }

    public void setAñospro(int añospro) {
        this.añospro = añospro;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", a\u00f1ospro=" + añospro + ", salario=" + salario + '}';
    }
    
}
