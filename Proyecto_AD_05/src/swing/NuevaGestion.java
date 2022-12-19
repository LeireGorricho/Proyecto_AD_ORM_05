/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package swing;

import consultas.ConsultasGestion;
import consultas.ConsultasPiezas;
import consultas.ConsultasProveedores;
import consultas.ConsultasProyectos;
import hibernate_bd.PiezasEntity;
import hibernate_bd.ProveedoresEntity;
import hibernate_bd.ProyectosEntity;

import javax.swing.*;
import java.awt.*;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author leiii
 */
public class NuevaGestion extends javax.swing.JPanel {

    JPanel panel;
    boolean anadirGestion;
    List<ProyectosEntity> proyectos;
    List<ProveedoresEntity> proveedores;
    List<PiezasEntity> piezas;

    /**
     * Creates new form NuevaGestion
     */
    public NuevaGestion(JPanel panel) {
        initComponents();
        
        this.panel = panel;

        ConsultasProyectos consultasProyectos = new ConsultasProyectos();
        proyectos = consultasProyectos.cargarAltas();
        ConsultasProveedores consultasProveedores = new ConsultasProveedores();
        proveedores = consultasProveedores.cargarAltas();
        ConsultasPiezas consultasPiezas = new ConsultasPiezas();
        piezas = consultasPiezas.cargarAltas();
        // En el caso de que no hayan piezas, proveedores o proyectos no es posible crear una gestión
        if (proyectos.size() == 0 || proveedores.size() == 0 || piezas.size() == 0) {
            JOptionPane.showMessageDialog(null, "Para crear una gestión se necesita una pieza, un proveedor y un proyecto");
            anadirGestion = false;
        }else {
            anadirGestion = true;
            for (ProyectosEntity proyecto : proyectos) {
                codProyecto.addItem(proyecto.getCodigo());
            }
            for (PiezasEntity pieza : piezas) {
                codPieza.addItem(pieza.getCodigo());
            }
            for (ProveedoresEntity proveedor : proveedores) {
                codProveedor.addItem(proveedor.getCodigo());
            }
        }
        consultasProyectos.cerrarConexion();
        consultasProveedores.cerrarConexion();
        consultasPiezas.cerrarConexion();
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
        botonAnadir = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        botonLimpiar = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        codProveedor = new javax.swing.JComboBox<>();
        codPieza = new javax.swing.JComboBox<>();
        cantidad = new javax.swing.JTextField();
        botonCancelar = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        codigoGestion = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        infoProveedor = new javax.swing.JLabel();
        infoPieza = new javax.swing.JLabel();
        codProyecto = new javax.swing.JComboBox<>();
        infoProyecto = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 26)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 117, 153));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("NUEVA GESTIÓN");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 710, 40));

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Proveedor: ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, -1, -1));

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Pieza: ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, -1, -1));

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Proyecto: ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 290, -1, -1));

        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Cantidad:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 370, -1, -1));

        botonAnadir.setBackground(new java.awt.Color(0, 204, 204));
        botonAnadir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonAnadirMousePressed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Helvetica Neue", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Añadir Gestión");

        javax.swing.GroupLayout botonAnadirLayout = new javax.swing.GroupLayout(botonAnadir);
        botonAnadir.setLayout(botonAnadirLayout);
        botonAnadirLayout.setHorizontalGroup(
            botonAnadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, botonAnadirLayout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );
        botonAnadirLayout.setVerticalGroup(
            botonAnadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel1.add(botonAnadir, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 440, 160, 30));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 170, 250, 20));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 260, 250, 10));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 350, 250, 10));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 90, 130, 10));

        botonLimpiar.setBackground(new java.awt.Color(0, 117, 153));
        botonLimpiar.setPreferredSize(new java.awt.Dimension(170, 30));
        botonLimpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonLimpiarMousePressed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Helvetica Neue", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Limpiar");

        javax.swing.GroupLayout botonLimpiarLayout = new javax.swing.GroupLayout(botonLimpiar);
        botonLimpiar.setLayout(botonLimpiarLayout);
        botonLimpiarLayout.setHorizontalGroup(
            botonLimpiarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
        );
        botonLimpiarLayout.setVerticalGroup(
            botonLimpiarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, botonLimpiarLayout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(botonLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 440, 110, 30));

        codProveedor.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                codProveedorItemStateChanged(evt);
            }
        });
        jPanel1.add(codProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 100, -1));

        codPieza.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                codPiezaItemStateChanged(evt);
            }
        });
        jPanel1.add(codPieza, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 100, -1));

        cantidad.setBorder(null);
        jPanel1.add(cantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 380, 120, -1));

        botonCancelar.setBackground(new java.awt.Color(0, 117, 153));
        botonCancelar.setPreferredSize(new java.awt.Dimension(170, 30));
        botonCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonCancelarMousePressed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Helvetica Neue", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Cancelar");

        javax.swing.GroupLayout botonCancelarLayout = new javax.swing.GroupLayout(botonCancelar);
        botonCancelar.setLayout(botonCancelarLayout);
        botonCancelarLayout.setHorizontalGroup(
            botonCancelarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
        );
        botonCancelarLayout.setVerticalGroup(
            botonCancelarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, botonCancelarLayout.createSequentialGroup()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(botonCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 440, 110, 30));

        jLabel9.setText("Código gestión:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, -1, -1));

        codigoGestion.setBorder(null);
        jPanel1.add(codigoGestion, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 70, 130, -1));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 400, 120, 10));
        jPanel1.add(infoProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 100, 250, 70));
        jPanel1.add(infoPieza, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 190, 250, 70));

        codProyecto.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                codProyectoItemStateChanged(evt);
            }
        });
        jPanel1.add(codProyecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 290, 100, -1));
        jPanel1.add(infoProyecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 280, 250, 70));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void botonCancelarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCancelarMousePressed
        GestionPedidos frame = new GestionPedidos(panel);
        frame.setSize(700, 490);
        frame.setLocation(0, 0);
        panel.removeAll();
        panel.add(frame, BorderLayout.CENTER);
        panel.revalidate();
        panel.repaint();
    }//GEN-LAST:event_botonCancelarMousePressed

    private void botonAnadirMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAnadirMousePressed
        if (anadirGestion) {
            if (codigoGestion.getText().isBlank() || cantidad.getText().isBlank()){
                JOptionPane.showMessageDialog(null, "Debes rellenar todos los campos para poder añadir");
            } else {
                Pattern pattern = Pattern.compile("^([A-Za-z]{4}[0-9]{2})$");
                Matcher codPattern = pattern.matcher(codigoGestion.getText());
                if (codPattern.find()) {
                    try {
                        int cantidadNum = Integer.parseInt(cantidad.getText());
                        ConsultasGestion consultasGestion = new ConsultasGestion();
                        if (consultasGestion.anadirGestion(codigoGestion.getText(), codProveedor.getSelectedItem().toString(), codPieza.getSelectedItem().toString(), codProyecto.getSelectedItem().toString(), cantidadNum)) {
                            GestionPedidos frame = new GestionPedidos(panel);
                            frame.setSize(700, 490);
                            frame.setLocation(0, 0);
                            panel.removeAll();
                            panel.add(frame, BorderLayout.CENTER);
                            panel.revalidate();
                            panel.repaint();
                        }
                        consultasGestion.cerrarConexion();
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "La cantidad debe escribirse con números");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Error para escribir el codigo tiene que contener 2 letras y 4 numeros.");
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "La opción no esta disponible por que no cumples los requisitos");
        }
    }//GEN-LAST:event_botonAnadirMousePressed

    private void botonLimpiarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonLimpiarMousePressed
        codigoGestion.setText("");
        cantidad.setText("");
    }//GEN-LAST:event_botonLimpiarMousePressed

    private void codProveedorItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_codProveedorItemStateChanged
        for (ProveedoresEntity proveedor : proveedores) {
            if (proveedor.getCodigo().equals(codProveedor.getSelectedItem())) {
                infoProveedor.setText("<html><p>Nombre: " + proveedor.getNombre() + " " + proveedor.getApellidos() + "</p><p>Direccion: " + proveedor.getDireccion() + "</p><p>Estado: " + proveedor.getEstado() + "</p></html>");
            }
        }
    }//GEN-LAST:event_codProveedorItemStateChanged

    private void codPiezaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_codPiezaItemStateChanged
        for (PiezasEntity pieza : piezas) {
            if (pieza.getCodigo().equals(codPieza.getSelectedItem())) {
                infoPieza.setText("<html><p>Nombre: " + pieza.getNombre() + "</p><p>Precio: " + pieza.getPrecio() + "</p><p>Estado: " + pieza.getEstado() + "</p><html>");
            }
        }
    }//GEN-LAST:event_codPiezaItemStateChanged

    private void codProyectoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_codProyectoItemStateChanged
        for (ProyectosEntity proyecto : proyectos) {
            if (proyecto.getCodigo().equals(codProyecto.getSelectedItem())) {
                infoProyecto.setText("<html><p>Nombre: " + proyecto.getNombre() + "</p><p>Ciudad: " + proyecto.getCiudad()+ "</p><p>Estado: " + proyecto.getEstado() + "</p><html>");
            }
        }
    }//GEN-LAST:event_codProyectoItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel botonAnadir;
    private javax.swing.JPanel botonCancelar;
    private javax.swing.JPanel botonLimpiar;
    private javax.swing.JTextField cantidad;
    private javax.swing.JComboBox<String> codPieza;
    private javax.swing.JComboBox<String> codProveedor;
    private javax.swing.JComboBox<String> codProyecto;
    private javax.swing.JTextField codigoGestion;
    private javax.swing.JLabel infoPieza;
    private javax.swing.JLabel infoProveedor;
    private javax.swing.JLabel infoProyecto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    // End of variables declaration//GEN-END:variables
}
