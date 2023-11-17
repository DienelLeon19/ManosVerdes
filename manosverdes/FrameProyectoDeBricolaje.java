/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package manosverdes;

/**
 *
 * @author Leonardo
 */
public class FrameProyectoDeBricolaje extends javax.swing.JFrame {

    private FrameReutilizayCrea padre;
    /**
     * Creates new form FrameProyectoDeBricolaje
     */
    public FrameProyectoDeBricolaje() {
        initComponents();
    }

    
     public FrameProyectoDeBricolaje(FrameReutilizayCrea padre) {
        this.padre = padre;
        initComponents();
        
        
        
    
        btnAtras.setVisible(false);
        btnSiguiente.setVisible(true);


        mostrarImagenes();


    }
     
     private String[] imagenes = {
        "/Recursos/Img7.jpeg",
        "/Recursos/Img8.jpeg",
        "/Recursos/Img9.jpeg",
        "/Recursos/Img10.jpeg",
        "/Recursos/Img11.jpeg",
        "/Recursos/Img12.jpeg",
    };
    
    private String[] infoImagenes = {
        "/Recursos/Info4E.png",
        "/Recursos/Info5E.png",
        "/Recursos/Info6E.png"
    };
    
    private int indiceImagenActual = 0;
    private int indiceInfoActual = 0;
    
    private void mostrarImagenes() {
        // Actualiza la imagen para lbl_Img1
        lbl_Img1.setIcon(new javax.swing.ImageIcon(getClass().getResource(imagenes[indiceImagenActual])));

        // Actualiza la imagen para lbl_Img2
        lbl_Img2.setIcon(new javax.swing.ImageIcon(getClass().getResource(imagenes[indiceImagenActual + 1])));
    }
    
    private void mostrarInfo() {
         // Actualiza la imagen para lbl_Info
         lbl_Info.setIcon(new javax.swing.ImageIcon(getClass().getResource(infoImagenes[indiceInfoActual])));
        }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbl_Info = new javax.swing.JLabel();
        lbl_Img1 = new javax.swing.JLabel();
        lbl_Img2 = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();
        btnAtras = new javax.swing.JButton();
        btnSiguiente = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_Info.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Info4E.png"))); // NOI18N
        jPanel1.add(lbl_Info, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, -1, -1));

        lbl_Img1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Img7.jpeg"))); // NOI18N
        jPanel1.add(lbl_Img1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 380, -1, -1));

        lbl_Img2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Img8.jpeg"))); // NOI18N
        jPanel1.add(lbl_Img2, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 370, -1, -1));

        btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/v2.png"))); // NOI18N
        btnVolver.setBorder(null);
        btnVolver.setContentAreaFilled(false);
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        jPanel1.add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 640, -1, -1));

        btnAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/btnAnterior.png"))); // NOI18N
        btnAtras.setBorder(null);
        btnAtras.setContentAreaFilled(false);
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });
        jPanel1.add(btnAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));

        btnSiguiente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/btnSiguiente.png"))); // NOI18N
        btnSiguiente.setBorder(null);
        btnSiguiente.setContentAreaFilled(false);
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });
        jPanel1.add(btnSiguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 310, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/image 51.png"))); // NOI18N
        jLabel1.setPreferredSize(new java.awt.Dimension(1280, 720));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        padre.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        indiceImagenActual -= 2;

         indiceInfoActual--;


          if (indiceImagenActual < 0 || indiceInfoActual < 0) {           
              btnAtras.setVisible(false);
             btnSiguiente.setVisible(true);
         } else {
               mostrarImagenes();
              mostrarInfo();
         }
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed
        indiceImagenActual += 2;

         indiceInfoActual++;


         if (indiceImagenActual >= imagenes.length || indiceInfoActual >= infoImagenes.length) {
              btnSiguiente.setVisible(false);
              btnAtras.setVisible(true);
         } else {
              mostrarImagenes();
              mostrarInfo();
         }
    }//GEN-LAST:event_btnSiguienteActionPerformed

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
            java.util.logging.Logger.getLogger(FrameProyectoDeBricolaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameProyectoDeBricolaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameProyectoDeBricolaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameProyectoDeBricolaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_Img1;
    private javax.swing.JLabel lbl_Img2;
    private javax.swing.JLabel lbl_Info;
    // End of variables declaration//GEN-END:variables
}
