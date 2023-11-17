    package manosverdes;   
import Entidades.*;

public class FrameLogin extends javax.swing.JFrame
{
    private BaseDeDatos bd;
    public FrameLogin() 
    {   initComponents();
        
    }
    public FrameLogin(BaseDeDatos bd) 
    {   initComponents();
        this.bd= bd;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn_Inicio1 = new javax.swing.JButton();
        btn_Registrar1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_Inicio1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FramesD/inicio.png"))); // NOI18N
        btn_Inicio1.setBorder(null);
        btn_Inicio1.setContentAreaFilled(false);
        btn_Inicio1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Inicio1ActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Inicio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 390, 260, 80));

        btn_Registrar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FramesD/registrar.png"))); // NOI18N
        btn_Registrar1.setBorder(null);
        btn_Registrar1.setContentAreaFilled(false);
        btn_Registrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Registrar1ActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Registrar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 480, 260, 80));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/2.jpg"))); // NOI18N
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

    private void btn_Registrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Registrar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_Registrar1ActionPerformed

    private void btn_Inicio1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Inicio1ActionPerformed
        FrameLoginPrincipal ref = new FrameLoginPrincipal(this,bd);
        ref.setLocationRelativeTo(ref);
        ref.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_Inicio1ActionPerformed

    
    
    
    
    
    
  
    public static void main(String args[])
    {
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
                {new FrameLogin().setVisible(true);}
        }
        );
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Inicio1;
    private javax.swing.JButton btn_Registrar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
