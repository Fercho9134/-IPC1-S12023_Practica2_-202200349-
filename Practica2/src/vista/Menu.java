/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import javax.swing.JOptionPane;

/**
 *
 * @author Fernando
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtCostoInventario = new javax.swing.JTextField();
        txtTiempoInventario = new javax.swing.JTextField();
        txtTiempoProduccion = new javax.swing.JTextField();
        txtCostoProduccion = new javax.swing.JTextField();
        txtCostoEmpaquetado = new javax.swing.JTextField();
        txtTiempoEmpaquetado = new javax.swing.JTextField();
        txtTiempoSalida = new javax.swing.JTextField();
        txtCostoSalida = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnIniciarSumulacion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menú inicial");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(241, 250, 238));
        jPanel1.setMinimumSize(new java.awt.Dimension(450, 410));
        jPanel1.setPreferredSize(new java.awt.Dimension(450, 410));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto Bk", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(20, 33, 61));
        jLabel1.setText("Monkey");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, -1, -1));

        jLabel2.setBackground(new java.awt.Color(188, 108, 37));
        jLabel2.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(38, 70, 83));
        jLabel2.setText("Salida:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, -1, -1));

        jLabel3.setBackground(new java.awt.Color(188, 108, 37));
        jLabel3.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(38, 70, 83));
        jLabel3.setText("Costo (Q/s)");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 80, -1, -1));

        jLabel4.setBackground(new java.awt.Color(188, 108, 37));
        jLabel4.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(38, 70, 83));
        jLabel4.setText("Producción:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, -1));

        jLabel5.setBackground(new java.awt.Color(188, 108, 37));
        jLabel5.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(38, 70, 83));
        jLabel5.setText("Empaquetado:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));

        txtCostoInventario.setBackground(new java.awt.Color(230, 240, 248));
        txtCostoInventario.setFont(new java.awt.Font("Montserrat", 0, 13)); // NOI18N
        txtCostoInventario.setForeground(new java.awt.Color(38, 70, 83));
        txtCostoInventario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCostoInventario.setBorder(null);
        jPanel1.add(txtCostoInventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 110, 80, 40));

        txtTiempoInventario.setBackground(new java.awt.Color(230, 240, 248));
        txtTiempoInventario.setFont(new java.awt.Font("Montserrat", 0, 13)); // NOI18N
        txtTiempoInventario.setForeground(new java.awt.Color(38, 70, 83));
        txtTiempoInventario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTiempoInventario.setBorder(null);
        jPanel1.add(txtTiempoInventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 80, 40));

        txtTiempoProduccion.setBackground(new java.awt.Color(230, 240, 248));
        txtTiempoProduccion.setFont(new java.awt.Font("Montserrat", 0, 13)); // NOI18N
        txtTiempoProduccion.setForeground(new java.awt.Color(38, 70, 83));
        txtTiempoProduccion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTiempoProduccion.setBorder(null);
        jPanel1.add(txtTiempoProduccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 80, 40));

        txtCostoProduccion.setBackground(new java.awt.Color(230, 240, 248));
        txtCostoProduccion.setFont(new java.awt.Font("Montserrat", 0, 13)); // NOI18N
        txtCostoProduccion.setForeground(new java.awt.Color(38, 70, 83));
        txtCostoProduccion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCostoProduccion.setBorder(null);
        jPanel1.add(txtCostoProduccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 170, 80, 40));

        txtCostoEmpaquetado.setBackground(new java.awt.Color(230, 240, 248));
        txtCostoEmpaquetado.setFont(new java.awt.Font("Montserrat", 0, 13)); // NOI18N
        txtCostoEmpaquetado.setForeground(new java.awt.Color(38, 70, 83));
        txtCostoEmpaquetado.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCostoEmpaquetado.setBorder(null);
        jPanel1.add(txtCostoEmpaquetado, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 230, 80, 40));

        txtTiempoEmpaquetado.setBackground(new java.awt.Color(230, 240, 248));
        txtTiempoEmpaquetado.setFont(new java.awt.Font("Montserrat", 0, 13)); // NOI18N
        txtTiempoEmpaquetado.setForeground(new java.awt.Color(38, 70, 83));
        txtTiempoEmpaquetado.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTiempoEmpaquetado.setBorder(null);
        jPanel1.add(txtTiempoEmpaquetado, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 80, 40));

        txtTiempoSalida.setBackground(new java.awt.Color(230, 240, 248));
        txtTiempoSalida.setFont(new java.awt.Font("Montserrat", 0, 13)); // NOI18N
        txtTiempoSalida.setForeground(new java.awt.Color(38, 70, 83));
        txtTiempoSalida.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTiempoSalida.setBorder(null);
        jPanel1.add(txtTiempoSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, 80, 40));

        txtCostoSalida.setBackground(new java.awt.Color(230, 240, 248));
        txtCostoSalida.setFont(new java.awt.Font("Montserrat", 0, 13)); // NOI18N
        txtCostoSalida.setForeground(new java.awt.Color(38, 70, 83));
        txtCostoSalida.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCostoSalida.setBorder(null);
        jPanel1.add(txtCostoSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 290, 80, 40));

        jLabel6.setBackground(new java.awt.Color(188, 108, 37));
        jLabel6.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(38, 70, 83));
        jLabel6.setText("Inventario:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, -1, -1));

        jLabel7.setBackground(new java.awt.Color(188, 108, 37));
        jLabel7.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(38, 70, 83));
        jLabel7.setText("Tiempo (s)");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, -1, -1));

        btnIniciarSumulacion.setBackground(new java.awt.Color(20, 33, 61));
        btnIniciarSumulacion.setFont(new java.awt.Font("Roboto Bk", 1, 13)); // NOI18N
        btnIniciarSumulacion.setForeground(new java.awt.Color(241, 250, 238));
        btnIniciarSumulacion.setText("Iniciar Simulacion");
        btnIniciarSumulacion.setBorder(null);
        btnIniciarSumulacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarSumulacionActionPerformed(evt);
            }
        });
        jPanel1.add(btnIniciarSumulacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 360, 130, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIniciarSumulacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarSumulacionActionPerformed
        try {

            int tiempoInventario = Integer.parseInt(txtTiempoInventario.getText()) * 1000;
            int tiempoProduccion = Integer.parseInt(txtTiempoProduccion.getText()) * 1000;
            int tiempoEmpaquetado = Integer.parseInt(txtTiempoEmpaquetado.getText()) * 1000;
            int tiempoSalida = Integer.parseInt(txtTiempoSalida.getText()) * 1000;
            int precioInventario = Integer.parseInt(txtCostoInventario.getText());
            int precioProduccion = Integer.parseInt(txtCostoProduccion.getText());
            int precioEmpaquetado = Integer.parseInt(txtCostoEmpaquetado.getText());
            int precioSalida = Integer.parseInt(txtCostoSalida.getText());

            if (tiempoInventario <= 0 || tiempoProduccion <= 0 || tiempoEmpaquetado <= 0 || tiempoSalida <= 0 || precioEmpaquetado <= 0 || precioInventario <= 0 || precioProduccion <= 0 || precioSalida <= 0) {
                JOptionPane.showMessageDialog(null, "Todos los campos deben estar llenos y ser mayores a 0");
            } else {
                
                this.dispose();
                Simulacion simulacion = new Simulacion();
                simulacion.setVisible(true);
                int tiempoTotal = ((tiempoInventario + tiempoProduccion + tiempoEmpaquetado + tiempoSalida)/1000) + 30;
                
                simulacion.iniciarSimulacion(tiempoInventario, tiempoProduccion, tiempoEmpaquetado, tiempoSalida, precioInventario, precioProduccion, precioEmpaquetado, precioSalida, tiempoTotal);
                
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Todos los datos teben ser enteros mayores a 0");
        }
    }//GEN-LAST:event_btnIniciarSumulacionActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIniciarSumulacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtCostoEmpaquetado;
    private javax.swing.JTextField txtCostoInventario;
    private javax.swing.JTextField txtCostoProduccion;
    private javax.swing.JTextField txtCostoSalida;
    private javax.swing.JTextField txtTiempoEmpaquetado;
    private javax.swing.JTextField txtTiempoInventario;
    private javax.swing.JTextField txtTiempoProduccion;
    private javax.swing.JTextField txtTiempoSalida;
    // End of variables declaration//GEN-END:variables
}
