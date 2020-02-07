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
public class Jugador extends Persona{
    private int numero_camisa;
    private int tiro3;
    private int defensa;
    private int tiromed;
    private int rebote;
    private int bandeja;
    private int pases;
    private int posteo;
    private int altura;

    public Jugador() {
    }

    public Jugador(int numero_camisa, int tiro3, int defensa, int tiromed, int rebote, int bandeja, int pases, int posteo, int altura,String nombre, String apellido,int  añospro, int salario) {
        super(nombre, apellido, añospro, salario);
        this.numero_camisa = numero_camisa;
        this.tiro3 = tiro3;
        this.defensa = defensa;
        this.tiromed = tiromed;
        this.rebote = rebote;
        this.bandeja = bandeja;
        this.pases = pases;
        this.posteo = posteo;
        this.altura = altura;
    }

    public int getNumero_camisa() {
        return numero_camisa;
    }

    public void setNumero_camisa(int numero_camisa) {
        this.numero_camisa = numero_camisa;
    }

    public int getTiro3() {
        return tiro3;
    }

    public void setTiro3(int tiro3) {
        this.tiro3 = tiro3;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public int getTiromed() {
        return tiromed;
    }

    public void setTiromed(int tiromed) {
        this.tiromed = tiromed;
    }

    public int getRebote() {
        return rebote;
    }

    public void setRebote(int rebote) {
        this.rebote = rebote;
    }

    public int getBandeja() {
        return bandeja;
    }

    public void setBandeja(int bandeja) {
        this.bandeja = bandeja;
    }

    public int getPases() {
        return pases;
    }

    public void setPases(int pases) {
        this.pases = pases;
    }

    public int getPosteo() {
        return posteo;
    }

    public void setPosteo(int posteo) {
        this.posteo = posteo;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Jugador{"+"Nombre: "+super.nombre+"Apellido: " +super.apellido+"Años de profecional"+super.añospro+"Salario: "+super.salario+ "numero_camisa=" + numero_camisa + ", tiro3=" + tiro3 + ", defensa=" + defensa + ", tiromed=" + tiromed + ", rebote=" + rebote + ", bandeja=" + bandeja + ", pases=" + pases + ", posteo=" + posteo + ", altura=" + altura + '}';
    }
    
    
}
