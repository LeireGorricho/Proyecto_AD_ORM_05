/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package swing;

import consultas.ConsultasProveedores;
import hibernate_bd.ProveedoresEntity;

import java.awt.BorderLayout;
import javax.swing.JPanel;

/**
 *
 * @author leiii
 */
public class VerProveedor extends javax.swing.JPanel {

    JPanel panel;
    String cod;
    /**
     * Creates new form VerProveedor
     */
    public VerProveedor(JPanel panel, String cod) {
        initComponents();
        
        this.panel = panel;
        this.cod = cod;

        ConsultasProveedores consultaProveedores = new ConsultasProveedores();
        ProveedoresEntity proveedor = consultaProveedores.recuperarProveedor(cod);

        codigo.setText(cod);
        nombre.setText(proveedor.getNombre());
        apellidos.setText(proveedor.getApellidos());
        dirPostal.setText(proveedor.getDireccion());
        estado.setText(proveedor.getEstado());

        consultaProveedores.cerrarConexion();
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
        codigo = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        nombre = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        apellidos = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        dirPostal = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        botonVolver = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        estado = new javax.swing.JTextField();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 26)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 117, 153));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("VER PROVEEDOR");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 700, 40));

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Código: ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, -1, -1));

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Nombre: ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, -1, -1));

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Apellido: ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, -1, -1));

        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Dirección postal: ");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, -1, -1));

        codigo.setForeground(new java.awt.Color(102, 102, 102));
        codigo.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        codigo.setBorder(null);
        jPanel1.add(codigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 170, 260, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 190, 260, 20));

        nombre.setForeground(new java.awt.Color(102, 102, 102));
        nombre.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        nombre.setBorder(null);
        jPanel1.add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 210, 260, -1));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, 260, 10));

        apellidos.setForeground(new java.awt.Color(102, 102, 102));
        apellidos.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        apellidos.setBorder(null);
        jPanel1.add(apellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 250, 260, -1));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 270, 260, 10));

        dirPostal.setForeground(new java.awt.Color(102, 102, 102));
        dirPostal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        dirPostal.setBorder(null);
        jPanel1.add(dirPostal, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 290, 260, -1));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 310, 260, 10));

        botonVolver.setBackground(new java.awt.Color(0, 204, 204));
        botonVolver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonVolverMousePressed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Helvetica Neue", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Volver");

        javax.swing.GroupLayout botonVolverLayout = new javax.swing.GroupLayout(botonVolver);
        botonVolver.setLayout(botonVolverLayout);
        botonVolverLayout.setHorizontalGroup(
            botonVolverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, botonVolverLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                .addContainerGap())
        );
        botonVolverLayout.setVerticalGroup(
            botonVolverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, botonVolverLayout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(botonVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 380, 130, 30));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 350, 260, 10));

        jLabel8.setText("Estado:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 330, -1, -1));

        estado.setEditable(false);
        estado.setBackground(new java.awt.Color(255, 255, 255));
        estado.setForeground(new java.awt.Color(102, 102, 102));
        estado.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        estado.setBorder(null);
        jPanel1.add(estado, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 330, 260, -1));

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

    private void botonVolverMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonVolverMousePressed
        GestionProveedores frame = new GestionProveedores(panel);
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
    private javax.swing.JTextField dirPostal;
    private javax.swing.JTextField estado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTextField nombre;
    // End of variables declaration//GEN-END:variables
}
