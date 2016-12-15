/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;
import java.sql.Date;
/**
 *
 * @author HP1000
 */
public class transferencia {
    private Date fecha_transferencia;
    private String modotransferencia;
    private String equipotransferencia;
    private String descripcion;
    private Double valoragegado;
    private int idtransferencia;
    private int porcentaje;
    private int id_jugador;
   
 

    public transferencia(Date fecha_transferencia, String modotransferencia, String equipotransferencia, String descripcion, Double valoragegado, int idtransferencia, int porcentaje) {
        this.fecha_transferencia = fecha_transferencia;
        this.modotransferencia = modotransferencia;
        this.equipotransferencia = equipotransferencia;
        this.descripcion = descripcion;
        this.valoragegado = valoragegado;
        this.idtransferencia = idtransferencia;
        this.porcentaje = porcentaje;
  
       
    }

 

    
    public transferencia(){
        
    }

    public Date getFecha_transferencia() {
        return fecha_transferencia;
    }

    public void setFecha_transferencia(Date fecha_transferencia) {
        this.fecha_transferencia = fecha_transferencia;
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

    public Double getValoragegado() {
        return valoragegado;
    }

    public void setValoragegado(Double valoragegado) {
        this.valoragegado = valoragegado;
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

    public int getId_jugador() {
        return id_jugador;
    }

    public void setId_jugador(int id_jugador) {
        this.id_jugador = id_jugador;
    }
    
}
