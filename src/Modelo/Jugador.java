/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author facu
 */
public class Jugador extends Persona{
    private String clubActual, posicion;
    private int goles, tarjetasAmarillas, tarjetasRojas;
    
    public Jugador(){
    }
    public Jugador(String nom, String apel, int dia, int mes, int anio, String nac, String club, String posicion,int goles, int tarAmarillas, int tarRojas){
    super(nom,apel,dia,mes,anio,nac);
    this.clubActual=club;
    this.posicion=posicion;
    this.goles=goles;
    this.tarjetasAmarillas= tarAmarillas;
    this.tarjetasRojas= tarRojas;
    }

    public String getClubActual() {
        return clubActual;
    }

    public void setClubActual(String clubActual) {
        this.clubActual = clubActual;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public int getGoles() {
        return goles;
    }

    public void setGoles(int goles) {
        this.goles = goles;
    }

    public int getTarjetasAmarillas() {
        return tarjetasAmarillas;
    }

    public void setTarjetasAmarillas(int tarjetasAmarillas) {
        this.tarjetasAmarillas = tarjetasAmarillas;
    }

    public int getTarjetasRojas() {
        return tarjetasRojas;
    }

    public void setTarjetasRojas(int tarjetasRojas) {
        this.tarjetasRojas = tarjetasRojas;
    }

    @Override
    public String toString() {
        return "Jugador{" + "clubActual=" + clubActual + ", posicion=" + posicion + ", goles=" + goles + ", tarjetasAmarillas=" + tarjetasAmarillas + ", tarjetasRojas=" + tarjetasRojas + '}';
    }
    
}
