/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.microkernel.client.presentation;


import co.unicauca.microkernel.client.access.Factory;
import co.unicauca.microkernel.client.access.IClientAccess;
import co.unicauca.microkernel.client.domain.ClientService;
import co.unicauca.microkernel.common.entities.PlatoEjecutivo;
import co.unicauca.microkernel.common.entities.Restaurant;
import java.awt.Image;
import java.util.Iterator;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author juan manuel
 */
public class GUIActualizarAlmuerzo extends javax.swing.JFrame {

    private List<Restaurant> AllRestaurants = null;
    private String usuario = "";
    private String nitRest = null;
    private String id_platoEjecutivo;
    IClientAccess service;
    ClientService servicioRestaurante;
    PlatoEjecutivo plato;

    /**
     * Creates new form GUIActualizarAlmuerzo
     */
    public GUIActualizarAlmuerzo() {
        initComponents();
        showImage();
        this.setLocationRelativeTo(null);
        inhabilitarOpciones();
        service = Factory.getInstance().getClienteService();
        servicioRestaurante = new ClientService(service);       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PnlActualizarAlmuerzo = new javax.swing.JPanel();
        LblTitulo = new javax.swing.JLabel();
        LblAplicacion = new javax.swing.JLabel();
        LblActualizarAlmuerzo = new javax.swing.JLabel();
        LblEntrada = new javax.swing.JLabel();
        LblPrincipio = new javax.swing.JLabel();
        LblProteina = new javax.swing.JLabel();
        LblBebida = new javax.swing.JLabel();
        txtEntrada = new javax.swing.JTextField();
        txtPrincipio = new javax.swing.JTextField();
        txtProteina = new javax.swing.JTextField();
        BtnAcualizarAlmuerzo = new javax.swing.JButton();
        LblPrecio = new javax.swing.JLabel();
        txtBebida1 = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        LblDiaSem = new javax.swing.JLabel();
        cbxDiaSem = new javax.swing.JComboBox<>();
        lblIngreseIdPlato = new javax.swing.JLabel();
        txtIdPlatoEjecutivo = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        lblImgPrincipal = new javax.swing.JLabel();
        BtnAtras = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PnlActualizarAlmuerzo.setBackground(new java.awt.Color(0, 0, 0));

        LblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        LblTitulo.setText("Software Food");

        LblAplicacion.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        LblAplicacion.setForeground(new java.awt.Color(255, 255, 255));
        LblAplicacion.setText("Aplicación Software Food");

        LblActualizarAlmuerzo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        LblActualizarAlmuerzo.setForeground(new java.awt.Color(255, 255, 255));
        LblActualizarAlmuerzo.setText("Actualizar almuerzo ejecutivo del día en el sistema");

        LblEntrada.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        LblEntrada.setForeground(new java.awt.Color(255, 255, 255));
        LblEntrada.setText("Id Entrada");

        LblPrincipio.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        LblPrincipio.setForeground(new java.awt.Color(255, 255, 255));
        LblPrincipio.setText("Id Principio");

        LblProteina.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        LblProteina.setForeground(new java.awt.Color(255, 255, 255));
        LblProteina.setText("Id Proteina");

        LblBebida.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        LblBebida.setForeground(new java.awt.Color(255, 255, 255));
        LblBebida.setText("Id Bebida");

        BtnAcualizarAlmuerzo.setText("Actualizar Almuerzo");
        BtnAcualizarAlmuerzo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAcualizarAlmuerzoActionPerformed(evt);
            }
        });

        LblPrecio.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        LblPrecio.setForeground(new java.awt.Color(255, 255, 255));
        LblPrecio.setText("Precio");

        txtPrecio.setName(""); // NOI18N

        LblDiaSem.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        LblDiaSem.setForeground(new java.awt.Color(255, 255, 255));
        LblDiaSem.setText("Dia de la Semana");

        cbxDiaSem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "LUNES", "MARTES", "MIERCOLES", "JUEVES", "VIERNES", "SABADO", "DOMINGO" }));

        lblIngreseIdPlato.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblIngreseIdPlato.setForeground(new java.awt.Color(255, 255, 255));
        lblIngreseIdPlato.setText("Ingrese el ID del Plato a Actualizar");

        txtIdPlatoEjecutivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdPlatoEjecutivoActionPerformed(evt);
            }
        });

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        lblImgPrincipal.setForeground(new java.awt.Color(255, 255, 255));
        lblImgPrincipal.setText("imgPrincipal");

        BtnAtras.setText("Atras");
        BtnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAtrasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PnlActualizarAlmuerzoLayout = new javax.swing.GroupLayout(PnlActualizarAlmuerzo);
        PnlActualizarAlmuerzo.setLayout(PnlActualizarAlmuerzoLayout);
        PnlActualizarAlmuerzoLayout.setHorizontalGroup(
            PnlActualizarAlmuerzoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlActualizarAlmuerzoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PnlActualizarAlmuerzoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlActualizarAlmuerzoLayout.createSequentialGroup()
                        .addGroup(PnlActualizarAlmuerzoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PnlActualizarAlmuerzoLayout.createSequentialGroup()
                                .addComponent(lblImgPrincipal)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(LblAplicacion))
                            .addGroup(PnlActualizarAlmuerzoLayout.createSequentialGroup()
                                .addComponent(LblTitulo)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnAtras)
                        .addContainerGap())
                    .addGroup(PnlActualizarAlmuerzoLayout.createSequentialGroup()
                        .addComponent(lblIngreseIdPlato)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtIdPlatoEjecutivo, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscar)
                        .addGap(0, 46, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlActualizarAlmuerzoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(PnlActualizarAlmuerzoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlActualizarAlmuerzoLayout.createSequentialGroup()
                                .addComponent(LblDiaSem)
                                .addGap(43, 43, 43))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlActualizarAlmuerzoLayout.createSequentialGroup()
                                .addGroup(PnlActualizarAlmuerzoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LblPrincipio)
                                    .addGroup(PnlActualizarAlmuerzoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(LblProteina)
                                        .addGroup(PnlActualizarAlmuerzoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(LblPrecio)
                                            .addComponent(LblBebida)))
                                    .addComponent(LblEntrada))
                                .addGap(49, 49, 49)))
                        .addGroup(PnlActualizarAlmuerzoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPrincipio, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtProteina, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBebida1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbxDiaSem, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(48, 48, 48))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlActualizarAlmuerzoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(LblActualizarAlmuerzo)
                .addGap(40, 40, 40))
            .addGroup(PnlActualizarAlmuerzoLayout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addComponent(BtnAcualizarAlmuerzo, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        PnlActualizarAlmuerzoLayout.setVerticalGroup(
            PnlActualizarAlmuerzoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlActualizarAlmuerzoLayout.createSequentialGroup()
                .addGroup(PnlActualizarAlmuerzoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LblTitulo)
                    .addGroup(PnlActualizarAlmuerzoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BtnAtras)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PnlActualizarAlmuerzoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblImgPrincipal)
                    .addComponent(LblAplicacion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(LblActualizarAlmuerzo)
                .addGroup(PnlActualizarAlmuerzoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PnlActualizarAlmuerzoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblIngreseIdPlato)
                        .addComponent(btnBuscar)
                        .addComponent(txtIdPlatoEjecutivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PnlActualizarAlmuerzoLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(PnlActualizarAlmuerzoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LblEntrada))))
                .addGap(18, 18, 18)
                .addGroup(PnlActualizarAlmuerzoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtPrincipio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblPrincipio))
                .addGap(19, 19, 19)
                .addGroup(PnlActualizarAlmuerzoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtProteina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblProteina))
                .addGap(18, 18, 18)
                .addGroup(PnlActualizarAlmuerzoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBebida1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblBebida))
                .addGap(18, 18, 18)
                .addGroup(PnlActualizarAlmuerzoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblPrecio))
                .addGap(26, 26, 26)
                .addGroup(PnlActualizarAlmuerzoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxDiaSem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblDiaSem))
                .addGap(32, 32, 32)
                .addComponent(BtnAcualizarAlmuerzo)
                .addGap(29, 29, 29))
        );

        getContentPane().add(PnlActualizarAlmuerzo, java.awt.BorderLayout.LINE_START);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnAcualizarAlmuerzoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAcualizarAlmuerzoActionPerformed
        boolean resultado = false;
        GUIListarRestaurantes rest = new GUIListarRestaurantes();
        this.AllRestaurants = rest.GetRestaurants();
        if (this.AllRestaurants.size() > 0) {
            for (Restaurant ls : this.AllRestaurants) {
                if(String.valueOf(ls.getCli_Id().getCus_id()).equals(usuario)){
                    this.nitRest = String.valueOf(ls.getNit());
                    break;
                }              
            }
        }
        
        String Id_entrada = txtEntrada.getText();
        String id_principio = txtPrincipio.getText();
        String id_proteina = txtProteina.getText();
        String id_bebida = txtBebida1.getText();
        String precio = txtPrecio.getText();
        String diaSem = String.valueOf(cbxDiaSem.getSelectedItem().toString());
        
        try {
            if(String.valueOf(plato.getResNIT()).equals(nitRest)){
                System.out.println("NIT---->"+nitRest);
                System.out.println("USUARIO----->"+usuario);
               resultado = servicioRestaurante.updateAlmuerzoEjecutivoDia(String.valueOf(plato.getIDplatoEJ()), String.valueOf(plato.getResNIT()),diaSem, Id_entrada, id_principio, id_proteina, id_bebida, precio);
            }
            if (resultado) {
                JOptionPane.showMessageDialog(null, "Almuerzo Ejecutivo Dia con ID: " + plato.getIDplatoEJ() + "  se ha actualizado");
                vaciarDatos();
                inhabilitarOpciones();
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo actualizar, el plato EJecutivo no Existe o no pertenece al Restaurante");
                
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR al ejecutar la accion");
           
        }
    }//GEN-LAST:event_BtnAcualizarAlmuerzoActionPerformed
    
    private void txtIdPlatoEjecutivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdPlatoEjecutivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdPlatoEjecutivoActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        id_platoEjecutivo = txtIdPlatoEjecutivo.getText();

        if (buscarAlmuerzoEjeDia(id_platoEjecutivo)) {
            habilitarOpciones();
            txtBebida1.setText(String.valueOf(plato.getBebida().getCompID()));
            //cbxDiaSem.setActionCommand(String.valueOf(plato.getDiaSemana()));
            for (int i = 0; i < cbxDiaSem.getMaximumRowCount(); i++) {
                if(String.valueOf(plato.getDiaSemana()).equals(cbxDiaSem.getItemAt(i))){
                    cbxDiaSem.setSelectedIndex(i);
                }
            }
            txtEntrada.setText(String.valueOf(plato.getEntrada().getCompID()));
            txtPrecio.setText(String.valueOf(plato.getPrecio()));
            txtPrincipio.setText(String.valueOf(plato.getPrincipio().getCompID()));
            txtProteina.setText(String.valueOf(plato.getProteina().getCompID()));
        }else{
           JOptionPane.showMessageDialog(null, "No se encontro el Plato Ejecutivo");
        }    
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void BtnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAtrasActionPerformed
        setVisible(false);
        GUIOpcionesAdmin ins = new GUIOpcionesAdmin();
        ins.getUsuario(usuario);
        ins.nombreAdmin(usuario);
        ins.setVisible(true);
    }//GEN-LAST:event_BtnAtrasActionPerformed

    private boolean buscarAlmuerzoEjeDia(String id) {
        try {
            PlatoEjecutivo plato = null;
            List<PlatoEjecutivo> lsDia = servicioRestaurante.listarAlmuerzoEjeDia();
            if (lsDia.size() > 0) {
                for (Iterator<PlatoEjecutivo> iterator = lsDia.iterator(); iterator.hasNext();) {
                    PlatoEjecutivo next = iterator.next();
                    if (String.valueOf(next.getIDplatoEJ()).equals(id)) {
                        this.plato = next;
                        return true;
                    }
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al hacer la consulta");

        }
        return false;
    }

    private void habilitarOpciones() {

        txtBebida1.setEnabled(true);
        cbxDiaSem.setEnabled(true);
        txtEntrada.setEnabled(true);
        txtIdPlatoEjecutivo.setEnabled(true);
        txtPrecio.setEnabled(true);
        txtPrincipio.setEnabled(true);
        txtProteina.setEnabled(true);
        BtnAcualizarAlmuerzo.setEnabled(true);
    }

    private void inhabilitarOpciones() {

        txtBebida1.setEnabled(false);
        cbxDiaSem.setEnabled(false);
        txtEntrada.setEnabled(false);
        txtPrecio.setEnabled(false);
        txtPrincipio.setEnabled(false);
        txtProteina.setEnabled(false);
        BtnAcualizarAlmuerzo.setEnabled(false);
    }
    private void vaciarDatos(){
         txtBebida1.setText("");
        txtEntrada.setText("");
        txtPrecio.setText("");
        txtPrincipio.setText("");
        txtProteina.setText("");
        txtIdPlatoEjecutivo.setText("");
    }
    private void showImage() {
        
        ImageIcon imagen = new ImageIcon("imagen_softwareFood.jpeg");
        lblImgPrincipal.setBounds(10, 15, 80, 80);
        lblImgPrincipal.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(80, 80,Image.SCALE_SMOOTH)));
        PnlActualizarAlmuerzo.add(lblImgPrincipal);
        
    }
    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(GUIActualizarAlmuerzo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIActualizarAlmuerzo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIActualizarAlmuerzo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIActualizarAlmuerzo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIActualizarAlmuerzo().setVisible(true);
            }
        });
    }

    private List<PlatoEjecutivo> listPlato = null;
    
    public void listar() throws Exception {
        try { 
            List<PlatoEjecutivo> lsDia = servicioRestaurante.listarAlmuerzoEjeDia();
            if (lsDia.size() > 0) {
                 this.listPlato = lsDia;
            }
        }catch(Exception e){
            System.out.println("Error al hacer laconsulta" + e);
        }
    }
    
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAcualizarAlmuerzo;
    private javax.swing.JButton BtnAtras;
    private javax.swing.JLabel LblActualizarAlmuerzo;
    private javax.swing.JLabel LblAplicacion;
    private javax.swing.JLabel LblBebida;
    private javax.swing.JLabel LblDiaSem;
    private javax.swing.JLabel LblEntrada;
    private javax.swing.JLabel LblPrecio;
    private javax.swing.JLabel LblPrincipio;
    private javax.swing.JLabel LblProteina;
    private javax.swing.JLabel LblTitulo;
    private javax.swing.JPanel PnlActualizarAlmuerzo;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JComboBox<String> cbxDiaSem;
    private javax.swing.JLabel lblImgPrincipal;
    private javax.swing.JLabel lblIngreseIdPlato;
    private javax.swing.JTextField txtBebida1;
    private javax.swing.JTextField txtEntrada;
    private javax.swing.JTextField txtIdPlatoEjecutivo;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtPrincipio;
    private javax.swing.JTextField txtProteina;
    // End of variables declaration//GEN-END:variables
}
