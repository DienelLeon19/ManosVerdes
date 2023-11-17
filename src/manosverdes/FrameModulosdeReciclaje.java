package manosverdes;

public class FrameModulosdeReciclaje extends javax.swing.JFrame {

    private FrameRevisaModulo padre;
    public FrameModulosdeReciclaje() {
        initComponents();
    }

    public FrameModulosdeReciclaje(FrameRevisaModulo padre) 
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
        btnAtras = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btnSiguiente = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/titRestos.png"))); // NOI18N
        jPanel1.add(labelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 350, 110));

        labelTexto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/textRestos.png"))); // NOI18N
        jPanel1.add(labelTexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(168, 242, 660, 410));

        labelImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/imgRestos.jpg"))); // NOI18N
        jPanel1.add(labelImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(822, 176, 320, 470));

        btnAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/btnAtras.png"))); // NOI18N
        btnAtras.setToolTipText("");
        btnAtras.setBorder(null);
        btnAtras.setBorderPainted(false);
        btnAtras.setContentAreaFilled(false);
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });
        jPanel1.add(btnAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 60, 110));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/btn_Volver.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 600, 160, 80));

        btnSiguiente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/btnSiguiente.png"))); // NOI18N
        btnSiguiente.setBorder(null);
        btnSiguiente.setContentAreaFilled(false);
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });
        jPanel1.add(btnSiguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 290, -1, 100));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/image 51.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

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
    
    private void llamarVentana1()
    {
        FrameRevisaModulo revMod=new FrameRevisaModulo();
        revMod.setLocationRelativeTo(null);
        revMod.setVisible(true);
        dispose();
    }
    private String[] informacion = {
        "/Recursos/titRestos.png",
        "/Recursos/titOrganico.png",
        "/Recursos/titVidrio.png",
        "/Recursos/titPapel.png"
    };
    private String[] informacion2 = {
        "/Recursos/textRestos.png",
        "/Recursos/textOrganico.png",
        "/Recursos/textVidrio.png",
        "/Recursos/textPapel.png"
    };
    private String[] imagenes = {
        "/Recursos/imgRestos.jpg",
        "/Recursos/imgOrganico.jpg",
        "/Recursos/imgVidrio.jpg",
        "/Recursos/imgPapel.jpg"    
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
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        llamarVentana1();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(FrameModulosdeReciclaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameModulosdeReciclaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameModulosdeReciclaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameModulosdeReciclaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameModulosdeReciclaje().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelImagen;
    private javax.swing.JLabel labelTexto;
    private javax.swing.JLabel labelTitulo;
    // End of variables declaration//GEN-END:variables
}
