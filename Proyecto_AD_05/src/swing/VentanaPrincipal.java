/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package swing;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author leiii
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal() {
        initComponents();
        
        Home frame = new Home();
        frame.setSize(700,550);
        frame.setLocation(0,0);
        panel_pagina.removeAll();
        panel_pagina.add(frame, BorderLayout.CENTER);
        panel_pagina.revalidate();
        panel_pagina.repaint();
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
        panel_menu = new javax.swing.JPanel();
        botonHome = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        bordeHome = new javax.swing.JPanel();
        botonSalir = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        botonPiezas = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        bordePiezas = new javax.swing.JPanel();
        botonProyectos = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        bordeProyectos = new javax.swing.JPanel();
        botonGestionGlobal = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        bordeGestion = new javax.swing.JPanel();
        botonAyuda = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        bordeAyuda = new javax.swing.JPanel();
        botonProveedores = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        bordeProveedores = new javax.swing.JPanel();
        panel_pagina = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_menu.setBackground(new java.awt.Color(0, 0, 102));
        panel_menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonHome.setBackground(new java.awt.Color(0, 117, 153));
        botonHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonHomeMousePressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText(" Home");

        bordeHome.setPreferredSize(new java.awt.Dimension(5, 0));

        javax.swing.GroupLayout bordeHomeLayout = new javax.swing.GroupLayout(bordeHome);
        bordeHome.setLayout(bordeHomeLayout);
        bordeHomeLayout.setHorizontalGroup(
            bordeHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        bordeHomeLayout.setVerticalGroup(
            bordeHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout botonHomeLayout = new javax.swing.GroupLayout(botonHome);
        botonHome.setLayout(botonHomeLayout);
        botonHomeLayout.setHorizontalGroup(
            botonHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botonHomeLayout.createSequentialGroup()
                .addComponent(bordeHome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addContainerGap(136, Short.MAX_VALUE))
        );
        botonHomeLayout.setVerticalGroup(
            botonHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bordeHome, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
            .addGroup(botonHomeLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        panel_menu.add(botonHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 200, 50));

        botonSalir.setBackground(new java.awt.Color(0, 0, 102));
        botonSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonSalirMousePressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Salir");

        javax.swing.GroupLayout botonSalirLayout = new javax.swing.GroupLayout(botonSalir);
        botonSalir.setLayout(botonSalirLayout);
        botonSalirLayout.setHorizontalGroup(
            botonSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botonSalirLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel2)
                .addGap(0, 151, Short.MAX_VALUE))
        );
        botonSalirLayout.setVerticalGroup(
            botonSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botonSalirLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel2)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        panel_menu.add(botonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 500, 200, -1));

        botonPiezas.setBackground(new java.awt.Color(0, 0, 102));
        botonPiezas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonPiezasMousePressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText(" Piezas");

        bordePiezas.setBackground(new java.awt.Color(0, 0, 102));
        bordePiezas.setPreferredSize(new java.awt.Dimension(5, 50));

        javax.swing.GroupLayout bordePiezasLayout = new javax.swing.GroupLayout(bordePiezas);
        bordePiezas.setLayout(bordePiezasLayout);
        bordePiezasLayout.setHorizontalGroup(
            bordePiezasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        bordePiezasLayout.setVerticalGroup(
            bordePiezasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout botonPiezasLayout = new javax.swing.GroupLayout(botonPiezas);
        botonPiezas.setLayout(botonPiezasLayout);
        botonPiezasLayout.setHorizontalGroup(
            botonPiezasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botonPiezasLayout.createSequentialGroup()
                .addComponent(bordePiezas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addContainerGap(133, Short.MAX_VALUE))
        );
        botonPiezasLayout.setVerticalGroup(
            botonPiezasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botonPiezasLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel3)
                .addContainerGap(18, Short.MAX_VALUE))
            .addComponent(bordePiezas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panel_menu.add(botonPiezas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 200, -1));

        botonProyectos.setBackground(new java.awt.Color(0, 0, 102));
        botonProyectos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonProyectosMousePressed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText(" Proyectos");

        bordeProyectos.setBackground(new java.awt.Color(0, 0, 102));
        bordeProyectos.setPreferredSize(new java.awt.Dimension(5, 50));

        javax.swing.GroupLayout bordeProyectosLayout = new javax.swing.GroupLayout(bordeProyectos);
        bordeProyectos.setLayout(bordeProyectosLayout);
        bordeProyectosLayout.setHorizontalGroup(
            bordeProyectosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        bordeProyectosLayout.setVerticalGroup(
            bordeProyectosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout botonProyectosLayout = new javax.swing.GroupLayout(botonProyectos);
        botonProyectos.setLayout(botonProyectosLayout);
        botonProyectosLayout.setHorizontalGroup(
            botonProyectosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botonProyectosLayout.createSequentialGroup()
                .addComponent(bordeProyectos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addContainerGap(110, Short.MAX_VALUE))
        );
        botonProyectosLayout.setVerticalGroup(
            botonProyectosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botonProyectosLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel4)
                .addContainerGap(18, Short.MAX_VALUE))
            .addComponent(bordeProyectos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panel_menu.add(botonProyectos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 200, -1));

        botonGestionGlobal.setBackground(new java.awt.Color(0, 0, 102));
        botonGestionGlobal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonGestionGlobalMousePressed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText(" Gesti??n Global");

        bordeGestion.setBackground(new java.awt.Color(0, 0, 102));
        bordeGestion.setPreferredSize(new java.awt.Dimension(5, 50));

        javax.swing.GroupLayout bordeGestionLayout = new javax.swing.GroupLayout(bordeGestion);
        bordeGestion.setLayout(bordeGestionLayout);
        bordeGestionLayout.setHorizontalGroup(
            bordeGestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        bordeGestionLayout.setVerticalGroup(
            bordeGestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout botonGestionGlobalLayout = new javax.swing.GroupLayout(botonGestionGlobal);
        botonGestionGlobal.setLayout(botonGestionGlobalLayout);
        botonGestionGlobalLayout.setHorizontalGroup(
            botonGestionGlobalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botonGestionGlobalLayout.createSequentialGroup()
                .addComponent(bordeGestion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addContainerGap(82, Short.MAX_VALUE))
        );
        botonGestionGlobalLayout.setVerticalGroup(
            botonGestionGlobalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bordeGestion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(botonGestionGlobalLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel_menu.add(botonGestionGlobal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 200, -1));

        botonAyuda.setBackground(new java.awt.Color(0, 0, 102));
        botonAyuda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonAyudaMousePressed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText(" Ayuda");

        bordeAyuda.setBackground(new java.awt.Color(0, 0, 102));
        bordeAyuda.setPreferredSize(new java.awt.Dimension(5, 50));

        javax.swing.GroupLayout bordeAyudaLayout = new javax.swing.GroupLayout(bordeAyuda);
        bordeAyuda.setLayout(bordeAyudaLayout);
        bordeAyudaLayout.setHorizontalGroup(
            bordeAyudaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        bordeAyudaLayout.setVerticalGroup(
            bordeAyudaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout botonAyudaLayout = new javax.swing.GroupLayout(botonAyuda);
        botonAyuda.setLayout(botonAyudaLayout);
        botonAyudaLayout.setHorizontalGroup(
            botonAyudaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botonAyudaLayout.createSequentialGroup()
                .addComponent(bordeAyuda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addContainerGap(110, Short.MAX_VALUE))
        );
        botonAyudaLayout.setVerticalGroup(
            botonAyudaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botonAyudaLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel6)
                .addContainerGap(18, Short.MAX_VALUE))
            .addComponent(bordeAyuda, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
        );

        panel_menu.add(botonAyuda, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 200, -1));

        botonProveedores.setBackground(new java.awt.Color(0, 0, 102));
        botonProveedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonProveedoresMousePressed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText(" Proveedores");

        bordeProveedores.setBackground(new java.awt.Color(0, 0, 102));
        bordeProveedores.setPreferredSize(new java.awt.Dimension(5, 50));

        javax.swing.GroupLayout bordeProveedoresLayout = new javax.swing.GroupLayout(bordeProveedores);
        bordeProveedores.setLayout(bordeProveedoresLayout);
        bordeProveedoresLayout.setHorizontalGroup(
            bordeProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        bordeProveedoresLayout.setVerticalGroup(
            bordeProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout botonProveedoresLayout = new javax.swing.GroupLayout(botonProveedores);
        botonProveedores.setLayout(botonProveedoresLayout);
        botonProveedoresLayout.setHorizontalGroup(
            botonProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botonProveedoresLayout.createSequentialGroup()
                .addComponent(bordeProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addGap(0, 95, Short.MAX_VALUE))
        );
        botonProveedoresLayout.setVerticalGroup(
            botonProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bordeProveedores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(botonProveedoresLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel7)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        panel_menu.add(botonProveedores, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 200, -1));

        jPanel1.add(panel_menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 550));

        panel_pagina.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panel_paginaLayout = new javax.swing.GroupLayout(panel_pagina);
        panel_pagina.setLayout(panel_paginaLayout);
        panel_paginaLayout.setHorizontalGroup(
            panel_paginaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );
        panel_paginaLayout.setVerticalGroup(
            panel_paginaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 550, Short.MAX_VALUE)
        );

        jPanel1.add(panel_pagina, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 700, 550));

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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botonHomeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonHomeMousePressed
        darColor(botonHome, bordeHome);
        devolverColor(botonProveedores, bordeProveedores);
        devolverColor(botonPiezas, bordePiezas);
        devolverColor(botonProyectos, bordeProyectos);
        devolverColor(botonGestionGlobal, bordeGestion);
        devolverColor(botonAyuda, bordeAyuda);
        
        Home frame = new Home();
        frame.setSize(700,550);
        frame.setLocation(0,0);
        panel_pagina.removeAll();
        panel_pagina.add(frame, BorderLayout.CENTER);
        panel_pagina.revalidate();
        panel_pagina.repaint();
    }//GEN-LAST:event_botonHomeMousePressed

    private void botonSalirMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonSalirMousePressed
        dispose();
    }//GEN-LAST:event_botonSalirMousePressed

    private void botonPiezasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonPiezasMousePressed
        darColor(botonPiezas, bordePiezas);
        devolverColor(botonHome, bordeHome);
        devolverColor(botonProveedores, bordeProveedores);
        devolverColor(botonProyectos, bordeProyectos);
        devolverColor(botonGestionGlobal, bordeGestion);
        devolverColor(botonAyuda, bordeAyuda);
        
        Piezas frame = new Piezas(panel_pagina);
        frame.setSize(700,550);
        frame.setLocation(0,0);
        panel_pagina.removeAll();
        panel_pagina.add(frame, BorderLayout.CENTER);
        panel_pagina.revalidate();
        panel_pagina.repaint();
    }//GEN-LAST:event_botonPiezasMousePressed

    private void botonProyectosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonProyectosMousePressed
        darColor(botonProyectos, bordeProyectos);
        devolverColor(botonHome, bordeHome);
        devolverColor(botonPiezas, bordePiezas);
        devolverColor(botonGestionGlobal, bordeGestion);
        devolverColor(botonAyuda, bordeAyuda);
        devolverColor(botonProveedores, bordeProveedores);
        
        Proyectos frame = new Proyectos(panel_pagina);
        frame.setSize(700,550);
        frame.setLocation(0,0);
        panel_pagina.removeAll();
        panel_pagina.add(frame, BorderLayout.CENTER);
        panel_pagina.revalidate();
        panel_pagina.repaint();
    }//GEN-LAST:event_botonProyectosMousePressed

    private void botonGestionGlobalMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonGestionGlobalMousePressed
        darColor(botonGestionGlobal, bordeGestion);
        devolverColor(botonHome, bordeHome);
        devolverColor(botonProveedores, bordeProveedores);
        devolverColor(botonPiezas, bordePiezas);
        devolverColor(botonProyectos, bordeProyectos);
        devolverColor(botonAyuda, bordeAyuda);
        
        GestionGlobal frame = new GestionGlobal(panel_pagina);
        frame.setSize(700,550);
        frame.setLocation(0,0);
        panel_pagina.removeAll();
        panel_pagina.add(frame, BorderLayout.CENTER);
        panel_pagina.revalidate();
        panel_pagina.repaint();
    }//GEN-LAST:event_botonGestionGlobalMousePressed

    private void botonAyudaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAyudaMousePressed
        darColor(botonAyuda, bordeAyuda);
        devolverColor(botonHome, bordeHome);
        devolverColor(botonProveedores, bordeProveedores);
        devolverColor(botonPiezas, bordePiezas);
        devolverColor(botonProyectos, bordeProyectos);
        devolverColor(botonGestionGlobal, bordeGestion);
        
        Ayuda frame = new Ayuda();
        frame.setSize(700,550);
        frame.setLocation(0,0);
        panel_pagina.removeAll();
        panel_pagina.add(frame, BorderLayout.CENTER);
        panel_pagina.revalidate();
        panel_pagina.repaint();
    }//GEN-LAST:event_botonAyudaMousePressed

    private void botonProveedoresMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonProveedoresMousePressed
        darColor(botonProveedores, bordeProveedores);
        devolverColor(botonHome, bordeHome);
        devolverColor(botonPiezas, bordePiezas);
        devolverColor(botonProyectos, bordeProyectos);
        devolverColor(botonGestionGlobal, bordeGestion);
        devolverColor(botonAyuda, bordeAyuda);
        
        Proveedores frame = new Proveedores(panel_pagina);
        frame.setSize(700,550);
        frame.setLocation(0,0);
        panel_pagina.removeAll();
        panel_pagina.add(frame, BorderLayout.CENTER);
        panel_pagina.revalidate();
        panel_pagina.repaint();
    }//GEN-LAST:event_botonProveedoresMousePressed

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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }
    
    private void darColor(JPanel pane, JPanel borde) {
        pane.setBackground(new Color(0, 117, 153));
        borde.setBackground(new Color(255,255,255));
    }
    
    private void devolverColor(JPanel pane, JPanel borde) {
        pane.setBackground(new Color(0, 0, 102));
        borde.setBackground(new Color(0, 0, 102));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bordeAyuda;
    private javax.swing.JPanel bordeGestion;
    private javax.swing.JPanel bordeHome;
    private javax.swing.JPanel bordePiezas;
    private javax.swing.JPanel bordeProveedores;
    private javax.swing.JPanel bordeProyectos;
    private javax.swing.JPanel botonAyuda;
    private javax.swing.JPanel botonGestionGlobal;
    private javax.swing.JPanel botonHome;
    private javax.swing.JPanel botonPiezas;
    private javax.swing.JPanel botonProveedores;
    private javax.swing.JPanel botonProyectos;
    private javax.swing.JPanel botonSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel panel_menu;
    private javax.swing.JPanel panel_pagina;
    // End of variables declaration//GEN-END:variables
}
