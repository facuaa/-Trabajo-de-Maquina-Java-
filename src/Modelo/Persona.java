/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author facu
 */
public class Persona {
     private String nombre, apellido;
    private Fecha nacimiento;
    private String nacionalidad;
    
    
    public Persona(){
    }
    
    public Persona(String nom, String apel, int dia, int mes, int anio, String nac){
    this.nombre=nom;
    this.apellido=apel;
    this.nacimiento.setDia(dia);
    this.nacimiento.setMes(mes);
    this.nacimiento.setAnio(anio);
    this.nacionalidad=nac;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Fecha getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(Fecha nacimiento) {
        this.nacimiento = nacimiento;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
}
