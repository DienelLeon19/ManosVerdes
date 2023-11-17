    package manosverdes;
import Entidades.*;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
    
public class FrameLoginPrincipal extends javax.swing.JFrame {

    private FrameLogin padre;
    private BaseDeDatos bd;
    public FrameLoginPrincipal() 
    {   initComponents();}

    public FrameLoginPrincipal(FrameLogin padre, BaseDeDatos bd) 
    {   initComponents();
        this.padre= padre;
        this.bd=bd;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txt_Nombre = new javax.swing.JTextField();
        btn_Inicio = new javax.swing.JButton();
        txt_Contraseña = new javax.swing.JPasswordField();
        Volver = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_Nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_NombreActionPerformed(evt);
            }
        });
        jPanel1.add(txt_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 320, 430, 40));

        btn_Inicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FramesD/inicio.png"))); // NOI18N
        btn_Inicio.setBorder(null);
        btn_Inicio.setContentAreaFilled(false);
        btn_Inicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_InicioActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Inicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 480, 260, 80));

        txt_Contraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ContraseñaActionPerformed(evt);
            }
        });
        jPanel1.add(txt_Contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 420, 430, 40));

        Volver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/aa.png"))); // NOI18N
        Volver.setBorder(null);
        Volver.setContentAreaFilled(false);
        Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverActionPerformed(evt);
            }
        });
        jPanel1.add(Volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 150, 70));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/1.jpeg"))); // NOI18N
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

    private void btn_InicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_InicioActionPerformed
        String name = txt_Nombre.getText();
        char[] cont = txt_Contraseña.getPassword();
        String contra = new String(cont);
        boolean usuarioEncontrado = false;
        try 
        {          
            Connection conn = bd.obtenerConexion();
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("select * from usuario");

            while(rs.next()){
            int id = rs.getInt(1);    
            String usuario = rs.getString(2);
            String pass = rs.getString(3);

            if (usuario.equals(name)) {
            if (pass.equals(contra)) {
                Usuario user = new Usuario(name, contra);
                user.setCodigoUsuario(id);
                
                FrameGuiaApp Ref = new FrameGuiaApp(this, user, bd);
                Ref.Modificar(user.TEXT(txt_Nombre.getText()));
                Ref.setLocationRelativeTo(Ref);
                Ref.setVisible(true);
                this.setVisible(false);
                
                usuarioEncontrado = true;
                break;
            }
        }
        }
        } catch (Exception ex) {}     
    if (!usuarioEncontrado) 
    {
        JOptionPane.showMessageDialog(this, "Usuario no registrado", "Error de inicio de sesión", JOptionPane.ERROR_MESSAGE);
    }


    }//GEN-LAST:event_btn_InicioActionPerformed

    private void txt_NombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_NombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_NombreActionPerformed
    private void txt_ContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ContraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ContraseñaActionPerformed

    private void VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverActionPerformed
        this.padre.setLocationRelativeTo(padre);
        this.padre.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_VolverActionPerformed

    
    
    
    
    
    public static void main(String args[])
    {
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
                {new FrameLoginPrincipal().setVisible(true);}
        }
        );
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Volver;
    private javax.swing.JButton btn_Inicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField txt_Contraseña;
    private javax.swing.JTextField txt_Nombre;
    // End of variables declaration//GEN-END:variables
}
