package manosverdes;
import Entidades.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class FrameRegistrar extends javax.swing.JFrame {
    private FrameAporta padre;
    private BaseDeDatos bd;
 
    
    public FrameRegistrar()
    {   initComponents();}

    public FrameRegistrar(FrameAporta padre, BaseDeDatos bd){
        initComponents();
        this.padre= padre;
        this.bd = bd;
    }
    
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txt_Departamento = new javax.swing.JTextField();
        txt_Contenedor = new javax.swing.JTextField();
        txt_Localizacion = new javax.swing.JTextField();
        btn_Enviar = new javax.swing.JButton();
        btn_Volver = new javax.swing.JButton();
        txt_Distrito = new javax.swing.JTextField();
        lbl_imagen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(txt_Departamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 540, 430, 30));
        jPanel1.add(txt_Contenedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 430, 430, 30));
        jPanel1.add(txt_Localizacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, 430, 30));

        btn_Enviar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/v1.png"))); // NOI18N
        btn_Enviar.setBorder(null);
        btn_Enviar.setContentAreaFilled(false);
        btn_Enviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EnviarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Enviar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 640, 210, 60));

        btn_Volver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/v2.png"))); // NOI18N
        btn_Volver.setBorder(null);
        btn_Volver.setContentAreaFilled(false);
        btn_Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_VolverActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 620, 150, 70));
        jPanel1.add(txt_Distrito, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 340, 430, 30));

        lbl_imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/FI3.jpeg"))); // NOI18N
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

    private void btn_EnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EnviarActionPerformed
        int num =0;
    String Localizacion =txt_Localizacion.getText();
    String Distrito = txt_Distrito.getText();
    String Contenedor = txt_Contenedor.getText();
    String Departamento = txt_Departamento.getText();
    
    if (Localizacion != null && Distrito != null && Contenedor != null && Departamento != null) 
    {
        try {
            Connection conn = bd.obtenerConexion();
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT COUNT(*) AS datos\n" +
                                            "FROM Aportaciones;");
            if (rs.next()) {
                num = rs.getInt(1) + 1;
            }

            String dates = "INSERT INTO Aportaciones (id_Aportaciones, localizacion, distrito, contenedor, departamento) " +
                "VALUES (" + num + ", '" + Localizacion + "','" + Distrito + "','" +
                Contenedor + "','" + Departamento + "')";   

            st.executeUpdate(dates);

            JOptionPane.showMessageDialog(this, "Comentario"
                    + " registrado", "Confirmación", 
                    JOptionPane.INFORMATION_MESSAGE);

            this.padre.setLocationRelativeTo(padre);
            this.padre.setVisible(true);
            this.setVisible(false);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    }//GEN-LAST:event_btn_EnviarActionPerformed

    
    
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
            java.util.logging.Logger.getLogger(FrameRegistrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameRegistrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameRegistrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameRegistrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    
        java.awt.EventQueue.invokeLater(new Runnable() 
                
        {
            public void run() {
                new FrameRegistrar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Enviar;
    private javax.swing.JButton btn_Volver;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_imagen;
    private javax.swing.JTextField txt_Contenedor;
    private javax.swing.JTextField txt_Departamento;
    private javax.swing.JTextField txt_Distrito;
    private javax.swing.JTextField txt_Localizacion;
    // End of variables declaration//GEN-END:variables
}
