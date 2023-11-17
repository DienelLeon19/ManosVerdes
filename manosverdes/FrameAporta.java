package manosverdes;
import Entidades.*;
public class FrameAporta extends javax.swing.JFrame {

    private FrameGuiaApp padre;
    private BaseDeDatos bd;
   
    
    public FrameAporta()
    {   initComponents();}
    
    public FrameAporta(FrameGuiaApp padre,BaseDeDatos bd)
    {
        initComponents();
        this.padre=padre;
        this.bd = bd;
        
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn_Registrar = new javax.swing.JButton();
        btn_Comentario = new javax.swing.JButton();
        btn_Volver = new javax.swing.JButton();
        lbl_imagen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_Registrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Group 182.png"))); // NOI18N
        btn_Registrar.setBorder(null);
        btn_Registrar.setContentAreaFilled(false);
        btn_Registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RegistrarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 350, -1, 190));

        btn_Comentario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Group 180.png"))); // NOI18N
        btn_Comentario.setBorder(null);
        btn_Comentario.setContentAreaFilled(false);
        btn_Comentario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ComentarioActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Comentario, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 650, 200));

        btn_Volver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/v2.png"))); // NOI18N
        btn_Volver.setBorder(null);
        btn_Volver.setContentAreaFilled(false);
        btn_Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_VolverActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 620, 150, 70));

        lbl_imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/FI2.jpeg"))); // NOI18N
        jPanel1.add(lbl_imagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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

    private void btn_ComentarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ComentarioActionPerformed
        FrameComentarios newFrame = new FrameComentarios(this,bd);
        
        newFrame.setLocationRelativeTo(newFrame);
        newFrame.setVisible(true);
        this.setVisible(false); 
        
    }//GEN-LAST:event_btn_ComentarioActionPerformed

    private void btn_RegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RegistrarActionPerformed
        FrameRegistrar newFrame = new FrameRegistrar(this,bd);
        newFrame.setLocationRelativeTo(newFrame);
        newFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_RegistrarActionPerformed

    private void btn_VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_VolverActionPerformed
        this.padre.setLocationRelativeTo(padre);
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
            java.util.logging.Logger.getLogger(FrameAporta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameAporta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameAporta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameAporta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameAporta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Comentario;
    private javax.swing.JButton btn_Registrar;
    private javax.swing.JButton btn_Volver;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_imagen;
    // End of variables declaration//GEN-END:variables
}
