package manosverdes;

public class FrameUbicacionEstrategica extends javax.swing.JFrame {

    private FrameRevisaModulo padre;
    public FrameUbicacionEstrategica() {
        initComponents();
    }
    public FrameUbicacionEstrategica(FrameRevisaModulo padre) 
    {
        initComponents();
        this.padre=padre;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelTitulo = new javax.swing.JLabel();
        labelTexto = new javax.swing.JLabel();
        labelImagen = new javax.swing.JLabel();
        btnSiguiente = new javax.swing.JButton();
        btnAtras = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1286, 0, -1, -1));

        labelTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/titCC.png"))); // NOI18N
        getContentPane().add(labelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 69, 670, 110));

        labelTexto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/textCC.png"))); // NOI18N
        getContentPane().add(labelTexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, 590, 370));

        labelImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/imgCC.jpg"))); // NOI18N
        getContentPane().add(labelImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(748, 232, 389, 323));

        btnSiguiente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/btnSiguiente.png"))); // NOI18N
        btnSiguiente.setBorder(null);
        btnSiguiente.setContentAreaFilled(false);
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });
        getContentPane().add(btnSiguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 300, 90, 80));

        btnAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/btnAtras.png"))); // NOI18N
        btnAtras.setBorder(null);
        btnAtras.setContentAreaFilled(false);
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });
        getContentPane().add(btnAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 80, 100));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/btn_Volver.png"))); // NOI18N
        jButton3.setBorder(null);
        jButton3.setContentAreaFilled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 620, 170, 70));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/image 51.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private String[] informacion = {
        "/Recursos/titCC.png",
        "/Recursos/titPP.png",
        "/Recursos/titEyU.png",
    };
    private String[] informacion2 = {
        "/Recursos/textCC.png",
        "/Recursos/textPP.png",
        "/Recursos/textEyU.png",
    };
    private String[] imagenes = {
        "/Recursos/imgCC.jpg",
        "/Recursos/imgPP.jpg",
        "/Recursos/imgEyU.jpg"
    };
    private int indiceImagenActual = 0;
    private int indiceInfoActual = 0;
    private int indiceInfoActual2 = 0;
    
    private void mostrarImagenes() {
        // Actualiza la imagen para lbl_Img
        labelImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource(imagenes[indiceImagenActual])));
    }
     private void mostrarInfo() {
         // Actualiza la imagen para lbl_Info
         labelTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource(informacion[indiceInfoActual])));
         
        }
     private void mostrarInfo2()
     {
         labelTexto.setIcon(new javax.swing.ImageIcon(getClass().getResource(informacion2[indiceInfoActual2])));
     }
    
    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        indiceImagenActual -= 1;

         indiceInfoActual--;
         indiceInfoActual2--;

          if (indiceImagenActual < 0 || indiceInfoActual < 0|| indiceInfoActual2 < 0) {
              btnAtras.setVisible(false);
             btnSiguiente.setVisible(true);
         } else {
               mostrarImagenes();
              mostrarInfo();
              mostrarInfo2();
         }
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed
        indiceImagenActual +=1;

        // Incrementa el índice de info si es necesario
         indiceInfoActual++;
         indiceInfoActual2++;

          // Verifica si el índice está fuera de límites
         if (indiceImagenActual >= imagenes.length || indiceInfoActual >= informacion.length|| indiceInfoActual2 >= informacion2.length) {
              // Si se llega al final, oculta el botón Siguiente y muestra el botón Atrás
              btnSiguiente.setVisible(false);
              btnAtras.setVisible(true);
         } else {
              // Muestra las imágenes y la info siguientes al mismo tiempo
              mostrarImagenes();
              mostrarInfo();
              mostrarInfo2();
              
         }
    }//GEN-LAST:event_btnSiguienteActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.padre.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(FrameUbicacionEstrategica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameUbicacionEstrategica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameUbicacionEstrategica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameUbicacionEstrategica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameUbicacionEstrategica().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelImagen;
    private javax.swing.JLabel labelTexto;
    private javax.swing.JLabel labelTitulo;
    // End of variables declaration//GEN-END:variables
}
