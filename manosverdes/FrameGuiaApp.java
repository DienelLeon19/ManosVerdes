    package manosverdes;
import Entidades.*;
    
public class FrameGuiaApp extends javax.swing.JFrame {

    private FrameLoginPrincipal Padre;
    private BaseDeDatos bd;
    private Usuario user;
            
    public FrameGuiaApp(){
        initComponents();
    }
    public FrameGuiaApp(FrameLoginPrincipal Padre,Usuario user, BaseDeDatos bd){
        initComponents();
        this.Padre=Padre;
        this.user = user;
        this.bd = bd;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btnPuntosReciclaje = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        Name = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FramesD/modulos.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/FramesD/modulos1.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 110, 270, 530));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FramesD/reutiliza.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/FramesD/reutiliza1.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 110, 270, 530));

        btnPuntosReciclaje.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FramesD/puntos.png"))); // NOI18N
        btnPuntosReciclaje.setBorder(null);
        btnPuntosReciclaje.setBorderPainted(false);
        btnPuntosReciclaje.setContentAreaFilled(false);
        btnPuntosReciclaje.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/FramesD/puntos1.png"))); // NOI18N
        btnPuntosReciclaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPuntosReciclajeActionPerformed(evt);
            }
        });
        jPanel1.add(btnPuntosReciclaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 270, 530));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FramesD/Aporta.png"))); // NOI18N
        jButton4.setBorder(null);
        jButton4.setBorderPainted(false);
        jButton4.setContentAreaFilled(false);
        jButton4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/FramesD/aporta 1.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 110, 270, 530));

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FramesD/cerrar.png"))); // NOI18N
        jButton5.setBorder(null);
        jButton5.setBorderPainted(false);
        jButton5.setContentAreaFilled(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 640, 270, 70));

        Name.setText("Nombre");
        jPanel1.add(Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 80, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/FD1.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
        FrameRevisaModulo Ref = new FrameRevisaModulo(this);
        Ref.setLocationRelativeTo(Ref);
        Ref.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        FrameReutilizayCrea Ref = new FrameReutilizayCrea(this);
        Ref.setLocationRelativeTo(Ref);
        Ref.setVisible(true);
        this.setVisible(false);


    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnPuntosReciclajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPuntosReciclajeActionPerformed
        FramePuntosDeReciclaje p = new FramePuntosDeReciclaje(this,bd,user);
        p.setLocationRelativeTo(p);
        p.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnPuntosReciclajeActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        FrameAporta ref = new FrameAporta(this,bd);
        ref.setLocationRelativeTo(ref);
        ref.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        this.Padre.setLocationRelativeTo(Padre);
        this.Padre.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_jButton5ActionPerformed

    
    public void Modificar(String name)
    {
        Name.setText(name);
    }
    
    
    
    
    
    
    
    
    
    
    public static void main(String args[])
    {
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
                {new FrameGuiaApp().setVisible(true);}
        }
        );
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Name;
    private javax.swing.JButton btnPuntosReciclaje;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
