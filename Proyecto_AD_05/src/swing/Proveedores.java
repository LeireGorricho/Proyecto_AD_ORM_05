/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package swing;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author leiii
 */
public class Proveedores extends javax.swing.JPanel {

    /**
     * Creates new form Proveedores
     */
    public Proveedores() {
        initComponents();
        
        GestionProveedores frame = new GestionProveedores();
        frame.setSize(700,480);
        frame.setLocation(0,0);
        
        panel_proveedores.removeAll();
        panel_proveedores.add(frame, BorderLayout.CENTER);
        panel_proveedores.revalidate();
        panel_proveedores.repaint();
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
        jPanel2 = new javax.swing.JPanel();
        botonConsulta = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        bordeConsulta = new javax.swing.JPanel();
        botonGestion = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        bordeGestion = new javax.swing.JPanel();
        panel_proveedores = new javax.swing.JPanel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 204, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonConsulta.setBackground(new java.awt.Color(0, 204, 204));
        botonConsulta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonConsultaMousePressed(evt);
            }
        });
        botonConsulta.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Consulta de Proveedores");
        botonConsulta.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 15, -1, -1));

        bordeConsulta.setBackground(new java.awt.Color(0, 204, 204));
        bordeConsulta.setPreferredSize(new java.awt.Dimension(5, 0));

        javax.swing.GroupLayout bordeConsultaLayout = new javax.swing.GroupLayout(bordeConsulta);
        bordeConsulta.setLayout(bordeConsultaLayout);
        bordeConsultaLayout.setHorizontalGroup(
            bordeConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        bordeConsultaLayout.setVerticalGroup(
            bordeConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        botonConsulta.add(bordeConsulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 50));

        jPanel2.add(botonConsulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 180, 50));

        botonGestion.setBackground(new java.awt.Color(0, 153, 153));
        botonGestion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonGestionMousePressed(evt);
            }
        });
        botonGestion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Gestión de Proveedores");
        botonGestion.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 15, -1, -1));

        bordeGestion.setPreferredSize(new java.awt.Dimension(5, 0));

        javax.swing.GroupLayout bordeGestionLayout = new javax.swing.GroupLayout(bordeGestion);
        bordeGestion.setLayout(bordeGestionLayout);
        bordeGestionLayout.setHorizontalGroup(
            bordeGestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        bordeGestionLayout.setVerticalGroup(
            bordeGestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        botonGestion.add(bordeGestion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 50));

        jPanel2.add(botonGestion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 180, 50));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 18, 700, 50));

        panel_proveedores.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panel_proveedoresLayout = new javax.swing.GroupLayout(panel_proveedores);
        panel_proveedores.setLayout(panel_proveedoresLayout);
        panel_proveedoresLayout.setHorizontalGroup(
            panel_proveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );
        panel_proveedoresLayout.setVerticalGroup(
            panel_proveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
        );

        jPanel1.add(panel_proveedores, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 68, 700, 480));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void botonGestionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonGestionMousePressed
        darColor(botonGestion, bordeGestion);
        devolverColor(botonConsulta, bordeConsulta);
        
        GestionProveedores frame = new GestionProveedores();
        frame.setSize(700,480);
        frame.setLocation(0,0);
        panel_proveedores.removeAll();
        panel_proveedores.add(frame, BorderLayout.CENTER);
        panel_proveedores.revalidate();
        panel_proveedores.repaint();
    }//GEN-LAST:event_botonGestionMousePressed

    private void botonConsultaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonConsultaMousePressed
        darColor(botonConsulta, bordeConsulta);
        devolverColor(botonGestion, bordeGestion);
        
        ConsultaProveedores frame = new ConsultaProveedores();
        frame.setSize(700,480);
        frame.setLocation(0,0);
        panel_proveedores.removeAll();
        panel_proveedores.add(frame, BorderLayout.CENTER);
        panel_proveedores.revalidate();
        panel_proveedores.repaint();
    }//GEN-LAST:event_botonConsultaMousePressed

    private void darColor(JPanel pane, JPanel borde) {
        pane.setBackground(new Color(0, 153, 153));
        borde.setBackground(new Color(255,255,255));
    }
    
    private void devolverColor(JPanel pane, JPanel borde) {
        pane.setBackground(new Color(0, 204, 204));
        borde.setBackground(new Color(0, 204, 204));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bordeConsulta;
    private javax.swing.JPanel bordeGestion;
    private javax.swing.JPanel botonConsulta;
    private javax.swing.JPanel botonGestion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel panel_proveedores;
    // End of variables declaration//GEN-END:variables
}
