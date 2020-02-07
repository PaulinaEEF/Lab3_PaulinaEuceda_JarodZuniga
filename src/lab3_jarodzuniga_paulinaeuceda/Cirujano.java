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
public class Cirujano extends Medico {
    private int cirujias;
    private String tipoM="Cirujano";

    public Cirujano(int cirujias,String tipoM,String colegio, String nombre, String apellido, int añospro,int salario) {
        super(colegio, nombre, apellido, añospro, salario);
        this.cirujias = cirujias;
    }

    public Cirujano() {
    }

    public int getCirujias() {
        return cirujias;
    }

    public void setCirujias(int cirujias) {
        this.cirujias = cirujias;
    }

    @Override
    public String toString() {
        return "Cirujano{" + "cirujias=" + cirujias + '}';
    }
    
}
