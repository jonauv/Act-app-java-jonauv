/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package farmaciasimi;

/**
 *
 * @author tinoc
 */
public class Farmacia extends javax.swing.JFrame {

    /**
     * Creates new form Farmacia
     */
    public Farmacia() {
        initComponents();
        this.setLocationRelativeTo(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btgSucursal = new javax.swing.ButtonGroup();
        panTop = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        panLeft = new javax.swing.JPanel();
        panPedido = new javax.swing.JPanel();
        btnPedido = new javax.swing.JButton();
        panVerPedido = new javax.swing.JPanel();
        btnVerPedidos = new javax.swing.JButton();
        panCenter = new javax.swing.JPanel();
        txtNombreProducto = new javax.swing.JTextField();
        cmbProveedor = new javax.swing.JComboBox<>();
        txtCantidadProducto = new javax.swing.JTextField();
        cmbTipoProducto = new javax.swing.JComboBox<>();
        btnBorrar = new javax.swing.JButton();
        btnConfirmar = new javax.swing.JButton();
        panSucursales = new javax.swing.JPanel();
        jrbSucursalSimiHidalgo = new javax.swing.JRadioButton();
        jrbSucursalSimiCentro = new javax.swing.JRadioButton();
        jrbSucursalSimiPetrolera = new javax.swing.JRadioButton();
        jrbSucursalSimiInfonavit = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panTop.setBackground(new java.awt.Color(54, 109, 161));
        panTop.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panTop.setPreferredSize(new java.awt.Dimension(900, 80));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/farmaciasimi/farmacia.png"))); // NOI18N
        jLabel1.setText("Farmacia Online");
        jLabel1.setIconTextGap(15);

        javax.swing.GroupLayout panTopLayout = new javax.swing.GroupLayout(panTop);
        panTop.setLayout(panTopLayout);
        panTopLayout.setHorizontalGroup(
            panTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panTopLayout.createSequentialGroup()
                .addContainerGap(330, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(217, 217, 217))
        );
        panTopLayout.setVerticalGroup(
            panTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panTopLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(panTop, java.awt.BorderLayout.PAGE_START);

        panLeft.setBackground(new java.awt.Color(54, 109, 161));
        panLeft.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panLeft.setPreferredSize(new java.awt.Dimension(200, 500));

        panPedido.setBackground(new java.awt.Color(54, 109, 161));

        btnPedido.setBackground(new java.awt.Color(54, 109, 161));
        btnPedido.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnPedido.setForeground(new java.awt.Color(255, 255, 255));
        btnPedido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/farmaciasimi/entrega-de-comida.png"))); // NOI18N
        btnPedido.setText("Realizar Pedido");
        btnPedido.setBorder(null);
        btnPedido.setBorderPainted(false);
        btnPedido.setContentAreaFilled(false);
        btnPedido.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPedido.setDefaultCapable(false);
        btnPedido.setFocusPainted(false);
        btnPedido.setFocusable(false);
        btnPedido.setIconTextGap(10);
        btnPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPedidoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panPedidoLayout = new javax.swing.GroupLayout(panPedido);
        panPedido.setLayout(panPedidoLayout);
        panPedidoLayout.setHorizontalGroup(
            panPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnPedido, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
        );
        panPedidoLayout.setVerticalGroup(
            panPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnPedido, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        panVerPedido.setBackground(new java.awt.Color(54, 109, 161));
        panVerPedido.setForeground(new java.awt.Color(255, 255, 255));

        btnVerPedidos.setBackground(new java.awt.Color(54, 109, 161));
        btnVerPedidos.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnVerPedidos.setForeground(new java.awt.Color(255, 255, 255));
        btnVerPedidos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/farmaciasimi/ver.png"))); // NOI18N
        btnVerPedidos.setText("Ver Pedidos");
        btnVerPedidos.setBorder(null);
        btnVerPedidos.setBorderPainted(false);
        btnVerPedidos.setContentAreaFilled(false);
        btnVerPedidos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVerPedidos.setFocusPainted(false);
        btnVerPedidos.setFocusable(false);
        btnVerPedidos.setIconTextGap(15);
        btnVerPedidos.setRequestFocusEnabled(false);
        btnVerPedidos.setRolloverEnabled(false);
        btnVerPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerPedidosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panVerPedidoLayout = new javax.swing.GroupLayout(panVerPedido);
        panVerPedido.setLayout(panVerPedidoLayout);
        panVerPedidoLayout.setHorizontalGroup(
            panVerPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnVerPedidos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panVerPedidoLayout.setVerticalGroup(
            panVerPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnVerPedidos, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panLeftLayout = new javax.swing.GroupLayout(panLeft);
        panLeft.setLayout(panLeftLayout);
        panLeftLayout.setHorizontalGroup(
            panLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panPedido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panVerPedido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panLeftLayout.setVerticalGroup(
            panLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panLeftLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(panPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(panVerPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(202, Short.MAX_VALUE))
        );

        getContentPane().add(panLeft, java.awt.BorderLayout.LINE_START);

        panCenter.setBackground(new java.awt.Color(255, 255, 255));

        txtNombreProducto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtNombreProducto.setActionCommand("<Not Set>");
        txtNombreProducto.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nombre del producto", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        cmbProveedor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Profarm ", "Bio-Mac Group", "Farmacon", "Vicma", "Uniparts" }));
        cmbProveedor.setBorder(null);
        cmbProveedor.setFocusable(false);

        txtCantidadProducto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtCantidadProducto.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cantidad", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        cmbTipoProducto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Medicamentos", "Cosméticos", "Medicamentos herbarios", "Productos dietéticos y edulcorantes", "Productos biológicos" }));
        cmbTipoProducto.setBorder(null);

        btnBorrar.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnBorrar.setText("Borrar");
        btnBorrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        btnConfirmar.setBackground(new java.awt.Color(54, 109, 161));
        btnConfirmar.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnConfirmar.setForeground(new java.awt.Color(255, 255, 255));
        btnConfirmar.setText("Guardar");
        btnConfirmar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });

