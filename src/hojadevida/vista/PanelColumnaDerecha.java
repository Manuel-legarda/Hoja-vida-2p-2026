package hojadevida.vista;

import hojadevida.modelo.DatosHojaVida;

import javax.swing.*;
import java.awt.*;

public class PanelColumnaDerecha extends JPanel {

    private final DatosHojaVida datos;

    public PanelColumnaDerecha(DatosHojaVida datos) {
        this.datos = datos;
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setBackground(Estilos.FONDO_CONTENIDO);
        setBorder(BorderFactory.createEmptyBorder(Estilos.PADDING_CONTENIDO, Estilos.PADDING_CONTENIDO + 5, Estilos.PADDING_CONTENIDO, Estilos.PADDING_CONTENIDO));
        add(new PanelSeccionDerecha("PROFESSIONAL SUMMARY", datos.getPerfil()));
        add(Box.createVerticalStrut(4));
        add(new PanelSeccionDerecha("EXPERIENCE", datos.getExperiencia()));
        add(Box.createVerticalStrut(4));
        add(new PanelSeccionDerecha("EDUCATION", datos.getEducacion()));
        add(Box.createVerticalStrut(4));
        add(new PanelSeccionDerecha("AREAS OF INTEREST", datos.getAreasInteresFormateadas()));
        add(Box.createVerticalStrut(4));
        add(new PanelSeccionDerecha("UNIVERSITY & ACADEMIC PROJECTS", datos.getProyectos()));
    }
}
