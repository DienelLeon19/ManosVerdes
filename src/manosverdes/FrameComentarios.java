    package manosverdes;
import Entidades.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
public class FrameComentarios extends javax.swing.JFrame {

    private FrameAporta padre;
    private BaseDeDatos bd;
    public FrameComentarios() {
        initComponents();
    }
      public FrameComentarios(FrameAporta padre, BaseDeDatos bd){
        initComponents();
        this.padre= padre;
        this.bd = bd;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn_Enviar = new javax.swing.JButton();
        btn_Volver = new javax.swing.JButton();
        txt_porque = new javax.swing.JTextField();
        txt_comenta = new javax.swing.JTextField();
        txt_recomienda = new javax.swing.JTextField();
        lbl_imagen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_Enviar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/v1.png"))); // NOI18N
        btn_Enviar.setBorder(null);
        btn_Enviar.setContentAreaFilled(false);
        btn_Enviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EnviarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Enviar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 630, 180, 70));

        btn_Volver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/v2.png"))); // NOI18N
        btn_Volver.setBorder(null);
        btn_Volver.setContentAreaFilled(false);
        btn_Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_VolverActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 620, 150, 70));
        jPanel1.add(txt_porque, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 380, 40));
        jPanel1.add(txt_comenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 370, 380, 40));
        jPanel1.add(txt_recomienda, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 540, 380, 40));

        lbl_imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/FI1.jpeg"))); // NOI18N
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
    String porque=txt_porque.getText();
    String comenta = txt_comenta.getText();
    String recomienda = txt_recomienda.getText();
    
    if(txt_porque != null && txt_comenta!= null && txt_recomienda != null)
    {
        try     
        {          
            Connection conn = bd.obtenerConexion();
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT COUNT(*) AS datos\n" +
                                            "FROM Comentario;");
            if (rs.next()) { num = rs.getInt(1) + 1;}
            
            String dates = "INSERT INTO Comentario (id_Comentario, porque, comenta, recomienda) VALUES (" + num + ", '" + porque + "', '" + comenta + "', '" + recomienda + "')";
            st.executeUpdate(dates);        
            JOptionPane.showMessageDialog(this, "Comentario registrado", "Confirmación", JOptionPane.INFORMATION_MESSAGE);

            
            this.padre.setLocationRelativeTo(padre);
            this.padre.setVisible(true);
            this.setVisible(false);
        } catch (Exception ex) {}    
    }
    
    }//GEN-LAST:event_btn_EnviarActionPerformed
    private void btn_VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_VolverActionPerformed
        this.padre.setLocationRelativeTo(padre);
        this.padre.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_VolverActionPerformed
    
    
    
    
    
    
    
    
    
    
    
    public static void main(String args[]) {     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameComentarios().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Enviar;
    private javax.swing.JButton btn_Volver;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_imagen;
    private javax.swing.JTextField txt_comenta;
    private javax.swing.JTextField txt_porque;
    private javax.swing.JTextField txt_recomienda;
    // End of variables declaration//GEN-END:variables
}
