/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorio;

import Conexion.Conexion;
import dominio.equipo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HP1000
 */
public class repositoryEquipos {
    
    
    private Conexion postgresql=new Conexion();
   private Connection cn=postgresql.Open();
   
   private String sSQL="";
   public Integer totalregistros;
   
  ;
   public DefaultTableModel mostrar(String buscar){
       DefaultTableModel modelo;
       
       String [] titulos = {"ID","Nombre","Ciudad","Serie","Numjugadores","Numasistentes","Detalles","C.I.Tecnico","NombresApellidos","Edad","Pasaporte"};
       
       String [] registro =new String [11];
       
       totalregistros=0;
       modelo = new DefaultTableModel(null,titulos);
       
       sSQL="select idequipo, nombre,origen,serie,numjugadores,numasistentes,detalles,cedula,nombres,edad,pasaporte from equipo where nombre like '%"+ buscar + "%' order by idequipo desc";
       
       try {
           Statement st= cn.createStatement();
           ResultSet rs=st.executeQuery(sSQL);
           
           while(rs.next()){
               registro [0]=rs.getString("idequipo");
               registro [1]=rs.getString("nombre");
               registro [2]=rs.getString("origen");
               registro [3]=rs.getString("serie");
               registro [4]=rs.getString("numjugadores");
               registro [5]=rs.getString("numasistentes");
               registro [6]=rs.getString("detalles");
               registro [7]=rs.getString("cedula");
               registro [8]=rs.getString("nombres");
               registro [9]=rs.getString("edad");
               registro [10]=rs.getString("pasaporte");
               
               totalregistros=totalregistros+1;
               modelo.addRow(registro);
               
           }
           return modelo;
           
       } catch (Exception e) {
           JOptionPane.showConfirmDialog(null, e);
           return null;
       }
       
       
       
   } 
   
   public boolean Grabar (equipo dts){
       sSQL="Insert Into equipo(nombre,origen,serie,numjugadores,numasistentes,detalles,cedula,nombres,edad,pasaporte) Values(?,?,?,?,?,?,?,?,?,?)";
       try {
           
           PreparedStatement pst=cn.prepareStatement(sSQL);
           pst.setString(1, dts.getNombre());
           pst.setString(2, dts.getOrigen());
           pst.setString(3, dts.getSerie());
           pst.setInt(4, dts.getNum_jugadores());
            pst.setInt(5, dts.getNum_asistentes());
           pst.setString(6, dts.getDetalles());
           pst.setInt(7, dts.getCedula());
           pst.setString(8, dts.getNombresApellidos());
            pst.setInt(9, dts.getEdad());
            pst.setInt(10, dts.getPasaporte());
            
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
   
   public boolean editar (equipo dts){
       sSQL="UPDATE equipo SET nombre=?,origen=?,serie=?,numjugadores=?,numasistentes=?,detalles=?, cedula=?, nombres=?, edad=?,pasaporte=? WHERE idequipo =?";
           
       
       try {
           PreparedStatement pst=cn.prepareStatement(sSQL);
       
           pst.setString(1, dts.getNombre());
           pst.setString(2, dts.getOrigen());
           pst.setString(3, dts.getSerie());
           pst.setInt(4, dts.getNum_jugadores());
            pst.setInt(5, dts.getNum_asistentes());
           pst.setString(6, dts.getDetalles());
           pst.setInt(7, dts.getCedula());
           pst.setString(8, dts.getNombresApellidos());
            pst.setInt(9, dts.getEdad());
            pst.setInt(10, dts.getPasaporte());
           pst.setInt(11, dts.getIdequipo());
           
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
  
   public boolean eliminar (equipo dts){
       sSQL="delete from equipo where idequipo";
       
       try {
           
           PreparedStatement pst=cn.prepareStatement(sSQL);
           
           pst.setInt(1, dts.getIdequipo());
           
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
       
         public List<equipo> getEquipo(){
        
		List<equipo> equipos = new ArrayList<equipo>();
		String query = "SELECT * FROM equipo ORDER BY idequipo ASC";
		try{
			      Conexion con = new Conexion();
            Connection conex = con.Open();
			PreparedStatement pst = conex.prepareStatement(query);
			ResultSet rs = pst.executeQuery();
			while(rs.next()){
				 
                                 equipo obj = new equipo(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5),rs.getInt(6),rs.getString(7),rs.getInt(8),rs.getString(9),rs.getInt(10),rs.getInt(11));
				equipos.add(obj);
			}
			conex.close();
		}
		catch(SQLException exc){
			JOptionPane.showMessageDialog(null, exc.getMessage(), "ERROR",JOptionPane.ERROR_MESSAGE);
		}
		
		return equipos;
    
   }
    
    
    
    
    
}
