package com.mycompany.udlareservacanchas;

import com.formdev.flatlaf.intellijthemes.FlatCyanLightIJTheme;
import com.mycompany.sistema.SingIn;
import java.sql.SQLException;
import javax.swing.UIManager;

/**
 *
 * @author Joao Conde, Victor Suquilanda, Josue Riera, Pablo Yanez
 */
public class UdlaReservaCanchas {

    public static void main(String[] args) throws SQLException {
        FlatCyanLightIJTheme.setup();
        UIManager.put( "Button.arc", 999 );
        
        SingIn start = new SingIn();
        start.setVisible(true);
    }
}
