/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package agendacontactos;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import views.Index;

/**
 *
 * @author dell-pc
 */
public class AgendaContactos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException e) {
            
        }
        new Index().setVisible(true);
    }
    
}
