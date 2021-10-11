
package co.unicauca.microkernel.plugin.componente;

import co.unicauca.microkernel.common.entities.Component;
import co.unicauca.microkernel.common.interfaces.Render;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author braia
 */

/**
 * Clase en el que se configura el numero de celdas 
 * con sus respectivo contenidos del los atributos de 
 * los componentes.
 */
public class Tabla_Componentes {

    /**
     * Componente
     */
    Component componente = null;

    /**
     * Metodo que configura las celdas de la tabla componente
     * @param tabla enviado desde la interfaz 
     * @param componentes lista que contiene todos los componentes 
     * a registrar en la tabla.
     */
    public void visualizar_Componente(JTable tabla, List<Component> componentes) {

        tabla.setDefaultRenderer(Object.class, new Render());
        DefaultTableModel dt = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        dt.addColumn("IDproducto");
        dt.addColumn("Nombre");
        dt.addColumn("Tipo");
        dt.addColumn("Foto");

        componente = new Component();
        List<Component> list = componentes;

        if (list.size() > 0) {
            for (int i = 0; i < list.size(); i++) {
                Object fila[] = new Object[5];

                fila[0] = list.get(i).getCompID();
                fila[1] = list.get(i).getCompNombre();
                fila[2] = list.get(i).getCompTipo();

                try {
                    byte[] bi = list.get(i).getCompFoto();
                    BufferedImage image = null;
                    InputStream in = new ByteArrayInputStream(bi);
                    image = ImageIO.read(in);
                    ImageIcon imgi = new ImageIcon(image.getScaledInstance(60, 60, 0));
                    fila[3] = new JLabel(imgi);

                } catch (Exception ex) {
                    fila[3] = new JLabel("No imagen");
                }
            dt.addRow(fila);
            }
            tabla.setModel(dt);
            tabla.setRowHeight(60);
        }
    }
}
