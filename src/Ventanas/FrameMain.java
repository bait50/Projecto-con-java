/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Ventanas;

import static clases.Main.*;




/**
 *
 * @author BIBPRESTAMOS# 21
 */
public class FrameMain extends javax.swing.JFrame {

    /**
     * Creates new form FrameMain
     */
//    FrameAgregar agregar = new FrameAgregar();
    public FrameMain() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        bsalir = new javax.swing.JButton();
        bagregar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lfondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bsalir.setBackground(new java.awt.Color(1, 199, 225));
        bsalir.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bsalir.setForeground(new java.awt.Color(255, 255, 255));
        bsalir.setText("SALIR");
        bsalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bsalirActionPerformed(evt);
            }
        });
        jPanel1.add(bsalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 210, 60));

        bagregar.setBackground(new java.awt.Color(1, 199, 225));
        bagregar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bagregar.setForeground(new java.awt.Color(255, 255, 255));
        bagregar.setText("AGREGAR USUARIO");
        bagregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bagregarActionPerformed(evt);
            }
        });
        jPanel1.add(bagregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 210, 50));

        jButton1.setBackground(new java.awt.Color(1, 199, 225));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("AGREGAR EQUIPOS ");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 50));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("BIENVENIDO A RORAT ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 50, 200, 60));

        lfondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo.jpg"))); // NOI18N
        jPanel1.add(lfondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 160));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 160));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bsalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_bsalirActionPerformed

    private void bagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bagregarActionPerformed
         FrameAgregar agregar = new FrameAgregar(); 
        agregar.setVisible(true);
        agregar.setLocationRelativeTo(null);
        menu.setVisible(false);
    }//GEN-LAST:event_bagregarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       FrameAgregarEquipo adddesktop = new FrameAgregarEquipo();
       adddesktop.setVisible(true);
       adddesktop.setLocationRelativeTo(null);
       menu.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bagregar;
    private javax.swing.JButton bsalir;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lfondo;
    // End of variables declaration//GEN-END:variables
}
