import pkUI.PantallaAcceso;
import pkUI.PantallaInicio;

public class App {
    public static void main(String[] args) throws Exception {
        PantallaInicio pantallaInicial = new PantallaInicio();
        pantallaInicial.mostrarPantalla();
        PantallaAcceso pantallaAcceso = new PantallaAcceso();
        pantallaAcceso.mostrarPantalla();
    }
}
