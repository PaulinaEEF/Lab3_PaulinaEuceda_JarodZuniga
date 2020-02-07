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
public class Principal extends Entrenador {
    private int salario;
    private String tipo="Principal";

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isFue_jugador() {
        return fue_jugador;
    }

    public void setFue_jugador(boolean fue_jugador) {
        this.fue_jugador = fue_jugador;
    }

    public String getJugada_fav() {
        return jugada_fav;
    }

    public void setJugada_fav(String jugada_fav) {
        this.jugada_fav = jugada_fav;
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

    public Principal() {
    }

    public Principal(int salario,boolean fue_jugador,String tipo,String nombre, String apellido, int añospro) {
        super(fue_jugador, nombre, apellido, añospro, salario);
        this.salario = salario;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Preparador{" + "salario=" + salario + '}';
    }
}
