/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author facu
 */

//========================================================

//                  Cantidad de equipos: 10
//                  Max Jugadores: 7, min: 5

//========================================================
public class EquipoFutbol extends Jugador {
    private String nombreEquipo;
    private int cantidadJugadores;


    public EquipoFutbol(){
    }
    
    public EquipoFutbol(String nombreEquipo, int cantidadJugadores, String nom, String apel, int dia, int mes, int anio, String nac, String club, String posicion, int goles, int tarAmarillas, int tarRojas) {
        super(nom, apel, dia, mes, anio, nac, club, posicion, goles, tarAmarillas, tarRojas);
        this.nombreEquipo = nombreEquipo;
        this.cantidadJugadores = cantidadJugadores;
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public int getCantidadJugadores() {
        return cantidadJugadores;
    }

    public void setCantidadJugadores(int cantidadJugadores) {
        this.cantidadJugadores = cantidadJugadores;
    }

    @Override
    public String toString() {
        return "EquipoFutbol{" + "nombreEquipo=" + nombreEquipo + ", cantidadJugadores=" + cantidadJugadores + '}';
    }
}
