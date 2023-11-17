package manosverdes;
import Entidades.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;

public class FrameFavoritosPuntosDeReciclaje extends javax.swing.JFrame {

    private FramePuntosDeReciclaje padre;
    private BaseDeDatos  bd;
    private Usuario user;
    List<PuntoReciclaje> puntosfav = new ArrayList<>();
    DefaultListModel<String>  model = new DefaultListModel();
    List<Ubicacion> ubic = new ArrayList<>();
    
    
    
    public FrameFavoritosPuntosDeReciclaje(FramePuntosDeReciclaje padre,
            BaseDeDatos  bd,Usuario user) 
    {
        initComponents();
        this.padre = padre;
        this.bd = bd;
        this.user =user;
     
        if(puntosfav == null){obtenerDatosPuntoReciclaje();}else{
            
            puntosfav.clear();
            model.clear();
            obtenerDatosPuntoReciclaje();
        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lst_Puntos = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        Volver = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1280, 720));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lst_Puntos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        lst_Puntos.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jScrollPane1.setViewportView(lst_Puntos);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 990, 490));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/lblPuntosReciclajeFavorito.png"))); // NOI18N
        jLabel2.setToolTipText("");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, -1, -1));

        Volver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FramesD/v1.png"))); // NOI18N
        Volver.setBorder(null);
        Volver.setContentAreaFilled(false);
        Volver.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/FramesD/v2.png"))); // NOI18N
        Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverActionPerformed(evt);
            }
        });
        jPanel1.add(Volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 640, 150, 70));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/image 51.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
public void obtenerDatosPuntoReciclaje() {
    try {
        Connection conn = bd.obtenerConexion();
        Statement st = conn.createStatement();
        
        String query = "SELECT T1.nombrePunto, T1.horafuncion, T4.Departamento, T4.Distrito, T4.Direccion " +
                       "FROM PuntoReciclaje T1 " +
                       "INNER JOIN Asignacion_Usuario_Punto T2 ON T1.id_PuntoReciclaje = T2.id_PuntoReciclaje " +
                       "INNER JOIN Usuario T3 ON T3.id_Usuario = T2.id_Usuario " +
                       "INNER JOIN Ubicacion T4 ON T1.id_Ubicacion = T4.id_Ubicacion " +
                       "WHERE T3.id_Usuario = " + user.getCodigoUsuario();
        ResultSet rs = st.executeQuery(query);
       
        while(rs.next()) 
        {          
            String nombrePunto = rs.getString("nombrePunto");
            String horario = rs.getString(2);
            
            String departamento = rs.getString("Departamento");
            String distrito = rs.getString("Distrito");
            String direccion = rs.getString("Direccion");
            CrearNodo(departamento, distrito, direccion,
                        nombrePunto, horario);         
        }
        lst_Puntos.setModel(model);
       
    } catch (SQLException e) {
        e.printStackTrace();
    }

}
    
public void CrearNodo(String departamento,String distrito,String direccion,
        String nombre,String hora)
{
    Ubicacion ubi = new Ubicacion(departamento,distrito,direccion);
    ubic.add(ubi);
    PuntoReciclaje pun = new PuntoReciclaje(nombre,ubi,hora); 
    puntosfav.add(pun);
    model.addElement(pun.TEXTO(pun));
}
  
    
    
    
    
    
    
    
    private void VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverActionPerformed
        padre.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_VolverActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Volver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> lst_Puntos;
    // End of variables declaration//GEN-END:variables
}
