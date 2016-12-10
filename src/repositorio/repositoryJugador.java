/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorio;
import Conexion.Conexion;
import dominio.jugador;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class repositoryJugador {
    
  private Conexion postgresql=new Conexion();
   private Connection cn=postgresql.Open();
   
   private String sSQL="";
   public Integer totalregistros;
   
  ;
   public DefaultTableModel mostrar(String buscar){
       DefaultTableModel modelo;
       
       String [] titulos = {"ID","Nombres","Apellidos","Edad","Pasaporte","Posicion","E.debug","E.actual","Cotizacion","Cedula"};
       
       String [] registro =new String [10];
       
       totalregistros=0;
       modelo = new DefaultTableModel(null,titulos);
       
       sSQL="select id_jugador, nombres, apellidos, edad, pasaporte, posicion, equipo_debug,"
                    + "            equipo_actual, cotizacion, cedula from jugador where nombres like '%"+ buscar + "%' order by id_jugador desc";
       
       try {
           Statement st= cn.createStatement();
           ResultSet rs=st.executeQuery(sSQL);
           
           while(rs.next()){
               registro [0]=rs.getString("id_jugador");
               registro [1]=rs.getString("nombres");
               registro [2]=rs.getString("apellidos");
               registro [3]=rs.getString("edad");
               registro [4]=rs.getString("pasaporte");
               registro [5]=rs.getString("posicion");
               registro [6]=rs.getString("equipo_debug");
               registro [7]=rs.getString("equipo_actual");
               registro [8]=rs.getString("cotizacion");
               registro [9]=rs.getString("cedula");
               totalregistros=totalregistros+1;
               modelo.addRow(registro);
               
           }
           return modelo;
           
       } catch (Exception e) {
           JOptionPane.showConfirmDialog(null, e);
           return null;
       }
       
       
       
   } 
   
   public boolean Grabar (jugador dts){
       sSQL="INSERT INTO jugador( nombres, apellidos, edad, pasaporte, posicion, equipo_debug, equipo_actual, cotizacion, cedula) VALUES ( ?, ?, ?, ?, ?, ?,?, ?, ?)";
       try {
           
           PreparedStatement pst=cn.prepareStatement(sSQL);
           pst.setString(1, dts.getNombres());
           pst.setString(2, dts.getApellidos());
           pst.setInt(3, dts.getEdad());
           pst.setInt(4, dts.getPasaporte());
           pst.setString(5, dts.getPosicion());
           pst.setString(6, dts.getEquipodebug());
           pst.setString(7, dts.getEquipoactual());
           pst.setDouble(8, dts.getCotizacion());
            pst.setInt(9, dts.getCedula());
           
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
   
   public boolean editar (jugador dts){
       sSQL="UPDATE jugador SET nombres=?,apellidos=?,edad=?,pasaporte=?,posicion=?,equipo_debug=?, equipo_actual=?, cotizacion=?,  cedula=? WHERE id_jugador =?";
           
       
       try {
           PreparedStatement pst=cn.prepareStatement(sSQL);
           pst.setString(1, dts.getNombres());
           pst.setString(2, dts.getApellidos());
           pst.setInt(3, dts.getEdad());
           pst.setInt(4, dts.getPasaporte());
           pst.setString(5, dts.getPosicion());
           pst.setString(6, dts.getEquipodebug());
           pst.setString(7, dts.getEquipoactual());
           pst.setDouble(8, dts.getCotizacion());
            pst.setInt(9, dts.getCedula());
           pst.setInt(10, dts.getIdjugador());
           
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
  
   public boolean eliminar (jugador dts){
       sSQL="delete from jugador where id_jugador=?";
       
       try {
           
           PreparedStatement pst=cn.prepareStatement(sSQL);
           
           pst.setInt(1, dts.getIdjugador());
           
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
