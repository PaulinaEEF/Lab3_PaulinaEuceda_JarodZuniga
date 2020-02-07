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
public class Entrenador {
    private boolean fue_jugador;
    private String jugada_fav;

    public Entrenador() {
    }

    public Entrenador(boolean fue_jugador) {
        this.fue_jugador = fue_jugador;
    }

    public Entrenador(boolean fue_jugador, String jugada_fav) {
        this.fue_jugador = fue_jugador;
        this.jugada_fav = jugada_fav;
    }

    public boolean getFue_jugador() {
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

    @Override
    public String toString() {
        return "Entrenador{" + "fue_jugador=" + fue_jugador + ", jugada_fav=" + jugada_fav + '}';
    }
    
}
