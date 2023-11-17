    package manosverdes;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import Entidades.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;

public class FrameListaPuntosDeReciclaje extends javax.swing.JFrame {
       
    private FramePuntosDeReciclaje padre;
    private BaseDeDatos bd;
     private Usuario user;
    List<PuntoReciclaje> puntos = new ArrayList<>();
    DefaultListModel<String>  model = new DefaultListModel();
    List<Ubicacion> ubi = new ArrayList<>();
    

    public FrameListaPuntosDeReciclaje( ) { initComponents();}

    public FrameListaPuntosDeReciclaje(FramePuntosDeReciclaje padre,
            BaseDeDatos bd,Usuario user)
    {
        initComponents();
        this.padre=padre;
        this.bd=bd;
        this.user=user;
        if(model!=null){obtenerDatosPuntoReciclaje();}
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        lst_Puntos = new javax.swing.JList<>();
        jLabel3 = new javax.swing.JLabel();
        btn_Fav = new javax.swing.JButton();
        Volver = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lst_Puntos.setFont(new java.awt.Font("Arial Narrow", 2, 18)); // NOI18N
        lst_Puntos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        jScrollPane2.setViewportView(lst_Puntos);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 1170, 460));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/lblPuntosReciclaje.png"))); // NOI18N
        jLabel3.setToolTipText("");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, -1, -1));

        btn_Fav.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/a.png"))); // NOI18N
        btn_Fav.setContentAreaFilled(false);
        btn_Fav.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/b.png"))); // NOI18N
        btn_Fav.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_FavActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Fav, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 40, 100, 90));

        Volver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FramesD/v1.png"))); // NOI18N
        Volver.setBorder(null);
        Volver.setContentAreaFilled(false);
        Volver.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/FramesD/v2.png"))); // NOI18N
        Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverActionPerformed(evt);
            }
        });
        jPanel1.add(Volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 640, 150, 70));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/image 51.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, -1));

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
    
    

    public void obtenerDatosPuntoReciclaje( ) {
    try {
        Connection conn = bd.obtenerConexion();
        Statement st = conn.createStatement();

        String query = "Select T1.*  , T2.Departamento,T2.Distrito,T2.Direccion"
                + " From PuntoReciclaje T1 inner join Ubicacion T2 ON "
                + "T1.id_Ubicacion = T2.id_Ubicacion";
        
        ResultSet rs = st.executeQuery(query);
       
        while(rs.next()) 
        {          
            String nombrePunto = rs.getString("nombrePunto");
            String horario = rs.getString(4);
            int id = rs.getInt(1);
            String departamento = rs.getString("departamento");
            String distrito = rs.getString("distrito");
            String direccion = rs.getString("direccion");
            CrearNodo(departamento, distrito, direccion,
                        nombrePunto, horario,id);         
        }
        lst_Puntos.setModel(model);
       
    } catch (SQLException e) {
        e.printStackTrace();
    }

}
    
public void CrearNodo(String departamento,String distrito,String direccion,
        String nombre,String hora,int id)
{
    Ubicacion ubi = new Ubicacion(departamento,distrito,direccion);
    PuntoReciclaje pun = new PuntoReciclaje(nombre,ubi,hora); 
    pun.setId_punto(id);
    
    puntos.add(pun);
    model.addElement(pun.TEXTO(pun));
}
  
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    private void VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverActionPerformed
        this.setVisible(false);
        this.padre.setLocationRelativeTo(padre);
        this.padre.setVisible(true);
    }//GEN-LAST:event_VolverActionPerformed

    private void btn_FavActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_FavActionPerformed
        int ip = lst_Puntos.getSelectedIndex();
        if (ip != -1) 
        {
            try {
                PuntoReciclaje pun = puntos.get(ip);
                int N_punto = pun.getId_punto();
                int N_user= user.getCodigoUsuario();
                Connection conn = bd.obtenerConexion();
                Statement st = conn.createStatement();

                String query = "SELECT COUNT(*) AS cantidad_resultados FROM "
        + "Asignacion_Usuario_Punto WHERE id_Usuario = " + N_user
        + " AND id_PuntoReciclaje = " + N_punto + ";";
                ResultSet rs = st.executeQuery(query);
            
            if (rs.next())
            {
                int num =rs.getInt(1);
                if(num==0)
                {
                   String q1 ="SELECT COUNT(*) AS cantidad_registros\n" +
                    "FROM Asignacion_Usuario_Punto;";
                   ResultSet rs2 = st.executeQuery(q1);
                   if (rs2.next()) 
                   {
                    int total = rs2.getInt(1)+1;
                    String q2 = "INSERT INTO Asignacion_Usuario_Punto (id_Asignacion, id_PuntoReciclaje, id_Usuario)\n" +
                    "VALUES (" + total + ", " + N_punto + ", " + N_user + ");";
                     st.executeUpdate(q2);
                   }
            
                }
            }
                
                
                
                
                
       } catch (SQLException e) {
            e.printStackTrace();    
        }

            
          
        } 
    }//GEN-LAST:event_btn_FavActionPerformed


    
    
    
    
    
    
    
    
    
    
    
    
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
            java.util.logging.Logger.getLogger(FrameListaPuntosDeReciclaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameListaPuntosDeReciclaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameListaPuntosDeReciclaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameListaPuntosDeReciclaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameListaPuntosDeReciclaje().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Volver;
    private javax.swing.JButton btn_Fav;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> lst_Puntos;
    // End of variables declaration//GEN-END:variables
}
