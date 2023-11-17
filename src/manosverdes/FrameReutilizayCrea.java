package manosverdes;


public class FrameReutilizayCrea extends javax.swing.JFrame {

    private FrameGuiaApp padre;

    public FrameReutilizayCrea() {
        initComponents();
    }

    
     public FrameReutilizayCrea(FrameGuiaApp padre) {
        this.padre = padre;
        initComponents();
        

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbl_ReutilizayCrea = new javax.swing.JLabel();
        btnIdeas_Reci = new javax.swing.JButton();
        btnProy_Brico = new javax.swing.JButton();
        btnArte_Manu = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        lbl_imagen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_ReutilizayCrea.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/RyC.png"))); // NOI18N
        jPanel1.add(lbl_ReutilizayCrea, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, -1, -1));

        btnIdeas_Reci.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/IdR.png"))); // NOI18N
        btnIdeas_Reci.setBorder(null);
        btnIdeas_Reci.setContentAreaFilled(false);
        btnIdeas_Reci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIdeas_ReciActionPerformed(evt);
            }
        });
        jPanel1.add(btnIdeas_Reci, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, -1, -1));

        btnProy_Brico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/PdB.png"))); // NOI18N
        btnProy_Brico.setBorder(null);
        btnProy_Brico.setContentAreaFilled(false);
        btnProy_Brico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProy_BricoActionPerformed(evt);
            }
        });
        jPanel1.add(btnProy_Brico, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 320, -1, -1));

        btnArte_Manu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/AyM.png"))); // NOI18N
        btnArte_Manu.setBorder(null);
        btnArte_Manu.setContentAreaFilled(false);
        btnArte_Manu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnArte_ManuActionPerformed(evt);
            }
        });
        jPanel1.add(btnArte_Manu, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 470, -1, -1));

        btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/v2.png"))); // NOI18N
        btnVolver.setBorder(null);
        btnVolver.setContentAreaFilled(false);
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        jPanel1.add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 640, -1, -1));

        lbl_imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/image 51.png"))); // NOI18N
        lbl_imagen.setPreferredSize(new java.awt.Dimension(1280, 720));
        jPanel1.add(lbl_imagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIdeas_ReciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIdeas_ReciActionPerformed
        FrameIdeasDeReutilizacion Ir = new FrameIdeasDeReutilizacion(this);
        Ir.setLocationRelativeTo(Ir);
        Ir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnIdeas_ReciActionPerformed

    private void btnProy_BricoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProy_BricoActionPerformed
        FrameProyectoDeBricolaje Ir = new FrameProyectoDeBricolaje(this);
        Ir.setLocationRelativeTo(Ir);
        Ir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnProy_BricoActionPerformed

    private void btnArte_ManuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnArte_ManuActionPerformed
        FrameArteYManualidades Ir = new FrameArteYManualidades(this);
        Ir.setLocationRelativeTo(Ir);
        Ir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnArte_ManuActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        padre.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

 
     

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
            java.util.logging.Logger.getLogger(FrameReutilizayCrea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameReutilizayCrea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameReutilizayCrea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameReutilizayCrea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameReutilizayCrea().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnArte_Manu;
    private javax.swing.JButton btnIdeas_Reci;
    private javax.swing.JButton btnProy_Brico;
    private javax.swing.JButton btnVolver;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_ReutilizayCrea;
    private javax.swing.JLabel lbl_imagen;
    // End of variables declaration//GEN-END:variables
}
