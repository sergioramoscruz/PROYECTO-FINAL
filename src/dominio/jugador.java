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
    private int cedula;
    private String nombres;
    private String apellidos;
    private int edad;
    private int pasaporte;
    private String equipodebug;
    private String equipoactual;
    private double cotizacion;
    private String posicion;

    public jugador(int idjugador, int cedula, String nombres, String apellidos, int edad, int pasaporte, String equipodebug, double cotizacion, String posicion) {
        this.idjugador = idjugador;
        this.cedula = cedula;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.edad = edad;
        this.pasaporte = pasaporte;
        this.equipodebug = equipodebug;
        this.cotizacion = cotizacion;
        this.posicion = posicion;
    }
    
    public jugador(){
        
        
    }

    public int getIdjugador() {
        return idjugador;
    }

    public void setIdjugador(int idjugador) {
        this.idjugador = idjugador;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
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

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }
    
    
}
