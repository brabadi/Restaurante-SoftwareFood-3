/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.microkernel.client.presentation;

import co.unicauca.microkernel.client.access.Factory;
import co.unicauca.microkernel.client.access.IClientAccess;
import co.unicauca.microkernel.client.domain.ClientService;
import co.unicauca.microkernel.common.entities.Component;
import co.unicauca.microkernel.common.entities.PlatoEjecutivo;
import co.unicauca.microkernel.common.entities.Restaurant;
import co.unicauca.microkernel.plugin.componente.Tabla_Componentes;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author braia
 */
public class GUISeleccionarRestaurante extends javax.swing.JFrame {

    private Object bean;
    private IClientAccess service;
    private ClientService servicioRestaurante;
    private PlatoEjecutivo plato;
    private PlatoEjecutivo platoPedido;
    private List<Restaurant> listRestaurants = null;
    private Restaurant restaurante;
    private Component componentP;
    private List<Component> ListaComponentes;
    private String nomRest = "";
    private String IDCliente = "";
    DefaultListModel modelBuscarRestaurantes;

    /**
     * Creates new customizer GUISeleccionarRestaurante
     */
    public GUISeleccionarRestaurante(){
        initComponents();
        showImage();
        
        this.setSize(new Dimension(922, 622));
        this.setLocationRelativeTo(null);
        //this.setMinimumSize(new Dimension(200, 200));
        
        
        this.modelBuscarRestaurantes = new DefaultListModel();
        this.service = Factory.getInstance().getClienteService();
        servicioRestaurante = new ClientService(service);
        
    }
    public GUISeleccionarRestaurante(String nomRest){
        initComponents();
        showImage();
        System.out.println("Valor5: " + nomRest);
        
        this.setSize(new Dimension(922, 622));
        this.setLocationRelativeTo(null);
        //this.setMinimumSize(new Dimension(200, 200));
        
        
        this.modelBuscarRestaurantes = new DefaultListModel();
        this.service = Factory.getInstance().getClienteService();
        servicioRestaurante = new ClientService(service);
        this.nomRest = nomRest;
        System.out.println("Valor3: " + this.nomRest);
        ejecutarSeleccion(nomRest);
        
    }
    public void setObject(Object bean) {
        this.bean = bean;
    }
    private void ejecutarSeleccion(String nomRest){
        if(nomRest != "")
            this.buscarAlmuerzoEjeDia();
    }
    private boolean cadenaVacia(){
        if(this.nomRest == "")
            return true;
        return false;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the FormEditor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PnlSeleccionarRestaurante = new javax.swing.JPanel();
        LblAplicacion = new javax.swing.JLabel();
        BtnAtras = new javax.swing.JButton();
        LblSelecione = new javax.swing.JLabel();
        BtnSelecRest = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jtxtIDRestaurante = new javax.swing.JTextField();
        lblImgPrincipal = new javax.swing.JLabel();
        lblMensAplicacion = new javax.swing.JLabel();
        jLabelImgRestaurante = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblComponentes = new javax.swing.JTable();
        lblPED = new javax.swing.JLabel();
        btnRealizarPed = new javax.swing.JButton();

        PnlSeleccionarRestaurante.setBackground(new java.awt.Color(0, 0, 0));
        PnlSeleccionarRestaurante.setMinimumSize(new java.awt.Dimension(0, 0));
        PnlSeleccionarRestaurante.setName("PnlSeleccionarRestaurante"); // NOI18N

        LblAplicacion.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        LblAplicacion.setForeground(new java.awt.Color(255, 255, 255));
        LblAplicacion.setText("Aplicación Software Food");

        BtnAtras.setText("Atrás");
        BtnAtras.setName("BtnAtras"); // NOI18N
        BtnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAtrasActionPerformed(evt);
            }
        });

        LblSelecione.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        LblSelecione.setForeground(new java.awt.Color(255, 255, 255));
        LblSelecione.setText("Seleccionar Restaurante:  ");
        LblSelecione.setName("LblSelecione"); // NOI18N

        BtnSelecRest.setBackground(new java.awt.Color(51, 153, 255));
        BtnSelecRest.setText("Buscar Restaurante");
        BtnSelecRest.setName("BtnSelecRest"); // NOI18N
        BtnSelecRest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSelecRestActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombre Restaurante: ");

        jtxtIDRestaurante.setName("jtxtIDRestaurante"); // NOI18N

        lblMensAplicacion.setForeground(new java.awt.Color(255, 255, 255));
        lblMensAplicacion.setText("Software Food");

        jLabelImgRestaurante.setText("jLabel2");

        tblComponentes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "IDProducto", "Nombre", "Tipo", "Foto"
            }
        ));
        jScrollPane1.setViewportView(tblComponentes);
        if (tblComponentes.getColumnModel().getColumnCount() > 0) {
            tblComponentes.getColumnModel().getColumn(0).setPreferredWidth(130);
            tblComponentes.getColumnModel().getColumn(1).setPreferredWidth(130);
            tblComponentes.getColumnModel().getColumn(2).setPreferredWidth(130);
            tblComponentes.getColumnModel().getColumn(3).setPreferredWidth(130);
        }

        lblPED.setBackground(new java.awt.Color(0, 0, 0));
        lblPED.setForeground(new java.awt.Color(255, 255, 255));
        lblPED.setText("Plato ejecutivo del dia:");

        btnRealizarPed.setText("Realizar Pedido");
        btnRealizarPed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRealizarPedActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PnlSeleccionarRestauranteLayout = new javax.swing.GroupLayout(PnlSeleccionarRestaurante);
        PnlSeleccionarRestaurante.setLayout(PnlSeleccionarRestauranteLayout);
        PnlSeleccionarRestauranteLayout.setHorizontalGroup(
            PnlSeleccionarRestauranteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlSeleccionarRestauranteLayout.createSequentialGroup()
                .addGroup(PnlSeleccionarRestauranteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PnlSeleccionarRestauranteLayout.createSequentialGroup()
                        .addGroup(PnlSeleccionarRestauranteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PnlSeleccionarRestauranteLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblMensAplicacion))
                            .addGroup(PnlSeleccionarRestauranteLayout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(lblImgPrincipal)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LblAplicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(199, 199, 199))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlSeleccionarRestauranteLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(LblSelecione)
                        .addGap(248, 248, 248)))
                .addComponent(BtnAtras)
                .addGap(67, 67, 67))
            .addGroup(PnlSeleccionarRestauranteLayout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addComponent(jtxtIDRestaurante, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BtnSelecRest, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 24, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlSeleccionarRestauranteLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PnlSeleccionarRestauranteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlSeleccionarRestauranteLayout.createSequentialGroup()
                        .addComponent(lblPED, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(346, 346, 346))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlSeleccionarRestauranteLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelImgRestaurante, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlSeleccionarRestauranteLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnRealizarPed, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(348, 348, 348))
        );
        PnlSeleccionarRestauranteLayout.setVerticalGroup(
            PnlSeleccionarRestauranteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlSeleccionarRestauranteLayout.createSequentialGroup()
                .addGroup(PnlSeleccionarRestauranteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PnlSeleccionarRestauranteLayout.createSequentialGroup()
                        .addComponent(lblMensAplicacion)
                        .addGap(18, 18, 18)
                        .addComponent(lblImgPrincipal))
                    .addGroup(PnlSeleccionarRestauranteLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(PnlSeleccionarRestauranteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LblAplicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnAtras))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LblSelecione)))
                .addGap(16, 16, 16)
                .addGroup(PnlSeleccionarRestauranteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtxtIDRestaurante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnSelecRest))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPED, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PnlSeleccionarRestauranteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelImgRestaurante, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRealizarPed, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        getContentPane().add(PnlSeleccionarRestaurante, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void BtnSelecRestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSelecRestActionPerformed
        try {
            this.nomRest = jtxtIDRestaurante.getText();
            this.buscarAlmuerzoEjeDia();
        } catch (Exception ex) {
            Logger.getLogger(GUIListarComponentes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BtnSelecRestActionPerformed

    private void BtnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAtrasActionPerformed
        setVisible(false);
        GUIListarRestaurantes ins = new GUIListarRestaurantes();
        ins.setVisible(true);
    }//GEN-LAST:event_BtnAtrasActionPerformed

    private void btnRealizarPedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRealizarPedActionPerformed
        setVisible(false);
        GUIRealizarPedido ins = new GUIRealizarPedido();
        ins.recibirPlato(platoPedido);
        ins.setIDCliente(IDCliente);
        ins.imgPedido(platoPedido);
        ins.setVisible(true);      
    }//GEN-LAST:event_btnRealizarPedActionPerformed
    
    public void nombreRestaurante(String p_nomRest){
        this.nomRest = p_nomRest;
    }
    private void buscarAlmuerzoEjeDia() {
        
        
        try {
            listRestaurants = servicioRestaurante.listarRestaurants();

            if (listRestaurants.size() > 0) {
                for (Iterator<Restaurant> iterator = listRestaurants.iterator(); iterator.hasNext();) {
                    Restaurant next = iterator.next();
                    if (String.valueOf(next.getNombre()).equals(nomRest)) {
                        this.restaurante = next;
                    }
                }
            }

            List<PlatoEjecutivo> listPlatos = servicioRestaurante.listarAlmuerzoEjeDia();

            if (listPlatos.size() > 0) {
                for (Iterator<PlatoEjecutivo> iterator = listPlatos.iterator(); iterator.hasNext();) {

                    PlatoEjecutivo next = iterator.next();
                    if (restaurante.getNit() == next.getResNIT()) {
                        this.plato = next;
                    }
                }
            }

            Component compEntrada = plato.getEntrada();
            Component compPrincipio = plato.getPrincipio();
            Component compProteina = plato.getProteina();
            Component compBebida = plato.getBebida();
            this.platoPedido = plato;
            List<Component> componentes = servicioRestaurante.listarComponents();
            ListaComponentes = new ArrayList<>();
            if (componentes.size() > 0) {
                modelBuscarRestaurantes.removeAllElements();
                modelBuscarRestaurantes.addElement(restaurante.getNombre());
                for (Iterator<Component> iterator = componentes.iterator(); iterator.hasNext();) {
                    Component next = iterator.next();
                    if (compEntrada.getCompID().equals(next.getCompID()) || compPrincipio.getCompID().equals(next.getCompID()) || compProteina.getCompID().equals(next.getCompID()) || compBebida.getCompID().equals(next.getCompID())) {
                        modelBuscarRestaurantes.addElement("ID: " + next.getCompID() + " Nombre: " + next.getCompNombre() + " Tipo: " + String.valueOf(next.getCompTipo()));  
                        ListaComponentes.add(next);
                    }
                }
                this.MostrarTabla(ListaComponentes);
            }

            byte[] bi = restaurante.getRes_Foto();
            BufferedImage image = null;
            InputStream in = new ByteArrayInputStream(bi);
            image = ImageIO.read(in);
            ImageIcon imgi = new ImageIcon(image.getScaledInstance(314, 314, 0));
            jLabelImgRestaurante.setIcon(imgi);
            jLabelImgRestaurante.setHorizontalAlignment(jLabelImgRestaurante.CENTER);
            jLabelImgRestaurante.setVerticalAlignment(jLabelImgRestaurante.CENTER);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se Encontro el Restaurante");
        }
    }

    private void showImage() {

        ImageIcon imagen = new ImageIcon("imagen_softwareFood.jpeg");
        lblImgPrincipal.setBounds(10, 15, 80, 80);
        lblImgPrincipal.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH)));
        PnlSeleccionarRestaurante.add(lblImgPrincipal);

    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUIOpcionesCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIOpcionesCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIOpcionesCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIOpcionesCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                final GUISeleccionarRestaurante frame = new GUISeleccionarRestaurante();
                frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
                frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
                frame.setVisible(true);
                //new GUISeleccionarRestaurante().setVisible(true);
            }
        });
    }

    public void MostrarTabla(List<Component> componentes) {
        System.out.println("ENTRO A MOSTRAR TABLA -----------");
        Tabla_Componentes tabla = new Tabla_Componentes();
        tabla.visualizar_Componente(tblComponentes, componentes);
    }
    
    public void setIDCliente(String ID){
        this.IDCliente = ID;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAtras;
    private javax.swing.JButton BtnSelecRest;
    private javax.swing.JLabel LblAplicacion;
    private javax.swing.JLabel LblSelecione;
    private javax.swing.JPanel PnlSeleccionarRestaurante;
    private javax.swing.JButton btnRealizarPed;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelImgRestaurante;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jtxtIDRestaurante;
    private javax.swing.JLabel lblImgPrincipal;
    private javax.swing.JLabel lblMensAplicacion;
    private javax.swing.JLabel lblPED;
    private javax.swing.JTable tblComponentes;
    // End of variables declaration//GEN-END:variables
}
