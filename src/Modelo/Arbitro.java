/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author facu
 */
public class Arbitro extends Persona {
    private int tarjetasTotales;
    private boolean internacional;

    public Arbitro() {
    }
    
    public Arbitro(String nom, String apel, int dia, int mes, int anio, String nac,int tarjetas, boolean internacional){
        super(nom,apel,dia,mes,anio,nac);
        this.tarjetasTotales=tarjetas;
        this.internacional=internacional;
    }

    public int getTarjetasTotales() {
        return tarjetasTotales;
    }

    public void setTarjetasTotales(int tarjetasTotales) {
        this.tarjetasTotales = tarjetasTotales;
    }

    public boolean isInternacional() {
        return internacional;
    }

    public void setInternacional(boolean internacional) {
        this.internacional = internacional;
    }

    @Override
    public String toString() {
        return "Arbitros{" + "tarjetasTotales=" + tarjetasTotales + ", internacional=" + internacional + '}';
    }
    
}

    

