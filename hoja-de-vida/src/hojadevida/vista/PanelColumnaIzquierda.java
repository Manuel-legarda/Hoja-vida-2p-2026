package hojadevida.vista;

import hojadevida.modelo.DatosHojaVida;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class PanelColumnaIzquierda extends JPanel {

    private final DatosHojaVida datos;

    public PanelColumnaIzquierda(DatosHojaVida datos) {
        this.datos = datos;
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setBackground(Estilos.FONDO_LATERAL);
        setBorder(new EmptyBorder(Estilos.PADDING_LATERAL + 10, Estilos.PADDING_LATERAL, Estilos.PADDING_LATERAL, Estilos.PADDING_LATERAL));
        setPreferredSize(new Dimension(Estilos.ANCHO_COLUMNA_IZQ, 0));
        add(crearNombre());
        add(Box.createVerticalStrut(4));
        add(crearTitulo());
        add(Box.createVerticalStrut(2));
        add(crearUbicacion());
        add(Box.createVerticalStrut(24));
        add(crearSeccion("CONTACT", "☎ " + datos.getTelefono() + "\n✉ " + datos.getEmail() + "\n" + datos.getGithub()));
        add(Box.createVerticalStrut(20));
        add(crearSeccion("TECHNICAL SKILLS", datos.getHabilidadesTecnicasFormateadas()));
        add(Box.createVerticalStrut(18));
        add(crearSeccion("SOFT SKILLS", datos.getHabilidadesBlandasFormateadas()));
        add(Box.createVerticalStrut(18));
        add(crearSeccion("LANGUAGES", datos.getIdiomas()));
        add(Box.createVerticalGlue());
    }

    private JLabel crearNombre() {
        JLabel l = new JLabel("<html><div style='text-align:left'>" + datos.getNombre().replace(" ", "&nbsp;") + "</div></html>");
        l.setFont(Estilos.FUENTE_NOMBRE);
        l.setForeground(Estilos.TEXTO_LATERAL);
        l.setAlignmentX(Component.LEFT_ALIGNMENT);
        return l;
    }

    private JLabel crearTitulo() {
        JLabel l = new JLabel(datos.getTitulo());
        l.setFont(Estilos.FUENTE_TITULO);
        l.setForeground(Estilos.TEXTO_LATERAL_SUAVE);
        l.setAlignmentX(Component.LEFT_ALIGNMENT);
        return l;
    }

    private JLabel crearUbicacion() {
        JLabel l = new JLabel(datos.getCiudad());
        l.setFont(Estilos.FUENTE_UBICACION);
        l.setForeground(Estilos.TEXTO_LATERAL_SUAVE);
        l.setAlignmentX(Component.LEFT_ALIGNMENT);
        return l;
    }

    private JPanel crearSeccion(String titulo, String contenido) {
        JPanel p = new JPanel(new BorderLayout(6, 6));
        p.setBackground(Estilos.FONDO_LATERAL);
        p.setAlignmentX(Component.LEFT_ALIGNMENT);
        JLabel tit = new JLabel(titulo);
        tit.setFont(Estilos.FUENTE_SECCION);
        tit.setForeground(Estilos.TITULO_SECCION_LATERAL);
        JTextArea cont = new JTextArea(contenido);
        cont.setFont(Estilos.FUENTE_ITEM);
        cont.setForeground(Estilos.TEXTO_LATERAL);
        cont.setBackground(Estilos.FONDO_LATERAL);
        cont.setEditable(false);
        cont.setLineWrap(true);
        cont.setWrapStyleWord(true);
        cont.setBorder(null);
        cont.setCaretColor(Estilos.FONDO_LATERAL);
        cont.setMargin(new Insets(0, 0, 0, 0));
        p.add(tit, BorderLayout.NORTH);
        p.add(cont, BorderLayout.CENTER);
        return p;
    }
}
