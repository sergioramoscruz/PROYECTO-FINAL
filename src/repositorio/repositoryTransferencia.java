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
import dominio.jugador;

import dominio.transferencia;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import dominio.transferencia;
import dto.transferenciadto;
import java.sql.Date;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class repositoryTransferencia {

    Conexion con = new Conexion();

    public repositoryTransferencia() {

    }

    public void grabar(transferencia dts) {
        try {
            Conexion con = new Conexion();
            Connection conex = con.Open();

            PreparedStatement pst = conex.prepareStatement("INSERT INTO transferencia( fecha, modo_transferencia, "
                    + "equipo_transferencia,descripcion, cotizacion, porcentaje, id_jugador ) "
                    + "VALUES ( ?, ?, ?, ?, ?, ?, ?)");

            pst.setDate(1, (Date) dts.getFecha_transferencia());
            pst.setString(2, dts.getModotransferencia());
            pst.setString(3, dts.getEquipotransferencia());
            pst.setString(4, dts.getDescripcion());
            pst.setDouble(5, dts.getValoragegado());
            pst.setInt(6, dts.getPorcentaje());
            //   pst.setInt(7, dts.getIdjugador());
            pst.setInt(7, dts.getId_jugador());

            pst.execute();
            conex.close();

        } catch (SQLException exc) {
            JOptionPane.showMessageDialog(null, exc.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            exc.printStackTrace();
        }
    }

    public void modificar(transferencia dts) {
        try {
            Conexion con = new Conexion();
            Connection conex = con.Open();
            PreparedStatement pst = conex.prepareStatement("UPDATE transferencia SET fecha=?, modo_transferencia=?, "
                    + "equipo_transferencia=?,"
                    + "descripcion=?, cotizacion=?, porcentaje=?, id_jugador=?  WHERE id_transferencia =?");

            pst.setDate(1, (Date) dts.getFecha_transferencia());
            pst.setString(2, dts.getModotransferencia());
            pst.setString(3, dts.getEquipotransferencia());
            pst.setString(4, dts.getDescripcion());
            pst.setDouble(5, dts.getValoragegado());
            pst.setInt(6, dts.getPorcentaje());
            pst.setInt(7, dts.getId_jugador());
            pst.setInt(8, dts.getIdtransferencia());

            pst.execute();
            conex.close();
        } catch (SQLException exc) {
            JOptionPane.showMessageDialog(null, exc.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            exc.printStackTrace();
        }
    }

    public void eliminar(transferencia transferencia) {
        String query = "Delete From transferencia Where id_transferencia=?";
        try {
            Conexion con = new Conexion();
            Connection conex = con.Open();
            PreparedStatement psr = conex.prepareStatement(query);
            psr.setInt(1, transferencia.getIdtransferencia());
            psr.execute();
            conex.close();
        } catch (SQLException exc) {
            JOptionPane.showMessageDialog(null, exc.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

    }

    /*public void ConsultarJugador(jugador dts) {
        try {
            Conexion con = new Conexion();
            Connection conex = con.Open();
            PreparedStatement pst = conex.prepareStatement("SELECT id_jugador,nombres,apellidos,cotizacion FROM jugador where cedula");

            pst.setInt(1, dts.getIdjugador());
            pst.setString(2, dts.getNombres());
            pst.setString(3, dts.getApellidos());
            pst.setDouble(4, dts.getCotizacion());

            pst.execute();
            conex.close();
        } catch (SQLException exc) {
            JOptionPane.showMessageDialog(null, exc.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            exc.printStackTrace();

        }
    }*/
    public List<jugador> getJugador(jugador jugador) {

        List<jugador> jugadores = new ArrayList<jugador>();
        String query = "SELECT * FROM jugador where cedula=? ORDER BY id_jugador ASC";
        try {
            Conexion con = new Conexion();
            Connection conex = con.Open();
            PreparedStatement pst = conex.prepareStatement(query);
            pst.setInt(1, jugador.getIdjugador());
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {

                jugador obj = new jugador(rs.getInt(1), rs.getString(2), rs.getString(3),
                        rs.getInt(4), rs.getInt(5), rs.getString(6),
                        rs.getString(7), rs.getString(8), rs.getDouble(9), rs.getInt(10));
                jugadores.add(obj);
            }
            conex.close();
        } catch (SQLException exc) {
            JOptionPane.showMessageDialog(null, exc.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }

        return jugadores;
    }

    public List<transferenciadto> getJugadorTransferido(transferenciadto dts) {
        List<transferenciadto> jugadorTransferido = new ArrayList<transferenciadto>();
        try {
            String sql = "select t.id_transferencia, t.fecha, t.modo_transferencia, "
                    + "t.equipo_transferencia, t.descripcion,t.cotizacion, "
                    + "t.porcentaje, t.id_jugador,j.nombres, j.apellidos, j.cotizacion "
                    + "from transferencia t "
                    + "inner join jugador j on j.id_jugador= t.id_jugador "
                    + "where j.cedula=?";
            Conexion con = new Conexion();
            Connection conex = con.Open();
            PreparedStatement pst = conex.prepareStatement(sql);
            pst.setInt(1, dts.getId_transferencia());

            ResultSet rs = pst.executeQuery();
            if (rs.next()) {

                transferenciadto obj = new transferenciadto(rs.getInt(1), rs.getDate(2),
                        rs.getString(3), rs.getString(4), rs.getString(5),
                        rs.getDouble(6), rs.getInt(7), rs.getInt(8),
                        rs.getString(9), rs.getString(10), rs.getDouble(11));
                jugadorTransferido.add(obj);
            }
            conex.close();
        } catch (SQLException exc) {
            JOptionPane.showMessageDialog(null, exc.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }

        return jugadorTransferido;
    }

}
