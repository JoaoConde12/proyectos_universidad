/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.sistema;

import com.mycompany.views.HomePanel;
import com.mycompany.views.ReservaPanel;
import com.mycompany.views.VerReservasPanel;
import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author Joao Conde, Victor Suquilanda, Josue Riera, Pablo Yanez
 */
public class UserDashboard extends javax.swing.JFrame {
    private String idBanner;
    private boolean isAdmin;
    
    /**
     * Creates new form userDashboard
     */
    public UserDashboard(String idBanner, String username, boolean isAdmin) {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/icon.png")).getImage());
        
        HomePanel homePanel = new HomePanel();
        ShowPanel(homePanel);
        userNameTxt.setText(username);
        this.idBanner = idBanner;
        this.isAdmin = isAdmin;
    }
    
    public String getIdBanner() {
        return idBanner;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        sideBar = new javax.swing.JPanel();
        udlaLogo = new javax.swing.JLabel();
        separador = new javax.swing.JSeparator();
        text1 = new javax.swing.JLabel();
        text2 = new javax.swing.JLabel();
        homoBtn = new com.mycompany.components.MyButton();
        reservaBtn = new com.mycompany.components.MyButton();
        verReservaBtn = new com.mycompany.components.MyButton();
        userIcon = new javax.swing.JLabel();
        userNameTxt = new javax.swing.JLabel();
        singOutBtn = new com.mycompany.components.MyButton();
        header = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        content = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        bg.setBackground(new java.awt.Color(255, 255, 255));

        sideBar.setBackground(new java.awt.Color(131, 28, 51));

        udlaLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        udlaLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logos/udlaLogo2.png"))); // NOI18N

        separador.setForeground(new java.awt.Color(255, 255, 255));

        text1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        text1.setForeground(new java.awt.Color(255, 255, 255));
        text1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        text1.setText("El mundo necesita gente");

        text2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        text2.setForeground(new java.awt.Color(255, 255, 255));
        text2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        text2.setText("que ame lo que hace ♥");

        homoBtn.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 20, 1, 1, new java.awt.Color(0, 0, 0)));
        homoBtn.setForeground(new java.awt.Color(255, 255, 255));
        homoBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logos/homeLogo.png"))); // NOI18N
        homoBtn.setText("Menú Principal");
        homoBtn.setBorderColor(new java.awt.Color(131, 28, 51));
        homoBtn.setBorderPainted(false);
        homoBtn.setColor(new java.awt.Color(131, 28, 51));
        homoBtn.setColorClick(new java.awt.Color(148, 79, 80));
        homoBtn.setColorOver(new java.awt.Color(148, 79, 80));
        homoBtn.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        homoBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        homoBtn.setIconTextGap(12);
        homoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homoBtnActionPerformed(evt);
            }
        });

        reservaBtn.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 20, 1, 1, new java.awt.Color(0, 0, 0)));
        reservaBtn.setForeground(new java.awt.Color(255, 255, 255));
        reservaBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logos/reservaLogo.png"))); // NOI18N
        reservaBtn.setText("Reservar Canchas");
        reservaBtn.setBorderColor(new java.awt.Color(131, 28, 51));
        reservaBtn.setBorderPainted(false);
        reservaBtn.setColor(new java.awt.Color(131, 28, 51));
        reservaBtn.setColorClick(new java.awt.Color(148, 79, 80));
        reservaBtn.setColorOver(new java.awt.Color(148, 79, 80));
        reservaBtn.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        reservaBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        reservaBtn.setIconTextGap(12);
        reservaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reservaBtnActionPerformed(evt);
            }
        });

        verReservaBtn.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 20, 1, 1, new java.awt.Color(0, 0, 0)));
        verReservaBtn.setForeground(new java.awt.Color(255, 255, 255));
        verReservaBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logos/verLogo.png"))); // NOI18N
        verReservaBtn.setText("Ver Reservas");
        verReservaBtn.setBorderColor(new java.awt.Color(131, 28, 51));
        verReservaBtn.setBorderPainted(false);
        verReservaBtn.setColor(new java.awt.Color(131, 28, 51));
        verReservaBtn.setColorClick(new java.awt.Color(148, 79, 80));
        verReservaBtn.setColorOver(new java.awt.Color(148, 79, 80));
        verReservaBtn.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        verReservaBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        verReservaBtn.setIconTextGap(12);
        verReservaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verReservaBtnActionPerformed(evt);
            }
        });

        userIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        userIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logos/userLogo.png"))); // NOI18N

        userNameTxt.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        userNameTxt.setForeground(new java.awt.Color(255, 255, 255));
        userNameTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        userNameTxt.setText("User Name");

        singOutBtn.setBackground(new java.awt.Color(131, 28, 51));
        singOutBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        singOutBtn.setForeground(new java.awt.Color(255, 255, 255));
        singOutBtn.setText("Cerrar Sesión");
        singOutBtn.setBorderColor(new java.awt.Color(255, 255, 255));
        singOutBtn.setBorderPainted(false);
        singOutBtn.setColor(new java.awt.Color(131, 28, 51));
        singOutBtn.setColorClick(new java.awt.Color(94, 29, 43));
        singOutBtn.setColorOver(new java.awt.Color(94, 29, 43));
        singOutBtn.setRadius(40);
        singOutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                singOutBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout sideBarLayout = new javax.swing.GroupLayout(sideBar);
        sideBar.setLayout(sideBarLayout);
        sideBarLayout.setHorizontalGroup(
            sideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sideBarLayout.createSequentialGroup()
                .addGroup(sideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(sideBarLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(sideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(udlaLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(separador, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(text1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(text2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(sideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(sideBarLayout.createSequentialGroup()
                            .addGap(47, 47, 47)
                            .addComponent(singOutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sideBarLayout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(sideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(userNameTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(userIcon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(28, Short.MAX_VALUE))
            .addComponent(verReservaBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(reservaBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(homoBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        sideBarLayout.setVerticalGroup(
            sideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sideBarLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(udlaLogo)
                .addGap(12, 12, 12)
                .addComponent(separador, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(text1)
                .addGap(6, 6, 6)
                .addComponent(text2)
                .addGap(27, 27, 27)
                .addGroup(sideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(sideBarLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(reservaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(homoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(verReservaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(userIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(userNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(singOutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        header.setBackground(new java.awt.Color(24, 19, 22));
        header.setPreferredSize(new java.awt.Dimension(110, 110));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Reserva de Canchas - Udla Arena");

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE)
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel2)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        content.setBackground(new java.awt.Color(255, 255, 255));
        content.setMinimumSize(new java.awt.Dimension(0, 490));

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addComponent(sideBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(sideBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(bgLayout.createSequentialGroup()
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(content, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void reservaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reservaBtnActionPerformed
        ReservaPanel reservaPanel = new ReservaPanel(isAdmin, idBanner);
        ShowPanel(reservaPanel);
    }//GEN-LAST:event_reservaBtnActionPerformed

    private void singOutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_singOutBtnActionPerformed
        SingIn singIn = new SingIn();
        singIn.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_singOutBtnActionPerformed

    private void homoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homoBtnActionPerformed
        HomePanel homePanel = new HomePanel();
        ShowPanel(homePanel);
    }//GEN-LAST:event_homoBtnActionPerformed

    private void verReservaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verReservaBtnActionPerformed
        VerReservasPanel verReservasPanel = new VerReservasPanel();
        ShowPanel(verReservasPanel);
    }//GEN-LAST:event_verReservaBtnActionPerformed

    
    public static void ShowPanel(JPanel panel) {
        panel.setSize(744, 484);
        panel.setLocation(0, 0);
        
        content.removeAll();
        content.add(panel, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }
    
    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(UserDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserDashboard("", "", false).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JPanel bg;
    private static javax.swing.JPanel content;
    private static javax.swing.JPanel header;
    private static com.mycompany.components.MyButton homoBtn;
    private static javax.swing.JLabel jLabel2;
    private static com.mycompany.components.MyButton reservaBtn;
    private static javax.swing.JSeparator separador;
    private static javax.swing.JPanel sideBar;
    private static com.mycompany.components.MyButton singOutBtn;
    private static javax.swing.JLabel text1;
    private static javax.swing.JLabel text2;
    private static javax.swing.JLabel udlaLogo;
    private static javax.swing.JLabel userIcon;
    private static javax.swing.JLabel userNameTxt;
    private static com.mycompany.components.MyButton verReservaBtn;
    // End of variables declaration//GEN-END:variables
}