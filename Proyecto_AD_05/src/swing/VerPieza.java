/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package swing;

import java.awt.BorderLayout;
import javax.swing.JPanel;

/**
 *
 * @author leiii
 */
public class VerPieza extends javax.swing.JPanel {

    JPanel panel;
    
    /**
     * Creates new form VerPieza
     */
    public VerPieza(JPanel panel, String cod) {
        initComponents();
        
        this.panel = panel;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        botonVolver = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        codigo = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        nombre = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        apellidos = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        descripcion = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 26)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 117, 153));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("VER PIEZA");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 700, 40));

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Código: ");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, -1, -1));

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Nombre: ");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, -1, -1));

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Apellidos: ");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, -1, -1));

        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Descripción:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, -1, -1));

        botonVolver.setBackground(new java.awt.Color(0, 204, 204));
        botonVolver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonVolverMousePressed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Helvetica Neue", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Volver");

        javax.swing.GroupLayout botonVolverLayout = new javax.swing.GroupLayout(botonVolver);
        botonVolver.setLayout(botonVolverLayout);
        botonVolverLayout.setHorizontalGroup(
            botonVolverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, botonVolverLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );
        botonVolverLayout.setVerticalGroup(
            botonVolverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        add(botonVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 360, 120, 30));

        codigo.setEditable(false);
        codigo.setBackground(new java.awt.Color(255, 255, 255));
        codigo.setForeground(new java.awt.Color(102, 102, 102));
        codigo.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        codigo.setBorder(null);
        add(codigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 170, 260, -1));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 190, 260, 20));

        nombre.setEditable(false);
        nombre.setBackground(new java.awt.Color(255, 255, 255));
        nombre.setForeground(new java.awt.Color(102, 102, 102));
        nombre.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        nombre.setBorder(null);
        add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 210, 260, -1));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, 260, 10));

        apellidos.setEditable(false);
        apellidos.setBackground(new java.awt.Color(255, 255, 255));
        apellidos.setForeground(new java.awt.Color(102, 102, 102));
        apellidos.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        apellidos.setBorder(null);
        add(apellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 250, 260, -1));
        add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 270, 260, 10));

        descripcion.setEditable(false);
        descripcion.setBackground(new java.awt.Color(255, 255, 255));
        descripcion.setForeground(new java.awt.Color(102, 102, 102));
        descripcion.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        descripcion.setBorder(null);
        add(descripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 290, 260, -1));
        add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 310, 260, 10));
    }// </editor-fold>//GEN-END:initComponents

    private void botonVolverMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonVolverMousePressed
        Piezas frame = new Piezas(panel);
        frame.setSize(700,490);
        frame.setLocation(0,0);
        panel.removeAll();
        panel.add(frame, BorderLayout.CENTER);
        panel.revalidate();
        panel.repaint();
    }//GEN-LAST:event_botonVolverMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField apellidos;
    private javax.swing.JPanel botonVolver;
    private javax.swing.JTextField codigo;
    private javax.swing.JTextField descripcion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextField nombre;
    // End of variables declaration//GEN-END:variables
}
