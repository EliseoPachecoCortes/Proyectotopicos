//
/// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 //* Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
package Interfazchofer;
 import java.awt.BorderLayout;
 import javax.swing.JPanel;
///**
// *
// * @author elise
// */
public class menudeChofer extends javax.swing.JFrame {

    private informacionDeChofer infoChofer;
    private horarioDeChoferes horaChofer;
    private informacionAutobus infoAutobus;
    private informacionRutasDeChofer infoRuta;
    private bitacoraDeViajes biViaje;
    private informacionLicencia infoLicencia;
    private direcciondeChofer dicChofer;
    
    public menudeChofer() {
        initComponents();
        inicializarVentanas();
    }
    private void inicializarVentanas() {
            infoChofer = new informacionDeChofer();
            horaChofer = new horarioDeChoferes();
            infoAutobus = new informacionAutobus();
            infoRuta = new informacionRutasDeChofer();
            biViaje = new bitacoraDeViajes();
            infoLicencia = new informacionLicencia();
            dicChofer = new direcciondeChofer();

            infoChofer.setMenuChofer(this);
            horaChofer.setMenuChofer(this);
            infoAutobus.setMenuChofer(this);
            infoRuta.setMenuChofer(this);
            biViaje.setMenuChofer(this);
            infoLicencia.setMenuChofer(this);

            dicChofer.setInfoChofer(infoChofer);
            infoChofer.setDicChofer(dicChofer);
     }

   @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu2 = new javax.swing.JMenu();
        jPanel2 = new javax.swing.JPanel();
        content = new javax.swing.JPanel();
        misdatos = new javax.swing.JButton();
        horario = new javax.swing.JButton();
        licencia = new javax.swing.JButton();
        autobus = new javax.swing.JButton();
        vitacora = new javax.swing.JButton();
        ruta = new javax.swing.JButton();
        cerrarsesion = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();

        jMenu2.setText("jMenu2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 255, 153));

        jPanel2.setBackground(new java.awt.Color(0, 204, 153));

        content.setBackground(new java.awt.Color(62, 67, 76));

        misdatos.setBackground(new java.awt.Color(62, 67, 76));
        misdatos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/misdatos.png"))); // NOI18N
        misdatos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        misdatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                misdatosActionPerformed(evt);
            }
        });

        horario.setBackground(new java.awt.Color(62, 67, 76));
        horario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Horario.png"))); // NOI18N
        horario.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        horario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                horarioActionPerformed(evt);
            }
        });

        licencia.setBackground(new java.awt.Color(62, 67, 76));
        licencia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/licencia.png"))); // NOI18N
        licencia.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        licencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                licenciaActionPerformed(evt);
            }
        });

        autobus.setBackground(new java.awt.Color(62, 67, 76));
        autobus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/autobus.png"))); // NOI18N
        autobus.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        autobus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                autobusActionPerformed(evt);
            }
        });

        vitacora.setBackground(new java.awt.Color(62, 67, 76));
        vitacora.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bitacora.png"))); // NOI18N
        vitacora.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        vitacora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vitacoraActionPerformed(evt);
            }
        });

        ruta.setBackground(new java.awt.Color(62, 67, 76));
        ruta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ruta.png"))); // NOI18N
        ruta.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ruta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rutaActionPerformed(evt);
            }
        });

        cerrarsesion.setBackground(new java.awt.Color(62, 67, 76));
        cerrarsesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cerrarsesion.png"))); // NOI18N
        cerrarsesion.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentLayout.createSequentialGroup()
                .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(contentLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cerrarsesion))
                    .addGroup(contentLayout.createSequentialGroup()
                        .addContainerGap(134, Short.MAX_VALUE)
                        .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(contentLayout.createSequentialGroup()
                                .addComponent(autobus)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(vitacora))
                            .addGroup(contentLayout.createSequentialGroup()
                                .addComponent(misdatos)
                                .addGap(153, 153, 153)
                                .addComponent(horario)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(179, 179, 179)
                .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(licencia)
                    .addComponent(ruta))
                .addGap(127, 127, 127))
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(misdatos)
                    .addComponent(horario)
                    .addComponent(licencia))
                .addGap(47, 47, 47)
                .addComponent(cerrarsesion)
                .addGap(47, 47, 47)
                .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(vitacora, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(autobus, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(ruta))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setBackground(new java.awt.Color(0, 255, 153));
        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Choferes De Oaxaca");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1099, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(content, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(content, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMenu4.setText("Ayuda");
        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
  
    
    private void misdatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_misdatosActionPerformed
        infoChofer.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_misdatosActionPerformed

    private void horarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_horarioActionPerformed
        horaChofer.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_horarioActionPerformed

    private void licenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_licenciaActionPerformed
         infoLicencia.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_licenciaActionPerformed

    private void autobusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_autobusActionPerformed
        infoAutobus.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_autobusActionPerformed

    private void vitacoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vitacoraActionPerformed
        biViaje.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_vitacoraActionPerformed

    private void rutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rutaActionPerformed
        infoRuta.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_rutaActionPerformed

    private void ShowPanel(JPanel c) {
        c.setSize(1300, 750);
        c.setLocation(0, 0);
        
        content.removeAll();
        content.add(c, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }
    
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
            java.util.logging.Logger.getLogger(menudeChofer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menudeChofer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menudeChofer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menudeChofer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               new menudeChofer().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton autobus;
    private javax.swing.JButton cerrarsesion;
    private javax.swing.JPanel content;
    private javax.swing.JButton horario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton licencia;
    private javax.swing.JButton misdatos;
    private javax.swing.JButton ruta;
    private javax.swing.JButton vitacora;
    // End of variables declaration//GEN-END:variables
}
