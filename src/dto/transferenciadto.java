/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

import java.sql.Date;

/**
 *
 * @author HP1000
 */
public class transferenciadto {

    private int id_transferencia;
    private Date fecha_transferencia;
    private String modo_transferencia;
    private String equipo_transferencia;
    private String descripcion;
    private Double cotizacion;
    private int porcentaje;
    private int id_jugador;
    private String nombres;
    private String apellidos;
    private Double cotizacion2;

    public transferenciadto(int id_transferencia, Date fecha_transferencia, String modo_transferencia, String equipo_transferencia, String descripcion, Double cotizacion, int porcentaje, int id_jugador, String nombres, String apellidos, Double cotizacion2) {
        this.id_transferencia = id_transferencia;
        this.fecha_transferencia = fecha_transferencia;
        this.modo_transferencia = modo_transferencia;
        this.equipo_transferencia = equipo_transferencia;
        this.descripcion = descripcion;
        this.cotizacion = cotizacion;
        this.porcentaje = porcentaje;
        this.id_jugador = id_jugador;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.cotizacion2 = cotizacion2;
    }

    public transferenciadto() {
    }

    public int getId_transferencia() {
        return id_transferencia;
    }

    public void setId_transferencia(int id_transferencia) {
        this.id_transferencia = id_transferencia;
    }

    public Date getFecha_transferencia() {
        return fecha_transferencia;
    }

    public void setFecha_transferencia(Date fecha_transferencia) {
        this.fecha_transferencia = fecha_transferencia;
    }

    public String getModo_transferencia() {
        return modo_transferencia;
    }

    public void setModo_transferencia(String modo_transferencia) {
        this.modo_transferencia = modo_transferencia;
    }

    public String getEquipo_transferencia() {
        return equipo_transferencia;
    }

    public void setEquipo_transferencia(String equipo_transferencia) {
        this.equipo_transferencia = equipo_transferencia;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Double getCotizacion() {
        return cotizacion;
    }

    public void setCotizacion(Double cotizacion) {
        this.cotizacion = cotizacion;
    }

    public int getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(int porcentaje) {
        this.porcentaje = porcentaje;
    }

    public int getId_jugador() {
        return id_jugador;
    }

    public void setId_jugador(int id_jugador) {
        this.id_jugador = id_jugador;
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

    public Double getCotizacion2() {
        return cotizacion2;
    }

    public void setCotizacion2(Double cotizacion2) {
        this.cotizacion2 = cotizacion2;
    }

}
