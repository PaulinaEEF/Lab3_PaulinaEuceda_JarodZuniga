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
public class Asistente extends Entrenador {
    private int salario=1000000;

    public Asistente() {
    }
    public Asistente(int salario,boolean fue_jugador,String nombre, String apellido, int añospro) {
        super(fue_jugador, nombre, apellido, añospro, salario);
        this.salario=salario;
    }
    
    public int getSalario() {
        
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Asistente{" + "salario=" + salario + '}';
    }
    
}
