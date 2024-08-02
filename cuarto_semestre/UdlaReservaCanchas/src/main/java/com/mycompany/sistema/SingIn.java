package com.mycompany.sistema;

import com.mycompany.sistema.*;
import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.extras.FlatSVGIcon;
import com.mycompany.interfaces.DAOUsers;
import com.mycompany.models.Usuarios;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author Joao Conde, Victor Suquilanda, Josue Riera, Pablo Yanez
 */
public class SingIn extends javax.swing.JFrame {

    public SingIn() {
        initComponents();
        
        setIconImage(new ImageIcon(getClass().getResource("/icon.png")).getImage());
        
        // Text Field
        Color backgroundColor = new Color(Integer.parseInt("D9D9D9", 16));
        int paddingLeft = 5;
        Border paddingBorder = new EmptyBorder(0, paddingLeft, 0, 0);

        idBannerTxtF.setBorder(BorderFactory.createCompoundBorder(idBannerTxtF.getBorder(), paddingBorder));
        passwordTxtF.setBorder(BorderFactory.createCompoundBorder(passwordTxtF.getBorder(), paddingBorder));
        
        idBannerTxtF.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Inserta tu ID Banner");
        idBannerTxtF.setBackground(backgroundColor);
        idBannerTxtF.putClientProperty("JComponent.roundRect", true);
        idBannerTxtF.putClientProperty(FlatClientProperties.TEXT_FIELD_LEADING_ICON, new FlatSVGIcon("svg/id.svg"));
        
        passwordTxtF.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Inserta tu contraseña");
        passwordTxtF.setBackground(backgroundColor);
        passwordTxtF.putClientProperty("JComponent.roundRect", true);
        passwordTxtF.putClientProperty(FlatClientProperties.TEXT_FIELD_LEADING_ICON, new FlatSVGIcon("svg/password.svg"));
        passwordTxtF.putClientProperty(FlatClientProperties.STYLE, "showRevealButton:true");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        side = new javax.swing.JPanel();
        udlaLogo = new javax.swing.JLabel();
        separador = new javax.swing.JSeparator();
        text1 = new javax.swing.JLabel();
        text2 = new javax.swing.JLabel();
        singUnBtn = new com.mycompany.components.MyButton();
        text3 = new javax.swing.JLabel();
        text4 = new javax.swing.JLabel();
        text6 = new javax.swing.JLabel();
        idBannerTxtF = new javax.swing.JTextField();
        passwordTxtF = new javax.swing.JPasswordField();
        singInBtn = new com.mycompany.components.MyButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setForeground(new java.awt.Color(255, 255, 255));

        side.setBackground(new java.awt.Color(131, 28, 51));

        udlaLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logos/udlaLogo.png"))); // NOI18N

        separador.setForeground(new java.awt.Color(255, 255, 255));

        text1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        text1.setForeground(new java.awt.Color(255, 255, 255));
        text1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        text1.setText("En caso de que no tengas una");

        text2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        text2.setForeground(new java.awt.Color(255, 255, 255));
        text2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        text2.setText("cuenta, puedes crear una");

        singUnBtn.setBackground(new java.awt.Color(131, 28, 51));
        singUnBtn.setForeground(new java.awt.Color(255, 255, 255));
        singUnBtn.setText("Crear Cuenta");
        singUnBtn.setBorderColor(new java.awt.Color(255, 255, 255));
        singUnBtn.setColor(new java.awt.Color(131, 28, 51));
        singUnBtn.setColorClick(new java.awt.Color(94, 29, 43));
        singUnBtn.setColorOver(new java.awt.Color(94, 29, 43));
        singUnBtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        singUnBtn.setRadius(40);
        singUnBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                singUnBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout sideLayout = new javax.swing.GroupLayout(side);
        side.setLayout(sideLayout);
        sideLayout.setHorizontalGroup(
            sideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sideLayout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addGroup(sideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(separador, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(sideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sideLayout.createSequentialGroup()
                                .addComponent(udlaLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(22, 22, 22))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sideLayout.createSequentialGroup()
                                .addGroup(sideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(text1, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
                                    .addComponent(text2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(50, 50, 50))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sideLayout.createSequentialGroup()
                        .addComponent(singUnBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70))))
        );
        sideLayout.setVerticalGroup(
            sideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sideLayout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(udlaLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(separador, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(text1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(text2)
                .addGap(36, 36, 36)
                .addComponent(singUnBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(140, Short.MAX_VALUE))
        );

        text3.setFont(new java.awt.Font("Segoe UI", 1, 60)); // NOI18N
        text3.setForeground(new java.awt.Color(131, 28, 51));
        text3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        text3.setText("Iniciar Sesión");

        text4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        text4.setForeground(new java.awt.Color(131, 28, 51));
        text4.setText("Id Banner:");

        text6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        text6.setForeground(new java.awt.Color(131, 28, 51));
        text6.setText("Contraseña:");

        idBannerTxtF.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        idBannerTxtF.setForeground(new java.awt.Color(0, 0, 0));
        idBannerTxtF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idBannerTxtFActionPerformed(evt);
            }
        });

        passwordTxtF.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        passwordTxtF.setForeground(new java.awt.Color(0, 0, 0));
        passwordTxtF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordTxtFActionPerformed(evt);
            }
        });

