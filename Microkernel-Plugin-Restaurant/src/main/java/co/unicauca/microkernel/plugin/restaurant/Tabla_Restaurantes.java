
package co.unicauca.microkernel.plugin.restaurant;

import co.unicauca.microkernel.common.entities.Restaurant;
import co.unicauca.microkernel.common.interfaces.Render;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.List;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


/**
 * Clase en el que se configura el numero de celdas 
 * con sus respectivo contenido del los atributos de 
 * los restaurantes
 */
public class Tabla_Restaurantes {
    
    /**
     * restaurante
     */
    Restaurant restaurante = null;
    
    /**
     * Metodo que configura las celdas de la tabla restaurante
     * @param tabla enviado desde la interfaz 
     * @param restaurantes lista que contiene todos los restaurantes 
     * a registrar en la tabla.
     */
     public void visualizar_Restaurante(JTable tabla, List<Restaurant> restaurantes) {

        tabla.setDefaultRenderer(Object.class, new Render());
        DefaultTableModel dt = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        dt.addColumn("NIT");
        dt.addColumn("Nombre");
        dt.addColumn("Direccion");
        dt.addColumn("Foto");

        restaurante = new Restaurant();
        List<Restaurant> list = restaurantes;

        if (list.size() > 0) {
            for (int i = 0; i < list.size(); i++) {
                Object fila[] = new Object[5];

                fila[0] = list.get(i).getNit();
                fila[1] = list.get(i).getNombre();
                fila[2] = list.get(i).getRes_Direccion();

                try {
                    byte[] bi = list.get(i).getRes_Foto();
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
