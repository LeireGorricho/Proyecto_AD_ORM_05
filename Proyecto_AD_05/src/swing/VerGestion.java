/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package swing;

import consultas.ConsultasGestion;
import consultas.ConsultasPiezas;
import consultas.ConsultasProveedores;
import consultas.ConsultasProyectos;
import hibernate_bd.GestionEntity;
import hibernate_bd.PiezasEntity;
import hibernate_bd.ProveedoresEntity;
import hibernate_bd.ProyectosEntity;

import java.awt.BorderLayout;
import java.util.List;
import javax.swing.JPanel;

/**
 *
 * @author leiii
 */
public class VerGestion extends javax.swing.JPanel {

    JPanel panel;
    String codigo;
    
    /**
     * Creates new form VerGestion
     */
    public VerGestion(JPanel panel, String codigo) {
        initComponents();
        
        this.panel = panel;
        this.codigo = codigo;

        ConsultasGestion consultasGestion = new ConsultasGestion();
        GestionEntity gestion = consultasGestion.recuperarGestion(codigo);

        codigoGestion.setText(codigo);
        codPieza.setText(gestion.getPiezasByCodpieza().getCodigo());
        infoPieza.setText(gestion.getPiezasByCodpieza().getNombre() + ", " + gestion.getPiezasByCodpieza().getPrecio() + ", " + gestion.getPiezasByCodpieza().getDescripcion());
        codProyecto.setText(gestion.getProyectosByCodproyecto().getCodigo());
        infoProyecto.setText(gestion.getProyectosByCodproyecto().getNombre() + ", " + gestion.getProyectosByCodproyecto().getCiudad());
        codProveedor.setText(gestion.getProveedoresByCodproveedor().getCodigo());
        infoProveedor.setText(gestion.getProveedoresByCodproveedor().getNombre() + " " + gestion.getProveedoresByCodproveedor().getApellidos() + ", " + gestion.getProveedoresByCodproveedor().getDireccion());
        cantidad.setText(String.valueOf(gestion.getCantidad()));
        estado.setText(gestion.getEstado());
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
        botonVolver = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        infoProyecto = new javax.swing.JTextField();
        infoProveedor = new javax.swing.JTextField();
        infoPieza = new javax.swing.JTextField();
        cantidad = new javax.swing.JTextField();
        codProveedor = new javax.swing.JTextField();
        codProyecto = new javax.swing.JTextField();
        codPieza = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        codigoGestion = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        estado = new javax.swing.JTextField();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 26)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 117, 153));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("GESTIÓN");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 700, 40));

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
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 380, -1, -1));

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
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
        );
        botonVolverLayout.setVerticalGroup(
            botonVolverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel1.add(botonVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 440, 130, 30));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 175, 370, 20));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 265, 370, 10));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 355, 370, 10));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 400, 120, 10));

        infoProyecto.setEditable(false);
        infoProyecto.setBackground(new java.awt.Color(255, 255, 255));
        infoProyecto.setText("<html><p></p></html>");
        infoProyecto.setBorder(null);
        jPanel1.add(infoProyecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 290, 240, 60));

        infoProveedor.setEditable(false);
        infoProveedor.setBackground(new java.awt.Color(255, 255, 255));
        infoProveedor.setText("<html><p></p></html>");
        infoProveedor.setBorder(null);
        jPanel1.add(infoProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 110, 240, 60));

        infoPieza.setEditable(false);
        infoPieza.setBackground(new java.awt.Color(255, 255, 255));
        infoPieza.setText("<html><p></p></html>");
        infoPieza.setBorder(null);
        jPanel1.add(infoPieza, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 200, 240, 60));

        cantidad.setEditable(false);
        cantidad.setBackground(new java.awt.Color(255, 255, 255));
        cantidad.setBorder(null);
        jPanel1.add(cantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 380, 120, -1));

        codProveedor.setEditable(false);
        codProveedor.setBackground(new java.awt.Color(255, 255, 255));
        codProveedor.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        codProveedor.setBorder(null);
        jPanel1.add(codProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, -1, -1));

        codProyecto.setEditable(false);
        codProyecto.setBackground(new java.awt.Color(255, 255, 255));
        codProyecto.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        codProyecto.setBorder(null);
        jPanel1.add(codProyecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 290, -1, -1));

        codPieza.setEditable(false);
        codPieza.setBackground(new java.awt.Color(255, 255, 255));
        codPieza.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        codPieza.setBorder(null);
        jPanel1.add(codPieza, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, -1, -1));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 90, 130, 10));

        jLabel9.setText("Código gestión:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, -1, -1));

        codigoGestion.setEditable(false);
        codigoGestion.setBackground(new java.awt.Color(255, 255, 255));
        codigoGestion.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        codigoGestion.setBorder(null);
        jPanel1.add(codigoGestion, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 70, 130, -1));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 400, 120, 10));

        jLabel8.setText("Estado:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 380, -1, -1));

        estado.setEditable(false);
        estado.setBackground(new java.awt.Color(255, 255, 255));
        estado.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        estado.setBorder(null);
        jPanel1.add(estado, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 380, 120, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void botonVolverMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonVolverMousePressed
        GestionPedidos frame = new GestionPedidos(panel);
        frame.setSize(700,490);
        frame.setLocation(0,0);
        panel.removeAll();
        panel.add(frame, BorderLayout.CENTER);
        panel.revalidate();
        panel.repaint();
    }//GEN-LAST:event_botonVolverMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel botonVolver;
    private javax.swing.JTextField cantidad;
    private javax.swing.JTextField codPieza;
    private javax.swing.JTextField codProveedor;
    private javax.swing.JTextField codProyecto;
    private javax.swing.JTextField codigoGestion;
    private javax.swing.JTextField estado;
    private javax.swing.JTextField infoPieza;
    private javax.swing.JTextField infoProveedor;
    private javax.swing.JTextField infoProyecto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    // End of variables declaration//GEN-END:variables
}
