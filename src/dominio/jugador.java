/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

/**
 *
 * @author HP1000
 */
public class jugador {
    
    private int idjugador ;
    private String nombres;
    private String apellidos;
    private int edad;
    private int pasaporte;
    private String posicion;
    private String equipodebug;
    private String equipoactual;
    private double cotizacion;
    private int cedula;

    public jugador(int idjugador, String nombres, String apellidos, int edad, int pasaporte, String posicion, String equipodebug, String equipoactual, double cotizacion, int cedula) {
        this.idjugador = idjugador;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.edad = edad;
        this.pasaporte = pasaporte;
        this.posicion = posicion;
        this.equipodebug = equipodebug;
        this.equipoactual = equipoactual;
        this.cotizacion = cotizacion;
        this.cedula = cedula;
    }

    public jugador() {
    }

    public int getIdjugador() {
        return idjugador;
    }

    public void setIdjugador(int idjugador) {
        this.idjugador = idjugador;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getPasaporte() {
        return pasaporte;
    }

    public void setPasaporte(int pasaporte) {
        this.pasaporte = pasaporte;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public String getEquipodebug() {
        return equipodebug;
    }

    public void setEquipodebug(String equipodebug) {
        this.equipodebug = equipodebug;
    }

    public String getEquipoactual() {
        return equipoactual;
    }

    public void setEquipoactual(String equipoactual) {
        this.equipoactual = equipoactual;
    }

    public double getCotizacion() {
        return cotizacion;
    }

    public void setCotizacion(double cotizacion) {
        this.cotizacion = cotizacion;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

        
    
}
