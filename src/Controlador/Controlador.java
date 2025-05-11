/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;
import Modelo.Arbitro;
import Modelo.Fecha;
import Modelo.Jugador;
/**
 *
 * @author facu
 */
public class Controlador {
   private Arbitro arbitro;
    private Jugador jugador;

    public Controller() {
    }
    //Los siguientes set son para arbitros
    public void colocarNombreArbitro(String nom){
    this.arbitro.setNombre(nom);
    }
    public void colocarApellidoArbitro(String ape){
        this.arbitro.setApellido(ape);
    }
    public void colocarNacimientoArbitro(Fecha nac){
    this.arbitro.setNacimiento(nac);
    }
    public void colocarNacionalidadArbitro(String nac){
    this.arbitro.setNacionalidad(nac);
    }
    public void colocarTarjetasTotalesArbitro(int tar){
        this.arbitro.setTarjetasTotales(tar);
    }
    public void colocarInternacional(boolean internacional){
        this.arbitro.setInternacional(internacional);
    }
    public Arbitro DevolverListaArbitro(){
        return arbitro;
    }
    //Los siguientes set son para jugadores
    public void colocarNombreJugador(String nom){
    this.jugador.setNombre(nom);
    }
    public void colocarApellidoJugador(String ape){
        this.jugador.setApellido(ape);
    }
    public void colocarNacimientoJugador(Fecha nac){
    this.jugador.setNacimiento(nac);
    }
    public void colocarNacionalidadJugador(String nac){
    this.jugador.setNacionalidad(nac);
    }
    public void colocarClubActualJugador(String clubActual){
        this.jugador.setClubActual(clubActual);
    }
    public void colocarGolesJugador(int gol){
        this.jugador.setGoles(gol);
    }
    public void colocarTarjetasAmarillas(int tar){
        this.jugador.setTarjetasAmarillas(tar);
    }
    public void colocarTarjetasRojas(int tar){
        this.jugador.setTarjetasRojas(tar);
    } 
    public Jugador DevolverListaJugador(){
    return jugador;
}
}
