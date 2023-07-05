package pkUI;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JWindow;

public class PantallaInicio {
    private JWindow pantallaLogo;
    private static final int ALTO_PANTALLA = 700;
    private static final int ANCHO_PANTALLA = ALTO_PANTALLA / 2;
    
    /**
     * <b>mostrarPantalla</b>: Presenta el primer pantallazo del programa correspodiente a la renta de habitaciones. 
     * @return boolean
     */
    public boolean mostrarPantalla() {
        pantallaLogo = new JWindow();
        pantallaLogo.setSize(ANCHO_PANTALLA, ALTO_PANTALLA);
        pantallaLogo.setLocationRelativeTo(null);
        ImageIcon logoEmpresa = new ImageIcon("src\\pkUI\\logo-splash.png"); 
        Image imagenAEscalonar = logoEmpresa.getImage();
        Image imagenEscalonada = imagenAEscalonar.getScaledInstance(ANCHO_PANTALLA ,ALTO_PANTALLA , Image.SCALE_SMOOTH);
        ImageIcon pantallazoLogoEscalonado = new ImageIcon(imagenEscalonada);
        JLabel etiquetaPantalla = new JLabel(pantallazoLogoEscalonado);
        pantallaLogo.getContentPane().add(etiquetaPantalla);
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
