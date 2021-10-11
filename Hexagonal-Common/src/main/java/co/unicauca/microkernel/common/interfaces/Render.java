/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.microkernel.common.interfaces;

import co.unicauca.microkernel.common.infra.*;
import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author braia
 */

/**
 * Clase Render
 * 
 * Clase usada por los plugins, el cual invoca funciones de las librerias de
 * java para poder pintar las celdas que se requieren en una tabla de la interfaz 
 * del usuario.
 */
public class Render extends DefaultTableCellRenderer {

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {

        if (value instanceof JButton) {
            JButton btn = (JButton) value;
            if (isSelected) {
                btn.setForeground(table.getSelectionForeground());
                btn.setBackground(table.getSelectionBackground());
            } else {
                btn.setForeground(table.getForeground());
            }
            return btn;
        }
        if (value instanceof JLabel) {
            JLabel lbl = (JLabel) value;
            return lbl;
        }

        return super.getTableCellRendererComponent(table, value, isSelected,
                hasFocus, row, column);
    }
}
