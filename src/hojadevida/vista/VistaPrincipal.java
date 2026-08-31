package hojadevida.vista;

import hojadevida.modelo.DatosHojaVida;

import javax.swing.*;
import java.awt.*;

public class VistaPrincipal extends JPanel {

    public VistaPrincipal(DatosHojaVida datos) {
        setLayout(new BorderLayout(0, 0));
        setBackground(Estilos.FONDO_CONTENIDO);
        add(new PanelColumnaIzquierda(datos), BorderLayout.WEST);
        add(new JScrollPane(new PanelColumnaDerecha(datos)), BorderLayout.CENTER);
    }
}
