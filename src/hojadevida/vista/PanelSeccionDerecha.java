package hojadevida.vista;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;

public class PanelSeccionDerecha extends JPanel {

    public PanelSeccionDerecha(String titulo, String contenido) {
        setLayout(new BorderLayout(8, 10));
        setBackground(Estilos.FONDO_CONTENIDO);
        setOpaque(true);
        setBorder(new EmptyBorder(0, 0, Estilos.SEPARACION_SECCIONES, 0));
        setAlignmentX(Component.LEFT_ALIGNMENT);

        JLabel tituloLabel = new JLabel(titulo);
        tituloLabel.setFont(Estilos.FUENTE_CONTENIDO_TITULO);
        tituloLabel.setForeground(Estilos.TITULO_SECCION_DERECHA);
        tituloLabel.setBorder(new CompoundBorder(
                new MatteBorder(0, 0, 1, 0, Estilos.LINEA_ACENTO),
                new EmptyBorder(0, 0, 8, 0)
        ));

        JTextArea area = new JTextArea(contenido);
        area.setFont(Estilos.FUENTE_CONTENIDO);
        area.setForeground(Estilos.TEXTO_CONTENIDO);
        area.setBackground(Estilos.FONDO_CONTENIDO);
        area.setEditable(false);
        area.setLineWrap(true);
        area.setWrapStyleWord(true);
        area.setBorder(null);
        area.setCaretColor(Estilos.FONDO_CONTENIDO);
        area.setMargin(new Insets(0, 0, 0, 0));

        add(tituloLabel, BorderLayout.NORTH);
        add(area, BorderLayout.CENTER);
    }
}
