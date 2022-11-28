/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package swing;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableCellRenderer;
import scrollbar.ScrollBarCustom;
import table.TableHeader;

/**
 *
 * @author leiii
 */
public class ConsultaProyectos extends javax.swing.JPanel {

    /**
     * Creates new form ConsultaProyectos
     */
    public ConsultaProyectos() {
        initComponents();
        
        tablaProyectos.setShowHorizontalLines(true);
        tablaProyectos.setGridColor(new Color(230,230,230));
        tablaProyectos.setRowHeight(27);
        tablaProyectos.getTableHeader().setReorderingAllowed(true);
        tablaProyectos.getTableHeader().setDefaultRenderer(new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                TableHeader header = new TableHeader(value + "");
                if(column==4){
                    header.setHorizontalAlignment(JLabel.CENTER);
                }
                return header;
            }
       });
       jScrollPane1.getViewport().setBackground(Color.WHITE);
       jScrollPane1.setVerticalScrollBar(new ScrollBarCustom());
       fixtable(jScrollPane1);
       // cargarDatos();
    }
    
    public void fixtable(JScrollPane scroll) {
        scroll.getViewport().setBackground(Color.WHITE);
        scroll.setVerticalScrollBar(new ScrollBarCustom());
        JPanel p = new JPanel();
        scroll.setCorner(JScrollPane.UPPER_RIGHT_CORNER, p);
        scroll.setBorder(new EmptyBorder(5, 10, 5, 10));
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaProyectos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        opcionBusqueda = new javax.swing.JComboBox<>();
        textBusqueda = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        botonBuscar = new javax.swing.JPanel();
        labelVer1 = new javax.swing.JLabel();
        botonVer = new javax.swing.JPanel();
        label = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(700, 490));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaProyectos.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        tablaProyectos.setForeground(new java.awt.Color(102, 102, 102));
        tablaProyectos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tablaProyectos.setSelectionBackground(new java.awt.Color(224, 255, 255));
        jScrollPane1.setViewportView(tablaProyectos);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 56, 640, 370));

        jLabel1.setText("Filtrar por:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        opcionBusqueda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(opcionBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 14, 171, -1));

        textBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textBusquedaActionPerformed(evt);
            }
        });
        jPanel1.add(textBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(392, 14, 160, -1));

        jLabel2.setText("Buscar:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, -1, -1));

        botonBuscar.setBackground(new java.awt.Color(0, 204, 204));
        botonBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonBuscarMousePressed(evt);
            }
        });

        labelVer1.setFont(new java.awt.Font("Helvetica Neue", 1, 15)); // NOI18N
        labelVer1.setForeground(new java.awt.Color(255, 255, 255));
        labelVer1.setText("Buscar");

        javax.swing.GroupLayout botonBuscarLayout = new javax.swing.GroupLayout(botonBuscar);
        botonBuscar.setLayout(botonBuscarLayout);
        botonBuscarLayout.setHorizontalGroup(
            botonBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botonBuscarLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(labelVer1)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        botonBuscarLayout.setVerticalGroup(
            botonBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botonBuscarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelVer1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(botonBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(575, 12, -1, -1));

        botonVer.setBackground(new java.awt.Color(0, 204, 204));

        label.setFont(new java.awt.Font("Helvetica Neue", 1, 15)); // NOI18N
        label.setForeground(new java.awt.Color(255, 255, 255));
        label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label.setText("Ver Proyecto");

        javax.swing.GroupLayout botonVerLayout = new javax.swing.GroupLayout(botonVer);
        botonVer.setLayout(botonVerLayout);
        botonVerLayout.setHorizontalGroup(
            botonVerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botonVerLayout.createSequentialGroup()
                .addComponent(label, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        botonVerLayout.setVerticalGroup(
            botonVerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
        );

        jPanel1.add(botonVer, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 440, 120, -1));

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

    private void textBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textBusquedaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textBusquedaActionPerformed

    private void botonBuscarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonBuscarMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonBuscarMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel botonBuscar;
    private javax.swing.JPanel botonVer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label;
    private javax.swing.JLabel labelVer1;
    private javax.swing.JComboBox<String> opcionBusqueda;
    private javax.swing.JTable tablaProyectos;
    private javax.swing.JTextField textBusqueda;
    // End of variables declaration//GEN-END:variables
}