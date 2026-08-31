package hojadevida;

import hojadevida.modelo.DatosHojaVida;
import hojadevida.vista.Estilos;
import hojadevida.vista.VistaPrincipal;

import javax.swing.*;
import java.awt.*;

public class HojaDeVida extends JFrame {

    private static final int ANCHO = 800;
    private static final int ALTO = 900;

    public HojaDeVida() {
        DatosHojaVida datos = new DatosHojaVida();
        setTitle("Hoja de Vida - Estructura de Datos");
        setSize(ANCHO, ALTO);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(true);
        getContentPane().setBackground(Estilos.FONDO_CONTENIDO);

        JScrollPane scroll = new JScrollPane(new VistaPrincipal(datos));
        scroll.setBorder(null);
        scroll.getViewport().setBackground(Estilos.FONDO_CONTENIDO);
        scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        add(scroll);
    }

    public static void main(String[] args) {
        try { UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName()); } catch (Exception ignored) { }
        SwingUtilities.invokeLater(() -> {
            new HojaDeVida().setVisible(true);
        });
    }
}
