/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import Conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.MessageFormat;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import dominio.jugador;
import javax.swing.table.DefaultTableModel;
import repositorio.repositoryJugador;
import repositorio.repositoryEquipos;
import dominio.equipo;

import java.util.List;
/**
 *
 * @author HP1000
 */
public class Jugador extends javax.swing.JInternalFrame {
  repositoryEquipos equiporep=new   repositoryEquipos();
    /**
     * Creates new form Jugador
     */
    public Jugador() {
        initComponents();
        mostrar("");
        inhabilitar();
        llenarequipos();

    }

    private String accion = "guardar";

    void ocultar_columnas() {
        tablalistado.getColumnModel().getColumn(0).setMaxWidth(0);
        tablalistado.getColumnModel().getColumn(0).setMinWidth(0);
        tablalistado.getColumnModel().getColumn(0).setPreferredWidth(0);
    }

    void inhabilitar() {
        id_jugador.setVisible(false);

        txtnombres.setEnabled(false);
        txtapellidos.setEnabled(false);
        txtcotizacion.setEnabled(false);
        cboposicion.setEnabled(false);
        cboequipoactual.setEnabled(false);
          cboequipodebug.setEnabled(false);
        txtedad.setEnabled(false);
        txtcedula.setEnabled(false);
        txtpasaporte.setEnabled(false);
      

        btnguardar.setEnabled(false);
        btneliminar1.setEnabled(false);
        
        btnlimpiar.setEnabled(false);

        id_jugador.setText("");
        txtcotizacion.setText("");
        txtnombres.setText("");
        txtapellidos.setText("");
        txtcedula.setText("");
        txtedad.setText("");
        txtpasaporte.setText("");
        
    }

    void habilitar() {
        id_jugador.setVisible(false);

        txtnombres.setEnabled(true);
        txtapellidos.setEnabled(true);
        txtcotizacion.setEnabled(true);
        cboposicion.setEnabled(true);
        txtedad.setEnabled(true);
        txtcedula.setEnabled(true);
        txtpasaporte.setEnabled(true);
        cboequipoactual.setEnabled(true);
         cboequipodebug.setEnabled(true);

        btnguardar.setEnabled(true);
       btnlimpiar.setEnabled(true);
        btneliminar1.setEnabled(true);
        btnnuevo.setEnabled(false);

        id_jugador.setText("");
        txtcotizacion.setText("");
        txtnombres.setText("");
        txtapellidos.setText("");
        txtcedula.setText("");
        txtedad.setText("");
        txtpasaporte.setText("");
        

    }

