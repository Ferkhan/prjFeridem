package pkUI;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JWindow;

public class PantallaInicio {
    private JWindow pantallaLogo;
    private static final int ALTO_PANTALLA = 700;
    private static final int ANCHO_PANTALLA = ALTO_PANTALLA / 2;
    
    /**
     * <b>gerNumeroPositivyLetraso</b>: Presenta el primer pantallazo del programa correspodiente a la renta de 
     * habitaciones. 
     * @return boolean
     */
    public boolean mostrarPantalla() {
        pantallaLogo = new JWindow();
        pantallaLogo.setSize(ANCHO_PANTALLA, ALTO_PANTALLA);
        Dimension tamañoPantalla = Toolkit.getDefaultToolkit().getScreenSize();
        pantallaLogo.setLocation((tamañoPantalla.width - ANCHO_PANTALLA) / 2, (tamañoPantalla.height - ALTO_PANTALLA) / 2);
        ImageIcon logoEmpresa = new ImageIcon("src\\pkUI\\logo-splash.png"); 
        Image imagenAEscalonar = logoEmpresa.getImage();
        Image imagenEscalonada = imagenAEscalonar.getScaledInstance(ANCHO_PANTALLA ,ALTO_PANTALLA , Image.SCALE_SMOOTH);
        ImageIcon pantallazoLogoEscalonado = new ImageIcon(imagenEscalonada);
        JLabel etiquetaPantallazo = new JLabel(pantallazoLogoEscalonado);
        pantallaLogo.getContentPane().add(etiquetaPantallazo);
        pantallaLogo.setVisible(true);
        try {
            Thread.sleep(5000);  
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        pantallaLogo.dispose();  
        return true;
    }

}