        singInBtn.setBackground(new java.awt.Color(131, 28, 51));
        singInBtn.setForeground(new java.awt.Color(255, 255, 255));
        singInBtn.setText("Iniciar Sesión");
        singInBtn.setBorderColor(new java.awt.Color(255, 255, 255));
        singInBtn.setColor(new java.awt.Color(131, 28, 51));
        singInBtn.setColorClick(new java.awt.Color(94, 29, 43));
        singInBtn.setColorOver(new java.awt.Color(94, 29, 43));
        singInBtn.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        singInBtn.setRadius(40);
        singInBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                singInBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addComponent(side, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(text4)
                            .addComponent(text6)
                            .addComponent(idBannerTxtF, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
                            .addComponent(passwordTxtF)
                            .addComponent(text3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(196, 196, 196)
                        .addComponent(singInBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(101, Short.MAX_VALUE))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(side, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addComponent(text3)
                .addGap(47, 47, 47)
                .addComponent(text4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(idBannerTxtF, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(text6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordTxtF, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(singInBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void singUnBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_singUnBtnActionPerformed
        SingUp singUp = new SingUp();
        singUp.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_singUnBtnActionPerformed

    private void idBannerTxtFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idBannerTxtFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idBannerTxtFActionPerformed

    private void passwordTxtFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordTxtFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordTxtFActionPerformed

    private void singInBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_singInBtnActionPerformed
        String idBanner = idBannerTxtF.getText();
        String password = new String(passwordTxtF.getPassword());

        if (idBanner.isEmpty() || password.isEmpty()){
            JOptionPane.showMessageDialog(null, "ID Banner o contraseña vacía", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        try {
            DAOUsers dao = new DAOUsersImpl();
            Usuarios usuario = dao.obtenerUsuarioPorIdBanner(idBanner);
            
            if (usuario == null) {
                JOptionPane.showMessageDialog(null, "Usuario no encontrado", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            if (!usuario.checkPassword(password)) {
                JOptionPane.showMessageDialog(null, "Contraseña incorrecta", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            if(usuario.isAdmin()) {
                AdminDashboard adminDS = new AdminDashboard(idBanner ,usuario.getUsername(), usuario.isAdmin());
                adminDS.setVisible(true);
            } else {
                UserDashboard userDS = new UserDashboard(idBanner ,usuario.getUsername(), usuario.isAdmin());
                userDS.setVisible(true);
            }
            this.setVisible(false);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al iniciar sesión", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_singInBtnActionPerformed
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SingIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JTextField idBannerTxtF;
    private javax.swing.JPasswordField passwordTxtF;
    private javax.swing.JSeparator separador;
    private javax.swing.JPanel side;
    private com.mycompany.components.MyButton singInBtn;
    private com.mycompany.components.MyButton singUnBtn;
    private javax.swing.JLabel text1;
    private javax.swing.JLabel text2;
    private javax.swing.JLabel text3;
    private javax.swing.JLabel text4;
    private javax.swing.JLabel text6;
    private javax.swing.JLabel udlaLogo;
    // End of variables declaration//GEN-END:variables
}
