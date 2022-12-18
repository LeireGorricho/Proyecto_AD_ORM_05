/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package swing;

import consultas.ConsultasPiezas;
import consultas.ConsultasProyectos;
import hibernate_bd.PiezasEntity;
import hibernate_bd.ProyectosEntity;

import java.awt.BorderLayout;
import javax.swing.*;

/**
 *
 * @author leiii
 */
public class EditarPieza extends javax.swing.JPanel {

    JPanel panel;
    
    /**
     * Creates new form EditarPieza
     */
    public EditarPieza(JPanel panel, String cod) {
        initComponents();
        
        this.panel = panel;

        ConsultasPiezas consultasPiezas = new ConsultasPiezas();
        PiezasEntity pieza = consultasPiezas.recuperarPieza(cod);
        codigo.setText(pieza.getCodigo());
        nombre.setText(pieza.getNombre());
        precio.setText(String.valueOf(pieza.getPrecio()));
        descripcion.setText(pieza.getDescripcion());
        consultasPiezas.cerrarConexion();
        estado.addItem("ALTA");
        estado.addItem("BAJA");
        if (pieza.getEstado().equals("ALTA")) {
            estado.setSelectedIndex(0);
        } else {
            estado.setSelectedIndex(1);
        }
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        botonEditar = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        codigo = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        nombre = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        precio = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        descripcion = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        botonCancelar = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        estado = new javax.swing.JComboBox<>();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(550, 400));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 26)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 117, 153));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("EDITAR PIEZA");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 700, 40));

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Código: ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, -1, -1));

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Nombre: ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, -1, -1));

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Precio:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, -1, -1));

        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Descripción: ");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, -1, -1));

        botonEditar.setBackground(new java.awt.Color(0, 204, 204));
        botonEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonEditarMousePressed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Helvetica Neue", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Editar");

        javax.swing.GroupLayout botonEditarLayout = new javax.swing.GroupLayout(botonEditar);
        botonEditar.setLayout(botonEditarLayout);
        botonEditarLayout.setHorizontalGroup(
            botonEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        );
        botonEditarLayout.setVerticalGroup(
            botonEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel1.add(botonEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 370, 120, 30));

        codigo.setEditable(false);
        codigo.setBackground(new java.awt.Color(255, 255, 255));
        codigo.setForeground(new java.awt.Color(102, 102, 102));
        codigo.setBorder(null);
        jPanel1.add(codigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, 260, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 170, 260, 20));

        nombre.setForeground(new java.awt.Color(102, 102, 102));
        nombre.setBorder(null);
        jPanel1.add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 190, 260, -1));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 210, 260, 10));

        precio.setForeground(new java.awt.Color(102, 102, 102));
        precio.setBorder(null);
        jPanel1.add(precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, 260, -1));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 250, 260, 10));

        descripcion.setForeground(new java.awt.Color(102, 102, 102));
        descripcion.setBorder(null);
        jPanel1.add(descripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 270, 260, -1));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 290, 260, 10));

        botonCancelar.setBackground(new java.awt.Color(0, 117, 153));
        botonCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonCancelarMousePressed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Helvetica Neue", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Cancelar");

        javax.swing.GroupLayout botonCancelarLayout = new javax.swing.GroupLayout(botonCancelar);
        botonCancelar.setLayout(botonCancelarLayout);
        botonCancelarLayout.setHorizontalGroup(
            botonCancelarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        );
        botonCancelarLayout.setVerticalGroup(
            botonCancelarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botonCancelarLayout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(botonCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 370, 120, 30));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 335, 260, 10));

        jLabel8.setText("Estado:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 310, -1, -1));

        jPanel1.add(estado, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 310, 260, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void botonCancelarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCancelarMousePressed
        GestionPiezas frame = new GestionPiezas(panel);
        frame.setSize(700,490);
        frame.setLocation(0,0);
        panel.removeAll();
        panel.add(frame, BorderLayout.CENTER);
        panel.revalidate();
        panel.repaint();
    }//GEN-LAST:event_botonCancelarMousePressed

    private void botonEditarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonEditarMousePressed
        try {
            float precioFloat = Float.parseFloat(precio.getText());
            if (nombre.getText().isBlank() || precio.getText().isBlank()) {
                JOptionPane.showMessageDialog(null, "Debes rellenar todos los campos para poder añadir");
            } else {
                ConsultasPiezas consultasPiezas = new ConsultasPiezas();
                String estadoText;
                if (estado.getSelectedIndex() == 0) {
                    estadoText = "ALTA";
                } else {
                    estadoText = "BAJA";
                }
                if (consultasPiezas.modificarPieza(codigo.getText().toUpperCase(), nombre.getText(), precioFloat, descripcion.getText(), estadoText)) {
                    consultasPiezas.cerrarConexion();
                    GestionPiezas frame = new GestionPiezas(panel);
                    frame.setSize(700, 490);
                    frame.setLocation(0, 0);
                    panel.removeAll();
                    panel.add(frame, BorderLayout.CENTER);
                    panel.revalidate();
                    panel.repaint();
                }
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "El precio debe ser un número");
        }
    }//GEN-LAST:event_botonEditarMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel botonCancelar;
    private javax.swing.JPanel botonEditar;
    private javax.swing.JTextField codigo;
    private javax.swing.JTextField descripcion;
    private javax.swing.JComboBox<String> estado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField precio;
    // End of variables declaration//GEN-END:variables
}
