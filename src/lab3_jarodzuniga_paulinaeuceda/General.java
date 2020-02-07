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
public class General extends Medico{
    private int num_enfermedades;
    private String tipoM="General";

    public General(int num_enfermedades,String tipoM,String colegio, String nombre, String apellido, int añospro,int salario) {
        super(nombre, nombre, apellido, añospro, salario);
        this.num_enfermedades = num_enfermedades;
        
    }

    public General() {
    }

    public int getNum_enfermedades() {
        return num_enfermedades;
    }

    public void setNum_enfermedades(int num_enfermedades) {
        this.num_enfermedades = num_enfermedades;
    }

    @Override
    public String toString() {
        return "General{" + "num_enfermedades=" + num_enfermedades + '}';
    }
    
}
