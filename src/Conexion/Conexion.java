
package Conexion;
import java.sql.Connection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class Conexion {
   public String db="Proyecto_final";
    public String url="jdbc:postgresql://localhost:5433/"+db;
    public String user="postgres";
    public String pass="1234";

    public Conexion() {
    }
    
   public Connection Open(){
    Connection link=null;
       try {
           Class.forName("org.postgresql.Driver");
      link=DriverManager.getConnection(this.url,this.user,this.pass);
     
       } catch (ClassNotFoundException | SQLException e) {
           JOptionPane.showConfirmDialog(null,e);
       }
       return link;
   }  
}