/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.views;

import com.mycompany.sistema.AdminDashboard;
import com.mycompany.sistema.UserDashboard;

/**
 *
 * @author dell-pc
 */
public class ReservaPanel extends javax.swing.JPanel {
    private String idBanner;
    private boolean isAdmin;
    
    public ReservaPanel(boolean isAdmin, String idBanner) {
        initComponents();
        this.isAdmin = isAdmin;
        this.idBanner = idBanner;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        tittle = new javax.swing.JLabel();
        futbolBtn = new javax.swing.JButton();
        rugbyBtn = new javax.swing.JButton();
        basketBtn = new javax.swing.JButton();
        voleyBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        bg.setBackground(new java.awt.Color(255, 255, 255));

        tittle.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        tittle.setForeground(new java.awt.Color(0, 0, 0));
        tittle.setText("Reservar canchas");

        futbolBtn.setBackground(new java.awt.Color(131, 28, 51));
        futbolBtn.setForeground(new java.awt.Color(0, 0, 0));
        futbolBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/fubol-sala-futsal-cancha (1).jpg"))); // NOI18N
        futbolBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        futbolBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        futbolBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                futbolBtnActionPerformed(evt);
            }
        });

        rugbyBtn.setBackground(new java.awt.Color(131, 28, 51));
        rugbyBtn.setForeground(new java.awt.Color(0, 0, 0));
        rugbyBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/rugby (1).jpg"))); // NOI18N
        rugbyBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        rugbyBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rugbyBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rugbyBtnActionPerformed(evt);
            }
        });

        basketBtn.setBackground(new java.awt.Color(131, 28, 51));
        basketBtn.setForeground(new java.awt.Color(0, 0, 0));
        basketBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/basket (1).jpg"))); // NOI18N
        basketBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        basketBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        basketBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                basketBtnActionPerformed(evt);
            }
        });

        voleyBtn.setBackground(new java.awt.Color(131, 28, 51));
        voleyBtn.setForeground(new java.awt.Color(0, 0, 0));
        voleyBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/volee (1).jpg"))); // NOI18N
        voleyBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        voleyBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        voleyBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voleyBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cancha de fútbol");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Cancha de basketball");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Cancha de rugby");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Cancha de volleyball");

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(futbolBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(rugbyBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(basketBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(voleyBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(78, 78, 78))
            .addGroup(bgLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tittle)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tittle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(futbolBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rugbyBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(basketBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(voleyBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
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

    private void futbolBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_futbolBtnActionPerformed
        ReservaFutPanel reservaFutPanel = new ReservaFutPanel(isAdmin, idBanner);
        
        if (isAdmin) {
            AdminDashboard.ShowPanel(reservaFutPanel);
        } else {
            UserDashboard.ShowPanel(reservaFutPanel);
        }
    }//GEN-LAST:event_futbolBtnActionPerformed

    private void rugbyBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rugbyBtnActionPerformed
        ReservaRugbyPanel reservaRugbyPanel = new ReservaRugbyPanel(isAdmin, idBanner);
        if (isAdmin) {
            AdminDashboard.ShowPanel(reservaRugbyPanel);
        } else {
            UserDashboard.ShowPanel(reservaRugbyPanel);
        }
    }//GEN-LAST:event_rugbyBtnActionPerformed

    private void basketBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_basketBtnActionPerformed
        ReservaBasketPanel reservaBasketPanel = new ReservaBasketPanel(isAdmin, idBanner);
        if (isAdmin) {
            AdminDashboard.ShowPanel(reservaBasketPanel);
        } else {
            UserDashboard.ShowPanel(reservaBasketPanel);
        }
    }//GEN-LAST:event_basketBtnActionPerformed

    private void voleyBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voleyBtnActionPerformed
        ReservaVoleyPanel reservaVoleyPanel = new ReservaVoleyPanel(isAdmin, idBanner);
        if (isAdmin) {
            AdminDashboard.ShowPanel(reservaVoleyPanel);
        } else {
            UserDashboard.ShowPanel(reservaVoleyPanel);
        }
    }//GEN-LAST:event_voleyBtnActionPerformed

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton basketBtn;
    private javax.swing.JPanel bg;
    private javax.swing.JButton futbolBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton rugbyBtn;
    private javax.swing.JLabel tittle;
    private javax.swing.JButton voleyBtn;
    // End of variables declaration//GEN-END:variables
}
