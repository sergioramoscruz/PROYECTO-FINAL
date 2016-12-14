/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorio;

/**
 *
 * @author HP1000
 */
import Conexion.Conexion;
import dominio.transferencia;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import dominio.jugador;
import java.sql.Date;

public class repositoryTransferencia {
    
  private Conexion postgresql=new Conexion();
   private Connection cn=postgresql.Open();
   
   private String sSQL="";
   public Integer totalregistros;
   
  ;
   public DefaultTableModel mostrar(String buscar){
       DefaultTableModel modelo;
       
       String [] titulos = {"ID","Fecha","Modo","E.transferido","Descripcion","cotizacion","Porcentaje","IdJugador","NumTransfer"};
       
       String [] registro =new String [9];
       
       totalregistros=0;
       modelo = new DefaultTableModel(null,titulos);
       
       sSQL="select id_transferencia, fecha, modo_transferencia,equipo_transferencia,descripcion, cotizacion, porcentaje, numtransfer from transferencia where modo_transferencia like '%"+ buscar + "%' order by id_transferencia desc";
       
       try {
           Statement st= cn.createStatement();
           ResultSet rs=st.executeQuery(sSQL);
           
           while(rs.next()){
               registro [0]=rs.getString("id_transferencia");
               registro [1]=rs.getString("fecha");
               registro [2]=rs.getString("modo_transferencia");
               registro [3]=rs.getString("equipo_transferencia");
               registro [4]=rs.getString("descripcion");
               registro [5]=rs.getString("cotizacion");
               registro [6]=rs.getString("porcentaje");
               //registro [7]=rs.getString("id_jugador");
               registro [7]=rs.getString("numtransfer");
               totalregistros=totalregistros+1;
               modelo.addRow(registro);
               
           }
           return modelo;
           
       } catch (Exception e) {
           JOptionPane.showConfirmDialog(null, e);
           return null;
       }
       
       
       
   } 
   
   public boolean Grabar (transferencia dts){
       sSQL=("INSERT INTO transferencia( fecha, modo_transferencia, "
                    + "equipo_transferencia,descripcion, cotizacion, porcentaje,numtransfer) "+
            "VALUES ( ?, ?, ?, ?, ?, ?, ?,?)");
       try {
           
           PreparedStatement pst=cn.prepareStatement(sSQL);
           
           pst.setDate(1, (Date) dts.getFecha_transferencia());
           pst.setString(2, dts.getModotransferencia());
            pst.setString(3, dts.getEquipotransferencia());
             pst.setString(4, dts.getDescripcion());
             pst.setDouble(5, dts.getValoragegado());
             pst.setInt(6, dts.getPorcentaje());
          //   pst.setInt(7, dts.getIdjugador());
              pst.setInt(7, dts.getNumtransfer());
           pst.setInt(8, dts.getIdtransferencia());
           
           int n=pst.executeUpdate();
           
           if (n!=0){
               return true;
           }
           else {
               return false;
           }
           
           
           
       } catch (Exception e) {
           JOptionPane.showConfirmDialog(null, e);
           return false;
       }
   }
   
   public boolean editar (transferencia dts){
       sSQL=("UPDATE transferencia SET fecha=?, modo_transferencia=?, "
                    + "equipo_transferencia=?,"
        + "descripcion=?, cotizacion=?, porcentaje=?,numtransfer=?  WHERE id_transferencia =?");
           
       
       try {
           PreparedStatement pst=cn.prepareStatement(sSQL);
           
           pst.setDate(1, (Date) dts.getFecha_transferencia());
           pst.setString(2, dts.getModotransferencia());
            pst.setString(3, dts.getEquipotransferencia());
             pst.setString(4, dts.getDescripcion());
             pst.setDouble(5, dts.getValoragegado());
             pst.setInt(6, dts.getPorcentaje());
              pst.setInt(7, dts.getNumtransfer());
             //pst.setInt(8, dts.getIdjugador()); 
            pst.setInt(8, dts.getIdtransferencia());
            
           int n=pst.executeUpdate();
           
           if (n!=0){
               return true;
           }
           else {
               return false;
           }
           
       } catch (Exception e) {
           JOptionPane.showConfirmDialog(null, e);
           return false;
       }
   }
  
   public boolean eliminar (transferencia dts){
       sSQL="delete from transferencia where id_transferencia=?";
       
       try {
           
           PreparedStatement pst=cn.prepareStatement(sSQL);
           
           pst.setInt(1, dts.getIdtransferencia());
           
           int n=pst.executeUpdate();
           
           if (n!=0){
               return true;
           }
           else {
               return false;
           }
           
       } catch (Exception e) {
           JOptionPane.showConfirmDialog(null, e);
           return false;
       }
   }
    
    
    
    
    
}
