package manosverdes;


public class FrameRevisaModulo extends javax.swing.JFrame {

    private FrameGuiaApp padre;
    public FrameRevisaModulo() {
        initComponents();
    }
    public FrameRevisaModulo(FrameGuiaApp padre) {
        initComponents();
        this.padre=padre;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btn_1 = new javax.swing.JButton();
        btn_2 = new javax.swing.JButton();
        btn_3 = new javax.swing.JButton();
        btn_Volver = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1329, 0, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/titRevisaModulo.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 160));

        btn_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/btnModuloReciclaje.png"))); // NOI18N
        btn_1.setBorder(null);
        btn_1.setContentAreaFilled(false);
        btn_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_1ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, 809, 140));

        btn_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/btnUbiEstrat.png"))); // NOI18N
        btn_2.setBorder(null);
        btn_2.setContentAreaFilled(false);
        btn_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_2ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 320, 809, 140));

        btn_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/btnParaQSM.png"))); // NOI18N
        btn_3.setBorder(null);
        btn_3.setContentAreaFilled(false);
        btn_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_3ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 470, 810, 140));

        btn_Volver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/btn_Volver.png"))); // NOI18N
        btn_Volver.setBorder(null);
        btn_Volver.setContentAreaFilled(false);
        btn_Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_VolverActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 620, 180, 80));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/image 51.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void btn_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_1ActionPerformed
        FrameModulosdeReciclaje modulo=new FrameModulosdeReciclaje(this);
        modulo.setLocationRelativeTo(null);
        modulo.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_1ActionPerformed
    private void btn_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_2ActionPerformed
        FrameUbicacionEstrategica ubicacion=new FrameUbicacionEstrategica(this);
        ubicacion.setLocationRelativeTo(null);
        ubicacion.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_2ActionPerformed
    private void btn_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_3ActionPerformed
       FrameSirvenModulos sirven=new FrameSirvenModulos(this);
        sirven.setLocationRelativeTo(null);
        sirven.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_3ActionPerformed
    private void btn_VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_VolverActionPerformed
      this.padre.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_btn_VolverActionPerformed
    
    
    
    
    
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
            java.util.logging.Logger.getLogger(FrameRevisaModulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameRevisaModulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameRevisaModulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameRevisaModulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameRevisaModulo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_1;
    private javax.swing.JButton btn_2;
    private javax.swing.JButton btn_3;
    private javax.swing.JButton btn_Volver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
