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
public class transferencia {
    private String fechatransferencia;
    private String modotransferencia;
    private String equipotransferencia;
    private String descripcion;
    private String cotizacion;
    private int idtransferencia;
    private int porcentaje;

    public transferencia(String fechatransferencia, String modotransferencia, String equipotransferencia, String descripcion, String cotizacion, int idtransferencia, int porcentaje) {
        this.fechatransferencia = fechatransferencia;
        this.modotransferencia = modotransferencia;
        this.equipotransferencia = equipotransferencia;
        this.descripcion = descripcion;
        this.cotizacion = cotizacion;
        this.idtransferencia = idtransferencia;
        this.porcentaje = porcentaje;
    }
    public transferencia(){
        
    }

    public String getFechatransferencia() {
        return fechatransferencia;
    }

    public void setFechatransferencia(String fechatransferencia) {
        this.fechatransferencia = fechatransferencia;
    }

    public String getModotransferencia() {
        return modotransferencia;
    }

    public void setModotransferencia(String modotransferencia) {
        this.modotransferencia = modotransferencia;
    }

    public String getEquipotransferencia() {
        return equipotransferencia;
    }

    public void setEquipotransferencia(String equipotransferencia) {
        this.equipotransferencia = equipotransferencia;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCotizacion() {
        return cotizacion;
    }

    public void setCotizacion(String cotizacion) {
        this.cotizacion = cotizacion;
    }

    public int getIdtransferencia() {
        return idtransferencia;
    }

    public void setIdtransferencia(int idtransferencia) {
        this.idtransferencia = idtransferencia;
    }

    public int getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(int porcentaje) {
        this.porcentaje = porcentaje;
    }
    
    
    
    
    
}
