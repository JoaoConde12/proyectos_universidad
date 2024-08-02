/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.views;

import com.mycompany.udlareservacanchas.*;
import com.mycompany.views.*;
import com.formdev.flatlaf.FlatClientProperties;
import com.mycompany.models.Reservas;
import com.mycompany.sistema.AdminDashboard;
import com.mycompany.sistema.DAOReservasImpl;

import java.awt.Color;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author dell-pc
 */
public class GestionarReservasPanel extends javax.swing.JPanel {

    private DAOReservasImpl daoReservas;

    public GestionarReservasPanel() {
        initComponents();
        idBannerTxtF.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Inserta el ID Banner a buscar");
        daoReservas = new DAOReservasImpl();
        actualizarTablaReservas();
        centrarContenidoTabla(tablaReservas);
    }
    
    private void centrarContenidoTabla(JTable table) {
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(DefaultTableCellRenderer.CENTER);
        for (int i = 0; i < table.getColumnCount(); i++) {
            table.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        }
    }

    private void actualizarTablaReservas() {
        try {
            List<Reservas> reservas = daoReservas.getAllReservas(); 
            llenarTablaReservas(reservas);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error al cargar las reservas: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void llenarTablaReservas(List<Reservas> reservas) {
        DefaultTableModel model = (DefaultTableModel) tablaReservas.getModel();
        model.setRowCount(0);

        for (Reservas reserva : reservas) {
            Object[] rowData = {
                reserva.getIdReserva(),
                reserva.getIdBanner(),
                obtenerNombreCancha(reserva.getCanchaID()),
                reserva.getNumeroPersonas(),
                new SimpleDateFormat("yyyy-MM-dd").format(reserva.getFecha()),
                formatHora(reserva.getHoraInicio()) + " - " + formatHora(reserva.getHoraFin())
            };
            model.addRow(rowData);
        }
    }

    private String formatHora(Time hora) {
        return new SimpleDateFormat("HH:mm").format(hora);
    }

    private String obtenerNombreCancha(int canchaID) {
        switch (canchaID) {
            case 1:
                return "Fútbol";
            case 2:
                return "Rugby";
            case 3:
                return "Basketball - Mitad 1";
            case 4:
                return "Basketball - Mitad 2";
            case 5:
                return "Volleyball - Mitad 1";
            case 6:
                return "Volleyball - Mitad 2";
            default:
                return "Desconocida";
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        bg = new javax.swing.JPanel();
        buscarBtn = new javax.swing.JButton();
        tittle = new javax.swing.JLabel();
        tableReservas = new javax.swing.JScrollPane();
        tablaReservas = new javax.swing.JTable();
        optionsCancha = new javax.swing.JComboBox<>();
        idBannerTxtF = new javax.swing.JTextField();
        text1 = new javax.swing.JLabel();
        text2 = new javax.swing.JLabel();
        filtarBtn = new javax.swing.JButton();
        verTodoBtn = new javax.swing.JButton();
        eliminarBtn = new javax.swing.JButton();

        jTextField1.setText("jTextField1");

        bg.setBackground(new java.awt.Color(255, 255, 255));

        buscarBtn.setBackground(new java.awt.Color(131, 28, 51));
        buscarBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        buscarBtn.setForeground(new java.awt.Color(255, 255, 255));
        buscarBtn.setText("Buscar por ID");
        buscarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarBtnActionPerformed(evt);
            }
        });

        tittle.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        tittle.setForeground(new java.awt.Color(0, 0, 0));
        tittle.setText("Ver reservas");

        tablaReservas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Id Reserva", "Id Banner", "Cancha", "N° Personas", "Fecha", "Hora"
            }
        ));
        tablaReservas.setShowVerticalLines(true);
        tableReservas.setViewportView(tablaReservas);

        optionsCancha.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fútbol", "Rugby", "Basketball", "Volleyball" }));

        idBannerTxtF.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        idBannerTxtF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idBannerTxtFActionPerformed(evt);
            }
        });

        text1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        text1.setForeground(new java.awt.Color(0, 0, 0));
        text1.setText("Buscar por ID Banner:");

        text2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        text2.setForeground(new java.awt.Color(0, 0, 0));
        text2.setText("Filtrar cancha:");

        filtarBtn.setBackground(new java.awt.Color(131, 28, 51));
        filtarBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        filtarBtn.setForeground(new java.awt.Color(255, 255, 255));
        filtarBtn.setText("Aplicar Filtro");
        filtarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filtarBtnActionPerformed(evt);
            }
        });

        verTodoBtn.setBackground(new java.awt.Color(131, 28, 51));
        verTodoBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        verTodoBtn.setForeground(new java.awt.Color(255, 255, 255));
        verTodoBtn.setText("Ver todo");
        verTodoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verTodoBtnActionPerformed(evt);
            }
        });

        eliminarBtn.setBackground(new java.awt.Color(131, 28, 51));
        eliminarBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        eliminarBtn.setForeground(new java.awt.Color(255, 255, 255));
        eliminarBtn.setText("Eliminar Reserva");
        eliminarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addComponent(tittle)
                        .addGap(624, 631, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, bgLayout.createSequentialGroup()
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tableReservas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 703, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(bgLayout.createSequentialGroup()
                                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                                        .addComponent(text1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(idBannerTxtF, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(65, 65, 65)
                                        .addComponent(text2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(bgLayout.createSequentialGroup()
                                        .addComponent(buscarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(filtarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(verTodoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(196, 196, 196)))
                                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(optionsCancha, 0, 132, Short.MAX_VALUE)
                                    .addComponent(eliminarBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tittle)
                .addGap(26, 26, 26)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(text1)
                    .addComponent(idBannerTxtF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(text2)
                    .addComponent(optionsCancha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buscarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(filtarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(verTodoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eliminarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(tableReservas, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void idBannerTxtFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idBannerTxtFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idBannerTxtFActionPerformed

    private void buscarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarBtnActionPerformed
        String idBanner = idBannerTxtF.getText();
        if (idBanner.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, ingresa un ID Banner.", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }

        try {
            List<Reservas> reservas = daoReservas.getReservasPorIdBanner(idBanner);
            if (reservas.isEmpty()) {
                JOptionPane.showMessageDialog(this, "ID Banner no encontrado.", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                llenarTablaReservas(reservas);
                idBannerTxtF.setText("");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error al buscar las reservas: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_buscarBtnActionPerformed

    private boolean esReservaDeCancha(Reservas reserva, String canchaSeleccionada) {
        int canchaID = reserva.getCanchaID();
        switch (canchaSeleccionada) {
            case "Fútbol":
                return canchaID == 1;
            case "Rugby":
                return canchaID == 2;
            case "Basketball":
                return canchaID == 3 || canchaID == 4;
            case "Volleyball":
                return canchaID == 5 || canchaID == 6;
            default:
                return false;
        }
    }
    
    private void filtarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filtarBtnActionPerformed
        String canchaSeleccionada = (String) optionsCancha.getSelectedItem();
        if (canchaSeleccionada == null || canchaSeleccionada.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, selecciona una cancha para filtrar.", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }

        try {
            List<Reservas> reservas = daoReservas.getAllReservas();
            reservas.removeIf(reserva -> !esReservaDeCancha(reserva, canchaSeleccionada));
            llenarTablaReservas(reservas);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error al filtrar las reservas: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_filtarBtnActionPerformed

    private void verTodoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verTodoBtnActionPerformed
        actualizarTablaReservas();
    }//GEN-LAST:event_verTodoBtnActionPerformed

    private void eliminarBtnActionPerformed(java.awt.event.ActionEvent evt) {                                            
        int selectedRow = tablaReservas.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Por favor, selecciona una reserva para eliminar.", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }
    
        int idReserva = (int) tablaReservas.getValueAt(selectedRow, 0);  // Asumiendo que la primera columna es el ID de la reserva
    
        int confirm = JOptionPane.showConfirmDialog(this, "¿Estás seguro de que deseas eliminar esta reserva?", "Confirmar eliminación", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            try {
                boolean success = daoReservas.borrarReserva(idReserva);
                if (success) {
                    JOptionPane.showMessageDialog(this, "Reserva eliminada con éxito.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                    actualizarTablaReservas();
                } else {
                    JOptionPane.showMessageDialog(this, "Error al eliminar la reserva.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Error al eliminar la reserva: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }   
    }
        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JButton buscarBtn;
    private javax.swing.JButton eliminarBtn;
    private javax.swing.JButton filtarBtn;
    private javax.swing.JTextField idBannerTxtF;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JComboBox<String> optionsCancha;
    private javax.swing.JTable tablaReservas;
    private javax.swing.JScrollPane tableReservas;
    private javax.swing.JLabel text1;
    private javax.swing.JLabel text2;
    private javax.swing.JLabel tittle;
    private javax.swing.JButton verTodoBtn;
    // End of variables declaration//GEN-END:variables
}
