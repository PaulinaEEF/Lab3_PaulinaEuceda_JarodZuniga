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
public class Terapeuta {
    private int num_terapias;

    public Terapeuta() {
    }

    public Terapeuta(int num_terapias) {
        this.num_terapias = num_terapias;
    }

    public int getNum_terapias() {
        return num_terapias;
    }

    public void setNum_terapias(int num_terapias) {
        this.num_terapias = num_terapias;
    }

    @Override
    public String toString() {
        return "Terapeuta{" + "num_terapias=" + num_terapias + '}';
    }
    
}
