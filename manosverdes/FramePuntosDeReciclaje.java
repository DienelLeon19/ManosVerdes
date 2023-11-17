package manosverdes;
import Entidades.*;

public class FramePuntosDeReciclaje extends javax.swing.JFrame {

    private FrameGuiaApp padre;
    private BaseDeDatos bd;
    private Usuario user;
    public FramePuntosDeReciclaje()
    {   initComponents();
    }
    
    public FramePuntosDeReciclaje(FrameGuiaApp padre,BaseDeDatos bd,Usuario user)
    {   initComponents();
        this.padre = padre;
        this.bd=bd;
        this.user=user;
    
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn_Fav = new javax.swing.JButton();
        btn_VerList = new javax.swing.JButton();
        Volver = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_Fav.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Group 169.png"))); // NOI18N
        btn_Fav.setBorder(null);
        btn_Fav.setContentAreaFilled(false);
        btn_Fav.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_FavActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Fav, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 310, 190, 260));

        btn_VerList.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/ad.png"))); // NOI18N
        btn_VerList.setBorder(null);
        btn_VerList.setContentAreaFilled(false);
        btn_VerList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_VerListActionPerformed(evt);
            }
        });
        jPanel1.add(btn_VerList, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 420, 260, 100));

        Volver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FramesD/v1.png"))); // NOI18N
        Volver.setBorder(null);
        Volver.setContentAreaFilled(false);
        Volver.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/FramesD/v2.png"))); // NOI18N
        Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverActionPerformed(evt);
            }
        });
        jPanel1.add(Volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 610, 150, 70));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/886552c1-8284-4181-8ca5-f21f8b185eb2.jpg"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1280, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_FavActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_FavActionPerformed
      FrameFavoritosPuntosDeReciclaje pantalla = new
         FrameFavoritosPuntosDeReciclaje(this,bd,user);
      pantalla.setLocationRelativeTo(pantalla);
      pantalla.setVisible(true);
      this.setVisible(false);
        
        
    }//GEN-LAST:event_btn_FavActionPerformed

    private void btn_VerListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_VerListActionPerformed
      FrameListaPuntosDeReciclaje pantalla = new 
      FrameListaPuntosDeReciclaje(this,bd,user);
      pantalla.setLocationRelativeTo(pantalla);
      pantalla.setVisible(true);
      this.setVisible(false);
    }//GEN-LAST:event_btn_VerListActionPerformed

    private void VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverActionPerformed
        this.padre.setLocationRelativeTo(this.padre);
        this.padre.setVisible(true);
        this.setVisible(false);  
    }//GEN-LAST:event_VolverActionPerformed


    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
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
            java.util.logging.Logger.getLogger(FramePuntosDeReciclaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FramePuntosDeReciclaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FramePuntosDeReciclaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FramePuntosDeReciclaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Volver;
    private javax.swing.JButton btn_Fav;
    private javax.swing.JButton btn_VerList;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    void setLocale(FramePuntosDeReciclaje padre) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
