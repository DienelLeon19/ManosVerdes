    package manosverdes;

import Entidades.Usuario;

public class FrameLogin extends javax.swing.JFrame {

    public FrameLogin() 
    {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txt_Nombre = new javax.swing.JTextField();
        btn_Inicio = new javax.swing.JButton();
        btn_Registrar = new javax.swing.JButton();
        txt_Contraseña = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(txt_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 320, 430, 40));

        btn_Inicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dat2/BTN_inicio de sesion.png"))); // NOI18N
        btn_Inicio.setBorder(null);
        btn_Inicio.setContentAreaFilled(false);
        btn_Inicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_InicioActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Inicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 490, 260, 80));

        btn_Registrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dat2/btn_Registrar.png"))); // NOI18N
        btn_Registrar.setBorder(null);
        btn_Registrar.setContentAreaFilled(false);
        jPanel1.add(btn_Registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 490, 260, 80));
        jPanel1.add(txt_Contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 420, 430, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dat2/Frame 8 (1).png"))); // NOI18N
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
               
        Usuario user = new Usuario(txt_Nombre.getText(),txt_Contraseña.getText());
        
        FrameGuiaApp Ref = new FrameGuiaApp(this,user);
        Ref.Modificar(user.TEXT(txt_Nombre.getText()));
        Ref.setLocationRelativeTo(Ref);
        Ref.setVisible(true);
      
    }//GEN-LAST:event_btn_InicioActionPerformed

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
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
    private javax.swing.JButton btn_Inicio;
    private javax.swing.JButton btn_Registrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField txt_Contraseña;
    private javax.swing.JTextField txt_Nombre;
    // End of variables declaration//GEN-END:variables
}