    void mostrar(String buscar) {
        try {
            DefaultTableModel modelo;
            repositoryJugador func = new repositoryJugador();
            modelo = func.mostrar(buscar);

            tablalistado.setModel(modelo);
            //ocultar_columnas();
            lbltotalregistros.setText("Total Registros " + Integer.toString(func.totalregistros));

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(rootPane, e);
        }

       

        getContentPane().setBackground(new java.awt.Color(255, 204, 153));
        //setForeground(new java.awt.Color(153,255,255));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnguardar = new javax.swing.JButton();
        btnsalir = new javax.swing.JButton();
        txtpasaporte = new javax.swing.JTextField();
        txtapellidos = new javax.swing.JTextField();
        txtnombres = new javax.swing.JTextField();
        txtedad = new javax.swing.JTextField();
        txtcotizacion = new javax.swing.JTextField();
        cboposicion = new javax.swing.JComboBox<>();
        btnlimpiar = new javax.swing.JButton();
        id_jugador = new javax.swing.JTextField();
        btnbuscar = new javax.swing.JButton();
        txtcedula = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        btnnuevo = new javax.swing.JButton();
        cboequipoactual = new javax.swing.JComboBox<>();
        cboequipodebug = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablalistado = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        txtbuscar = new javax.swing.JTextField();
        btnbuscar1 = new javax.swing.JButton();
        btneliminar1 = new javax.swing.JButton();
        btnsalir1 = new javax.swing.JButton();
        lbltotalregistros = new javax.swing.JLabel();
        btnimprimir = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 255));
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setForeground(new java.awt.Color(255, 204, 153));

        fondo.setBackground(new java.awt.Color(102, 255, 102));
        fondo.setBorder(javax.swing.BorderFactory.createTitledBorder("Mantenimiento"));
        fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("FUTBOLISTAS");
        fondo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 140, 20));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("CEDULA:");
        fondo.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("APELLIDOS:");
        fondo.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("EDAD:");
        fondo.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("PASAPORTE");
        fondo.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("POSICION:");
        fondo.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("EQUIPO DEBUG:");
        fondo.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("EQUIPO ACTUAL:");
        fondo.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("COTIZACIÒN :");
        fondo.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, -1, -1));

        btnguardar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnguardar.setForeground(new java.awt.Color(204, 0, 0));
        btnguardar.setText("GUARDAR");
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });
        fondo.add(btnguardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 270, -1, -1));

        btnsalir.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnsalir.setText("SALIR");
        btnsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalirActionPerformed(evt);
            }
        });
        fondo.add(btnsalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 30, -1, -1));

        txtpasaporte.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtpasaporte.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtpasaporteKeyTyped(evt);
            }
        });
        fondo.add(txtpasaporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, 225, -1));

        txtapellidos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtapellidos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtapellidosKeyTyped(evt);
            }
        });
        fondo.add(txtapellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 232, -1));

        txtnombres.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtnombres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnombresKeyTyped(evt);
            }
        });
        fondo.add(txtnombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 225, -1));

        txtedad.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtedad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtedadActionPerformed(evt);
            }
        });
        txtedad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtedadKeyTyped(evt);
            }
        });
        fondo.add(txtedad, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, 190, -1));

        txtcotizacion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtcotizacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcotizacionKeyTyped(evt);
            }
        });
        fondo.add(txtcotizacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 460, 225, -1));

        cboposicion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cboposicion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DELANTERO", "DEFENSA", "ARQUERO", "VOLANTE" }));
        fondo.add(cboposicion, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, 130, -1));

        btnlimpiar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnlimpiar.setText("LIMPIAR");
        btnlimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimpiarActionPerformed(evt);
            }
        });
        fondo.add(btnlimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(413, 400, 110, -1));
        fondo.add(id_jugador, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, 30, 10));

        btnbuscar.setText("Buscar");
        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
            }
        });
        fondo.add(btnbuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, -1, -1));

        txtcedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcedulaKeyTyped(evt);
            }
        });
        fondo.add(txtcedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 120, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("NOMBRES:");
        fondo.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        btnnuevo.setBackground(new java.awt.Color(51, 51, 51));
        btnnuevo.setForeground(new java.awt.Color(255, 255, 255));
        btnnuevo.setText("Nuevo");
        btnnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnuevoActionPerformed(evt);
            }
        });
        fondo.add(btnnuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 110, -1, -1));

        cboequipoactual.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        fondo.add(cboequipoactual, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 410, 120, -1));

        cboequipodebug.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        fondo.add(cboequipodebug, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 360, 130, -1));

        jPanel2.setBackground(new java.awt.Color(0, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Listado de jugadores", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        tablalistado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tablalistado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablalistadoMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tablalistado);

        jLabel11.setText("Buscar");

        btnbuscar1.setBackground(new java.awt.Color(51, 51, 51));
        btnbuscar1.setForeground(new java.awt.Color(255, 255, 255));
        btnbuscar1.setText("Buscar");
        btnbuscar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscar1ActionPerformed(evt);
            }
        });

        btneliminar1.setBackground(new java.awt.Color(51, 51, 51));
        btneliminar1.setForeground(new java.awt.Color(255, 255, 255));
        btneliminar1.setText("Eliminar");
        btneliminar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminar1ActionPerformed(evt);
            }
        });

        btnsalir1.setBackground(new java.awt.Color(51, 51, 51));
        btnsalir1.setForeground(new java.awt.Color(255, 255, 255));
        btnsalir1.setText("Salir");
        btnsalir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalir1ActionPerformed(evt);
            }
        });

        lbltotalregistros.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbltotalregistros.setText("Registros");

        btnimprimir.setBackground(new java.awt.Color(51, 51, 51));
        btnimprimir.setForeground(new java.awt.Color(255, 255, 255));
        btnimprimir.setText("Imprimir");
        btnimprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnimprimirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addComponent(txtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnbuscar1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btneliminar1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lbltotalregistros, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnimprimir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 247, Short.MAX_VALUE)
                        .addComponent(btnsalir1)
                        .addGap(92, 92, 92))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnbuscar1)
                    .addComponent(btneliminar1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 124, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbltotalregistros)
                    .addComponent(btnimprimir)
                    .addComponent(btnsalir1))
                .addGap(94, 94, 94))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(fondo, javax.swing.GroupLayout.PREFERRED_SIZE, 598, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fondo, javax.swing.GroupLayout.PREFERRED_SIZE, 571, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 8, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimpiarActionPerformed
        // TODO adeso qd your handling code here:
        Limpiar();
    }//GEN-LAST:event_btnlimpiarActionPerformed

    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnsalirActionPerformed

    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed
        // TODO add your handling code here:
        Consultar();
        btneliminar1.setEnabled(true);
    }//GEN-LAST:event_btnbuscarActionPerformed

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
        // TODO add your handling code here:
        if (txtcedula.getText().length() == 0) {
            JOptionPane.showConfirmDialog(rootPane, "INGRESAR CEDULA");
            txtcedula.requestFocus();
            return;
        }
        if (txtnombres.getText().length() == 0) {
            JOptionPane.showConfirmDialog(rootPane, "INGRESAR NOMBRES");
            txtnombres.requestFocus();
            return;
        }
        if (txtapellidos.getText().length() == 0) {
            JOptionPane.showConfirmDialog(rootPane, "INGRESAR APELLIDOS");
            txtapellidos.requestFocus();
            return;
        }

        if (txtcotizacion.getText().length() == 0) {
            JOptionPane.showConfirmDialog(rootPane, "INGRESAR COTIZACION");
            txtcotizacion.requestFocus();
            return;
        }

        if (txtedad.getText().length() == 0) {
            JOptionPane.showConfirmDialog(rootPane, "INGRESAR EDAD");
            txtedad.requestFocus();
            return;
        }

        

        jugador dts = new jugador();
        repositoryJugador func = new repositoryJugador();

        dts.setNombres(txtnombres.getText());
        dts.setApellidos(txtapellidos.getText());
         dts.setEdad(Integer.parseInt(txtedad.getText()));
       dts.setPasaporte(Integer.parseInt(txtpasaporte.getText()));
       
        int seleccionado = cboposicion.getSelectedIndex();
        dts.setPosicion((String) cboposicion.getItemAt(seleccionado));
        
         seleccionado = cboequipodebug.getSelectedIndex();
        dts.setEquipodebug((String) cboequipodebug.getItemAt(seleccionado));
        
        seleccionado = cboequipoactual.getSelectedIndex();
        dts.setEquipoactual((String) cboequipoactual.getItemAt(seleccionado));
        
        
        
        dts.setCotizacion(Double.parseDouble(txtcotizacion.getText()));
      dts.setCedula (Integer.parseInt(txtcedula.getText()));

        if (accion.equals("guardar")) {
            if (func.Grabar(dts)) {
                JOptionPane.showMessageDialog(rootPane, "REGISTRO EXITOSO");
                mostrar("");
                inhabilitar();

            }

        } else if (accion.equals("editar")) {
            dts.setIdjugador(Integer.parseInt(id_jugador.getText()));

            if (func.editar(dts)) {
                JOptionPane.showMessageDialog(rootPane, "MODIFICACION EXITOSA");
                mostrar("");
                inhabilitar();
            }
        }
