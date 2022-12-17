/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package swing;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author leiii
 */
public class Proveedores extends javax.swing.JPanel {

    JPanel panel;
            
    /**
     * Creates new form Proveedores
     */
    public Proveedores(JPanel panel) {
        initComponents();
        
        GestionProveedores frame = new GestionProveedores(panel_proveedores);
        frame.setSize(700,490);
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
        panel_proveedores = new javax.swing.JPanel();
        botonGestion = new javax.swing.JPanel();
        labelGestion = new javax.swing.JLabel();
        botonNuevo = new javax.swing.JPanel();
        labelNuevo = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        botonConsulta = new javax.swing.JPanel();
        labelConsulta = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_proveedores.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panel_proveedoresLayout = new javax.swing.GroupLayout(panel_proveedores);
        panel_proveedores.setLayout(panel_proveedoresLayout);
        panel_proveedoresLayout.setHorizontalGroup(
            panel_proveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );
        panel_proveedoresLayout.setVerticalGroup(
            panel_proveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 490, Short.MAX_VALUE)
        );

        jPanel1.add(panel_proveedores, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 58, 700, 490));

        botonGestion.setBackground(new java.awt.Color(255, 255, 255));
        botonGestion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonGestionMousePressed(evt);
            }
        });
        botonGestion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelGestion.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        labelGestion.setForeground(new java.awt.Color(0, 117, 153));
        labelGestion.setText("Gestión de Proveedores");
        botonGestion.add(labelGestion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jPanel1.add(botonGestion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 40));

        botonNuevo.setBackground(new java.awt.Color(255, 255, 255));
        botonNuevo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonNuevoMousePressed(evt);
            }
        });
        botonNuevo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelNuevo.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        labelNuevo.setForeground(new java.awt.Color(0, 204, 204));
        labelNuevo.setText("Nuevo Proveedor");
        botonNuevo.add(labelNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jPanel1.add(botonNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 0, 140, 40));

        jSeparator1.setForeground(new java.awt.Color(0, 117, 153));
        jSeparator1.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 700, 10));

        botonConsulta.setBackground(new java.awt.Color(255, 255, 255));
        botonConsulta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonConsultaMousePressed(evt);
            }
        });
        botonConsulta.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelConsulta.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        labelConsulta.setForeground(new java.awt.Color(0, 204, 204));
        labelConsulta.setText("Consulta de Proveedores");
        botonConsulta.add(labelConsulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jPanel1.add(botonConsulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 190, 40));

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
        darColor(labelGestion);
        devolverColor(labelNuevo);
        devolverColor(labelConsulta);
        
        GestionProveedores frame = new GestionProveedores(panel_proveedores);
        frame.setSize(700,490);
        frame.setLocation(0,0);
        panel_proveedores.removeAll();
        panel_proveedores.add(frame, BorderLayout.CENTER);
        panel_proveedores.revalidate();
        panel_proveedores.repaint();
    }//GEN-LAST:event_botonGestionMousePressed

    private void botonNuevoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonNuevoMousePressed
        darColor(labelNuevo);
        devolverColor(labelGestion);
        devolverColor(labelConsulta);
        
        NuevoProveedor frame = new NuevoProveedor(panel_proveedores);
        frame.setSize(700,490);
        frame.setLocation(0,0);
        panel_proveedores.removeAll();
        panel_proveedores.add(frame, BorderLayout.CENTER);
        panel_proveedores.revalidate();
        panel_proveedores.repaint();
    }//GEN-LAST:event_botonNuevoMousePressed

    private void botonConsultaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonConsultaMousePressed
        darColor(labelConsulta);
        devolverColor(labelGestion);
        devolverColor(labelNuevo);
        
        ConsultaProveedores frame = new ConsultaProveedores();
        frame.setSize(700,490);
        frame.setLocation(0,0);
        panel_proveedores.removeAll();
        panel_proveedores.add(frame, BorderLayout.CENTER);
        panel_proveedores.revalidate();
        panel_proveedores.repaint();
    }//GEN-LAST:event_botonConsultaMousePressed

    private void darColor(JLabel label) {
        label.setForeground(new Color(0, 117, 153));
    }
    
    private void devolverColor(JLabel label) {
        label.setForeground(new Color(0, 204, 204));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel botonConsulta;
    private javax.swing.JPanel botonGestion;
    private javax.swing.JPanel botonNuevo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labelConsulta;
    private javax.swing.JLabel labelGestion;
    private javax.swing.JLabel labelNuevo;
    private javax.swing.JPanel panel_proveedores;
    // End of variables declaration//GEN-END:variables
}
