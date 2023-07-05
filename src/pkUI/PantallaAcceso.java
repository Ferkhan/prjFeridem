package pkUI;

import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class PantallaAcceso {
    private JFrame pantallaAcceso;
    private static final int ALTO_PANTALLA = 700;
    private static final int ANCHO_PANTALLA = ALTO_PANTALLA / 2;
    
    public PantallaAcceso() {
        pantallaAcceso = new JFrame();
        pantallaAcceso = new JFrame("Feridem");
        pantallaAcceso.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pantallaAcceso.setSize(ANCHO_PANTALLA, ALTO_PANTALLA);
        pantallaAcceso.setResizable(false);
    }
    
    /**
     * <b>mostrarPantalla</b>: Presenta la pantalla de acceso donde el usuario ingresa sus datos
     */
    public void mostrarPantalla() {
        pantallaAcceso.setLocationRelativeTo(null);
        
        JLabel etiquetaBase = new JLabel();
        ImageIcon imagenFondo = new ImageIcon("src\\pkUI\\pantalla-login.png");
        Image imagenEscalonada = imagenFondo.getImage().getScaledInstance(ANCHO_PANTALLA - 15, ALTO_PANTALLA, Image.SCALE_SMOOTH);
        ImageIcon imagenFondoEscalonada = new ImageIcon(imagenEscalonada);
        etiquetaBase.setIcon(imagenFondoEscalonada);
        etiquetaBase.setBounds(0, 0, ANCHO_PANTALLA, ALTO_PANTALLA);
        
        
        JTextField campoUsuario = new JTextField();
        JTextField campoContrasenia = new JTextField();
        campoUsuario.setText("Usuario");
        campoUsuario.setForeground(Color.GRAY);
        campoContrasenia.setText("Contraseña");
        campoContrasenia.setForeground(Color.GRAY);
        campoUsuario.setBounds(25, 375, 290, 35);
        campoContrasenia.setBounds(25, 440, 290, 35);
        
        JButton pulsadorAcceso = new JButton("Iniciar Sesión");
        pulsadorAcceso.setBounds(35, 500, 270, 55);
        pantallaAcceso.getContentPane().setLayout(null);
        pantallaAcceso.getContentPane().add(etiquetaBase);
        pantallaAcceso.getContentPane().add(pulsadorAcceso);
        pantallaAcceso.getContentPane().add(campoUsuario);
        pantallaAcceso.getContentPane().add(campoContrasenia);
        pantallaAcceso.setVisible(true);
    }
}