//Grabar();
        Limpiar();
    }//GEN-LAST:event_btnguardarActionPerformed

    private void txtnombresKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnombresKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if ((Character.isDigit(c))) {

            evt.consume();
            getToolkit().beep();
            JOptionPane.showMessageDialog(null, "Ingresar solo cadena de caracteres por favor");
        }

    }//GEN-LAST:event_txtnombresKeyTyped

    private void txtapellidosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtapellidosKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if ((Character.isDigit(c))) {

            evt.consume();
            getToolkit().beep();
            JOptionPane.showMessageDialog(null, "Ingresar solo cadena de caracteres por favor");
        }

    }//GEN-LAST:event_txtapellidosKeyTyped

    private void txtcedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcedulaKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if ((Character.isLetter(c))) {
            if (!(c > '.' & c < '.')) {
                evt.consume();
                getToolkit().beep();
                JOptionPane.showMessageDialog(null, "Ingresar solo numeros por favor");
            }
        }
    }//GEN-LAST:event_txtcedulaKeyTyped

    private void txtedadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtedadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtedadActionPerformed

    private void txtedadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtedadKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if ((Character.isLetter(c))) {
            if (!(c > '.' & c < '.')) {
                evt.consume();
                getToolkit().beep();
                JOptionPane.showMessageDialog(null, "Ingresar solo numeros por favor");
            }
        }
    }//GEN-LAST:event_txtedadKeyTyped

    private void txtpasaporteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpasaporteKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if ((Character.isLetter(c))) {
            if (!(c > '.' & c < '.')) {
                evt.consume();
                getToolkit().beep();
                JOptionPane.showMessageDialog(null, "Ingresar solo numeros por favor");
            }
        }
    }//GEN-LAST:event_txtpasaporteKeyTyped

    private void txtcotizacionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcotizacionKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if ((Character.isLetter(c))) {
            if (!(c > '.' & c < '.')) {
                evt.consume();
                getToolkit().beep();
                JOptionPane.showMessageDialog(null, "Ingresar solo numeros por favor");
            }
        }
    }//GEN-LAST:event_txtcotizacionKeyTyped

    private void tablalistadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablalistadoMouseClicked
        // TODO add your handling code here:
        btnguardar.setText("Editar");
         habilitar();
         
        btneliminar1.setEnabled(true);
        accion="editar";
        try {
            int fila = tablalistado.rowAtPoint(evt.getPoint());
            //int fila = tablalistado.getSelectedRow();
            System.err.println(""+fila);
            id_jugador.setText(tablalistado.getValueAt(fila, 0).toString());
            System.err.println("" + id_jugador.getText());
            if (id_jugador.getText().equals("")) {
                btneliminar1.setEnabled(false);
            } else {
                btneliminar1.setEnabled(true);
            }
            txtnombres.setText(tablalistado.getValueAt(fila, 1).toString());
            txtapellidos.setText(tablalistado.getValueAt(fila, 2).toString());
            txtedad.setText(tablalistado.getValueAt(fila, 3).toString());
            txtpasaporte.setText(tablalistado.getValueAt(fila, 4).toString());
            cboposicion.setSelectedItem(tablalistado.getValueAt(fila, 5).toString());
            cboequipodebug.setSelectedItem(tablalistado.getValueAt(fila, 6).toString());
            cboequipoactual.setSelectedItem(tablalistado.getValueAt(fila, 7).toString());
            txtcotizacion.setText(tablalistado.getValueAt(fila, 8).toString());
            txtcedula.setText(tablalistado.getValueAt(fila, 9).toString());
        } catch (Exception ex) {

        }

    }//GEN-LAST:event_tablalistadoMouseClicked

    private void btnbuscar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscar1ActionPerformed
        // TODO add your handling code here:
        mostrar(txtbuscar.getText());
    }//GEN-LAST:event_btnbuscar1ActionPerformed

    private void btneliminar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminar1ActionPerformed
        // TODO add your handling code here:
        if (id_jugador.getText() != ("")) {

            int confirmacion = JOptionPane.showConfirmDialog(rootPane, "SEGURO DE ELIMINAR?", "Confirmar", 2);

            if (confirmacion == 0) {
                repositoryJugador func = new repositoryJugador();
                jugador dts = new jugador();

                dts.setIdjugador(Integer.parseInt(id_jugador.getText()));
                func.eliminar(dts);
                mostrar("");
                inhabilitar();

            }

        }
    }//GEN-LAST:event_btneliminar1ActionPerformed

    private void btnsalir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalir1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnsalir1ActionPerformed

    private void btnimprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnimprimirActionPerformed
        // TODO add your handling code here:
        MessageFormat header = new MessageFormat("Listado de jugadores");
        MessageFormat footer = new MessageFormat("Pagina{0,number,integer}");
        try {
            tablalistado.print(JTable.PrintMode.NORMAL, header, footer);

        } catch (java.awt.print.PrinterException e) {

            System.err.format("error, no puede imrimir %s %n", e.getMessage());
        }

    }//GEN-LAST:event_btnimprimirActionPerformed

    private void btnnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnuevoActionPerformed
        // TODO add your handling code here:
        habilitar();
        btnguardar.setText("Guardar");
        accion = "guardar";
    }//GEN-LAST:event_btnnuevoActionPerformed

   /*  public void Grabar() {

        try {
            Conexion con = new Conexion();
            Connection conex = con.Open();
            PreparedStatement pst = conex.prepareStatement("INSERT INTO jugador( nombres, apellidos, edad, pasaporte, posicion, equipo_debug,"
                    + "            equipo_actual, cotizacion, cedula) VALUES ( ?, ?, ?, ?, ?, ?,?, ?, ?)");

            //pst.setInt(1, Integer.parseInt(id_jugador.getText()));
            pst.setString(1, txtnombres.getText().toUpperCase());
            pst.setString(2, txtapellidos.getText().toUpperCase());
            pst.setInt(3, Integer.parseInt(txtedad.getText()));
            pst.setInt(4, Integer.parseInt(txtpasaporte.getText()));

            int seleccionado = cboposicion.getSelectedIndex();
            pst.setString(5, cboposicion.getItemAt(seleccionado));

            pst.setString(6, txtdebug.getText().toUpperCase());
            pst.setString(7, txtactual.getText().toUpperCase());
            pst.setDouble(8, Double.parseDouble(txtcotizacion.getText()));
            pst.setInt(9, Integer.parseInt(txtcedula.getText()));

            pst.executeQuery();
             JOptionPane.showMessageDialog(rootPane, "Jugador Guardado", "Confirmación", 2);
          //  JOptionPane.showConfirmDialog(this, "Jugador Guardado", "Confirmación", 2);
        } catch (SQLException exc) {
            // JOptionPane.showMessageDialog(null, exc, "WARNING", JOptionPane.ERROR_MESSAGE);
        }
    }
   /* public void Modificar() {
        Conexion con = new Conexion();
        try {
            Connection conex = con.Open();
            PreparedStatement pst = conex.prepareStatement("UPDATE jugador SET nombres=?,apellidos=?,edad=?,pasaporte=?,"
                    + "posicion=?,equipo_debug=?, equipo_actual=?, cotizacion=?,  cedula=? WHERE id_jugador =?");

            pst.setString(1, txtnombres.getText().toUpperCase());
            pst.setString(2, txtapellidos.getText().toUpperCase());
            pst.setInt(3, Integer.parseInt(txtedad.getText()));
            pst.setInt(4, Integer.parseInt(txtpasaporte.getText()));

            int seleccionado = cboposicion.getSelectedIndex();
            pst.setString(5, cboposicion.getItemAt(seleccionado));

            pst.setString(6, txtdebug.getText().toUpperCase());
            pst.setString(7, txtactual.getText().toUpperCase());
            pst.setDouble(8, Double.parseDouble(txtcotizacion.getText()));
            pst.setInt(9, Integer.parseInt(txtcedula.getText()));
            pst.setInt(10, Integer.parseInt(id_jugador.getText()));
            pst.executeQuery();
            JOptionPane.showConfirmDialog(this, "Datos de Jugador Editado", "Confirmación", 2);
        } catch (SQLException exc) {
            //  JOptionPane.showMessageDialog(null,exc.getMessage(),"WARNING",JOptionPane.ERROR_MESSAGE);
        }
    }

    public void Eliminar() {
        Conexion con = new Conexion();
        try {
            Connection conex = con.Open();
            PreparedStatement pst = conex.prepareStatement("DELETE FROM jugador WHERE id_jugador =" + id_jugador.getText());
            pst.executeQuery();
            JOptionPane.showConfirmDialog(this, "Jugador Eliminado", "Confirmación", 2);
        } catch (SQLException exc) {
            //JOptionPane.showMessageDialog(null, exc.getMessage(), "WARNING", JOptionPane.ERROR_MESSAGE);
        }
    }*/

    public void Consultar() {
        Conexion con = new Conexion();
        try {
            Connection conex = con.Open();
            PreparedStatement pst = conex.prepareCall("SELECT * FROM jugador where cedula = " + txtcedula.getText());
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                id_jugador.setText(rs.getString(1));
                txtnombres.setText(rs.getString(2));
                txtapellidos.setText(rs.getString(3));
                txtedad.setText(rs.getString(4));
                txtpasaporte.setText(rs.getString(5));
                cboposicion.setSelectedItem(rs.getString(6));
                 cboequipodebug.setSelectedItem(rs.getString(7));
                cboequipoactual.setSelectedItem(rs.getString(8));
                txtcotizacion.setText(rs.getString(9));
                txtcedula.setText(rs.getString(10));

            } else {
                JOptionPane.showMessageDialog(null, "NO SE ENCONTRO FUTBOLISTA", "BOOK NOT FOUND", JOptionPane.ERROR_MESSAGE);
            }

        } catch (SQLException exc) {
            //JOptionPane.showMessageDialog(null,exc,"WARNING",JOptionPane.ERROR_MESSAGE);
        }
    }

    public void Limpiar() {
        id_jugador.setText("");
        txtnombres.setText("");
        txtapellidos.setText("");
        txtedad.setText("");
        txtpasaporte.setText("");
        cboposicion.setSelectedIndex(-0);
         cboequipoactual.setSelectedIndex(-0);
         cboequipodebug.setSelectedIndex(-0);
        txtcotizacion.setText("");
        txtcedula.setText("");
    }

   
    
   public void llenarequipos(){
        List<equipo> equi =equiporep.getEquipo();
        
        cboequipodebug.removeAllItems();  
        cboequipoactual.removeAllItems();
       
        
        for(equipo eq : equi){
            
            cboequipoactual.addItem(eq.getNombre());
            cboequipodebug.addItem(eq.getNombre());
        }
        
  
   }
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Jugador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Jugador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Jugador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Jugador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Jugador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbuscar;
    private javax.swing.JButton btnbuscar1;
    private javax.swing.JButton btneliminar1;
    private javax.swing.JButton btnguardar;
    private javax.swing.JButton btnimprimir;
    private javax.swing.JButton btnlimpiar;
    private javax.swing.JButton btnnuevo;
    private javax.swing.JButton btnsalir;
    private javax.swing.JButton btnsalir1;
    private javax.swing.JComboBox<String> cboequipoactual;
    private javax.swing.JComboBox<String> cboequipodebug;
    private javax.swing.JComboBox<String> cboposicion;
    private javax.swing.JPanel fondo;
    private javax.swing.JTextField id_jugador;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lbltotalregistros;
    private javax.swing.JTable tablalistado;
    private javax.swing.JTextField txtapellidos;
    private javax.swing.JTextField txtbuscar;
    private javax.swing.JTextField txtcedula;
    private javax.swing.JTextField txtcotizacion;
    private javax.swing.JTextField txtedad;
    private javax.swing.JTextField txtnombres;
    private javax.swing.JTextField txtpasaporte;
    // End of variables declaration//GEN-END:variables
}
