/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorio;

import Conexion.Conexion;
import dominio.equipo;
import static dominio.equipo.id;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class repositoryEquipo {
 
    
   Conexion con= new Conexion();
    
  
    public repositoryEquipo(){
        
    }
    
   
    public void agregar(equipo equi){
         try{
               Conexion con = new Conexion();
            Connection conex = con.Open();
          
           PreparedStatement psr= conex.prepareStatement("Insert Into equipo(nombre,origen,serie,numjugadores,numasistentes,detalles,cedula,nombres,edad,pasaporte) Values(?,?,?,?,?,?,?,?,?,?)");
           psr.setString(1,equi.getNombre());
            psr.setString(2,equi.getOrigen());
            psr.setString(3,equi.getSerie());
           psr.setInt(4, equi.getNum_jugadores());
            psr.setInt(5, equi.getNum_asistentes());
             psr.setString(6,equi.getDetalles());
              psr.setInt(7, equi.getCedula());
               psr.setString(8,equi.getNombresApellidos());
               psr.setInt(9, equi.getEdad());
            psr.setInt(10, equi.getPasaporte());
            
           psr.execute();
           conex.close();
       
       
               }
      catch(SQLException exc){
               JOptionPane.showMessageDialog(null,exc.getMessage(),"Error", JOptionPane.ERROR_MESSAGE);  
        exc.printStackTrace();
    }
    }
    
    public void editar(int id,equipo equip){
        try{
          Conexion con = new Conexion();
            Connection conex = con.Open();
      PreparedStatement psr= conex.prepareStatement("UPDATE equipo Set nombre=?,origen=?, serie=?, numjugadores=?, numasistente=?, detalles=?, cedula=?, nombres=?, edad=?, pasaporte=?  Where idequipo=?");
      
      psr.setString(1,equip.getNombre());
       psr.setString(2,equip.getOrigen());
          psr.setString(3,equip.getSerie());
         psr.setInt(4, equip.getNum_jugadores());
            psr.setInt(5, equip.getNum_asistentes());
            psr.setString(6,equip.getDetalles());
              psr.setInt(7, equip.getCedula());
              psr.setString(8,equip.getNombresApellidos());
               psr.setInt(9, equip.getEdad());
            psr.setInt(10, equip.getPasaporte());
       psr.setInt(11, equip.getIdequipo());
       
      psr.execute();
      conex.close();
    }
    catch(SQLException exc){
        JOptionPane.showMessageDialog(null, exc.getMessage(),"Error", JOptionPane.ERROR_MESSAGE);
        exc.printStackTrace();
    } 
    }
    
    public void eliminar( int id){
        String query = "Delete From equipo Where idequipo=?";
        try{
                Conexion con = new Conexion();
            Connection conex = con.Open();
      PreparedStatement psr= conex.prepareStatement(query);
      psr.setInt(1, id);
      psr.execute();
      conex.close();
        }
        catch(SQLException exc){
            JOptionPane.showMessageDialog(null, exc.getMessage(),"Error", JOptionPane.ERROR_MESSAGE);
        }
    
    }
    
         
    
    
    public equipo getEquipos(int id){
     String query = "SELECT * FROM equipo WHERE  idequipo = ?";
		equipo equipos = null;
    try{
           Conexion con = new Conexion();
            Connection conex = con.Open();
			PreparedStatement pst = conex.prepareStatement(query);
			pst.setInt(1, id);
			ResultSet rs = pst.executeQuery();
			while(rs.next()){
					equipos = new equipo(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5),rs.getInt(6),rs.getString(7),rs.getInt(8),rs.getString(9),rs.getInt(10),rs.getInt(11));
			}
			conex.close();
		}
		catch(SQLException exc){
			JOptionPane.showMessageDialog(null, exc.getMessage(), "ERROR",JOptionPane.ERROR_MESSAGE);
		}
		
		return equipos;

    }
    
  
    public List<equipo> getEquipoporNombre(String val){
        List<equipo> equipos=new ArrayList<equipo>();
     String query= "Select * From equipo Where nombre like?  ";
    try{
            Conexion con = new Conexion();
            Connection conex = con.Open();
      PreparedStatement psr= conex.prepareStatement(query);
      psr.setString(1,"%" + val+ "%");
      psr.setString(2,"%" + val + "%");
      psr.setString(3,"%" + val + "%");
      psr.setString(4,"%" + val + "%");
      psr.setString(5,"%" + val + "%");
      psr.setString(6,"%" + val + "%");
      psr.setString(7,"%" + val + "%");
      psr.setString(8,"%" + val + "%");
      psr.setString(9,"%" + val + "%");
      psr.setString(10,"%" + val + "%");
      psr.setString(11,"%" + val + "%");
      
      
        ResultSet rs=psr.executeQuery();
        while (rs.next()){
           
           equipo obj= new equipo(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5),rs.getInt(6),rs.getString(7),rs.getInt(8),rs.getString(9),rs.getInt(10),rs.getInt(11));
            equipos.add(obj);
        }
        conex.close();
    } 
    catch(SQLException exc){
        JOptionPane.showMessageDialog(null, exc.getMessage(),"ERROR",JOptionPane.ERROR_MESSAGE);
    }
        return equipos;
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


