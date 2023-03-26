package vista;

import java.awt.Component;
import modelo.Cronometro;
import modelo.Hilo;
import modelo.Reporte;

/**
 *
 * @author Fernando
 */
public class Simulacion extends javax.swing.JFrame {

    /**
     * Creates new form Simulacion
     */
    public Simulacion() {
        initComponents();
        setLocationRelativeTo(null);
        btnMenu.setVisible(false);
        btnReporte.setVisible(false);
        btnMenu.setEnabled(false);
        btnReporte.setEnabled(false);
        Hilo.reiniciarCoordenadas();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        pnlInventario = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        lblInventario = new javax.swing.JLabel();
        pnlProduccion = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        lblProduccion = new javax.swing.JLabel();
        pnlEmpaquetado = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        lblEmpaquetado = new javax.swing.JLabel();
        pnlSalida = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        lblSalida = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lblTiempo = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        lblInicio = new javax.swing.JLabel();
        lblFinal = new javax.swing.JLabel();
        btnReporte = new javax.swing.JButton();
        btnMenu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(660, 425));
        setMinimumSize(new java.awt.Dimension(660, 425));
        setResizable(false);
        setSize(new java.awt.Dimension(660, 425));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelPrincipal.setBackground(new java.awt.Color(241, 250, 238));
        panelPrincipal.setForeground(new java.awt.Color(241, 250, 238));
        panelPrincipal.setMaximumSize(new java.awt.Dimension(660, 425));
        panelPrincipal.setMinimumSize(new java.awt.Dimension(660, 425));
        panelPrincipal.setPreferredSize(new java.awt.Dimension(660, 425));
        panelPrincipal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelPrincipalMouseClicked(evt);
            }
        });
        panelPrincipal.setLayout(null);

        pnlInventario.setBackground(new java.awt.Color(144, 224, 239));
        pnlInventario.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 1, true));
        pnlInventario.setLayout(null);

        jLabel12.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(46, 45, 66));
        jLabel12.setText("Inventario:");
        pnlInventario.add(jLabel12);
        jLabel12.setBounds(7, 7, 67, 15);

        lblInventario.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        lblInventario.setForeground(new java.awt.Color(46, 45, 66));
        lblInventario.setText("0");
        pnlInventario.add(lblInventario);
        lblInventario.setBounds(80, 7, 20, 15);

        panelPrincipal.add(pnlInventario);
        pnlInventario.setBounds(370, 240, 230, 110);

        pnlProduccion.setBackground(new java.awt.Color(178, 255, 175));
        pnlProduccion.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 1, true));
        pnlProduccion.setLayout(null);

        jLabel14.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(46, 45, 66));
        jLabel14.setText("Produccion:");
        pnlProduccion.add(jLabel14);
        jLabel14.setBounds(7, 7, 75, 15);

        lblProduccion.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        lblProduccion.setForeground(new java.awt.Color(46, 45, 66));
        lblProduccion.setText("0");
        pnlProduccion.add(lblProduccion);
        lblProduccion.setBounds(88, 7, 20, 15);

        panelPrincipal.add(pnlProduccion);
        pnlProduccion.setBounds(370, 40, 230, 110);

        pnlEmpaquetado.setBackground(new java.awt.Color(224, 185, 255));
        pnlEmpaquetado.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 1, true));
        pnlEmpaquetado.setLayout(null);

        jLabel16.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(46, 45, 66));
        jLabel16.setText("Empaquetado:");
        pnlEmpaquetado.add(jLabel16);
        jLabel16.setBounds(7, 7, 90, 15);

        lblEmpaquetado.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        lblEmpaquetado.setForeground(new java.awt.Color(46, 45, 66));
        lblEmpaquetado.setText("0");
        pnlEmpaquetado.add(lblEmpaquetado);
        lblEmpaquetado.setBounds(103, 7, 20, 15);

        panelPrincipal.add(pnlEmpaquetado);
        pnlEmpaquetado.setBounds(45, 40, 230, 110);

        pnlSalida.setBackground(new java.awt.Color(251, 195, 188));
        pnlSalida.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 1, true));
        pnlSalida.setLayout(null);

        jLabel17.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(46, 45, 66));
        jLabel17.setText("Salida:");
        pnlSalida.add(jLabel17);
        jLabel17.setBounds(7, 7, 42, 15);

        lblSalida.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        lblSalida.setForeground(new java.awt.Color(46, 45, 66));
        lblSalida.setText("0");
        pnlSalida.add(lblSalida);
        lblSalida.setBounds(55, 7, 20, 15);

        panelPrincipal.add(pnlSalida);
        pnlSalida.setBounds(45, 239, 230, 110);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/felcha arriba.png"))); // NOI18N
        panelPrincipal.add(jLabel1);
        jLabel1.setBounds(390, 160, 24, 24);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/felcha arriba.png"))); // NOI18N
        panelPrincipal.add(jLabel2);
        jLabel2.setBounds(70, 210, 24, 24);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/flecha izquierda.png"))); // NOI18N
        panelPrincipal.add(jLabel3);
        jLabel3.setBounds(278, 80, 24, 24);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/felcha abajo.png"))); // NOI18N
        panelPrincipal.add(jLabel4);
        jLabel4.setBounds(220, 210, 24, 24);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/flecha izquierda.png"))); // NOI18N
        panelPrincipal.add(jLabel5);
        jLabel5.setBounds(40, 170, 24, 24);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/felcha abajo.png"))); // NOI18N
        panelPrincipal.add(jLabel7);
        jLabel7.setBounds(560, 210, 24, 24);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/felcha abajo.png"))); // NOI18N
        panelPrincipal.add(jLabel8);
        jLabel8.setBounds(220, 160, 24, 24);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/felcha arriba.png"))); // NOI18N
        panelPrincipal.add(jLabel9);
        jLabel9.setBounds(390, 210, 24, 24);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/flecha izquierda.png"))); // NOI18N
        panelPrincipal.add(jLabel10);
        jLabel10.setBounds(585, 170, 24, 24);

        lblTiempo.setFont(new java.awt.Font("Roboto Bk", 1, 16)); // NOI18N
        lblTiempo.setForeground(new java.awt.Color(46, 45, 66));
        lblTiempo.setText("00:00:00");
        panelPrincipal.add(lblTiempo);
        lblTiempo.setBounds(290, 10, 64, 19);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/flecha izquierda.png"))); // NOI18N
        panelPrincipal.add(jLabel6);
        jLabel6.setBounds(340, 80, 24, 24);

        jLabel18.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(46, 45, 66));
        jLabel18.setText("Inicio");
        panelPrincipal.add(jLabel18);
        jLabel18.setBounds(620, 180, 35, 15);

        jLabel19.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(46, 45, 66));
        jLabel19.setText("Final");
        panelPrincipal.add(jLabel19);
        jLabel19.setBounds(10, 190, 30, 15);

        lblInicio.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        lblInicio.setForeground(new java.awt.Color(46, 45, 66));
        lblInicio.setText("30");
        panelPrincipal.add(lblInicio);
        lblInicio.setBounds(630, 160, 15, 15);

        lblFinal.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        lblFinal.setForeground(new java.awt.Color(46, 45, 66));
        lblFinal.setText("0");
        panelPrincipal.add(lblFinal);
        lblFinal.setBounds(8, 170, 20, 15);

        btnReporte.setBackground(new java.awt.Color(20, 33, 61));
        btnReporte.setFont(new java.awt.Font("Roboto Bk", 0, 10)); // NOI18N
        btnReporte.setForeground(new java.awt.Color(241, 250, 238));
        btnReporte.setText("Reporte");
        btnReporte.setBorder(null);
        btnReporte.setEnabled(false);
        btnReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporteActionPerformed(evt);
            }
        });
        panelPrincipal.add(btnReporte);
        btnReporte.setBounds(290, 300, 60, 30);

        btnMenu.setBackground(new java.awt.Color(20, 33, 61));
        btnMenu.setFont(new java.awt.Font("Roboto Bk", 0, 10)); // NOI18N
        btnMenu.setForeground(new java.awt.Color(241, 250, 238));
        btnMenu.setText("Volver al menu");
        btnMenu.setBorder(null);
        btnMenu.setEnabled(false);
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });
        panelPrincipal.add(btnMenu);
        btnMenu.setBounds(280, 340, 80, 30);

        getContentPane().add(panelPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 380));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void panelPrincipalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelPrincipalMouseClicked

        System.out.println("X: " + evt.getX() + "Y: " + evt.getY());
    }//GEN-LAST:event_panelPrincipalMouseClicked

    Reporte reporte = new Reporte();
    
    private void btnReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteActionPerformed
        reporte.generarReporte(Integer.toString(this.costoInventario), Integer.toString(this.costoProduccion), Integer.toString(this.costoEmpaquetado), Integer.toString(this.costoSalida), Integer.toString(this.totalSim));
    }//GEN-LAST:event_btnReporteActionPerformed

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        this.dispose();
        Menu menu = new Menu();
        menu.setVisible(true);
    }//GEN-LAST:event_btnMenuActionPerformed

    void iniciarSimulacion(int tiempoInventario, int tiempoProduccion, int tiempoEmpaquetado, int tiempoSalida, int precioInventario, int precioProduccion, int precioEmpaquetado, int precioSalida, int tiempoTotal) {

        for (int i = 1; i <= 30; i++) {
            int retrasoInicial = i * 1000; // 1000 milisegundos = 1 segundo
            Hilo materia = new Hilo(i, tiempoInventario, tiempoProduccion, tiempoEmpaquetado, tiempoSalida, retrasoInicial, this);
            Thread hilo = new Thread(materia);
            hilo.start();
        }
        
        Cronometro cronometro = new Cronometro(lblTiempo, this, tiempoTotal);
        Thread hilo = new Thread(cronometro);
        hilo.start();
        
        this.costoInventario=precioInventario * (tiempoInventario/1000) * 30;
        this.costoProduccion=precioProduccion * (tiempoProduccion/1000) * 30;
        this.costoEmpaquetado=precioEmpaquetado * (tiempoEmpaquetado/1000) * 30;
        this.costoSalida=precioSalida * (tiempoSalida/1000) * 30;
        this.totalSim = this.costoInventario + this.costoProduccion + this.costoEmpaquetado + this.costoSalida;

    }
    
    int costoInventario, costoProduccion, costoEmpaquetado, costoSalida, totalSim;
    

    public void setInventario(String texto) {
        lblInventario.setText(texto);
    }

    public void setProduccion(String texto) {
        lblProduccion.setText(texto);
    }

    public void setEmpaquetado(String texto) {
        lblEmpaquetado.setText(texto);
    }

    public void setSalida(String texto) {
        lblSalida.setText(texto);
    }

    public void setInicio(String inicio) {
        lblInicio.setText(inicio);
    }
    
    public void setFinal(String fin) {
        lblFinal.setText(fin);
    }
    

    public int getInicio() {
        return Integer.parseInt(lblInicio.getText());
    }

    public int getInventario() {
        return Integer.parseInt(lblInventario.getText());
    }

    public int getProduccion() {
        return Integer.parseInt(lblProduccion.getText());
    }

    public int getEmpaquetado() {
        return Integer.parseInt(lblEmpaquetado.getText());
    }

    public int getSalida() {
        return Integer.parseInt(lblSalida.getText());
    }

    public int getFin() {
        return Integer.parseInt(lblFinal.getText());
    }
    
    public void habilitarBotones(){
        this.btnReporte.setEnabled(true);
        this.btnReporte.setVisible(true);
        this.btnMenu.setVisible(true);
        this.btnMenu.setEnabled(true);
    }

    public void agregarComponenteAPanelPrincipal(Component componente) {
        panelPrincipal.add(componente);
        panelPrincipal.setComponentZOrder(componente, 0);
        panelPrincipal.revalidate();
        panelPrincipal.repaint();

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
            java.util.logging.Logger.getLogger(Simulacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Simulacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Simulacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Simulacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Simulacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMenu;
    private javax.swing.JButton btnReporte;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblEmpaquetado;
    private javax.swing.JLabel lblFinal;
    private javax.swing.JLabel lblInicio;
    private javax.swing.JLabel lblInventario;
    private javax.swing.JLabel lblProduccion;
    private javax.swing.JLabel lblSalida;
    private javax.swing.JLabel lblTiempo;
    public javax.swing.JPanel panelPrincipal;
    private javax.swing.JPanel pnlEmpaquetado;
    private javax.swing.JPanel pnlInventario;
    private javax.swing.JPanel pnlProduccion;
    private javax.swing.JPanel pnlSalida;
    // End of variables declaration//GEN-END:variables
}
