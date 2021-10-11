/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.restaurant.client.hexagonal.plugin.pedido;

import co.unicauca.microkernel.common.entities.Pedido;
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
 *
 * @author Rivera
 */
public class Tabla_Pedidos {

    /**
     * Pedido
     */
    Pedido pedido = null;

    public void visualizar_Pedido(JTable tabla, List<Pedido> pedidos) {

        tabla.setDefaultRenderer(Object.class, new Render());
        DefaultTableModel dt = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        dt.addColumn("Id");
        dt.addColumn("Id Cliente");
        dt.addColumn("Nit Restaurante");
        dt.addColumn("Precio");
        dt.addColumn("Foto");
        dt.addColumn("Cantidad");
        dt.addColumn("Fecha");
        dt.addColumn("Hora");
        dt.addColumn("Estado");
        dt.addColumn("Total a Pagar");

        pedido = new Pedido();
        List<Pedido> list = pedidos;

        if (list.size() > 0) {
            for (int i = 0; i < list.size(); i++) {
                Object fila[] = new Object[10];

                fila[0] = list.get(i).getPed_Id();
                fila[1] = list.get(i).getCli_Id();
                fila[2] = list.get(i).getRes_Nit();
                fila[3] = list.get(i).getPlaEje_Dia().getPrecio();

                try {
                    byte[] bi = list.get(i).getPlaEje_Dia().getFoto();
                    BufferedImage image = null;
                    InputStream in = new ByteArrayInputStream(bi);
                    image = ImageIO.read(in);
                    ImageIcon imgi = new ImageIcon(image.getScaledInstance(60, 60, 0));
                    fila[4] = new JLabel(imgi);

                } catch (Exception ex) {
                    fila[4] = new JLabel("No imagen");
                }
                fila[5] = list.get(i).getPed_Cantidad();
                fila[6] = list.get(i).getPed_fecha();
                fila[7] = list.get(i).getPed_Hora();
                fila[8] = list.get(i).getPed_Estado();
                fila[9] = list.get(i).getPed_PrecioTotal();

                dt.addRow(fila);
            }
            tabla.setModel(dt);
            tabla.setRowHeight(60);
        }
    }
}