        panSucursales.setBackground(new java.awt.Color(255, 255, 255));
        panSucursales.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Sucursal", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        btgSucursal.add(jrbSucursalSimiHidalgo);
        jrbSucursalSimiHidalgo.setText("Famarcia Simi Hidalgo");

        btgSucursal.add(jrbSucursalSimiCentro);
        jrbSucursalSimiCentro.setText("Famarcia Simi Centro");

        btgSucursal.add(jrbSucursalSimiPetrolera);
        jrbSucursalSimiPetrolera.setText("Famarcia Simi Petrolera");

        jrbSucursalSimiInfonavit.setText("Farmacia Simi Infonavit");

        javax.swing.GroupLayout panSucursalesLayout = new javax.swing.GroupLayout(panSucursales);
        panSucursales.setLayout(panSucursalesLayout);
        panSucursalesLayout.setHorizontalGroup(
            panSucursalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panSucursalesLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(panSucursalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jrbSucursalSimiInfonavit)
                    .addComponent(jrbSucursalSimiPetrolera)
                    .addComponent(jrbSucursalSimiCentro, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jrbSucursalSimiHidalgo, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        panSucursalesLayout.setVerticalGroup(
            panSucursalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panSucursalesLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jrbSucursalSimiHidalgo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jrbSucursalSimiCentro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jrbSucursalSimiPetrolera)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jrbSucursalSimiInfonavit)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Proveedor");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Tipo de producto");

        javax.swing.GroupLayout panCenterLayout = new javax.swing.GroupLayout(panCenter);
        panCenter.setLayout(panCenterLayout);
        panCenterLayout.setHorizontalGroup(
            panCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panCenterLayout.createSequentialGroup()
                .addContainerGap(108, Short.MAX_VALUE)
                .addGroup(panCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panCenterLayout.createSequentialGroup()
                        .addGroup(panCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(panSucursales, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtNombreProducto))
                        .addGap(64, 64, 64)
                        .addGroup(panCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panCenterLayout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(txtCantidadProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panCenterLayout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(panCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmbProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmbTipoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panCenterLayout.createSequentialGroup()
                                .addGap(72, 72, 72)
                                .addComponent(jLabel2))
                            .addGroup(panCenterLayout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(jLabel3)))
                        .addGap(95, 95, 95))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panCenterLayout.createSequentialGroup()
                        .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(134, 134, 134)
                        .addComponent(btnConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(117, 117, 117))))
        );
        panCenterLayout.setVerticalGroup(
            panCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panCenterLayout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addGroup(panCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCantidadProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(panCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panCenterLayout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbTipoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panCenterLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(panSucursales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addGroup(panCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBorrar)
                    .addComponent(btnConfirmar))
                .addGap(36, 36, 36))
        );

        getContentPane().add(panCenter, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPedidoActionPerformed
        
    }//GEN-LAST:event_btnPedidoActionPerformed

    private void btnVerPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerPedidosActionPerformed
        verPedidos verPedidos = new verPedidos();
        verPedidos.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnVerPedidosActionPerformed

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnConfirmarActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        // TODO add your handling code here:
        
        txtNombreProducto.setText("");
        txtCantidadProducto.setText("");
        cmbProveedor.setSelectedIndex(0);
        cmbTipoProducto.setSelectedIndex(0);
        btgSucursal.clearSelection();
    }//GEN-LAST:event_btnBorrarActionPerformed

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
            java.util.logging.Logger.getLogger(Farmacia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Farmacia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Farmacia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Farmacia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Farmacia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btgSucursal;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JButton btnPedido;
    private javax.swing.JButton btnVerPedidos;
    private javax.swing.JComboBox<String> cmbProveedor;
    private javax.swing.JComboBox<String> cmbTipoProducto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JRadioButton jrbSucursalSimiCentro;
    private javax.swing.JRadioButton jrbSucursalSimiHidalgo;
    private javax.swing.JRadioButton jrbSucursalSimiInfonavit;
    private javax.swing.JRadioButton jrbSucursalSimiPetrolera;
    private javax.swing.JPanel panCenter;
    private javax.swing.JPanel panLeft;
    private javax.swing.JPanel panPedido;
    private javax.swing.JPanel panSucursales;
    private javax.swing.JPanel panTop;
    private javax.swing.JPanel panVerPedido;
    private javax.swing.JTextField txtCantidadProducto;
    private javax.swing.JTextField txtNombreProducto;
    // End of variables declaration//GEN-END:variables
}
